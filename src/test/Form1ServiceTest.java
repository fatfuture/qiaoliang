package test;

import org.junit.Test;
import pojo.Form1;
import service.Form1Service;
import service.impl.Form1ServiceImpl;

public class Form1ServiceTest {
    Form1Service form1Service=new Form1ServiceImpl();
    Form1 form1=new Form1("1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1");

    @Test
    public void saveForm1(){
        form1Service.saveForm1(form1);
    }

    @Test
    public void queryforoneForm1Byqiaoliangmingcheng(){
        String key="我";
        System.out.println(form1Service.queryforoneForm1Byqiaoliangmingcheng(key));
    }

}
