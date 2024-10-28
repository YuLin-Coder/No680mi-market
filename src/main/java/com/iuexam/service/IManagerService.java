package com.iuexam.service;

import com.iuexam.entity.Manager;


public interface IManagerService {
	   Manager getbyid( String managerid,String pwd);
	   
	   boolean update(Manager manager);
	   
	   Manager getmanager(String managerid);
}
