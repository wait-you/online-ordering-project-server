package cn.wenhe9.onlineshop.service;

import cn.wenhe9.onlineshop.entity.Food;
import cn.wenhe9.onlineshop.entity.Shop;

import java.util.List;

/**
 * @author DuJinliang
 * 2021/11/18
 */
public interface ShopService {
    List<Food> foodListByShopId(int shopId);

    List<Shop> shopList();
}
