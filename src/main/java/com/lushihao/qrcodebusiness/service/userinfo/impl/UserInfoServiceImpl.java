package com.lushihao.qrcodebusiness.service.userinfo.impl;

import com.lushihao.qrcodebusiness.dao.UserInfoMapper;
import com.lushihao.qrcodebusiness.entity.user.UserInfo;
import com.lushihao.qrcodebusiness.init.InitProject;
import com.lushihao.qrcodebusiness.service.userinfo.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public String create(UserInfo userInfo) {
        userInfo.setUserType(userInfoMapper.filterType("06").get(0));
        int back = userInfoMapper.create(userInfo);
        if (back > 0) {
            return "创建成功";
        }
        return "创建失败";
    }

    @Override
    public UserInfo filter() {
        return InitProject.userInfo;
    }

}

