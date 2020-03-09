package com.lushihao.qrcodebusiness.dao;

import com.lushihao.qrcodebusiness.entity.manager.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ManagerMapper {

    int create(Manager manager);

    int update(Manager manager);

    int delete(@Param("code") String code);

    List<Manager> filter(Manager manager);

}
