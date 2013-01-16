package com.designpatterns.enums;

import com.designpatterns.factories.interfaces.PatternFactory;

public enum PatternType {
	CREATIONAL("creational", null),
	BEHAVIORAL("behavioral", null),
	NONE("none",null);
	
	private final String name;
	private final PatternFactory factory;
	
	PatternType(String name, PatternFactory factory){
		this.name = name;
		this.factory = factory;
	}

	public String patternName(){
		return this.name;
	}
	
	public PatternFactory getFactory(){
		return this.factory;
	}}