package cn.wenhe9.onlineshop.dao;

import cn.wenhe9.onlineshop.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface FoodRepository extends JpaRepository<Food, Integer>, JpaSpecificationExecutor<Food> {
    List<Food> findAllByShopId(int shopId);
}