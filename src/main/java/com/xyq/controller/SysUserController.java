package com.xyq.controller;

import com.xyq.entity.SysUser;
import com.xyq.service.SysUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @ApiOperation("test的接口")
    @GetMapping("/get/{id}")
    public SysUser getById(@PathVariable Object id) {
        SysUser sysUser = sysUserService.getById(id);
        return sysUser != null ? sysUser : new SysUser();
    }

    @GetMapping("/get")
    public SysUser getByEntity(SysUser sysUser) {
        return sysUserService.getByEntity(sysUser);
    }

    @GetMapping("/list")
    public List<SysUser> list(SysUser sysUser) {
        List<SysUser> sysUserList = sysUserService.listByEntity(sysUser);
        return sysUserList;
    }

    @PostMapping("/insert")
    public SysUser insert(@RequestBody SysUser sysUser) {
        sysUserService.insert(sysUser);
        return sysUser;
    }

    @PutMapping("/update")
    public int update(@RequestBody SysUser sysUser) {
        return sysUserService.update(sysUser);
    }

    @DeleteMapping("/delete/{id}")
    public int deleteOne(@PathVariable Object id) {
        return sysUserService.deleteById(id);
    }

    @DeleteMapping("/delete")
    public int deleteBatch(@RequestBody List<Object> ids) {
        int result = 0;
        if (ids != null && ids.size() > 0) {
            result = sysUserService.deleteByIds(ids);
        }
        return result;
    }

}
