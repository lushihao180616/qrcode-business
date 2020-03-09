package com.lushihao.qrcodebusiness.init;

import com.lushihao.myutils.collection.LSHMapUtils;
import com.lushihao.qrcodebusiness.dao.BusinessMapper;
import com.lushihao.qrcodebusiness.dao.ManagerMapper;
import com.lushihao.qrcodebusiness.dao.UserInfoMapper;
import com.lushihao.qrcodebusiness.entity.business.Business;
import com.lushihao.qrcodebusiness.entity.manager.Manager;
import com.lushihao.qrcodebusiness.entity.user.UserInfo;
import com.lushihao.qrcodebusiness.entity.yml.ProjectBasicInfo;
import com.lushihao.qrcodebusiness.entity.yml.UserBasicInfo;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * 初始化项目
 */
@Component
public class InitProject implements ApplicationRunner {

    public static UserInfo userInfo;
    @Resource
    private ProjectBasicInfo projectBasicInfo;
    @Resource
    private UserInfoMapper userInfoMapper;
    @Resource
    private UserBasicInfo userBasicInfo;
    @Resource
    private BusinessMapper businessMapper;
    @Resource
    private ManagerMapper managerMapper;

    /**
     * 根据配置文件获取需要执行的任务，并通过任务调度器执行
     *
     * @param args
     * @throws Exception
     */
    @Override
    public void run(ApplicationArguments args) {
        createDirectory(projectBasicInfo.getTempleUrl());
        createDirectory(projectBasicInfo.getBusinessUrl());
        createDirectory(projectBasicInfo.getQrcodeUrl());
        createDirectory(projectBasicInfo.getModelUrl());
        createDirectory(projectBasicInfo.getTempJpgUrl());

        getUserInfo();
    }

    private void createDirectory(String directory) {
        File modelDirectory = new File(directory);
        if (!modelDirectory.exists()) {//如果文件夹不存在
            modelDirectory.mkdir();//创建文件夹
        }
    }

    public void getUserInfo() {
        List<Map<String, Object>> userInfoList = userInfoMapper.filter(userBasicInfo.getCode());

        if (userInfoList.size() > 0) {
            Map<String, Object> map = userInfoList.get(0);
            userInfo = LSHMapUtils.mapToEntity(map, UserInfo.class);
            userInfo.setCount((Integer) map.get("count"));
            userInfo.setUserType(userInfoMapper.filterType((String) map.get("typecode")).get(0));
            if (userInfo.getUserType().getType().equals("1")) {//商家信息
                Business business = new Business();
                business.setCode(userBasicInfo.getCode());
                List<Business> businessList = businessMapper.filter(business);
                if (businessList.size() > 0) {
                    business = businessList.get(0);
                }
                userInfo.setBusiness(business);
            } else {//管理员信息
                Manager manager = new Manager();
                manager.setCode(userBasicInfo.getCode());
                List<Manager> managerList = managerMapper.filter(manager);
                if (managerList.size() > 0) {
                    manager = managerList.get(0);
                }
                userInfo.setManager(manager);
            }
        }
    }

}
