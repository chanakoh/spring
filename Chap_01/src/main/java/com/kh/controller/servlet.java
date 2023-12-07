package com.kh.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.kh.model.dao.DAO;
import com.kh.model.vo.DTO;


public class servlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//사용자로부터 입력받은 데이터 처리 및 dao호출 작업을 수행
		//list로 조회된 결과를 가지고 옴
		List<DTO> userList = DAO.selectAllUsers();
		//2.값이 일치할 경우
		//3.검색 결과가 없을 때
		if(userList != null && !userList.isEmpty()) {
			request.setAttribute("userList",userList);
			request.getRequestDispatcher("/searchResult.jsp").forward(request,respone);
		}
		//1.비어있지 않거나 NULL값이 아닐 때는 전체 조회
	}

}
