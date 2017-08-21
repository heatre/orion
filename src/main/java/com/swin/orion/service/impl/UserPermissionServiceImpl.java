package com.swin.orion.service.impl;

import com.swin.orion.dao.UserPermissionMapper;
import com.swin.orion.domain.UserPermission;
import com.swin.orion.service.UserPermissionService;
import com.swin.orion.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/08/21.
 */
@Service
@Transactional
public class UserPermissionServiceImpl extends AbstractService<UserPermission> implements UserPermissionService {
    @Resource
    private UserPermissionMapper userPermissionMapper;

}
