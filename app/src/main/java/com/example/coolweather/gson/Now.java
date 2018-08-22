package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author zhaoting
 * @date 2018/8/21
 * @use
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
