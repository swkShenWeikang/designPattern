package com.designPattern.strategy.behaviorImpl;

import com.designPattern.strategy.behavior.QuackBehavior;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("鸭子嘎嘎叫。");
	}

}
