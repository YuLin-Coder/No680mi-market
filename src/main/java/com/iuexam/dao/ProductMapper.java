package com.iuexam.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.iuexam.entity.Product;
import com.iuexam.entity.ProductExample;

public interface ProductMapper {
    int deleteByPrimaryKey(String proid);

    int insert(Product record);


    List<Product> selectByExample(ProductExample example);

    Product selectByPrimaryKey(String proid);

    boolean updateByPrimaryKey(Product record);
//    多条件查询
    List<Product> getbyparams(@Param("proid") String proid,@Param("supname")String supname,@Param("pname")String pname,@Param("protype")String protype );
}