package com.designPattern.strategy.behaviorImpl;

import com.designPattern.strategy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("我不会飞！");
	}

}
