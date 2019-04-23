package com.qianfeng.service.Impl;

import com.qianfeng.mapper.InfoMapper;
import com.qianfeng.service.IPhoneInfoService;
import com.qianfeng.vo.InfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class InfoPhoneService implements IPhoneInfoService {

    @Autowired
    private InfoMapper infoMapper;

    @Override
    public InfoVo selectPhoneInfo(Integer phoneId) {
        InfoVo list = infoMapper.selectPhoneInfo(phoneId) ;
        return list;
    }
}
