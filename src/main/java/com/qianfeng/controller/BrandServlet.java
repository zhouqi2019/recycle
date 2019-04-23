package com.qianfeng.controller;


import com.qianfeng.po.TbBrand;
import com.qianfeng.service.Impl.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/brand")
public class BrandServlet {

    @Autowired
    private BrandService brandService;

   @RequestMapping(value="{brands}",method = RequestMethod.GET)
    public List<TbBrand> selectAllBrand() {
        List<TbBrand> brands = brandService.selectAllBrand();
        return brands;
    }
}
