package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by qwe on 2018/3/12.
 */

public class Country extends DataSupport {
    private String countryname;
    private int id;
    private String weatherid;
    private int cityid;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCountryname(){
        return countryname;
    }
    public void setCountryname(String countryname){
        this.countryname=countryname;
    }
    public String getWeatherid(){
        return weatherid;
    }
    public void setWeatherid(String weatherid){
        this.weatherid=weatherid;
    }
    public int getCityid(){
        return cityid;
    }
    public void setCityid(int cityid){
        this.cityid=cityid;
    }
}
