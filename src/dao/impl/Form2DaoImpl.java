package dao.impl;

import dao.Form2Dao;
import pojo.Form1;
import pojo.Form2;

public class Form2DaoImpl extends BaseDao implements Form2Dao {

    @Override
    public int saveForm2(Form2 form2) {
        String sql="insert into form2(`qiaoliangmingcheng`,`xunjiandanwei`,`qiaomingpai_sunhuaileixing`,`qiaomingpai_sunhuaichengdu`,`qiaomingpai_sunhuaiweizhi`," +
                "`qiaomingpai_beizhu`,`xiangaopaixianzaipai_shi`,`xiangaopaixianzaipai_fou`,`xiangaopaixianzaipai_sunhuaileixing`,`xiangaopaixianzaipai_sunhuaichengdu`," +
                "`xiangaopaixianzaipai_sunhuaiweizhi`,`xiangaopaixianzaipai_beizhu`,`chexingdao_shi`,`chexingdao_fou`,`chexingdao_sunhuaileixing`," +
                "`chexingdao_sunhuaichengdu`,`chexingdao_sunhuaiweizhi`,`chexingdao_beizhu`,`renxingdao_shi`,`renxingdao_fou`," +
                "`renxingdao_test1`,`renxingdao_test2`,`renxingdao_test3`,`renxingdao_test4`,`shensuofeng_shi`," +
                "`shensuofeng_fou`,`shensuofeng_test1`,`shensuofeng_test2`,`shensuofeng_test3`,`shensuofeng_test4`," +
                "`langan_shi`,`langan_fou`,`langan_test1`,`langan_test2`,`langan_test3`," +
                "`langan_test4`,`paishuisheshi_shi`,`paishuisheshi_fou`,`paishuisheshi_test1`,`paishuisheshi_test2`," +
                "`paishuisheshi_test3`,`paishuisheshi_test4`,`qiaolulianjieweizhi_shi`,`qiaolulianjieweizhi_fou`,`qiaolulianjieweizhi_test1`," +
                "`qiaolulianjieweizhi_test2`,`qiaolulianjieweizhi_test3`,`qiaolulianjieweizhi_test4`,`shangbujiegou_shi`,`shangbujiegou_fou`," +
                "`shangbujiegou_test1`,`shangbujiegou_test2`,`shangbujiegou_test3`,`shangbujiegou_test4`,`zhizuo_shi`," +
                "`zhizuo_fou`,`zhizuo_test1`,`zhizuo_test2`,`zhizuo_test3`,`zhizuo_test4`," +
                "`xiabujiegou_shi`,`xiabujiegou_fou`,`xiabujiegou_test1`,`xiabujiegou_test2`,`xiabujiegou_test3`," +
                "`xiabujiegou_test4`,`qiaoliangbaohuquyuneishigong`,`qitabinghai`,`xuncharen`,`xunchariqi`) "
                +"values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        return update(sql,form2.getQiaoliangmingcheng(),form2.getXunjiandanwei(),form2.getQiaomingpai_sunhuaileixing(),form2.getQiaomingpai_sunhuaichengdu(),form2.getQiaomingpai_sunhuaiweizhi(),
                form2.getQiaomingpai_beizhu(),form2.getXiangaopaixianzaipai_shi(),form2.getXiangaopaixianzaipai_fou(),form2.getXiangaopaixianzaipai_sunhuaileixing(),form2.getXiangaopaixianzaipai_sunhuaichengdu(),
                form2.getXiangaopaixianzaipai_sunhuaiweizhi(),form2.getXiangaopaixianzaipai_beizhu(),form2.getChexingdao_shi(),form2.getChexingdao_fou(), form2.getChexingdao_sunhuaileixing(),
                form2.getChexingdao_sunhuaichengdu(),form2.getChexingdao_sunhuaiweizhi(),form2.getChexingdao_beizhu(),form2.getRenxingdao_shi(),form2.getRenxingdao_fou(),
                form2.getRenxingdao_test1(),form2.getRenxingdao_test2(),form2.getRenxingdao_test3(),form2.getRenxingdao_test4(), form2.getShensuofeng_shi(),
                form2.getShensuofeng_fou(),form2.getShensuofeng_test1(),form2.getShensuofeng_test2(),form2.getShensuofeng_test3(),form2.getShensuofeng_test4(),
                form2.getLangan_shi(),form2.getLangan_fou(),form2.getLangan_test1(),form2.getLangan_test2(),form2.getLangan_test3(),
                form2.getLangan_test4(),form2.getPaishuisheshi_shi(),form2.getLangan_fou(),form2.getPaishuisheshi_test1(),form2.getPaishuisheshi_test2(),
                form2.getPaishuisheshi_test3(),form2.getPaishuisheshi_test4(),form2.getQiaolulianjieweizhi_shi(),form2.getQiaolulianjieweizhi_fou(),form2.getQiaolulianjieweizhi_test1(),
                form2.getQiaolulianjieweizhi_test2(),form2.getQiaolulianjieweizhi_test3(),form2.getQiaolulianjieweizhi_test4(),form2.getShangbujiegou_shi(),form2.getShangbujiegou_fou(),
                form2.getShangbujiegou_test1(),form2.getShangbujiegou_test2(),form2.getShangbujiegou_test3(),form2.getShangbujiegou_test4(),form2.getZhizuo_shi(),
                form2.getZhizuo_fou(),form2.getZhizuo_test1(),form2.getZhizuo_test2(),form2.getZhizuo_test3(),form2.getZhizuo_test4(),
                form2.getXiabujiegou_shi(),form2.getXiabujiegou_fou(),form2.getXiabujiegou_test1(),form2.getXiabujiegou_test2(),form2.getXiabujiegou_test3(),
                form2.getXiabujiegou_test4(),form2.getQiaoliangbaohuquyuneishigong(),form2.getQitabinghai(),form2.getXuncharen(),form2.getXunchariqi());
    }

    @Override
    public Form2 queryforoneForm2Byqiaoliangmingcheng(String key) {
        String sql="select * from form2 where `qiaoliangmingcheng` like ?";
        return queryForOne(Form2.class,sql,key);
    }

    @Override
    public int deleteForm2Byqiaoliangmingcheng(String key) {
        String sql="delete from form2 where `qiaoliangmingcheng` = ?";
        return update(sql,key);
    }

    @Override
    public int updateForm2Byqiaoliangmingcheng(Form2 form2) {
        deleteForm2Byqiaoliangmingcheng(form2.getQiaoliangmingcheng());
        return saveForm2(form2);
    }
}
