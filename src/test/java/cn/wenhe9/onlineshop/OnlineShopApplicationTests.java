package cn.wenhe9.onlineshop;

import cn.wenhe9.onlineshop.dao.ShopRepository;
import cn.wenhe9.onlineshop.entity.Shop;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class OnlineShopApplicationTests {

    @Resource
    private ShopRepository shopRepository;

    @Test
    void contextLoads() {
        List<Shop> shopList = shopRepository.findAll();

        for (Shop shop : shopList) {
            System.out.println(shop);
        }
    }

}
