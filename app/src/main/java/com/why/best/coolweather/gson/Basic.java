package com.why.best.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by why on 2017/6/28.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
