package cn.wenhe9.onlineshop.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;

@Table(name = "food", indexes = {
        @Index(name = "shop_id", columnList = "shop_id")
})
@Entity
@Getter
@Setter
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "food_id", nullable = false)
    private Integer id;

    @Column(name = "food_name", length = 20)
    private String foodName;

    @Column(name = "taste", length = 30)
    private String taste;

    @Column(name = "sale_num", length = 10)
    private String saleNum;

    @Column(name = "price")
    private Integer price;

    @Column(name = "count")
    private Integer count;

    @Column(name = "food_pic", length = 200)
    private String foodPic;

    @Column(name = "shop_id")
    private int shopId;
}