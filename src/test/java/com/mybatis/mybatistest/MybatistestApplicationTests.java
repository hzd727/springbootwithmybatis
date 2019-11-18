package com.mybatis.mybatistest;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatis.mybatistest.bean.RetryMerchant;
import com.mybatis.mybatistest.service.RetryMerchantBaseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MybatistestApplication.class)
public class MybatistestApplicationTests {

    @Autowired
    private RetryMerchantBaseService retryMerchantService;

    @Test
    public void test() throws Exception {

        RetryMerchant mer = new RetryMerchant();

        mer.setBizid("1234567890");
        mer.setMerchantName("高铁管家2");
        mer.setGateMerchantCode("99999999");
        mer.setSubMerchantCode("88888888");
        mer.setCreator("123123123");
        mer.setCreateDate(new Date());
        mer.setOpStatus(1);
        mer.setOperator("321321321");
        mer.setUpdateDate(new Date());
		List<RetryMerchant> retryMerchants = new ArrayList<>();
		retryMerchants.add(mer);
		this.retryMerchantService.saveList(retryMerchants);


//		Example example = new Example(RetryMerchant.class);
//		example.createCriteria().andCondition("merchant_name like '%高%'");
//		example.setOrderByClause("id desc");
//		List<RetryMerchant> userList = this.retryMerchantService.selectByExample(example);
//		for (RetryMerchant u : userList) {
//			System.out.println(u);
//		}
//
//		List<RetryMerchant> all = this.retryMerchantService.selectAll();
//		for (RetryMerchant u : all) {
//			System.out.println(u);
//		}
//
        RetryMerchant user = new RetryMerchant();
		user.setId(24l);
		user = this.retryMerchantService.selectByKey(user);
		System.out.println(user);
//
//		user.setId(4l);
//		this.userService.delete(user);

//        PageHelper.startPage(1, 2);
//        List<RetryMerchant> list = retryMerchantService.selectAll();
//        PageInfo<RetryMerchant> pageInfo = new PageInfo<RetryMerchant>(list);
//        List<RetryMerchant> result = pageInfo.getList();
//        for (RetryMerchant u : result) {
//            System.out.println(u);
//        }
    }

}
