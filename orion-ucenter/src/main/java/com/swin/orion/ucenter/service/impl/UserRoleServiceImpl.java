package com.swin.orion.ucenter.service.impl;

import com.swin.orion.ucenter.dao.UserRoleMapper;
import com.swin.orion.ucenter.domain.UserRole;
import com.swin.orion.ucenter.service.UserRoleService;
import com.swin.orion.ucenter.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Swin on 2017/08/21.
 */
@Service
@Transactional
public class UserRoleServiceImpl extends AbstractService<UserRole> implements UserRoleService {
    @Resource
    private UserRoleMapper userRoleMapper;

}
