package com.memoreform.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.memoreform.domain.userVO;

//데이터 베이스에 데이터를 전송할 클래스 지정
@Repository
public class userDAOImpl{
	
	//마이바티스 = JDBC를 우리가 자바를 입력할려면 driver불러오고 불러오고 하는건데 편하게 할수있게 일종의 libaray이다.
	@Autowired
	private SqlSessionTemplate mybatis;
	
	
	//중복이메일 체크
	public userVO emailCheck(userVO vo) {
		System.out.println("===>userMapper emailCheck 호출");
		return mybatis.selectOne("user.emailCheck", vo);
		//user = userMapper의 namespace의 지정된 값 
	}	
	
	//회원가입
	public int userInsert(userVO vo) {
		System.out.println("===> userMapper userInsert() 호출");
		return mybatis.insert("user.userInsert",vo);
	}
	
	
}
