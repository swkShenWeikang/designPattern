package com.designPattern.strategy.behaviorImpl;

import com.designPattern.strategy.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("吱吱叫。");
	}

}
