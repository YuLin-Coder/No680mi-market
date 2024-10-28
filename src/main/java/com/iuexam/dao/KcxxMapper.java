package com.iuexam.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.iuexam.entity.Kcxx;
import com.iuexam.entity.KcxxExample;

public interface KcxxMapper {
    int deleteByPrimaryKey(String proid);

    int insert(Kcxx record);

    List<Kcxx> selectByExample(KcxxExample example);

    Kcxx selectByPrimaryKey(String proid);

    Boolean updateByPrimaryKey(Kcxx record);
//    库存表关联商品信息表
    Kcxx kcxxWithPro(String proid);
//  库存表关联商品信息表（库存预警表）
    List<Kcxx> kcxxWithPronum();
    List<Kcxx> kcxxWithProdata();
    List<Kcxx> getbyparams(@Param("proid") String proid,@Param("pname")String pname);
}