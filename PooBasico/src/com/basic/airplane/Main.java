package com.basic.airplane;

import com.basic.airplane.interfaces.Airplane;
import com.basic.airplane.interfaces.AutoMobile;
import com.basic.airplane.models.A380;
import com.basic.airplane.models.Boing777;

public class Main {

	public static void main(String[] args) {
		
		A380 a380 = new A380();
		
		Airplane airplane = a380;
		AutoMobile autoMobile = a380;
		
		a380.turnOn();
		airplane.turnOn();
		autoMobile.turnOn();
		
		
		Boing777 boing777 = new Boing777();
		boing777.turnOn();
		
		

	}

}
