package dao.impl;

import dao.Form1Dao;
import pojo.Form1;
import pojo.Form3;

public class Form1DaoImpl extends BaseDao implements Form1Dao {
    @Override
    public int saveForm1(Form1 form1) {
        String sql = "insert into form1(`qiaoliangmingcheng`,`suozailuming`,`guanlidanwei`,`zhuliangxingsi`,`xingsi1`,`yanghudanwei`,`zuliangchichun`," +
                "`qiaodunshuliang`,`jiansedanwei`,`zuliangshuliang`,`qiaodunbiaogao`,`shejidanwei`," +
                "`hengliangxingsi`,`gailiangcicun`,`jianlidanwei`,`zukuaqiaoxiajingkong`,`jidibiaogao1`," +
                "`shigongdanwei`,`qiaoxiaxiangao`,`dibancicun`,`jianchengnianyue`,`gongqiaosikuabi`," +
                "`jizhuangcichun1`,`zhongzhaojia`,`jizhuoxingsi`,`jizhuanggengshu1`,`yanghuleibie`," +
                "`zhizuoshuliang`,`xingsi2`,`yanghudengji`,`qiaomianjiegou`,`qiaotaishuliang`," +
                "`daoludengji`,`qiaomianpuzhunagchengdu`,`qiaotaibiaogao`,`jiegouleixing`,`shensuofongxingshi`," +
                "`jidibiaogao2`,`sejihezai`,`shensuofongshuliang`,`taimaocichun`,`xianzhaibiaozun`," +
                "`zhuqiaozhongpo`,`dibancichun`,`kangzhengliedu`,`zhuqiaohengpo`,`jizhuangcichun2`," +
                "`zhengxiejiaojiao`,`liqiaozhongpo`,`jizhuanggengshu2`,`qiaoliangkuashu`,`yingqiaohengpo`," +
                "`dangtubanhoudu`,`kuajingzuhe`,`jishuikoucichun`,`yiqiangxings`,`qiaomianmianji`," +
                "`jishuikoushuliang`,`yiqiangchangdu`,`qiaoliangzhongchang`,`xieshuiguancicun`,`fuguguanxian`," +
                "`qiaoliangzhongkuan`,`xieshuichangdu`,`ranqiguan`,`cehangdaojingkuan`,`langanzhongchang`," +
                "`dainlilan`,`renxingdaojingkuan`,`langanjiegou`,`tongxingdianlan`,`hedaodengji`," +
                "`duanzhucichun`,`zuigaoshuiwei`,`huanleixing`,`changshuiwei`,`yingpodangqiangleixing`) " +
                "values(?,?,?,?,?,?,?," +
                "?,?,?,?,?," +
                "?,?,?,?,?," +
                "?,?,?,?,?," +
                "?,?,?,?,?," +
                "?,?,?,?,?," +
                "?,?,?,?,?," +
                "?,?,?,?,?," +
                "?,?,?,?,?," +
                "?,?,?,?,?," +
                "?,?,?,?,?," +
                "?,?,?,?,?," +
                "?,?,?,?,?," +
                "?,?,?,?,?," +
                "?,?,?,?,?)";
        return  update(sql,form1.getQiaoliangmingcheng(),form1.getSuozailuming(), form1.getGuanlidanwei(),form1.getZhuliangxingsi(),form1.getXingsi1(),form1.getYanghudanwei(),form1.getZuliangchichun(),
                form1.getQiaodunshuliang(),form1.getJiansedanwei(),form1.getZuliangshuliang(),form1.getQiaodunbiaogao(),form1.getShejidanwei(),
                form1.getHengliangxingsi(),form1.getGailiangcicun(),form1.getJianlidanwei(),form1.getZukuaqiaoxiajingkong(),form1.getJidibiaogao1(),
                form1.getShigongdanwei(),form1.getQiaoxiaxiangao(),form1.getDibancicun(),form1.getJianchengnianyue(),form1.getGongqiaosikuabi(),
                form1.getJizhuangcichun1(),form1.getZhongzhaojia(),form1.getJizhuoxingsi(),form1.getJizhuanggengshu1(),form1.getYanghuleibie(),
                form1.getZhizuoshuliang(),form1.getXingsi2(),form1.getYanghudengji(),form1.getQiaomianjiegou(),form1.getQiaotaishuliang(),
                form1.getDaoludengji(),form1.getQiaomianpuzhunagchengdu(),form1.getQiaotaibiaogao(),form1.getJiegouleixing(),form1.getShensuofongxingshi(),
                form1.getJidibiaogao2(),form1.getSejihezai(),form1.getShensuofongshuliang(),form1.getTaimaocichun(),form1.getXianzhaibiaozun(),
                form1.getZhuqiaozhongpo(),form1.getDibancichun(),form1.getKangzhengliedu(),form1.getZhuqiaohengpo(),form1.getJizhuangcichun2(),
                form1.getZhengxiejiaojiao(),form1.getLiqiaozhongpo(),form1.getJizhuanggengshu2(),form1.getQiaoliangkuashu(),form1.getYingqiaohengpo(),
                form1.getDangtubanhoudu(),form1.getKuajingzuhe(),form1.getJishuikoucichun(),form1.getYiqiangxings(),form1.getQiaomianmianji(),
                form1.getJishuikoushuliang(),form1.getYiqiangchangdu(),form1.getQiaoliangzhongchang(),form1.getXieshuiguancicun(),form1.getFuguguanxian(),
                form1.getQiaoliangzhongkuan(),form1.getXieshuichangdu(),form1.getRanqiguan(),form1.getCehangdaojingkuan(),form1.getLanganzhongchang(),
                form1.getDainlilan(),form1.getRenxingdaojingkuan(),form1.getLanganjiegou(),form1.getTongxingdianlan(),
                form1.getHedaodengji(), form1.getDuanzhucichun(), form1.getZuigaoshuiwei(), form1.getHuanleixing(), form1.getChangshuiwei(),
                form1.getYingpodangqiangleixing());
    }

    @Override
    public Form1 queryforoneForm1Byqiaoliangmingcheng(String key) {
        String sql="select * from form1 where `qiaoliangmingcheng` like ?";
        return queryForOne(Form1.class,sql,key);
    }

    @Override
    public int deleteForm1Byqiaoliangmingcheng(String key) {
        String sql="delete from form1 where `qiaoliangmingcheng` = ?";
        return update(sql,key);
    }

    @Override
    public int updateForm1Byqiaoliangmingcheng(Form1 form1) {
        deleteForm1Byqiaoliangmingcheng(form1.getQiaoliangmingcheng());
        return saveForm1(form1);
    }
}
