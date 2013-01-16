package com.designpatterns.factories.interfaces;

import com.designpatterns.templates.TemplateStrategy;

public interface LanguageFactory {
	String buildPage();
	String buildPatternTypePage(TemplateStrategy patternType);
}
