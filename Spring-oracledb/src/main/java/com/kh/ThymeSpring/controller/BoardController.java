package com.kh.ThymeSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.ThymeSpring.service.*;
import com.kh.ThymeSpring.model.*;
@Controller
@RequestMapping("/boards")
public class BoardController {

	 @Autowired
	    private BoardService boardService;
	 
	   @GetMapping
	    public String getAllboard(Model model) {
	    	//model.addAttribute("products","제품 저장할 공간");
		   List<Board> boards = boardService.getAllBoard();
	    	model.addAttribute("boards",boards);
	        return "board-list";
	    }
	   	//
	   @GetMapping("/{board_id}")		//boards/{boardId}로 앞에 boards가 내장되어있음
	   public String getBoardById(@PathVariable int board_id,Model model) {
		   Board board = boardService.getBoardById(board_id);
		   model.addAttribute("board",board);
		   return"board-detail";
	   }
	   
	   //GetMapping을 사용해서 게시글작성하는 html로 이동한 후
	   @GetMapping("/create") //HTTP GET요청이 /create라는 경로로 들어올 때 호출
		public String displayCreateBoard(Model model) { //Model이라는 객체를 매개변수로 받아서 templates(view)으로 데이터를 전달할 수 있음
			model.addAttribute("board",new Board());
			//new Board로 새로운 Board 객체를 생성해서 모델에 추가
			return "board-form"; //board-form.html 템플릿에서 해당 뷰를 보여줌
		}
		//postMapping을 사용해서 작성해놓은 insert HTML Form 가져온다.
		@PostMapping("create")
		public String createBoard(@ModelAttribute Board board) {
			boardService.registerBoard(board);
			//유저가 회원가입을 성공할 경우 이동하는 경로
			return "redirect:/boards";
		}
		@PostMapping("/update/{board_id}")
		public String UpdateBoard(@PathVariable int board_id, @ModelAttribute Board board) {
			//URL에서 가져온 board_id값을 baord객체에 저장
			board.setBoard_id(board_id);
			boardService.updateBoard(board);
			//수정이 완료된 후 게시글 목록 페이지로 돌아가기
			return "redirect:/boards";
		}
		
		@GetMapping("/update/{board_id}")
		public String displayUpdateForm(@PathVariable int board_id, Model model) {
			Board board = boardService.getBoardById(board_id);
			model.addAttribute("board",board);
			return "board-form";
			
		}
		@GetMapping("/delete/{board_id}")
		public String deleteBoard(@PathVariable int board_id) {
			boardService.deleteBoard(board_id);
			return "redirect:/boards";
		}
		//게시물 모두 삭제
		@GetMapping("/delete-all-boards")
		public String deleteAllBoards() {
			boardService.deleteAllBoards();
			return"redirect:/boards";
		}
		
		
}
/*
 Model model
 	컨트롤러에서 뷰로 데이터를 전달할 때 사용하는 인터페이스
 	컨트롤러에 있는 메서드에서 매개변수로 Model를 선언하면
 	Get에 추가한 데이터는 자동으로 뷰에 전달됨
 	Select에서 DB에 담겨온 데이터는 자동으로 모델에 담겨져 View(html)파일로 전달됨
 @ModelAttribute  클래스이름 클래스를 대신할 변수명
 	폼 데이터나 URL 경로에서 전달된 데이터를 객체에 넣어줄 때 사용
 	클라이언트에서 전송한 데이터를 객체로 값을 넣어주고 컨트롤러에서 사용할 수 있도록 해주는 것
 		전달된 데이터는 mapper를 통해 db에 저장됨
 
 
 * */
