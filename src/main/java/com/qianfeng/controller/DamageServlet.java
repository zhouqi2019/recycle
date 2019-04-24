package com.qianfeng.controller;

import com.qianfeng.service.Impl.DamageService;
import com.qianfeng.vo.DamageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/discount")
public class DamageServlet {

    @Autowired
    private DamageService discountService;

    @RequestMapping(value = "info/{phoneId}",method = RequestMethod.GET)
    public List<DamageVo> selectAllDiscountVo(@PathVariable("phoneId") Integer phoneId){

        List<DamageVo> damageVos = discountService.selectAllDiscountVo(phoneId);

        return damageVos;
    }
}
