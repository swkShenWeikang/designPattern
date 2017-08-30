package com.designPattern.observer.observerImpl;

import com.designPattern.observer.observerInter.DisplayElement;
import com.designPattern.observer.observerInter.Observer;
import com.designPattern.observer.subject.Subject;

/**
 * 显示当前状况布告板
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
	
	private float temperature;//温度
	private float humidity;//湿度
	private Subject weatherData;//主题
	
	public CurrentConditionDisplay(Subject weatherData) {
		super();
		this.weatherData = weatherData;
		weatherData.registerObserver(this);//注册
	}

	@Override
	public void display() {
		System.out.println("当前状况为：温度" + temperature + "，湿度" + humidity);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

}
