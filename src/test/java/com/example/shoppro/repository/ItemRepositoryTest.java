package com.example.shoppro.repository;

import com.example.shoppro.constant.ItemSellStatus;
import com.example.shoppro.entity.Item;
import groovy.util.logging.Log4j2;
import org.apache.juli.logging.Log;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@Log4j2
class ItemRepositoryTest {

    @Autowired
    ItemRepository itemRepository;

    @Test
    @DisplayName("상품 저장 테스트")
    public void createItemTest(){


            Item item =
                    Item.builder()
                            .itemNm("테스트상품")
                            .price(10000)
                            .itemDetail("상세설명")
                            .itemSellStatus(ItemSellStatus.SELL)
                            .stockNumber(100)
                            .regTime(LocalDateTime.now())
                            .updateTime(LocalDateTime.now())
                            .build();

            for(int i=0; i<200; i++) {
                 item.setItemNm(item.getItemNm()+i);
                item.setItemDetail(item.getItemDetail()+i);
                item.setPrice(item.getPrice()+i);

                Item item1=
                        itemRepository.save(item);
                    log.info(item1);

            }

                itemListA.forEach(item->log.info(item));
                System.out.println("-------------");

                itemListA =
                         itemRepository.selectwhereItemNm("테스트상품2");
                itemListA.forEach(item->log.info(item));
                System.out.println("-------------");
        itemListA =
                itemRepository.findItemNmContaining("테스트");
        itemListA.forEach(item->log.info(item));
        System.out.println("-------------");
        itemListA =
                itemRepository.selectwhereItemNm("1");
        itemListA.forEach(item->log.info(item));
        System.out.println("-------------");

    }

}