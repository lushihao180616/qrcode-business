package com.lushihao.qrcodebusiness.service.video;

import com.lushihao.qrcodebusiness.entity.common.Result;
import com.lushihao.qrcodebusiness.entity.video.VideoIcon;

public interface VideoIconService {

    Result addIcon(VideoIcon videoIcon);

    Result testIcon(VideoIcon videoIcon);

}
