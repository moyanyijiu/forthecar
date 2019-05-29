package com.xa.service;

import com.xa.pojo.Phcar;

import java.util.List;

public interface PhcarService {

    List<Phcar> getAllPhcar();

    Phcar getOnePhcar(Integer cid);


}
