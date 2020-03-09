package com.lushihao.qrcodebusiness.service.video;

import com.lushihao.qrcodebusiness.entity.common.Result;
import com.lushihao.qrcodebusiness.entity.video.VideoFont;

public interface VideoFontService {

    Result addFont(VideoFont videoFont);

    Result testFont(VideoFont videoFont);
    
}
