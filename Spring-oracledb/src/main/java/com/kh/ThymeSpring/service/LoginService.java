package com.kh.ThymeSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ThymeSpring.mapper.LoginMapper;
import com.kh.ThymeSpring.model.User;

@Service
//LoginService : 스프링에서 사용자한테 필요한 메서드를 제공하는 서비스 역할을 하고 있음
public class LoginService {
	//DB가 담긴 loginMapper를 사용하기위해 선언한 것
	private LoginMapper loginMapper;
	
	@Autowired //의존성 주입(DI : 인터페이스를 주입받는 생성자임을 정의내림)
	public LoginService(LoginMapper loginmapper) {
	this.loginMapper=loginmapper;	
	}
	
	//로그인 기능을 수행하는 lgoin 메서드를 정의하고 있음
	public User login(String mname, String memail) {
		//loginMapper 안에 있는 loginByMnameAndMemail메서드를 호출해서 mname, memail 사용해서 데이터베이스에서 해당 정보를 조회할 것임을 나타냄
		//추후 public User를 통해 조회된 결과인 User에 담긴 객체를 반환
		return loginMapper.loginByMnameAndMemail(mname, memail);
	}
	
}
