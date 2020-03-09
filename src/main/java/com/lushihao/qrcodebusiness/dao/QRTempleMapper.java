package com.lushihao.qrcodebusiness.dao;

import com.lushihao.qrcodebusiness.entity.temple.QRCodeTemple;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface QRTempleMapper {

    int create(QRCodeTemple qrCodeTemple);

    int update(QRCodeTemple qrCodeTemple);

    int delete(@Param("code") String code);

    List<QRCodeTemple> filter(@Param("code") String code);

}
