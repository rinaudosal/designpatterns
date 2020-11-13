package com.github.rinaudosal.designpatterns.behavioral.chain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
class Request {
	private RequestType requestType;
	private double amount;

	enum RequestType {
		CONFERENCE, PURCHASE
	}
}
