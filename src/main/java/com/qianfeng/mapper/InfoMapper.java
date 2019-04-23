package com.qianfeng.mapper;

import com.qianfeng.vo.InfoVo;
import org.apache.ibatis.annotations.Param;



public interface InfoMapper {

    InfoVo selectPhoneInfo(@Param("phoneId") Integer phoneId);
}
