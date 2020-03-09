package com.lushihao.qrcodebusiness.service.temple;

import java.util.List;
import java.util.Map;

public interface QRTempleService {

    List<Map<String, Object>> filter(String code);

}
