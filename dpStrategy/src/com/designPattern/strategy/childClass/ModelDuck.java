package com.designPattern.strategy.childClass;

import com.designPattern.strategy.behaviorImpl.FlyNoWay;
import com.designPattern.strategy.behaviorImpl.Quack;
import com.designPattern.strategy.superClass.Duck;

public class ModelDuck extends Duck {

	public ModelDuck() {
		setQuackBehavior(new Quack());
		setFlyBehavior(new FlyNoWay());
	}

	@Override
	public void display() {
		System.out.println("我是一只模型鸭。");
	}

}
