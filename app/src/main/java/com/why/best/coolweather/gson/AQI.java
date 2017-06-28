package com.why.best.coolweather.gson;

/**
 * Created by why on 2017/6/28.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
