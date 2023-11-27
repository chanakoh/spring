package com.kh.ThymeSpring.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kh.ThymeSpring.model.*;
@Mapper
public interface BoardMapper {
		//모든 게시물 조회
		List<Board> getAllBoard();
		//게시물 1개 조회
		Board getBoardById(int board_id);
		//게시물 작성하기
		void insertBoard(Board board);
		//게시물 수정하기
		void updateBoard(Board board);
		//게시물 삭제하기
		void deleteBoard(int board_id);
		//게시물 전체 삭제
		void deleteAllBoards();
}
