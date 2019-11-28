package com.example.demo.service.impl;

import com.example.demo.ObjectData.OrderDetail;
import com.example.demo.dto.OrderDTO;
import com.example.demo.service.OrderService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by yl2258 on 2019/11/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceImplTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void testCreate() throws Exception {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName("底先生");
        orderDTO.setBuyerAddress("泊寓");
        orderDTO.setBuyerPhone("151564123132");
        orderDTO.setBuyerOpenid("6666666");

        //购物车
        List<OrderDetail> orderDetailList = new ArrayList<>();
        OrderDetail o1 = new OrderDetail();
        o1.setProductId("12345673333");
        o1.setProductQuantity(1);
        orderDetailList.add(o1);

        orderDTO.setOrderDetailList(orderDetailList);

        OrderDTO result = orderService.create(orderDTO);
        Assert.assertNotNull(result);
    }

    @Test
    public void testFindOne() throws Exception {

    }

    @Test
    public void testFindList() throws Exception {

    }

    @Test
    public void testCancel() throws Exception {

    }

    @Test
    public void testFinish() throws Exception {

    }

    @Test
    public void testPaid() throws Exception {

    }
}