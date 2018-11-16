package com.mr.mapper;

import com.mr.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by YinShuai on 2018/11/3.
 */
@Mapper
public interface UserMapper {

    List<User> queryUser();
}
