package com.example.demo.service.impl;

import com.example.demo.ObjectData.ProductInfo;
import com.example.demo.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2019/11/23.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void testFindOne() throws Exception {

    }

    @Test
    public void testFindAll() throws Exception {

    }

    @Test
    public void testFindUpAll() throws Exception {

    }

    @Test
    public void testSave() throws Exception {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("皮皮虾");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好吃虾子");
        productInfo.setProductIcon(("http:baidu.com"));
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(2);
        ProductInfo result = productService.save(productInfo);
        Assert.assertNotNull(result);
    }
}