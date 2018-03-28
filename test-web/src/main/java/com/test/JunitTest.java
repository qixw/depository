package com.test;

import com.test.service.TUserService;
import com.test.util.SignatureAlgorithm;
import com.test.util.SignatureUtils;
import com.test.vo.UserVo;
import org.apache.commons.codec.binary.Base64;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.security.PrivateKey;
import java.util.*;

/**
 * @author ：qixuewei@jinlianchu.com
 * @Description ：
 * @ClassName ：JunitTest
 * @date ：2018/2/26 18:02
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring/spring-*.xml"})
public class JunitTest {

	@Resource
	TUserService tUserService;
	@Test
	public void test()throws Exception{
		UserVo userVo = new UserVo();
		userVo.setUserName("zhangsansan");
		userVo.setPhone("17640541025");
		userVo.setIsLimit(1);
		PrivateKey privateKey = SignatureUtils.getRsaPkcs8PrivateKey(Base64.decodeBase64("qixuewei"));
		byte[] sign = SignatureUtils.sign(SignatureAlgorithm.SHA1WithRSA, privateKey, "123456");
		String password = Base64.encodeBase64String(sign);
		userVo.setPassword(password);
		tUserService.insert(userVo);
	}

	@Test
	public void test2(){

		Set set =  new HashSet();
		set.add("1");
		set.add("1");
		System.out.println(set.toString());
	}

	@Test
	public void test3(){
		String str ="j";
		str.substring(1).replaceAll("","*");
		System.out.println(str.substring(0,1)+str.substring(1).replaceAll("\\S","*"));
	}
}





















