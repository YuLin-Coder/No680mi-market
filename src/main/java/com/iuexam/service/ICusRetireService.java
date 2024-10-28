package com.iuexam.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.iuexam.entity.CusRetire;


public interface ICusRetireService {
	int delete(String saleid);

    int insert(CusRetire record);


    List<CusRetire> getall();

    CusRetire getbyid(String saleid);


    Boolean update(CusRetire record);
    
    List<CusRetire> getbyparams(@Param("proid") String proid,@Param("saleid")String saleid,@Param("pname")String pname,@Param("retdate")String retdate );


}
