package com.qianfeng.service;

import com.qianfeng.po.TbPhone;

import java.util.List;

public interface IPhoneService {
    List<TbPhone> selectAllPhone();
    List<TbPhone> selectPhoneById(Integer brandId);
}
