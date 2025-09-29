package com.nacs.collection.entities;

import java.util.Objects;

public class ToDo {
	private int srNo;
	private String activity;
	private String timing;

	public ToDo() {}

	public ToDo(int srNo, String activity, String timing) {
		this.srNo = srNo;
		this.activity = activity;
		this.timing = timing;
	}

	public int getSrNo() {
		return srNo;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null || obj.getClass()!=this.getClass())
			return false;
		ToDo temp = (ToDo)obj;
		return (this.srNo==temp.srNo 
				&& this.activity.equals(temp.activity) 
				&& this.timing.equals(temp.timing));
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(srNo, activity, timing);
	}
	
	@Override
	public String toString() {
		return "ToDo [srNo=" + srNo + ", activity=" + activity + ", timing=" + timing + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
