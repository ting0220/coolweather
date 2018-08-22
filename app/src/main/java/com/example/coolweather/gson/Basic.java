package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author zhaoting
 * @date 2018/8/21
 * @use
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    @SerializedName("update")
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
