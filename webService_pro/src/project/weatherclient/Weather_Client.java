package project.weatherclient;

public class Weather_Client {
    public static void main(String[] args) {
        WeatherServiceImplService weatherServiceImplService = new WeatherServiceImplService();
        WeatherServiceImpl weatherServiceImplPort = weatherServiceImplService.getWeatherServiceImplPort();
        String result = weatherServiceImplPort.qryWeather("济南");
        System.out.printf(result);
    }
}
