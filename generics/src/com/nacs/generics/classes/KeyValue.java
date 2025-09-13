package com.nacs.generics.classes;

public class KeyValue<K,V> {
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	public void setKey(K key) {
		this.key=key;
	}
	
	
	public void setValue(V value) {
		this.value=value;
	}
}
