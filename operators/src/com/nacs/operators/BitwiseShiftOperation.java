package com.nacs.operators;

public class BitwiseShiftOperation {
	int operand1;
	
	public BitwiseShiftOperation() {
		
	}
	
	public BitwiseShiftOperation(int operand1) {
		this.operand1=operand1;
	}
	
	public int getOperand1() {
		return operand1;
	}
	
	public void setOperand1(int operand1) {
		this.operand1=operand1;
	}
	
	public int leftShiftWithPosition(int position) {
		return operand1<<position;
	}
	
	public int rightShiftWithPosition(int position) {
		return operand1>>position;
	}
	
	public int unsignedRightShiftWithPosition(int position) {
		return operand1>>>position;
	}
}
