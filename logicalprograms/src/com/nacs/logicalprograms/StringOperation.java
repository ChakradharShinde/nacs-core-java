package com.nacs.logicalprograms;

public class StringOperation {
	String data;

	public StringOperation() {}

	public StringOperation(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public String reverseData() {
//		int left=0;
//		int right=data.length()-1;
//		char[] dataArray = data.toCharArray();
//		while(left<right) {
//			char temp = dataArray[left];
//			dataArray[left]=dataArray[right];
//			dataArray[right]=temp;
//			left++;
//			right--;
//		}
		
		char[] dataArray=data.toCharArray();
		for(int left=0,right=dataArray.length-1;left<right;left++,right--) {
			char temp=dataArray[left];
			dataArray[left]=dataArray[right];
			dataArray[right]=temp;
		}
		
		return new String(dataArray);
	}
	
	public String reverseLineOfData() {
		String[] stringArray=data.split(" ");
		int left=0;
		int right=stringArray.length-1;
		while(left<right) {
			String temp=stringArray[left];
			stringArray[left]=stringArray[right];
			stringArray[right]=temp;
			left++;
			right--;
		}
		
		return String.join(" ", stringArray);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
