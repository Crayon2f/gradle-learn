package com.crayon2f.dao;

import com.crayon2f.dao.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by feiFan.gou on 2017/11/27 15:30.
 */
@Mapper
public interface UserDao {

    @Select("select * from user where id = #{id}")
    User fetchById(Integer id);
}
