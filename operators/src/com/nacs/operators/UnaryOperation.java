package com.nacs.operators;

public class UnaryOperation {
	int operand1;
	
	public UnaryOperation() {
		
	}
	
	public UnaryOperation(int operand1) {
		this.operand1=operand1;
	}
	
	public int getOperand1() {
		return operand1;
	}
	
	public void setOperand1(int operand1) {
		this.operand1=operand1;
	}
	
	public void preIncrementByOne() {
		++operand1;
	}
	
	public void postIncrementByOne() {
		operand1++;
	}
	
	public void preDecrementByOne() {
		--operand1;
	}
	
	public void postDecrementByOne() {
		operand1--;
	}
	
	public void calculateOnesComplement() {
		operand1=~operand1;
	}
}
