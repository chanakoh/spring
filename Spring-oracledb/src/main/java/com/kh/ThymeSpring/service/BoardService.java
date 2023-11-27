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
	
	//게시판에서 게시글 전체보기
	public List<Board> getAllBoard(){
		return boardMapper.getAllBoard();
	}
	//게시판에서 게시물 1개 선택했을때 상세보기
	public Board getBoardById(int board_id) {
		return boardMapper.getBoardById(board_id);
	}
	//게시글 작성하기
	public void registerBoard(Board board) {
		boardMapper.insertBoard(board);
}
	//게시글 수정하기
	public void updateBoard(Board board) {
		boardMapper.updateBoard(board);
	}
	
	//게시글 삭제하기
	public void deleteBoard(int board_id) {
		boardMapper.deleteBoard(board_id);
	}
}
