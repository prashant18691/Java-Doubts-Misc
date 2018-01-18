package com.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonSerializable implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SingletonSerializable(){
		
	}
	
	public static SingletonSerializable getInstance(){
		return SingletonHelper.INSTANCE;
	}
	
	private static class SingletonHelper{
		private static final SingletonSerializable INSTANCE = new SingletonSerializable();
	}
	
	protected Object readResolve() {
	    return getInstance();
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SingletonSerializable instance1 = getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("C:/Users/praupadh.ORADEV/Downloads/input07.txt"));
		out.writeObject(instance1);
		out.close();
		
		ObjectInput ip = new ObjectInputStream(new FileInputStream("C:/Users/praupadh.ORADEV/Downloads/input07.txt"));
		SingletonSerializable instance2 = (SingletonSerializable)ip.readObject();
		ip.close();
		
		System.out.println(instance1.hashCode()+"  ::  "+instance2.hashCode());

	}

}
