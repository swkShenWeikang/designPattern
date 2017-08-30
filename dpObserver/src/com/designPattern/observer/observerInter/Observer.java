package com.designPattern.observer.observerInter;

/**
 * 观察者接口
 */
public interface Observer {
	public void update(float temperature, float humidity, float pressure);//更新布告板数据
}
