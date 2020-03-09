package com.lushihao.qrcodebusiness.service.image;

import com.lushihao.qrcodebusiness.entity.common.Result;
import com.lushihao.qrcodebusiness.entity.image.ImageCut;

public interface ImageCutService {

    Result addCut(ImageCut imageCut);

    Result testCut(ImageCut imageCut);

}
