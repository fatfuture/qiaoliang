package test;

import dao.Form3Dao;
import dao.impl.Form3DaoImpl;
import org.junit.Test;
import pojo.Form3;

import java.util.Arrays;

public class Form3DaoTest {
    Form3Dao form3Dao=new Form3DaoImpl();
    Form3 form3=new Form3("你好啊","1","01010101","1","1","1","1","1","1","12","12","12","12","12","12","12");
    @Test
    public void saveForm3(){
        System.out.println(form3Dao.saveForm3(form3));
    }
    @Test
    public void queryForm3ByGoujianbianhao(){

        System.out.println(Arrays.toString(form3Dao.queryForm3ByGoujianbianhao("%").toArray()));

    }
    @Test
    public void queryforoneForm3ByGoujianbianhao(){
        System.out.println(form3Dao.queryforoneForm3ByGoujianbianhao("1"));
    }
    @Test
    public void deleteForm3ByGoujianbianhao(){
        String key="1";
        System.out.println(form3Dao.deleteForm3ByGoujianbianhao(key));
    }

}
