package com.swin.orion.ucenter.dao;

import com.swin.orion.ucenter.core.Mapper;
import com.swin.orion.ucenter.domain.User;

public interface UserMapper extends Mapper<User> {
    @Override
    User selectByPrimaryKey(Object key);
}