package com.designpatterns.factories;

import com.designpatterns.factories.interfaces.LanguageFactory;
import com.designpatterns.templates.TemplateStrategy;

public class EmptyFactory implements LanguageFactory {

	@Override
	public String buildPage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buildPatternTypePage(TemplateStrategy patternType) {
		// TODO Auto-generated method stub
		return null;
	}

}