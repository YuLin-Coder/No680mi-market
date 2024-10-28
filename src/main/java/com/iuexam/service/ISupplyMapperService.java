package com.iuexam.service;

import java.util.List;

import com.iuexam.entity.Supply;


public interface ISupplyMapperService {

    int delete(String supid);

    int insert(Supply record);

    List<Supply> getall();

    Supply getbyid(String supid);

    boolean update(Supply record);
    List<Supply> getbyparams(String supid, String suppname);
}
