package com.qianfeng.controller;

import com.qianfeng.po.TbPhone;
import com.qianfeng.service.Impl.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/phone")
public class PhoneServlet {

    @Autowired
    private PhoneService phoneService;

    @RequestMapping(method = RequestMethod.GET)
    public List<TbPhone> selectAllPhone(){
        List<TbPhone> phone = phoneService.selectAllPhone();
        return phone;
    }
    @ResponseBody
    @RequestMapping(value = "{brandId}",method = RequestMethod.GET)
    public List<TbPhone> selectPhoneById(@PathVariable("brandId") Integer brandId){
        List<TbPhone> phones = phoneService.selectPhoneById(brandId);
        return phones;
    }
}
