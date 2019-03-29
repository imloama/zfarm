package com.github.imloama.zfarm.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.imloama.zfarm.model.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}