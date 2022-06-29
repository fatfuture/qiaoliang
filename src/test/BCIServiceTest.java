package test;

import org.junit.Test;
import service.BCIService;
import service.impl.BCIServiceImpl;

public class BCIServiceTest {
    BCIService bciService=new BCIServiceImpl();
    @Test
    public void BCICalculate(){
        System.out.println(bciService.BCICalculate("01010101"));

    }
}
