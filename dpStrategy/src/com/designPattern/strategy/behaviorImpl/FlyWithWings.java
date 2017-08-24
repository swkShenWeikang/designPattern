package com.designPattern.strategy.behaviorImpl;

import com.designPattern.strategy.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("扇动翅膀，飞于天际。");
	}

}
