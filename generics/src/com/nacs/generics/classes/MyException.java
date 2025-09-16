package com.nacs.generics.classes;

public class MyException<T extends Integer>{
	T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	

}
