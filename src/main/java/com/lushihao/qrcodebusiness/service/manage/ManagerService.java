package com.lushihao.qrcodebusiness.service.manage;

import com.lushihao.qrcodebusiness.entity.common.Result;
import com.lushihao.qrcodebusiness.entity.manager.Manager;

import java.util.List;

public interface ManagerService {

    Result create(Manager manager);

    Result update(Manager manager);

    Result delete(String code);

    List<Manager> filter(Manager manager);

}
