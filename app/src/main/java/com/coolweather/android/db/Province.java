package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by qwe on 2018/3/12.
 */

public class Province extends DataSupport {
    private String provincename;
    private int id;
    private int provincecode;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getProvincename(){
        return provincename;
    }
    public void setProvincename(String provincename){
        this.provincename=provincename;
    }
    public int getProvincecode(){
        return provincecode;
    }
    public void setProvincecode(int provincecode){
        this.provincecode=provincecode;
    }
}
