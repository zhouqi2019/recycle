package com.qianfeng.mapper;

import com.qianfeng.vo.DamageVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DamageMapper {

    List<DamageVo> selectAllDiscountVo(@Param("phoneId") Integer phoneId);

}
