package com.factoryPattern;

public class TestFactoryDesign {

	public static void main(String[] args) {

		Computer pc =ComputerFactory.getComputer(new PCFactory("4gb", "1tb", "i5"));
		Computer ser  = ComputerFactory.getComputer(new ServerFactory("128gb", "10tb", "i7"));
		
		System.out.println(pc);
		System.out.println(ser);
	}

}
