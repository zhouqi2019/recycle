package com.qianfeng.mapper;

import com.qianfeng.po.TbPhone;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PhoneMapper {

    List<TbPhone> selectAllPhone();

    List<TbPhone> selectPhoneById(@Param("brandId") Integer brandId);
}
