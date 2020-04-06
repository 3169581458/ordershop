package edu.niit.shopdemo.controller;

import edu.niit.shopdemo.entity.Orderlist;
import edu.niit.shopdemo.repository.OrderlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ABC
 * @date 2020/4/6 12:19
 */
@RestController
@RequestMapping("/orderlist")
public class OrderlistHandler {
    @Autowired
    private OrderlistRepository orderlistRepository;
    @GetMapping("/findAll")
    public List<Orderlist> finAll(){
        return orderlistRepository.findAll();
    }
}
