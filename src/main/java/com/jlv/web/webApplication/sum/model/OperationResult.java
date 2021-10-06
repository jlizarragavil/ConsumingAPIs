package com.jlv.web.webApplication.sum.model;

import org.springframework.stereotype.Component;

@Component
public class OperationResult{
	private double result;
	public OperationResult() {
		
	}
	public OperationResult(double result) {
		this.result = result;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
}
