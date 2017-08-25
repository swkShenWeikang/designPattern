package com.designPattern.strategy.superClass;

import com.designPattern.strategy.behavior.FlyBehavior;
import com.designPattern.strategy.behavior.QuackBehavior;

public abstract class Duck {
	
	private QuackBehavior quackBehavior;
	private FlyBehavior flyBehavior;
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void swim(){
		System.out.println("所有鸭子都会漂浮。");
	}
	
}
