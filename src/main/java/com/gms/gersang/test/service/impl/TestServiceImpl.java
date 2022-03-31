package com.gms.gersang.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gms.gersang.test.mapper.TestMapper;
import com.gms.gersang.test.service.TestService;
import com.gms.gersang.test.vo.TestVO;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestMapper testMapper;
	
	@Override
	public List<TestVO> getList(TestVO vo) {
		return testMapper.getList(vo);
	}

}
