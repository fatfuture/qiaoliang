package test;


import org.junit.Test;
import pojo.Form2;
import service.Form2Service;
import service.impl.Form2ServiceImpl;

public class Form2ServiceTest {
    Form2Service form2Service=new Form2ServiceImpl();
    Form2 form2=new Form2("1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1");
    @Test
    public void saveForm2(){
        form2Service.saveForm2(form2);
    }
    @Test
    public void queryforoneForm2Byqiaoliangmingcheng(){
        System.out.println(form2Service.queryforoneForm2Byqiaoliangmingcheng("1"));

    }
    @Test
    public void deleteForm2Byqiaoliangmingcheng(){
        form2Service.deleteForm2Byqiaoliangmingcheng("1");
    }
    @Test
    public void updateForm2Byqiaoliangmingcheng(){
        form2Service.updateForm2Byqiaoliangmingcheng(form2);
    }
}
