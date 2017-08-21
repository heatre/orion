package com.swin.orion.service.impl;

import com.swin.orion.dao.UserMapper;
import com.swin.orion.domain.User;
import com.swin.orion.service.UserService;
import com.swin.orion.core.AbstractService;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by Swin on 2017/08/21.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
}
