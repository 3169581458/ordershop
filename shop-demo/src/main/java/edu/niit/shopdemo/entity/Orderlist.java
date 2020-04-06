package edu.niit.shopdemo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author ABC
 * @date 2020/4/6 11:29
 */
@Entity
@Data
public class Orderlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer goods_id;
    private String goods_name;
    private Integer goods_price;
    private Integer goods_num;
}
