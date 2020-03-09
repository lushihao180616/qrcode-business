package com.lushihao.qrcodebusiness.service.userinfo;

import com.lushihao.qrcodebusiness.entity.user.UserInfo;

public interface UserInfoService {

    String create(UserInfo userInfo);

    UserInfo filter();

}
