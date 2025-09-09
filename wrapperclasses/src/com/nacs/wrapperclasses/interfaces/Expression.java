package com.nacs.wrapperclasses.interfaces;

import java.util.function.IntBinaryOperator;

public interface Expression {
	IntBinaryOperator greaterObject = Integer::compare;
}
