package dao;

import pojo.Form2;

public interface Form2Dao {
    public int saveForm2(Form2 form2);
    public Form2 queryforoneForm2Byqiaoliangmingcheng(String key);
    public int deleteForm2Byqiaoliangmingcheng(String key);
    public int updateForm2Byqiaoliangmingcheng(Form2 form2);
}
