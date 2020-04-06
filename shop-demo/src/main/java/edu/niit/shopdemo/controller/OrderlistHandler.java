package edu.niit.shopdemo.controller;

import edu.niit.shopdemo.entity.Orderlist;
import edu.niit.shopdemo.repository.OrderlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/save")
    public String save(@RequestBody Orderlist orderlist){
        Orderlist result=orderlistRepository.save(orderlist);
        if(result !=null){
            return "success";
        }else {
            return "error";
        }
    }

    @GetMapping("/findById/{id}")
    public Orderlist findById(@PathVariable("id") Integer id){
        return orderlistRepository.findById(id).get();
    }

    @PutMapping("update")
    public String update(@RequestBody Orderlist orderlist){
        Orderlist result=orderlistRepository.save(orderlist);
        if(result !=null){
            return "success";
        }else {
            return "error";
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        orderlistRepository.deleteById(id);
    }
}
