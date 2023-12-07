package com.kh.oracleDB.mallBoard.model.vo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Item {
	//primaryKey
	private int id;
	//상품이믈 // 상품설명 //상품가격 //판매개수 //재고 // 상품상태 // 판매자아이디 //상품사진
	private String name;
	private String description;
	private int price;
	private int count;
	private int stockQuantity;
	private boolean isSale;
	//상품을 판매하는 판매자가 여러명일 수 있으므로 판매자가 누구인지 아이디를 넣어줘야함
	//판매자 아이디(admin)
	@ManyToOne // 판매자 한명이 여러개의 상품을 팔 수 있기 때문에 판매자 1 : 상품 N
	@JoinColumn(name="admin_id")
	//private Admin admin;

	//상품사진,상품사진명,상품이미지 위치
	private String photo;
	private String photoName;
	private String photoPath;
	private List<CartItem> cart_items = new ArrayList<>();
}
