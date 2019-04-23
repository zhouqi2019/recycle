package com.qianfeng.service.Impl;

import com.qianfeng.mapper.PhoneMapper;
import com.qianfeng.po.TbPhone;
import com.qianfeng.service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneService implements IPhoneService {

    @Autowired
    private PhoneMapper phoneMapper;

    @Override
    public List<TbPhone> selectAllPhone(){
        List<TbPhone> list = phoneMapper.selectAllPhone();
        return list;
    }

    @Override
    public List<TbPhone> selectPhoneById(Integer brandId) {
        List<TbPhone> list = phoneMapper.selectPhoneById(brandId);
        return list;
    }

}
