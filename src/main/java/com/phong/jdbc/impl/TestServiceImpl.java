package com.phong.jdbc.impl;

import com.phong.jdbc.dao.OwnCodeMapper;
import com.phong.jdbc.dynamic.DataSourceType;
import com.phong.jdbc.dynamic.annotation.DataSource;
import com.phong.jdbc.model.OwnCode;
import com.phong.jdbc.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestServiceImpl implements ITestService {

    @Autowired
    private OwnCodeMapper ownCodeMapper;
    @DataSource(DataSourceType.MASTER)
    @Override
    public String save() {
        System.out.println("=======save======Entering the main library operation ========save======");
        System.out.println("Delete the number of affected rows:" + this.ownCodeMapper.deleteByPrimaryKey(1));
        return null;
    }
    @DataSource(DataSourceType.MASTER)
    @Override
    public String insert() {
        OwnCode ownCode=new OwnCode();
        ownCode.setcId(15);
        ownCode.setcCode("10");
        ownCode.setcMsg("ahihi");
        ownCode.setExtend1("ahihi");
        ownCode.setExtend2("ahihi");
        ownCode.setExtend3("ahihi");
        ownCode.setExtend4("ahihi");
        System.out.println("=======insert======Entering the main library operation ========insert======");
        System.out.println("Delete the number of affected rows:" + this.ownCodeMapper.insert(ownCode));
        return null;
    }
    @DataSource(DataSourceType.SLAVE)
    @Override
    public String query() {
        System.out.println("=======query======Entering from the library operation =========query=====");
        System.out.println("Query result:" + this.ownCodeMapper.selectByPrimaryKey(1));
        return null;
    }
}
