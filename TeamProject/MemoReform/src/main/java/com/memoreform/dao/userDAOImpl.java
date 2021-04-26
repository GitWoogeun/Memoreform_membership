package com.memoreform.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.memoreform.domain.userVO;

//������ ���̽��� �����͸� ������ Ŭ���� ����
@Repository
public class userDAOImpl{
	
	//���̹�Ƽ�� = JDBC�� �츮�� �ڹٸ� �Է��ҷ��� driver�ҷ����� �ҷ����� �ϴ°ǵ� ���ϰ� �Ҽ��ְ� ������ libaray�̴�.
	@Autowired
	private SqlSessionTemplate mybatis;
	
	
	//�ߺ��̸��� üũ
	public userVO emailCheck(userVO vo) {
		System.out.println("===>userMapper emailCheck ȣ��");
		return mybatis.selectOne("user.emailCheck", vo);
		//user = userMapper�� namespace�� ������ �� 
	}	
	
	//ȸ������
	public int userInsert(userVO vo) {
		System.out.println("===> userMapper userInsert() ȣ��");
		return mybatis.insert("user.userInsert",vo);
	}
	
	
}
