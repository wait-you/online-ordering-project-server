package cn.wenhe9.onlineshop.service.impl;

import cn.wenhe9.onlineshop.dao.FoodRepository;
import cn.wenhe9.onlineshop.dao.ShopRepository;
import cn.wenhe9.onlineshop.entity.Food;
import cn.wenhe9.onlineshop.entity.Shop;
import cn.wenhe9.onlineshop.service.ShopService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author DuJinliang
 * 2021/11/18
 */
@Service
public class ShopServiceImpl implements ShopService {

    @Resource
    private FoodRepository foodRepository;
    @Resource
    private ShopRepository shopRepository;

    @Override
    public List<Food> foodListByShopId(int shopId) {
        return foodRepository.findAllByShopId(shopId);
    }

    @Override
    public List<Shop> shopList() {
        return shopRepository.findAll();
    }
}
