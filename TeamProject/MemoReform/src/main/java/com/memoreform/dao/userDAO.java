package com.memoreform.dao;

import com.memoreform.domain.userVO;

public interface userDAO {
	
	//ID 중복체크 기능 구현
	userVO emailCheck(userVO vo);
	
	//회원가입 기능 구현
	int userInsert(userVO vo);
	
	//로그인 확인 기능 구현
	userVO userLogin(userVO vo);
	
}
