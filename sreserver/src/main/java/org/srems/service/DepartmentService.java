package org.srems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.support.NullValue;
import org.springframework.stereotype.Service;
import org.srems.mappers.DepartmentMapper;
import org.srems.models.Department;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;

    /**
     * 递归获取指定部门下所有部门列表
     * @param id 指定部门id
     * @return
     */
    public List<Department> getDepById(String id)
    {
        return null;
    }

    /**
     * 获取所有部门
     * @return
     */
    public List<Department> getAllDeps()
    {
//        return departmentMapper.;
        return null;
    }

    /**
     * 添加部门
     */
    public void addDept()
    {

    }


}
