package com.gms.gersang.test.comtroller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gms.gersang.test.service.TestService;
import com.gms.gersang.test.vo.TestVO;



@Controller
public class TestController {

	@Autowired
	private TestService testServiceImpl;
	
	@RequestMapping("/test/test.do")
	public String list(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		TestVO vo = new TestVO();
		
		List<TestVO> list = testServiceImpl.getList(vo);
				
		System.out.println("리스크 크기 == "+ list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "번째 vo 값 == " + list.get(i));
		}
		
		return "test/testJsp";
	}
}
