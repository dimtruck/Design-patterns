package com.designpatterns.factories.interfaces;

import java.util.HashMap;

import com.designpatterns.entities.Pattern;
import com.designpatterns.templates.Template;

public interface PatternFactory {
	Pattern createPattern();
	PatternFactory setStrategyMap(HashMap<Pattern, Template> strategyMap);
}
