package com.kh.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.board.repository.BoardRepository;
import com.kh.board.vo.Board;

import java.util.List;
import java.util.Optional;

@Service
public class BoardService {

    private final BoardRepository boardRepository;

    @Autowired
    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public List<Board> getAllBoards() {
        return boardRepository.findAll();
    }

    public Board saveBoard(Board board) {
        return boardRepository.save(board);
    }

    public Optional<Board> getBoardById(Long id) {
        return boardRepository.findById(id);
    }
    public void deleteBoardById(Long id) {
        boardRepository.deleteById(id);
    }
    
    public void deleteAllBoards() {
        boardRepository.deleteAll();
    }
    
    public List<Board> findBoardsByTitle(String keyword) {
        return boardRepository.findTitle(keyword);
    }

}