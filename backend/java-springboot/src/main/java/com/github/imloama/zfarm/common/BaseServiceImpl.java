package com.github.imloama.zfarm.common;

import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import lombok.Data;

@Data
public abstract class BaseServiceImpl<M extends BaseMapper<T>, T extends BaseModel<?>> implements IBaseService<M, T> {

	@Autowired
	protected M baseMapper;

}
