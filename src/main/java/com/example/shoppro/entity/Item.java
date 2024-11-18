package com.example.shoppro.entity;

import com.example.shoppro.constant.ItemSellStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="item")
public class Item {

    @Id
    @Column(name="item_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id; //상품코드

    @Column(nullable = false,length = 50)
    private String itemNm; //상품명
    @Column(name="price", nullable = false)
    private int price;  //가격
    @Column(nullable = false)
    private int stockNumber;    //재고수량

    @Lob
    @Column(nullable = false)
    private String itemDetail;  //상품상세설명

    @Enumerated(EnumType.STRING)
    private ItemSellStatus itemSellStatus; //상품판매상태
    private LocalDateTime regTime;          //상품등록시간
    private LocalDateTime updateTime;       //상품수정시간





}
