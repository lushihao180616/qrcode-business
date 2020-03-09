package com.lushihao.qrcodebusiness.service.image;

import com.lushihao.qrcodebusiness.entity.common.Result;
import com.lushihao.qrcodebusiness.entity.image.ImageWaterMark;

public interface ImageWaterMarkService {

    Result addWaterMark(ImageWaterMark imageWaterMark);

    Result testWaterMark(ImageWaterMark imageWaterMark);

}
