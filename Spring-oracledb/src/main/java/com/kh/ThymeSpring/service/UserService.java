package com.kh.ThymeSpring.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ThymeSpring.mapper.UserMapper;
import com.kh.ThymeSpring.model.User;


@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	//전체 회원 조회 가져오기
	public List<User> getAllUsers(){
		return userMapper.getAllUsers();
	}
	
	//하나의 회원 정보 가져오기
	public User getUserById(int mno) {
		return userMapper.getUserById(mno);
	}
	//한명의 회원 정보 DB에 저장하기
		public void registerUser(User user) {
			userMapper.insertUser(user);
		}
	//회원의 정보 수정해서 db에 저장하기
	public void updateUser(User user) {
		userMapper.updateUser(user);
	}
	
	public void deleteUser(int mno) {
		userMapper.deleteUser(mno);
	}
}
