package com.github.imloama.zfarm.common;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;

public interface IBaseService<M extends BaseMapper<T>, T extends BaseModel<?>> extends IService<T>{

}
