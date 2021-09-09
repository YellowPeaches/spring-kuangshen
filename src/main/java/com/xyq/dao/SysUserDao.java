package com.xyq.dao;

import com.xyq.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface SysUserDao {

    SysUser getById(Object id);

    List<SysUser> listByEntity(SysUser sysUser);

    SysUser getByEntity(SysUser sysUser);

    List<SysUser> listByIds(List<Object> list);

    int insert(SysUser sysUser);

    int insertBatch(List<SysUser> list);

    int update(SysUser sysUser);

    int updateByField(@Param("where") SysUser where, @Param("set") SysUser set);

    int updateBatch(List<SysUser> list);

    int deleteById(Object id);

    int deleteByEntity(SysUser sysUser);

    int deleteByIds(List<Object> list);

    int countAll();

    int countByEntity(SysUser sysUser);

}
