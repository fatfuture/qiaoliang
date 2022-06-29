package test;

import org.junit.Test;
import pojo.Form3;
import service.Form3Service;
import service.impl.Form3ServiceImpl;

public class Form3ServiceTest {
    Form3Service form3Service=new Form3ServiceImpl();
    Form3 form3=new Form3("1","1","1","1","你","1","1","1","1","1","12","12","12","12","12","12");

    @Test
    public void saveForm3(){
        form3Service.saveForm3(form3);
    }
    @Test
    public void queryForm3ByGoujianbianhao(){
        System.out.println(form3Service.queryForm3ByGoujianbianhao("01010101"));

    }

}
