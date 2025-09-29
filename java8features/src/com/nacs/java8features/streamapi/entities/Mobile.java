package com.nacs.java8features.streamapi.entities;

import java.util.Objects;

public class Mobile implements Comparable<Mobile>{
	private int serialId;
	private String manufacturer;
	private String model;
	private float price;
	private int ram;
	private String processor;
	private String color;
	private String refreshRate;

	public Mobile() {}

	public Mobile(int serialId, String manufacturer, String model, float price, int ram, String processor, String color,
			String refreshRate) {
		this.serialId = serialId;
		this.manufacturer = manufacturer;
		this.model = model;
		this.price = price;
		this.ram = ram;
		this.processor = processor;
		this.color = color;
		this.refreshRate = refreshRate;
	}

	public int getSerialId() {
		return serialId;
	}

	public void setSerialId(int serialId) {
		this.serialId = serialId;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRefreshRate() {
		return refreshRate;
	}

	public void setRefreshRate(String refreshRate) {
		this.refreshRate = refreshRate;
	}
	
	@Override
	public boolean equals(Object temp) {
		if(temp==this)
			return true;
		if(temp == null || temp.getClass()!=this.getClass())
			return false;
		
		Mobile tmp = (Mobile)temp;
		
		return this.serialId==tmp.serialId 
				&& this.manufacturer.equals(tmp.manufacturer) 
				&& this.model.equals(tmp.model)
				&& this.price==tmp.price
				&& this.ram == tmp.ram
				&& this.processor.equals(tmp.processor)
				&& this.color.equals(tmp.color)
				&& this.refreshRate.equals(tmp.refreshRate);
 	}

	
	@Override
	public int hashCode() {
		return Objects.hash(serialId, manufacturer, model, price, ram, processor, color, refreshRate);
	}
	
	@Override
	public int compareTo(Mobile temp) {
//		return temp.ram-this.ram;
//		return temp.manufacturer.compareTo(this.manufacturer);
		return (int)(this.price-temp.price);
	
	}
	
	@Override
	public String toString() {
		return "Mobile [serialId=" + serialId + ", manufacturer=" + manufacturer + ", model=" + model + ", price="
				+ price + ", ram=" + ram + ", processor=" + processor + ", color=" + color + ", refreshRate="
				+ refreshRate + "]";
	}

}
