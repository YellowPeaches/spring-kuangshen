package com.xyq.service.impl;

import com.xyq.dao.SysUserDao;
import com.xyq.service.SysUserService;
import com.xyq.entity.SysUser;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource(type = SysUserDao.class)
    private SysUserDao sysUserDao;

    @Override
    public SysUserDao getSysUserDao() {
        return sysUserDao;
    }

    @Override
    public SysUser getById(Object id) {
        return sysUserDao.getById(id);
    }

    @Override
    public SysUser getByEntity(SysUser sysUser) {
        return sysUserDao.getByEntity(sysUser);
    }

    @Override
    public List<SysUser> listByEntity(SysUser sysUser) {
        return sysUserDao.listByEntity(sysUser);
    }

    @Override
    public List<SysUser> listByIds(List<Object> ids) {
        return sysUserDao.listByIds(ids);
    }

    @Override
    public int insert(SysUser sysUser) {
        return sysUserDao.insert(sysUser);
    }

    @Override
    public int insertBatch(List<SysUser> list) {
        return sysUserDao.insertBatch(list);
    }

    @Override
    public int update(SysUser sysUser) {
        return sysUserDao.update(sysUser);
    }

    @Override
    public int updateBatch(List<SysUser> list) {
        return sysUserDao.updateBatch(list);
    }

    @Override
    public int deleteById(Object id) {
        return sysUserDao.deleteById(id);
    }

    @Override
    public int deleteByEntity(SysUser sysUser) {
        return sysUserDao.deleteByEntity(sysUser);
    }

    @Override
    public int deleteByIds(List<Object> list) {
        return sysUserDao.deleteByIds(list);
    }

    @Override
    public int countAll() {
        return sysUserDao.countAll();
    }

    @Override
    public int countByEntity(SysUser sysUser) {
        return sysUserDao.countByEntity(sysUser);
    }

}
