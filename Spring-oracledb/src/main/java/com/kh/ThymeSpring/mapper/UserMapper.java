package com.kh.ThymeSpring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kh.ThymeSpring.model.User;

@Mapper
public interface UserMapper {
	// 모든 유저 조회
	List<User> getAllUsers();
	// 유저 한명 조회
	User getUserById(int mno);
	
	void insertUser(User user);
	//유저 정보 수정 메서드
	void updateUser(User user);
	void deleteUser(int mno);
}
