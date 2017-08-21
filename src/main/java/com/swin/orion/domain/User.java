package com.swin.orion.domain;

import java.util.Date;
import javax.persistence.*;

public class User {
    /**
     * 用户id自增
     */
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮件地址
     */
    private String email;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 联系方式
     */
    private String phone;

    /**
     * Man:男 Female:女
     */
    private Boolean sex;

    /**
     * 0:正常 1:异常
     */
    private Boolean status;

    /**
     * 记录创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 记录更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取用户id自增
     *
     * @return user_id - 用户id自增
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id自增
     *
     * @param userId 用户id自增
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取邮件地址
     *
     * @return email - 邮件地址
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮件地址
     *
     * @param email 邮件地址
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取用户昵称
     *
     * @return nickname - 用户昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置用户昵称
     *
     * @param nickname 用户昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取用户头像
     *
     * @return avatar - 用户头像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置用户头像
     *
     * @param avatar 用户头像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 获取联系方式
     *
     * @return phone - 联系方式
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系方式
     *
     * @param phone 联系方式
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取Man:男 Female:女
     *
     * @return sex - Man:男 Female:女
     */
    public Boolean getSex() {
        return sex;
    }

    /**
     * 设置Man:男 Female:女
     *
     * @param sex Man:男 Female:女
     */
    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    /**
     * 获取0:正常 1:异常
     *
     * @return status - 0:正常 1:异常
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置0:正常 1:异常
     *
     * @param status 0:正常 1:异常
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取记录创建时间
     *
     * @return create_time - 记录创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置记录创建时间
     *
     * @param createTime 记录创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取记录更新时间
     *
     * @return update_time - 记录更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置记录更新时间
     *
     * @param updateTime 记录更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}