package com.ruoyi.wx.service;

import com.ruoyi.wx.pojo.entity.User;


public interface WxUserService {

    User login(String code);
}
