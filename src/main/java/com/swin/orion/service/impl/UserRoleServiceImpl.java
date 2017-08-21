package com.swin.orion.service.impl;

import com.swin.orion.dao.UserRoleMapper;
import com.swin.orion.domain.UserRole;
import com.swin.orion.service.UserRoleService;
import com.swin.orion.core.AbstractService;
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
