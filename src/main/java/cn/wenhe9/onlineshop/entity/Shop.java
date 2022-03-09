package cn.wenhe9.onlineshop.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "shop")
@Entity
@Getter
@Setter
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "shop_name", length = 20)
    private String shopName;

    @Lob
    @Column(name = "sale_num")
    private String saleNum;

    @Column(name = "offer_price")
    private Integer offerPrice;

    @Column(name = "distributionCost")
    private Integer distributionCost;

    @Column(name = "welfare", length = 200)
    private String welfare;

    @Column(name = "time", length = 50)
    private String time;

    @Column(name = "shopPic", length = 200)
    private String shopPic;

    @Column(name = "shop_notice", length = 200)
    private String shopNotice;
}