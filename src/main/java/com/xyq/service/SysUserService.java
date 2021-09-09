package com.xyq.service;

import com.xyq.dao.SysUserDao;
import com.xyq.entity.SysUser;

import java.util.List;

public interface SysUserService {

    SysUserDao getSysUserDao();

    SysUser getById(Object id);

    SysUser getByEntity(SysUser sysUser);

    List<SysUser> listByEntity(SysUser sysUser);

    List<SysUser> listByIds(List<Object> ids);

    int insert(SysUser sysUser);

    int insertBatch(List<SysUser> list);

    int update(SysUser sysUser);

    int updateBatch(List<SysUser> list);

    int deleteById(Object id);

    int deleteByEntity(SysUser sysUser);

    int deleteByIds(List<Object> list);

    int countAll();

    int countByEntity(SysUser sysUser);
}
