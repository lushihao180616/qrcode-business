package com.lushihao.qrcodebusiness.service.business;

import com.lushihao.qrcodebusiness.entity.business.Business;
import com.lushihao.qrcodebusiness.entity.common.Result;

import java.util.List;

public interface BusinessService {

    Result create(Business business, String logoSrc);

    Result update(Business business, String logoSrc);

    Result delete(String code);

    List<Business> filter(Business business);
}
