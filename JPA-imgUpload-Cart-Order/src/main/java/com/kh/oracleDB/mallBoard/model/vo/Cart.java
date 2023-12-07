package com.kh.oracleDB.mallBoard.model.vo;

import java.util.*;

import jakarta.persistence.*;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Cart {
		//구매자의 장바구니
	@Id
	private int id;
	
	@OneToOne()//fetch에 관련된 타입을 작성해줄 것
	@JoinColumn(name="user_id")
	User user;//구매자의 장바구니
	
	@OneToMany(mappedBy = "cart")//장바구니 안에 상품들이 담길 예정이기 때문에 장바구니 One : 상품들 Many
	private List<CartItem> cart_item = new ArrayList<>();
}
