package cn.lntu.group07.mappers;

import cn.lntu.group07.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * 从user表检索手机号和密码同时匹配的一条记录
     * @return User对象
     */
    User selectOneByUserPhoneAndUserEmail(@Param("userEmail") String inputEmail,@Param("userPassword") String inputPassword);

    void insertUser(User user);
}
