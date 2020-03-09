package com.lushihao.qrcodebusiness.controller;

import com.lushihao.qrcodebusiness.entity.common.Result;
import com.lushihao.qrcodebusiness.service.userinfo.UserInfoService;
import com.lushihao.qrcodebusiness.util.LSHMACUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    private UserInfoService userInfoService;
    @Resource
    private LSHMACUtil lshmacUtil;

    @RequestMapping("filter")
    @ResponseBody
    public Result filter() {
        if (!lshmacUtil.check()) {
            return null;
        }
        return new Result(true, userInfoService.filter(), "搜索完成", null);
    }

}
