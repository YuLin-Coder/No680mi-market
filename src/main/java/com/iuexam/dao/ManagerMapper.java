package com.iuexam.dao;

import org.apache.ibatis.annotations.Param;

import com.iuexam.entity.Manager;


public interface ManagerMapper {
	
   Manager getbyid(@Param("managerid") String managerid);
   
   boolean update(Manager manager);
   
   Manager getmanager(String managerid);
	
}