package service.impl;

import pojo.Form3;
import service.BCIService;
import service.Form3Service;
import utils.BCIUtil;

import java.util.List;

public class BCIServiceImpl implements BCIService {
    Form3Service form3Service=new Form3ServiceImpl();
    BCIUtil bciUtil=new BCIUtil();
    @Override
    public double BCICalculate(String key) {
        List<Form3> list=form3Service.queryForm3ByGoujianbianhao(key);
        double res=bciUtil.calculate(list);
        return res;
    }
}
