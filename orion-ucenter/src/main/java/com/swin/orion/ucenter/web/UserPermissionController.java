package com.swin.orion.ucenter.web;

import com.swin.orion.ucenter.core.Result;
import com.swin.orion.ucenter.core.ResultGenerator;
import com.swin.orion.ucenter.domain.UserPermission;
import com.swin.orion.ucenter.service.UserPermissionService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by Swin on 2017/08/21.
*/
@RestController
@RequestMapping("/user/permission")
public class UserPermissionController {
    @Resource
    private UserPermissionService userPermissionService;

    @PostMapping
    public Result add(@RequestBody UserPermission userPermission) {
        userPermissionService.save(userPermission);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        userPermissionService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody UserPermission userPermission) {
        userPermissionService.update(userPermission);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        UserPermission userPermission = userPermissionService.findById(id);
        return ResultGenerator.genSuccessResult(userPermission);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<UserPermission> list = userPermissionService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
