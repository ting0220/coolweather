package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author zhaoting
 * @date 2018/8/21
 * @use
 */
public class Aqi {
    @SerializedName("city")
    public AqiCity city;

    public class AqiCity {
        @SerializedName("aqi")
        public String aqi;
        @SerializedName("pm25")
        public String pm25;
    }
}
