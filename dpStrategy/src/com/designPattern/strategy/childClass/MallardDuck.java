package com.designPattern.strategy.childClass;

import com.designPattern.strategy.behaviorImpl.FlyWithWings;
import com.designPattern.strategy.behaviorImpl.Quack;
import com.designPattern.strategy.superClass.Duck;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		setQuackBehavior(new Quack());
		setFlyBehavior(new FlyWithWings());
	}

	@Override
	public void display() {
		System.out.println("我是一只真正的野鸭。");
	}

}
