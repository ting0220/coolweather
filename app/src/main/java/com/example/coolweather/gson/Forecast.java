package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author zhaoting
 * @date 2018/8/21
 * @use
 */
public class Forecast {
    @SerializedName("date")
    public String date;
    @SerializedName("cond")
    public More more;
    @SerializedName("tmp")
    public Temperature temperature;

    public class More {
        @SerializedName("txt_d")
        public String info;
    }

    public class Temperature {
        @SerializedName("max")
        public String max;
        @SerializedName("min")
        public String min;
    }
}
