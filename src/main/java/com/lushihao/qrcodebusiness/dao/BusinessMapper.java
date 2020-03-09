package com.lushihao.qrcodebusiness.dao;

import com.lushihao.qrcodebusiness.entity.business.Business;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BusinessMapper {

    int create(Business business);

    int update(Business business);

    int delete(@Param("code") String code);

    List<Business> filter(Business business);

}
