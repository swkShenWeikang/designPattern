package com.designPattern.observer.subjectImpl;

import java.util.ArrayList;

import com.designPattern.observer.observerInter.Observer;
import com.designPattern.observer.subject.Subject;

/**
 * 一个主题实现类
 */
public class WeatherData implements Subject {
	
	private ArrayList<Observer> observers;
	private float temperature;//温度
	private float humidity;//湿度
	private float pressure;//气压
	
	public WeatherData() {
		super();
		observers = new ArrayList<Observer>(); 
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i >= 0){
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged(){
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
