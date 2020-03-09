package com.lushihao.qrcodebusiness.service.video;

import com.lushihao.qrcodebusiness.entity.common.Result;
import com.lushihao.qrcodebusiness.entity.video.VideoWaterMark;

public interface VideoWaterMarkService {

    Result addWaterMark(VideoWaterMark videoWaterMark);

    Result testWaterMark(VideoWaterMark videoWaterMark);

}
