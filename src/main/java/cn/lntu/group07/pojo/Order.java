package cn.lntu.group07.pojo;

import lombok.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class Order {
    private Integer id;
    private Double total;
    private Integer amount;
    private Integer status;
    private Integer paytype;
    private String name;
    private String phone;
    private String address;
    private Date dateTime;
    private User userId;

    /**
     * 传入dateTime的特殊处理setter
     * @param dateTime 字符串形式的详细日期时间
     */
    public void setDateTime(String dateTime) {
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            this.dateTime = f.parse(dateTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    /**
     * 从dateTime中获取字符串形式的值
     * @return 日期时间 字符串形式
     */
    public String getDateTimeStr() {
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(this.dateTime);
    }
}
