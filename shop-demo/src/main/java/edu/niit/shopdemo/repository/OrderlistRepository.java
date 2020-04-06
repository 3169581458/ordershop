package edu.niit.shopdemo.repository;

import edu.niit.shopdemo.entity.Orderlist;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ABC
 * @date 2020/4/6 11:34
 */
public interface OrderlistRepository extends JpaRepository<Orderlist,Integer> {
}
