package com.example.demo.repository;

import com.example.demo.ObjectData.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2019/11/24.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

    @Test
    public void  saveTest() throws Exception {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1213");
        orderMaster.setBuyerAddress("亿联网络");
        orderMaster.setBuyerName("黄某某");
        orderMaster.setBuyerPhone("18080356");
        orderMaster.setOrderAmount(new BigDecimal(2.5));
        orderMaster.setBuyerOpenid("1213214");
        OrderMaster result =  repository.save(orderMaster);
        Assert.assertNotNull(result);
    }

    @Test
    public void testFindByBuyerOpenIdIn() throws Exception {
        PageRequest pageRequest = new PageRequest(1, 3);

        Page<OrderMaster> result = repository.findByBuyerOpenidIn("121314", pageRequest);

        Assert.assertNotEquals( 0, result.getTotalElements());

    }
}