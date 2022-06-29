package dao;

import pojo.Form1;
import pojo.Form3;

import java.util.List;

public interface Form3Dao {
    public int saveForm3(Form3 form3);
    public List<Form3> queryForm3ByGoujianbianhao(String key);
    public Form3 queryforoneForm3ByGoujianbianhao(String key);
    public int deleteForm3ByGoujianbianhao(String key);
    public int updateForm3ByGoujianbianhao(Form3 form3);
}
