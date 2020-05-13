package com.basic.airplane.models;

import com.basic.airplane.interfaces.Airplane;
import com.basic.airplane.interfaces.AutoMobile;

public class A380 implements Airplane, AutoMobile  {

	@Override
	public void turnOn() {
		System.out.println("Liga o aviao");
		
	}

}
