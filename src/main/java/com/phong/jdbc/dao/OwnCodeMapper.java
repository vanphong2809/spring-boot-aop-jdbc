package com.phong.jdbc.dao;

import com.phong.jdbc.model.OwnCode;

import java.util.List;

public interface OwnCodeMapper {
    int deleteByPrimaryKey(Integer cId);
    int insert(OwnCode code);
    int insertSelective(OwnCode code);
    OwnCode selectByPrimaryKey(Integer cId);
    int updateByPrimaryKeySelective(OwnCode code);
    int updateByPrimaryKey(OwnCode code);
    List<OwnCode> selectCodes();
}
