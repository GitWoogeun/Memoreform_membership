package com.memoreform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.memoreform.dao.userDAO;
import com.memoreform.dao.userDAOImpl;
import com.memoreform.domain.userVO;

@Service
public class userServiceImpl implements userService{
	
	@Autowired
	private userDAOImpl userDAO;
	
		
	//이메일 중복체크
	public userVO emailCheck(userVO vo) 
	{
		return userDAO.emailCheck(vo);
	}
	
	//회원가입하기
	public int userInsert(userVO vo) {
		
		return userDAO.userInsert(vo);
	}
}
