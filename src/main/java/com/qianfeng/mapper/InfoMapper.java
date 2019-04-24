package com.qianfeng.mapper;

import com.qianfeng.vo.InfoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface InfoMapper {

    InfoVo selectPhoneInfo(@Param("phoneId") Integer phoneId);
}
