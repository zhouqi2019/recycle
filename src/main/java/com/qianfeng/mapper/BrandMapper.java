package com.qianfeng.mapper;


import com.qianfeng.po.TbBrand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BrandMapper {

    List<TbBrand> selectAllBrand();
}
