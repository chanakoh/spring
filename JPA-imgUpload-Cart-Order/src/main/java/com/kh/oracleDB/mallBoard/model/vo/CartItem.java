package com.kh.oracleDB.mallBoard.model.vo;

import jakarta.persistence.*;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class CartItem {
	
	@Id
	private int id;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="cart_id")
	private Cart cart;
	@JoinColumn(name="item_id")
	private Item item;
	//카트에 담긴 상품 갯수
	private int cartCount;
}




/*
  
 @ManyToOne(fetch=FetchType.EAGER)
 여러 엔티티가 하나의 엔티티에 감싸져서 활용되는 N:1관계를 나타냄 
  fetch=FetchType.EAGER : 가져오기, 감싸진(매핑된) 엔티티를 자바에서 검색할 때 (찿고자할 때 ) 바로 로딩해서 가져올 수 있도록 설정해준 것
  
  
 * */
