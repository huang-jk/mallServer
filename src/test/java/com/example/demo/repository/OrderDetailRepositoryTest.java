package com.example.demo.repository;

import com.example.demo.ObjectData.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2019/11/24.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {


    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest() throws  Exception {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("65454");
        orderDetail.setOrderId("1212");
        orderDetail.setProductId("sdsdsd");
        orderDetail.setProductName("吊牌洗衣水");
        orderDetail.setProductPrice(new BigDecimal(8.5));
        orderDetail.setProductQuantity(2);
        orderDetail.setProductIcon("www.baidu.com");
        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotNull(result);
    }

    @Test
    public void testFindOrderIdIn() throws Exception {
        List<OrderDetail> list = repository.findByOrderIdIn("1212");
        Assert.assertNotEquals( 0, list.size());
    }
}