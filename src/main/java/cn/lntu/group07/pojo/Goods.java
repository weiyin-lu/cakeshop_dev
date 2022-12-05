package cn.lntu.group07.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Goods {
    private Integer goodsId;
    private String goodsName;
    private String goodsCover;
    private String goodsImage1;
    private String goodsImage2;
    private Double goodsPrice;
    private String goodsIntro;
    private Integer goodsStock;
    private Integer goodsTypeId;
    private List<Recommend> recommend;
}
