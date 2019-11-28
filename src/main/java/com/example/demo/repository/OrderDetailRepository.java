package com.example.demo.repository;

import com.example.demo.ObjectData.OrderDetail;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by Administrator on 2019/11/24.
 */
public interface OrderDetailRepository extends MongoRepository<OrderDetail, String> {
    List<OrderDetail> findByOrderIdIn(String orderId);
}
