package com.kh.oracleDB.mallBoard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kh.oracleDB.mallBoard.model.vo.Cart;

public interface CartItemRepository extends JpaRepository<Cart, Integer> {

}
