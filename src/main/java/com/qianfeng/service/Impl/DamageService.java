package com.qianfeng.service.Impl;

import com.qianfeng.mapper.DamageMapper;
import com.qianfeng.service.IDamageSerivce;
import com.qianfeng.vo.DamageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DamageService implements IDamageSerivce {

    @Autowired
    private DamageMapper damageMapper;

    @Override
    public List<DamageVo> selectAllDiscountVo(Integer phoneId) {

        List<DamageVo> list = damageMapper.selectAllDiscountVo(phoneId);
        return list;
    }
}
