package com.swin.orion.ucenter.service.impl;

import com.swin.orion.ucenter.domain.User;
import com.swin.orion.ucenter.service.UserService;
import com.swin.orion.ucenter.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by Swin on 2017/08/21.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
}
