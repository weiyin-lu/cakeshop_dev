package cn.lntu.group07.pojo;

import lombok.Data;

@Data
public class OrderItem {
    private Integer orderItemId;
    private Double orderItemPrice;
    private Integer orderItemAmount;
    private Integer orderItemGoodsId;
    private Integer orderItemOrderId;
}
