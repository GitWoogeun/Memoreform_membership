package com.memoreform.dao;

import com.memoreform.domain.userVO;

public interface userDAO {
	
	//ID �ߺ�üũ ��� ����
	userVO emailCheck(userVO vo);
	
	//ȸ������ ��� ����
	int userInsert(userVO vo);
	
	//�α��� Ȯ�� ��� ����
	userVO userLogin(userVO vo);
	
}
