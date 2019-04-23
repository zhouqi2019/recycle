package com.qianfeng;




import com.qianfeng.po.TbBrand;
import com.qianfeng.po.TbPhone;
import com.qianfeng.service.Impl.BrandService;
import com.qianfeng.service.Impl.PhoneService;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class SpringTest {


    @Autowired
    private BrandService brandService;

    @Autowired
    private PhoneService phoneService;

    @Test
    public void testCase1(){
        List<TbBrand> lsit = brandService.selectAllBrand();
        System.out.println(lsit);
    }

    @Test
    public void testCase2(){
        List<TbPhone> list = phoneService.selectAllPhone();
        for (TbPhone b:list) {
            System.out.println(b.getPhoneName());
        }
    }

    @Test
    public void testCase3(){
        List<TbPhone> list = phoneService.selectPhoneById(1);
        System.out.println(list);
    }
}
