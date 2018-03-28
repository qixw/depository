package com.test.service.impl;

import com.test.mapper.TUserMapper;
import com.test.service.TUserService;
import com.test.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author ：qixuewei@jinlianchu.com
 * @Description ：
 * @ClassName ：TUserServiceImpl
 * @date ：2018/2/27 14:54
 */
@Component
public class TUserServiceImpl implements TUserService {

	@Autowired
	TUserMapper tUserMapper;
	@Override
	public Integer insert(UserVo userVo) {
		return tUserMapper.insert(userVo);
	}
}
