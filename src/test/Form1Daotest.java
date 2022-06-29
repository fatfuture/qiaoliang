package test;

import dao.Form1Dao;
import dao.impl.Form1DaoImpl;
import org.junit.Test;
import pojo.Form1;

public class Form1Daotest {
    Form1Dao form1Dao=new Form1DaoImpl();
    Form1 form1=new Form1("1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1");
    @Test
    public void saveForm1(){
        form1Dao.saveForm1(form1);
    }
    @Test
    public void deleteForm1Byqiaoliangmingcheng(){
        String key="1";
        form1Dao.deleteForm1Byqiaoliangmingcheng(key);
    }
}
