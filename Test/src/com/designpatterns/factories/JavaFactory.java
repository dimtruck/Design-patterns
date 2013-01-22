package com.designpatterns.factories;

import java.util.List;

import org.json.simple.JSONArray;

import com.designpatterns.entities.Pattern;
import com.designpatterns.factories.interfaces.LanguageFactory;
import com.designpatterns.templates.BehavioralTemplate;
import com.designpatterns.templates.CreationalTemplate;
import com.designpatterns.templates.FooterTemplate;
import com.designpatterns.templates.HeaderTemplate;
import com.designpatterns.templates.Template;
import com.designpatterns.templates.TemplateContext;


public class JavaFactory implements LanguageFactory {
	private final String language = "Java";

	@Override
	public String buildPage(String realContextPath) {
		// TODO Auto-generated method stub
		List<Pattern> patternList = JsonFactory.getPatterns(realContextPath, "java-patterns.json");
		return new TemplateContext(new HeaderTemplate(),
				new CreationalTemplate(), new BehavioralTemplate(), new FooterTemplate())
		.BuildTemplate(language, patternList);
	}

	@Override
	public String buildPatternTypePage(Template patternType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JSONArray buildJson(String realContextPath) {
		// TODO Auto-generated method stub
		JSONArray patternList = JsonFactory.getJsonPatterns(realContextPath, "java-patterns.json");
		return new TemplateContext(new CreationalTemplate(), new BehavioralTemplate())
		.BuildJsonTemplate(language, patternList);
	}
}
