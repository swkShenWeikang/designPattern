package com.designPattern.strategy.test;

import com.designPattern.strategy.behaviorImpl.FlyRocketPowered;
import com.designPattern.strategy.childClass.MallardDuck;
import com.designPattern.strategy.childClass.ModelDuck;
import com.designPattern.strategy.superClass.Duck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		System.out.println("-----------------------");
		
		Duck model = new ModelDuck();
		model.performQuack();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
