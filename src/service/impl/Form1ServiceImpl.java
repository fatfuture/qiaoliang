package service.impl;

import dao.Form1Dao;
import dao.impl.Form1DaoImpl;
import pojo.Form1;
import service.Form1Service;

public class Form1ServiceImpl implements Form1Service {
    Form1Dao form1Dao=new Form1DaoImpl();
    @Override
    public int saveForm1(Form1 form1) {
        return form1Dao.saveForm1(form1);
    }

    @Override
    public Form1 queryforoneForm1Byqiaoliangmingcheng(String key) {
        return form1Dao.queryforoneForm1Byqiaoliangmingcheng(key);
    }
    @Override
    public int deleteForm1Byqiaoliangmingcheng(String key){
        return form1Dao.deleteForm1Byqiaoliangmingcheng(key);
    }

    @Override
    public int updateForm1Byqiaoliangmingcheng(Form1 form1) {
        return form1Dao.updateForm1Byqiaoliangmingcheng(form1);
    }
}


