package cn.lntu.group07.pojo;

import lombok.Data;

@Data
public class Goods {
    private Integer id;
    private String name;
    private String cover;
    private String image1;
    private String image2;
    private Double price;
    private String intro;
    private Integer stock;
    private Type typeId;
}
