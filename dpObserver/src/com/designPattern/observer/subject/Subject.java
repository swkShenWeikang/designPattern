package com.designPattern.observer.subject;

import com.designPattern.observer.observerInter.Observer;

/**
 * 主题接口
 */
public interface Subject {
	public void registerObserver(Observer o);//注册观察者
	public void removeObserver(Observer o);//注销观察者
	public void notifyObservers();//通知观察者
}
