package utils;

import pojo.Form3;

import java.util.List;

public class BSIUtil {
    private double result=0;
    public double calculate(List<Form3> list){
        for (Form3 form3:list){
            int temp=Integer.parseInt(form3.getGoujianbianhao());
            double form3_result=0;
            switch (temp/1000000){
                case 1:
                    form3_result=Integer.parseInt(form3.getBeizhu())*0.1;
                    break;
                case 2:
                    form3_result=Integer.parseInt(form3.getBeizhu())*0.4;
                    break;
                default:
                    System.out.println("构件错误");
                    break;
            }
            switch ((temp%1000000)/10000){
                case 1:
                    form3_result=form3_result*0.2;
                    break;
                case 2:
                    form3_result=form3_result*0.4;
                    break;
                default:
                    System.out.println("构件错误");
                    break;
            }
            switch ((temp%10000)/100){
                case 1:
                    form3_result=form3_result*0.4;
                    break;
                case 2:
                    form3_result=form3_result*0.4;
                    break;
                default:
                    System.out.println("构件错误");
                    break;
            }
            result+=form3_result;

        }
        return result;
    }

    public double getResult() {
        return result;
    }
}
