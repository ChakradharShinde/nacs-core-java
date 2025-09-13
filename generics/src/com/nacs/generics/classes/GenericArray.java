package com.nacs.generics.classes;

public class GenericArray<T> {
	
		T[] tArray;
		
		public void setTArray(T[] tArray) {
			this.tArray=tArray;
		}
		
		
		public void printTArray(){
//			for(int i=0;i<tArray.length;i++)
//				System.out.println(tArray[i]);
			
			for(T ele:tArray)
				System.out.println(ele);
		}

}
