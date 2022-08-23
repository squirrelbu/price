package com.example.demo.controller;


import com.example.demo.entity.Price;
import com.example.demo.mapper.PriceMapper;
import com.example.demo.service.PriceService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 关注公众号：MarkerHub
 * @since 2022-08-21
 */
@RestController
@RequestMapping("/price")



public class PriceController {
    @Autowired(required = false)
    private PriceMapper priceMapper;
    @Autowired
    PriceService priceService;
    @RequestMapping(value = "/get")
    public List<Price> getUsers() {
        System.out.print("请求次数--");
        List<Price> prices = priceMapper.selectList(null);
        return prices;
    }

    @RequestMapping(value = "/save")
    public boolean save() {
        Price price = new Price();
        price.setPrice(1580.);
        price.setId(1L);
        price.setTime(LocalDateTime.now());
        return priceService.save(price);
    }



}

