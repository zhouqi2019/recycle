package com.qianfeng.service;


import com.qianfeng.vo.DamageVo;


import java.util.List;

public interface IDamageSerivce {

    List<DamageVo> selectAllDiscountVo(Integer phoneId);
}
