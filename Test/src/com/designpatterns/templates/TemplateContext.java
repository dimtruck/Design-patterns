package com.designpatterns.templates;

import java.util.List;

import com.designpatterns.entities.Pattern;

public class TemplateContext {
	private final Template[] templates;
	public TemplateContext(Template... templates) {
		this.templates = templates;
	}
	public String BuildTemplate(String language, List<Pattern> patterns){
		StringBuffer buffer = new StringBuffer();
		for(Template template: templates)
			buffer.append(template.create(language, patterns));
		return buffer.toString();
	}
}
