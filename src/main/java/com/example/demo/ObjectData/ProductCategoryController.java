package com.example.demo.ObjectData;

import com.example.demo.repository.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2019/11/3.
 */
@RestController
public class ProductCategoryController {

    @Autowired
    MongoTemplate mongotemplate;

    @GetMapping("/list")
    public List<ProductCategory> list() {
        List<ProductCategory> list;
        list = mongotemplate.findAll(ProductCategory.class);
        return list;
    }

    @GetMapping("/byId/{categoryId}")
    public ProductCategory byId(@PathVariable("categoryId") Integer categoryId) {
        Query query = new Query(Criteria.where("_id").is(categoryId));
        return mongotemplate.findOne(query,ProductCategory.class);
    }

    @PostMapping("/add")
    public ProductCategory add(@RequestParam("categoryId")  Integer categoryId,
                        @RequestParam("categoryName") String categoryName){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId(categoryId);
        productCategory.setCategoryName(categoryName);
        return mongotemplate.insert(productCategory);
    }


}
