package cn.lntu.group07.pojo;

import lombok.Data;

@Data
public class User {
    private Integer userId;
    private String userUserName;
    private String userEmail;
    private String userPassword;
    private String userName;
    private String userPhone;
    private String userAddress;
    private Boolean userIsAdmin;
    private String userIsValidate;
}
