package com.xyc.springboot.mapper;

import com.xyc.springboot.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper //将接口扫描装配到容器中
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
