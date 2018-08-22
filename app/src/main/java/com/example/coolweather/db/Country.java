package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;

/**
 * @author zhaoting
 * @date 2018/8/21
 * @use
 */
public class Country extends LitePalSupport {
    private int id;
    /**
     * 记录县的名字
     */
    private String countryName;
    /**
     * 记录县对应的天气
     */
    private String weatherId;
    /**
     * 记录县所属市的ID
     */
    private int cityId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
