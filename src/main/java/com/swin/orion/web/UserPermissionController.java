package com.swin.orion.web;
import com.swin.orion.core.Result;
import com.swin.orion.core.ResultGenerator;
import com.swin.orion.domain.UserPermission;
import com.swin.orion.service.UserPermissionService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/08/21.
*/
@RestController
@RequestMapping("/user/permission")
public class UserPermissionController {
    @Resource
    private UserPermissionService userPermissionService;

    @PostMapping("/add")
    public Result add(UserPermission userPermission) {
        userPermissionService.save(userPermission);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        userPermissionService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(UserPermission userPermission) {
        userPermissionService.update(userPermission);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        UserPermission userPermission = userPermissionService.findById(id);
        return ResultGenerator.genSuccessResult(userPermission);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<UserPermission> list = userPermissionService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
