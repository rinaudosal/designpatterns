package com.github.rinaudosal.designpatterns.behavioral.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TemplateDemo {
	private static final Logger log = LoggerFactory.getLogger(TemplateDemo.class);

	public static void main(String[] args) {
		log.info("Web Order:");
		
		OrderTemplate webOrder = new WebOrder();
		webOrder.processOrder();
		
		log.info("\nStore Order:");
		
		OrderTemplate storeOrder = new StoreOrder();
		storeOrder.processOrder();
	}
}
