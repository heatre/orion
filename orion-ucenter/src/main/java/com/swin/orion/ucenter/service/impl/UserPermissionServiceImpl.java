package com.swin.orion.ucenter.service.impl;

import com.swin.orion.ucenter.dao.UserPermissionMapper;
import com.swin.orion.ucenter.domain.UserPermission;
import com.swin.orion.ucenter.service.UserPermissionService;
import com.swin.orion.ucenter.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Swin on 2017/08/21.
 */
@Service
@Transactional
public class UserPermissionServiceImpl extends AbstractService<UserPermission> implements UserPermissionService {
    @Resource
    private UserPermissionMapper userPermissionMapper;

}
