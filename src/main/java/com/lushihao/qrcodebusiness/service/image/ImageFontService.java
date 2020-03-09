package com.lushihao.qrcodebusiness.service.image;

import com.lushihao.qrcodebusiness.entity.common.Result;
import com.lushihao.qrcodebusiness.entity.image.ImageFont;

public interface ImageFontService {

    Result addFont(ImageFont imageFont);

    Result testFont(ImageFont imageFont);

}
