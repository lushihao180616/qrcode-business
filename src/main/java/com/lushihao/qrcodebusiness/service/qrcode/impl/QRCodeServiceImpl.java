package com.lushihao.qrcodebusiness.service.qrcode.impl;

import com.lushihao.qrcodebusiness.dao.QRCodeRecordMapper;
import com.lushihao.qrcodebusiness.dao.QRTempleMapper;
import com.lushihao.qrcodebusiness.entity.common.Result;
import com.lushihao.qrcodebusiness.entity.qrcode.QRCode;
import com.lushihao.qrcodebusiness.entity.qrcode.QRCodeRecord;
import com.lushihao.qrcodebusiness.entity.qrcode.QRCodeRequest;
import com.lushihao.qrcodebusiness.service.qrcode.QRCodeService;
import com.lushihao.qrcodebusiness.util.LSHQRCodeUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class QRCodeServiceImpl implements QRCodeService {

    @Resource
    private LSHQRCodeUtil lshqrCodeUtil;
    @Resource
    private QRTempleMapper qrTempleMapper;
    @Resource
    private QRCodeRecordMapper qrCodeRecordMapper;

    @Override
    @Transactional
    public Result create(QRCodeRequest qrCodeRequest) {
        QRCode qrCode = new QRCode(qrCodeRequest.getMessage(), qrCodeRequest.getType(), qrTempleMapper.filter(qrCodeRequest.getTempleCode()).get(0), qrCodeRequest.getBusinessCode(), qrCodeRequest.getManagerCode(), qrCodeRequest.getFileName(), qrCodeRequest.getBackGround(), qrCodeRequest.getShortLength(), qrCodeRequest.getX(), qrCodeRequest.getY(), qrCodeRequest.getAlpha(), qrCodeRequest.getAngle());
        Result result = lshqrCodeUtil.qrcode(qrCode, false, false);
        Map<String, Object> map = (Map<String, Object>) result.getBean();
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("record", selectRecord(new QRCodeRecord()));
        result.setBean(map);
        return result;
    }

    @Override
    @Transactional
    public Result test(QRCodeRequest qrCodeRequest) {
        QRCode qrCode = new QRCode("超级码丽", qrCodeRequest.getType(), qrTempleMapper.filter(qrCodeRequest.getTempleCode()).get(0), "00000000", "00000000", qrCodeRequest.getFileName(), qrCodeRequest.getBackGround(), qrCodeRequest.getShortLength(), qrCodeRequest.getX(), qrCodeRequest.getY(), qrCodeRequest.getAlpha(), qrCodeRequest.getAngle());
        Result result = lshqrCodeUtil.qrcode(qrCode, true, false);
        Map<String, Object> map = (Map<String, Object>) result.getBean();
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("record", selectRecord(new QRCodeRecord()));
        result.setBean(map);
        return result;
    }

    @Override
    @Transactional
    public List<QRCodeRecord> selectRecord(QRCodeRecord qrCodeRecord) {
        return qrCodeRecordMapper.select(qrCodeRecord);
    }

}
