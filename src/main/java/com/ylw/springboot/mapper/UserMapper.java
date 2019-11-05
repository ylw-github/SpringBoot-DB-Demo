package com.ylw.springboot.mapper;


import com.ylw.springboot.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("SELECT * FROM t_user WHERE NAME = #{name}")
    User findByName(@Param("name") String name);

    @Insert("INSERT INTO t_user(uuid,name, age) VALUES(#{uuid},#{name}, #{age})")
    int insert(@Param("uuid") String uuid, @Param("name") String name, @Param("age") Integer age);
}
