package com.example.demo.repository;

import com.example.demo.ObjectData.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Administrator on 2019/11/24.
 */
public interface OrderMasterRepository extends MongoRepository<OrderMaster, String> {
    Page<OrderMaster> findByBuyerOpenidIn(String buyerOpenid, Pageable pageable);
}
