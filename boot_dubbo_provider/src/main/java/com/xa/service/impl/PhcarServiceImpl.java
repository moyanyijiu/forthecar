package com.xa.service.impl;

import com.xa.mapper.PhcarMapper;
import com.xa.pojo.Phcar;
import com.xa.service.PhcarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class PhcarServiceImpl implements PhcarService {

    @Resource
    PhcarMapper phcarMapper;

    @Override
    public List<Phcar> getAllPhcar() {
        return phcarMapper.selectByExample(null);
    }

    @Override
    public Phcar getOnePhcar(Integer cid) {
        return phcarMapper.selectByPrimaryKey(cid);
    }
}
