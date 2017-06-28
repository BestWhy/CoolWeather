package com.why.best.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by why on 2017/6/28.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
