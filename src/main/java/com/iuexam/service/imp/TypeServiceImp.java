package com.iuexam.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iuexam.dao.TypeMapper;
import com.iuexam.entity.Type;
import com.iuexam.service.ITypeService;


@Service
public class TypeServiceImp  implements ITypeService{
	@Autowired
	TypeMapper typeMapper;
	public int delete(String protypeid) {
		// TODO Auto-generated method stub
		return typeMapper.deleteByPrimaryKey(protypeid);
	}

	public int insert(Type record) {
		// TODO Auto-generated method stub
		return typeMapper.insert(record);
	}

	public List<Type> getall() {
		// TODO Auto-generated method stub
		return typeMapper.selectByExample(null);
	}

	public Type selectByid(String protypeid) {
		// TODO Auto-generated method stub
		return typeMapper.selectByPrimaryKey(protypeid);
	}

	public boolean update(Type record) {
		// TODO Auto-generated method stub
		return typeMapper.updateByPrimaryKey(record);
	}

	public List<Type> getbyparams(String protypeid, String typename) {
		// TODO Auto-generated method stub
		return typeMapper.getbyparams(protypeid, typename);
	}
	
}
