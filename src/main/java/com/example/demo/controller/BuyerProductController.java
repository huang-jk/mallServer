package com.example.demo.controller;

import com.example.demo.ObjectData.ProductCategory;
import com.example.demo.ObjectData.ProductInfo;
import com.example.demo.VO.ProductVO;
import com.example.demo.VO.ResultVO;
import com.example.demo.service.CategoryService;
import com.example.demo.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utils.ResultVOUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 买家商品
 * Created by Administrator on 2019/11/23.
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVO list() {
        // 查询所有的上架商品
        List<ProductInfo> productInfoList  =  productService.findUpAll();
        // 查询所有类目
        List<Integer> categoryList = new ArrayList<>();
        // 循环所有类目类型
        for (ProductInfo productInfo : productInfoList) {
            categoryList.add(productInfo.getCategoryType());
        }
        // 查询类目类型对应的类目
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(categoryList);

        List<ProductVO> productVOList  = new ArrayList<>();
        for (ProductCategory productCategory : productCategoryList) {
            // 设置类目对应的格式
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(productCategory.getCategoryName());
            productVO.setCategoryType(productCategory.getCategoryType());
            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList) {
                // 循环商品信息，类型相同的对应赋值
                if (productVO.getCategoryType().equals(productInfo.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    //方法：把productInfoVO格式有对的字段从productInfo获取赋值
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setList(productInfoVOList);
            productVOList.add(productVO);
        }
        return ResultVOUtils.success(productVOList);
    }
}
