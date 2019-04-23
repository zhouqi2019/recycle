package com.qianfeng.controller;

import com.qianfeng.service.Impl.InfoPhoneService;
import com.qianfeng.vo.InfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@CrossOrigin
@RestController
@RequestMapping("/info")
public class InfoPhoneServlet {

    @Autowired
    private InfoPhoneService infoPhoneSerice;

    @ResponseBody
    @RequestMapping(value = "{phoneId}",method = RequestMethod.GET)
    public InfoVo selectPhoneInfo(@PathVariable("phoneId") Integer phoneId){
        InfoVo  info = infoPhoneSerice.selectPhoneInfo(phoneId);
        return info;
    }
}
