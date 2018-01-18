package com.factoryPattern;

public abstract class Computer {

	
	public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();
	@Override
	public String toString() {
		return this.getClass().getName()+" [getRAM()=" + getRAM() + ", getHDD()=" + getHDD() + ", getCPU()=" + getCPU() + "]";
	}
    
    
}
