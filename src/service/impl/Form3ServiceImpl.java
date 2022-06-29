package service.impl;

import dao.Form3Dao;
import dao.impl.Form3DaoImpl;
import pojo.Form3;
import service.Form3Service;

import java.util.List;

public class Form3ServiceImpl implements Form3Service {
    Form3Dao form3Dao=new Form3DaoImpl();

    @Override
    public int saveForm3(Form3 form3) {
         return form3Dao.saveForm3(form3);
    }

    @Override
    public Form3 queryforoneForm3ByGoujianbianhao(String key) {
        return form3Dao.queryforoneForm3ByGoujianbianhao(key);
    }

    @Override
    public List<Form3> queryForm3ByGoujianbianhao(String key) {
        return form3Dao.queryForm3ByGoujianbianhao(key);
    }

    @Override
    public int deleteForm3ByGoujianbianhao(String key) {
        return form3Dao.deleteForm3ByGoujianbianhao(key);
    }

    @Override
    public int updateForm3ByGoujianbianhao(Form3 form3) {
        return form3Dao.updateForm3ByGoujianbianhao(form3);
    }

}
