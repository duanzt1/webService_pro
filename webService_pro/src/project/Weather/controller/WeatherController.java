package project.Weather.controller;

import project.Weather.service.WeatherServiceImpl;

import javax.xml.ws.Endpoint;

public class WeatherController {
    public static void main(String[] args) {
        Endpoint.publish("http://127.168.0.1:8888/order", new WeatherServiceImpl());
        System.out.printf("发布成功!");
    }
}
