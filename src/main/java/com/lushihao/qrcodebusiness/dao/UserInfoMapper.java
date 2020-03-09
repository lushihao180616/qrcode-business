package com.lushihao.qrcodebusiness.dao;

import com.lushihao.qrcodebusiness.entity.user.UserInfo;
import com.lushihao.qrcodebusiness.entity.user.UserType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserInfoMapper {

    int create(UserInfo userInfo);

    List<Map<String, Object>> filter(@Param("code") String code);

    List<UserType> filterType(@Param("code") String code);

    int countSub(@Param("subCount") int subCount, @Param("code") String code);

}
