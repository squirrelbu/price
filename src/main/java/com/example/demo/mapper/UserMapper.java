package com.example.demo.mapper;

import com.example.demo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 关注公众号：MarkerHub
 * @since 2022-08-21
 */
public interface UserMapper extends BaseMapper<User> {

    @Insert("INSERT INTO user(name,phone,create_time,age) VALUES(#{name}, #{phone}, #{createTime},#{age}")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
        // keyProperty java对象的属性；keyColumn表示数据库的字段
    int insert(User user);

}
