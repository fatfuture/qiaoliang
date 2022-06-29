package test;

import dao.Form2Dao;
import dao.impl.Form2DaoImpl;
import org.junit.Test;
import pojo.Form2;

public class Form2Daotest {
    Form2Dao form2Dao=new Form2DaoImpl();
    Form2 form2=new Form2("1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1");
    @Test
    public void saveForm2(){
        form2Dao.saveForm2(form2);
    }
    @Test
    public void queryforoneForm2Byqiaoliangmingcheng(){
        System.out.println(form2Dao.queryforoneForm2Byqiaoliangmingcheng("1"));

    }
    @Test
    public void deleteForm2Byqiaoliangmingcheng(){
        form2Dao.deleteForm2Byqiaoliangmingcheng("1");
    }
    @Test
    public void updateForm2Byqiaoliangmingcheng(){
        form2Dao.updateForm2Byqiaoliangmingcheng(form2);
    }
}
