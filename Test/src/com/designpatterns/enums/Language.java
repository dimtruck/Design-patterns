package com.designpatterns.enums;

import com.designpatterns.factories.EmptyFactory;
import com.designpatterns.factories.JavaFactory;
import com.designpatterns.factories.interfaces.LanguageFactory;

public enum Language {
	JAVA("java", new JavaFactory()),
	CSHARP("csharp", null),
	RUBY("ruby", null),
	JAVASCRIPT("javascript", null),
	ERLANG("erlang", null),
	NONE("none",new EmptyFactory());
	
	private final String name;
	private final LanguageFactory factory;
	
	Language(String name, LanguageFactory factory){
		this.name = name;
		this.factory = factory;
	}

	public String languageName(){
		return this.name;
	}
	
	public LanguageFactory getFactory(){
		return this.factory;
	}
	
}
