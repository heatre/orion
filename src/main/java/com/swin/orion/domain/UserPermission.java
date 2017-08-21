package com.swin.orion.domain;

import javax.persistence.*;

@Table(name = "user_permission")
public class UserPermission {
    /**
     * 权限id
     */
    @Id
    @Column(name = "permission_id")
    private Integer permissionId;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 获取权限id
     *
     * @return permission_id - 权限id
     */
    public Integer getPermissionId() {
        return permissionId;
    }

    /**
     * 设置权限id
     *
     * @param permissionId 权限id
     */
    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * 获取权限名称
     *
     * @return name - 权限名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置权限名称
     *
     * @param name 权限名称
     */
    public void setName(String name) {
        this.name = name;
    }
}