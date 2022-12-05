package cn.lntu.group07.pojo;

import lombok.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class Order {
    private Integer orderId;
    private Double orderTotal;
    private Integer orderAmount;
    private Integer orderStatus;
    private Integer ordetPayType;
    private String orderName;
    private String orderPhone;
    private String orderAddress;
    private Date orderDateTime;
    private User orderUserId;

    /**
     * 传入dateTime的特殊处理setter
     * @param inputDateTime 字符串形式的详细日期时间
     */
    public void setDateTime(String inputDateTime) {
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
//            字符串转日期
            this.orderDateTime = f.parse(inputDateTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    /**
     * 从dateTime中获取字符串形式的值
     * @return 日期时间 字符串形式
     */
    public String getDateTimeStr() {
//        日期转字符串
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.orderDateTime);
    }
}
