package com.memoreform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.memoreform.domain.userVO;
import com.memoreform.service.userService;
import com.memoreform.service.userServiceImpl;

@RequestMapping("main")
@Controller
public class mainController {

	@Autowired
	userServiceImpl service;

	// ȸ������ �������� �̵�
	@RequestMapping("/join")
	public void join() {
		System.out.println("ȸ������ ��ư ����");
	}

	// ȸ������ ��û
	@RequestMapping("userInsert")
	public String insertUserDB(userVO vo) {
		service.userInsert(vo);
		return "main/JoinOk";
	}
	
	//email �ߺ�üũ
	@ResponseBody
	@RequestMapping(value="emailCheck",
			produces="application/text; charset=utf8")
	public String emailCheck(userVO vo) {
		System.out.println();
		userVO result = service.emailCheck(vo);
		String message = "";
		if(result == null) {
			message = "Ok";
		}else if(result != null) {
			message = "No";
		}
		return message;
	}

	@RequestMapping("login")
	public void login() {

	}

	@RequestMapping("search")
	public void search() {

	}
}
