package com.designpatterns.factories;

import org.json.simple.JSONArray;

import com.designpatterns.factories.interfaces.LanguageFactory;
import com.designpatterns.templates.Template;

public class EmptyFactory implements LanguageFactory {

	@Override
	public String buildPage(String realContextPath) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buildPatternTypePage(Template patternType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JSONArray buildJson(String realContextPath) {
		// TODO Auto-generated method stub
		return null;
	}

}
