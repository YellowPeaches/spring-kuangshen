package com.xyq.entity;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 用户表(SysUser)实体类
 *
 * @author xiaoG
 * @since 2021-09-06 15:38:43
 */
@Data
@ApiModel("用户实体")
public class SysUser {
    /**
     * 主键
     */
    private Object id;
    /**
     * 归属部门
     */
    private Object deptId;
    /**
     * 登录名
     */
    @ApiModelProperty("用户名")
    private String username;
    /**
     * 密码
     */
    @ApiModelProperty("用户密码")
    private String password;
    /**
     * 姓名
     */
    private String realname;
    /**
     * 性别。0：未知；1：男；2：女
     */
    private Object sex;
    /**
     * 手机号码
     */
    private String phone;
    /**
     * 固定电话
     */
    private String tel;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 用户头像
     */
    private String avatar;
    /**
     * 职务名称
     */
    private String jobTitle;
    /**
     * 用户状态。0：正常；1：禁用
     */
    private Object status;
    /**
     * 排序。值越小越靠前
     */
    private Integer sort;
    /**
     * 删除标识。0：未删除；1：已删除
     */
    private Integer delFlag;
    /**
     * 创建人
     */
    private Object createBy;
    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

}
