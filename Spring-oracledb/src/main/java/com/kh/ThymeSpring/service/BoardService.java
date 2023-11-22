package com.kh.ThymeSpring.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.kh.ThymeSpring.model.*;
import com.kh.ThymeSpring.mapper.*;


@Service
public class BoardService {
	@Autowired
	private BoardMapper boardMapper;
	public List<Board> getAllBoard(){
		return boardMapper.getAllBoard();
	}
}
