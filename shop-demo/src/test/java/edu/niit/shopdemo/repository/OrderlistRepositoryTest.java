package edu.niit.shopdemo.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author ABC
 * @date 2020/4/6 11:37
 */
@SpringBootTest
class OrderlistRepositoryTest {
    @Autowired
    private OrderlistRepository orderlistRepository;
@Test
    void findAll(){
    System.out.println(orderlistRepository.findAll());
}
}