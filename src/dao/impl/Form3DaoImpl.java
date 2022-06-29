package dao.impl;

import dao.Form3Dao;
import pojo.Form3;

import java.util.ArrayList;
import java.util.List;

public class Form3DaoImpl extends BaseDao implements Form3Dao {

    @Override
    public int saveForm3(Form3 form3) {
        String sql = "insert into form3(`bujian`,`goujianmingcheng`,`goujianbianhao`,`zhuangtai`,`shunhuaileixing`,`shunhuaichengdu`,`shunhuaiweizhi`,`qingshifenlei`,`pupianbianhao`,`beizhu`,`qiaoliangmingcheng`,`jiancedanwei`,`riqi`,`shending`,`fuhe`,`jiancerenyuan`) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        return  update(sql,form3.getBujian(),form3.getGoujianmingcheng(),form3.getGoujianbianhao(),form3.getZhuangtai(),form3.getShunhuaileixing(),form3.getShunhuaichengdu(),form3.getShunhuaiweizhi(),form3.getQingshifenlei(),form3.getPupianbianhao(),form3.getBeizhu(),form3.getQiaoliangmingcheng(),form3.getJiancedanwei(),form3.getRiqi(),form3.getShending(),form3.getFuhe(),form3.getJiancerenyuan());
    }
    @Override
    public List<Form3> queryForm3ByGoujianbianhao(String key) {
        String sql="select * from form3 where `goujianbianhao` like ?";
        return queryForList(Form3.class,sql,key);
    }

    @Override
    public Form3 queryforoneForm3ByGoujianbianhao(String key) {
        String sql="select * from form3 where `goujianbianhao` like ?";
        return queryForOne(Form3.class,sql,key);
    }

    @Override
    public int deleteForm3ByGoujianbianhao(String key) {
        String sql="delete from form3 where `goujianbianhao` = ?";
        return update(sql,key);
    }

    @Override
    public int updateForm3ByGoujianbianhao(Form3 form3) {
        deleteForm3ByGoujianbianhao(form3.getGoujianbianhao());
        return saveForm3(form3);
    }
}
