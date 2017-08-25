package com.designPattern.strategy.childClass;

import com.designPattern.strategy.behavior.FlyBehavior;
import com.designPattern.strategy.behavior.QuackBehavior;
import com.designPattern.strategy.superClass.Duck;

public class MallardDuck extends Duck {
	
	/**
	 * 构造器注入
	 * @param qb
	 * @param fb
	 */
	public MallardDuck(QuackBehavior qb, FlyBehavior fb) {
		setQuackBehavior(qb);
		setFlyBehavior(fb);
	}

	@Override
	public void display() {
		System.out.println("我是一只真正的野鸭。");
	}

}
