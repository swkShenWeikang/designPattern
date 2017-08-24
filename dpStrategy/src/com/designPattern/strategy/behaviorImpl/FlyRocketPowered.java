package com.designPattern.strategy.behaviorImpl;

import com.designPattern.strategy.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("利用火箭，飞于天际。");
	}

}
