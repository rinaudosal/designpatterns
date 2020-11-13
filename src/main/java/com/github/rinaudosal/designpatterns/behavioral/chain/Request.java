package com.github.rinaudosal.designpatterns.behavioral.chain;

class Request {

	private RequestType requestType;
	private double amount;
	
	Request(RequestType requestType, double amount) {
		this.requestType = requestType;
		this.amount = amount;
	}
	
	RequestType getRequestType() {
		return requestType;
	}

	double getAmount() {
		return amount;
	}
}
