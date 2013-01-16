package com.designpatterns.factories;

import java.util.HashMap;

import com.designpatterns.entities.Pattern;
import com.designpatterns.factories.interfaces.LanguageFactory;
import com.designpatterns.factories.interfaces.PatternFactory;
import com.designpatterns.templates.TemplateStrategy;

public class JavaFactory implements LanguageFactory {

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
