package com.lushihao.qrcodebusiness.service.qrcode;

import com.lushihao.qrcodebusiness.entity.common.Result;
import com.lushihao.qrcodebusiness.entity.qrcode.QRCodeRecord;
import com.lushihao.qrcodebusiness.entity.qrcode.QRCodeRequest;

import java.util.List;

public interface QRCodeService {

    Result create(QRCodeRequest qrCodeRequest);

    Result test(QRCodeRequest qrCodeRequest);

    List<QRCodeRecord> selectRecord(QRCodeRecord qrCodeRecord);

}
