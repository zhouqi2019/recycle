package com.qianfeng.service.Impl;

import com.qianfeng.mapper.BrandMapper;
import com.qianfeng.po.TbBrand;
import com.qianfeng.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService implements IBrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<TbBrand> selectAllBrand() {
      List<TbBrand> list =  brandMapper.selectAllBrand();
        return list;
    }
}
