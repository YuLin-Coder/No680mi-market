package com.iuexam.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iuexam.dao.ManagerMapper;
import com.iuexam.entity.Manager;
import com.iuexam.service.IManagerService;


@Service
public class ManagerServiceImp implements IManagerService{

	@Autowired
	ManagerMapper managerMapper;
	public Manager getbyid(String managerid,String pwd) {
		Manager manager=managerMapper.getbyid(managerid);
		if(manager!=null) {
			if(manager.getPwd().equals(pwd)) {
				return manager;
			}
		}
		
		return null;
	}

	public boolean update(Manager manager) {
		// TODO Auto-generated method stub
		return managerMapper.update(manager);
	}

	public Manager getmanager(String managerid) {
		// TODO Auto-generated method stub
		return managerMapper.getbyid(managerid);
	}

}
