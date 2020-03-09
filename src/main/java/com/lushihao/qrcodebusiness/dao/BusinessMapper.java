package com.lushihao.qrcodebusiness.dao;

import com.lushihao.qrcodebusiness.entity.business.Business;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BusinessMapper {

    List<Business> filter(Business business);

}
