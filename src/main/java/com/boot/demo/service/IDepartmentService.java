package com.boot.demo.service;

import com.boot.demo.entity.Department;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lxt
 * @since 2019-08-20
 */
public interface IDepartmentService extends IService<Department> {

   Department getInfoById(Integer id);
}
