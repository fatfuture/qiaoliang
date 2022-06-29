package service.impl;

import pojo.Form3;
import service.BSIService;
import service.Form3Service;
import utils.BCIUtil;
import utils.BSIUtil;

import java.util.List;

public class BSIServiceImpl implements BSIService {
    Form3Service form3Service=new Form3ServiceImpl();
    BSIUtil bsiUtil=new BSIUtil();
    @Override
    public double BSICalculate(String key) {
        List<Form3> list=form3Service.queryForm3ByGoujianbianhao(key);
        double res=bsiUtil.calculate(list);
        return res;
    }
}
