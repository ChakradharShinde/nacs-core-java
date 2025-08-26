package com.nacs.operators;

public class BinaryOperation {
	int operand1;
	int operand2;
	
	public BinaryOperation() {
		
	}
	
	public BinaryOperation(int operand1, int operand2) {
		this.operand1=operand1;
		this.operand2=operand2;
	}
	
	public int getOperand1() {
		return operand1;
	}
	
	public int getOperand2() {
		return operand2;
	}
	
	public void setOperand1(int operand1) {
		this.operand1=operand1;
	}
	
	public void setOperand2(int operand2) {
		this.operand2=operand2;
	}
	
	public int addTwoNumbers() {
		return operand1+operand2;
	}
	
	public int substractOperand1FromOperand2() {
		return operand2-operand1;
	}
	
	public int multiplyTwoOperands() {
		return operand1*operand2;
	}
	
	public int divideOperand2ByOperand1() {
		return operand2/operand1;
	}
	
	public int bitwiseAndOnTwoOperands() {
		return operand1&operand2;
	}
	
	public int bitwiseOrOnTwoOperands() {
		return operand1|operand2;
	}
	
	public int bitwiseXorOnTwoOperands() {
		return operand1^operand2;
	}
	
	
	
	
	
	
	
	
	
}
