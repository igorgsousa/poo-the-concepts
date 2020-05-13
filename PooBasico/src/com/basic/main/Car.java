package com.basic.main;

public class Car {
	
	private String name;

	public Car() {
		
	}

	public String getName() {
		//executa alguma regra de negocio
		return name;
	}

	public void setName(String name) {
		//executa alguma regra de negocio
		testName(name);
		this.name = name;
	}
	
	private boolean testName(String name) {
		if(name == null) {
			throw new RuntimeException("Nome nao pode ser nulo");
		}
		return true;
	}
}
