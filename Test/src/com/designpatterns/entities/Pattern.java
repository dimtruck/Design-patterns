package com.designpatterns.entities;

import com.designpatterns.enums.Language;

public interface Pattern {

	String getName();
	void setName(String name);
	
	Language getLanguage();
	void setLanguage(Language language);
	
	String getImage();
	void setImage(String image);
	
	PatternExample getExample();
	void setExample(PatternExample example);
}
