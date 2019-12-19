package com.xiong.dao;


import com.xiong.domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    @Select("select * from u_user where u_name = #{u_name} and u_password = #{u_password}")
    User Login(String u_name, String u_password)throws Exception;
}
