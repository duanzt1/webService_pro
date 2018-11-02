package project.Weather.service;

import project.Weather.api.WeatherService;

import javax.jws.WebService;

@WebService
public class WeatherServiceImpl implements WeatherService {

    @Override
    public String qryWeather(String cityName) {
        if ("济南".equals(cityName)) {
            return "晴 6-21摄氏度";
        } else {
            return "暂无该城市数据";
        }
    }
}
