package com.lushihao.qrcodebusiness.service.business.impl;

import com.lushihao.qrcodebusiness.dao.BusinessMapper;
import com.lushihao.qrcodebusiness.entity.business.Business;
import com.lushihao.qrcodebusiness.entity.common.Result;
import com.lushihao.qrcodebusiness.entity.yml.ProjectBasicInfo;
import com.lushihao.qrcodebusiness.service.business.BusinessService;
import com.lushihao.qrcodebusiness.util.LSHImageUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Service
public class BusinessServiceImpl implements BusinessService {

    @Resource
    private BusinessMapper businessMapper;

    @Override
    @Transactional
    public List<Business> filter(Business business) {
        return businessMapper.filter(business);
    }

}
