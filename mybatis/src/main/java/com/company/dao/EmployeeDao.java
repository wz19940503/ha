package com.company.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.company.bean.Employee;

/**
 * @author wz
 * @category 
 */
public interface EmployeeDao {

	/**
	 * 通过eId查询对象
	 * @param eId
	 * @return
	 */
	public Employee selectOne(int eId);
	/**
	 * 查询所有的对象
	 * @return
	 */
	public List<Employee> selectAll();
	
	/**
	 * 添加对象
	 * @return
	 */
	public void addEmp(Employee emp);
	
	/**
	 * 修改
	 * @param id
	 */
	public void updateEmp(Employee emp);
	
	/**
	 * 删除对象
	 * @param eid
	 */
	public void deleteEmp(int eid);
	
	/**
	 * 多条件查询
	 */
	public List<Employee> querList(String name,char sex);
	
	/**
	 * 多条件查询
	 */
	public List<Employee> querList2(@Param("name") String name,@Param("sex") char sex);
	
	/**
	 * 多条件查询
	 */
	public List<Employee> querList3(Map map);
	
	/**
	 * 模糊查询
	 */
	public  List<Employee> queryByIf(Employee emp);
	
}
