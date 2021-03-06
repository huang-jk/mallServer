package com.example.demo.service.impl;

import com.example.demo.ObjectData.ProductInfo;
import com.example.demo.dto.CartDTO;
import com.example.demo.enums.PayStatusEnum;
import com.example.demo.enums.ProductStatusEnum;
import com.example.demo.enums.ResultEnum;
import com.example.demo.repository.ProductInfoRepository;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.expression.ExpressionException;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by yl2258 on 2019/11/19.
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductInfoRepository repository;

    @Override
    public ProductInfo findOne(String productId) {
        return repository.findById(productId).get();
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findByProductStatusIn(ProductStatusEnum.DOWN.getCode());
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }

    @Override
    public void increaseStock(List<CartDTO> list) {

    }

    @Override
    public void decreaseStock(List<CartDTO> list) {
        for (CartDTO cartDTO : list) {
            ProductInfo productInfo =  this.findOne(cartDTO.getProductId());
            if(productInfo == null){
                throw new ExpressionException(ResultEnum.PRODUCT_NOT_EXIST.getMessage());
            }
            Integer stock = productInfo.getProductStock() - cartDTO.getProductQuantity();
            if(stock < 0) {
                throw new ExpressionException(ResultEnum.PRODUCT_STOCK_ERROR.getMessage());
            }
            productInfo.setProductStock(stock);
            this.save(productInfo);
        }
    }

}
