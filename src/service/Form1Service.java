package service;

import pojo.Form1;

public interface Form1Service {
    public int saveForm1(Form1 form1);
    public Form1 queryforoneForm1Byqiaoliangmingcheng(String key);
    public int deleteForm1Byqiaoliangmingcheng(String key);
    public int updateForm1Byqiaoliangmingcheng(Form1 form1);
}
