package com.designPattern.strategy.childClass;

import com.designPattern.strategy.behavior.FlyBehavior;
import com.designPattern.strategy.behavior.QuackBehavior;
import com.designPattern.strategy.behaviorImpl.FlyNoWay;
import com.designPattern.strategy.behaviorImpl.Quack;
import com.designPattern.strategy.superClass.Duck;

public class ModelDuck extends Duck {

	public ModelDuck() {
		setQuackBehavior(new Quack());
		setFlyBehavior(new FlyNoWay());
	}
	
	/**
	 * 构造器注入
	 * @param qb
	 * @param fb
	 */
	public ModelDuck(QuackBehavior qb, FlyBehavior fb) {
		setQuackBehavior(qb);
		setFlyBehavior(fb);
	}

	@Override
	public void display() {
		System.out.println("我是一只模型鸭。");
	}

}
