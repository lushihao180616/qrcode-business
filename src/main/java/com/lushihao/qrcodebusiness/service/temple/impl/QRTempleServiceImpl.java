package com.lushihao.qrcodebusiness.service.temple.impl;

import com.lushihao.myutils.collection.LSHMapUtils;
import com.lushihao.qrcodebusiness.dao.QRTempleMapper;
import com.lushihao.qrcodebusiness.entity.temple.QRCodeTemple;
import com.lushihao.qrcodebusiness.entity.yml.ProjectBasicInfo;
import com.lushihao.qrcodebusiness.service.temple.QRTempleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class QRTempleServiceImpl implements QRTempleService {

    @Resource
    private QRTempleMapper qrTempleMapper;
    @Resource
    private ProjectBasicInfo projectBasicInfo;

    @Override
    @Transactional
    public List<Map<String, Object>> filter(String code) {
        List<Map<String, Object>> list = new ArrayList<>();
        List<QRCodeTemple> templeList = qrTempleMapper.filter(code);
        for (QRCodeTemple qrCodeTemple : templeList) {
            Map<String, Object> map = LSHMapUtils.entityToMap(qrCodeTemple);
            if (qrCodeTemple.isIfGif()) {
                map.put("path", projectBasicInfo.getModelUrl() + "\\" + qrCodeTemple.getCode() + ".gif");
            } else {
                map.put("path", projectBasicInfo.getModelUrl() + "\\" + qrCodeTemple.getCode() + ".jpg");
            }
            map.put("frame", map.get("frame") + "/" + map.get("startQRFrame") + "/" + map.get("endQRFrame"));
            list.add(map);
        }
        return list;
    }

}
