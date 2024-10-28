package com.iuexam.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.iuexam.entity.CusRetire;
import com.iuexam.entity.CusRetireExample;

public interface CusRetireMapper {
    int deleteByPrimaryKey(String saleid);

    int insert(CusRetire record);


    List<CusRetire> selectByExample(CusRetireExample example);

    CusRetire selectByPrimaryKey(String saleid);


    Boolean updateByPrimaryKey(CusRetire record);
    
    List<CusRetire> getbyparams(@Param("proid") String proid,@Param("saleid")String saleid,@Param("pname")String pname,@Param("retdate")String retdate );
}