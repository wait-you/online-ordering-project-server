package cn.wenhe9.onlineshop.controller;

import cn.wenhe9.onlineshop.dao.ShopRepository;
import cn.wenhe9.onlineshop.entity.Food;
import cn.wenhe9.onlineshop.entity.Shop;
import cn.wenhe9.onlineshop.service.ShopService;
import javassist.bytecode.Descriptor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author DuJinliang
 * 2021/11/18
 */
@RestController
@RequestMapping("/onlineShop")
public class ShopController {

    @Resource
    private ShopService service;

    @GetMapping("/shopList")
    public List<Shop> shopList(){
        return service.shopList();
    }

    @GetMapping("/foodList/{shopId}")
    public List<Food> foodList(@PathVariable(name = "shopId") int shopId){
        return service.foodListByShopId(shopId);
    }
}
