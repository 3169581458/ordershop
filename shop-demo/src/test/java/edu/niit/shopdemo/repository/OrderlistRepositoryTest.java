package edu.niit.shopdemo.repository;

import edu.niit.shopdemo.entity.Orderlist;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;

/**
 * @author ABC
 * @date 2020/4/6 11:37
 */
@SpringBootTest
@Repository
class OrderlistRepositoryTest {
    @Autowired
    private OrderlistRepository orderlistRepository;
@Test
    void findAll(){
    System.out.println(orderlistRepository.findAll());
}
@Test
    void update(){
    Orderlist orderlist = new Orderlist();
    orderlist.setGoods_id(8);
    orderlist.setGoods_name("bbb");
    orderlist.setGoods_price(22);
    orderlist.setGoods_num(5);
    Orderlist orderlist1= orderlistRepository.save(orderlist);
}
}