package com.designPattern.observer.test;

import com.designPattern.observer.observerImpl.CurrentConditionDisplay;
import com.designPattern.observer.subjectImpl.WeatherData;

/**
 * 测试
 */
public class weatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		
		weatherData.setMeasurements(27, 70, 30.4f);
		weatherData.setMeasurements(28, 80, 32.5f);
		weatherData.setMeasurements(25, 75, 29.4f);
	}

}
