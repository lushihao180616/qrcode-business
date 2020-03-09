package com.lushihao.qrcodebusiness.service.image;

import com.lushihao.qrcodebusiness.entity.common.Result;
import com.lushihao.qrcodebusiness.entity.image.ImageIcon;

public interface ImageIconService {

    Result addIcon(ImageIcon imageIcon);

    Result testIcon(ImageIcon imageIcon);

}
