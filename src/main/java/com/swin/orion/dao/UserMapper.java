package com.swin.orion.dao;

import com.swin.orion.core.Mapper;
import com.swin.orion.domain.User;

public interface UserMapper extends Mapper<User> {
    @Override
    User selectByPrimaryKey(Object key);
}