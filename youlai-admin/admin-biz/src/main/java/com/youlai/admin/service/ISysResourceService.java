package com.youlai.admin.service;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.youlai.admin.entity.SysResource;
import com.youlai.admin.vo.TreeSelectVO;

import java.util.List;

public interface ISysResourceService extends IService<SysResource> {

    List<SysResource> listForResourceRoles();

    List<TreeSelectVO> listForTreeSelect(LambdaQueryWrapper<SysResource> baseQuery);
}
