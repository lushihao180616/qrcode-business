package com.lushihao.qrcodebusiness.service.business;

import com.lushihao.qrcodebusiness.entity.business.Business;
import com.lushihao.qrcodebusiness.entity.common.Result;

import java.util.List;

public interface BusinessService {

    List<Business> filter(Business business);

}
