package com.memoreform.service;

import com.memoreform.domain.userVO;

public interface userService { 
	
	public userVO emailCheck(userVO vo);
	public int userInsert(userVO vo);
}