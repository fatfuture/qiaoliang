package service.impl;

import dao.Form2Dao;
import dao.impl.Form2DaoImpl;
import pojo.Form1;
import pojo.Form2;
import service.Form2Service;

public class Form2ServiceImpl implements Form2Service{
    Form2Dao form2Dao=new Form2DaoImpl();

    @Override
    public int saveForm2(Form2 form2) {
        return form2Dao.saveForm2(form2);
    }

    @Override
    public Form2 queryforoneForm2Byqiaoliangmingcheng(String key) {
        return form2Dao.queryforoneForm2Byqiaoliangmingcheng(key);
    }
    @Override
    public int deleteForm2Byqiaoliangmingcheng(String key){
        return form2Dao.deleteForm2Byqiaoliangmingcheng(key);
    }

    @Override
    public int updateForm2Byqiaoliangmingcheng(Form2 form2) {
        return form2Dao.updateForm2Byqiaoliangmingcheng(form2);
    }

}
