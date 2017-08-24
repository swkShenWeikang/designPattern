package com.designPattern.strategy.behaviorImpl;

import com.designPattern.strategy.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("叫不出声！");
	}

}
