package com.designpatterns.factories.interfaces;

import com.designpatterns.templates.Template;

public interface LanguageFactory {
	String buildPage(String realContextPath);
	String buildPatternTypePage(Template patternType);
}
