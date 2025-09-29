package com.nacs.collection.list;

import java.util.Stack;

import com.nacs.collection.list.entities.BrowserHistory;

public class BrowserHistoryUtil {
	Stack<BrowserHistory> forward = new Stack<>();
	Stack<BrowserHistory> backward = new Stack<>();
	
	public void visitSite(BrowserHistory history) {
		backward.push(history);
	}
	
	public void previousSite() {
		forward.push(backward.pop());
		System.out.println(backward.peek());
	}
	
	public void nextSite() {
		backward.push(forward.pop());
		System.out.println(backward.peek());
	}
}
