package com.designpatterns.factories.interfaces;

import org.json.simple.JSONArray;

import com.designpatterns.templates.Template;

public interface LanguageFactory {
	String buildPage(String realContextPath);
	JSONArray buildJson(String realContextPath);
	String buildPatternTypePage(Template patternType);
}
