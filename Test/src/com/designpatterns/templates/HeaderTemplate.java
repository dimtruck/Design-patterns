package com.designpatterns.templates;

import java.util.List;

import com.designpatterns.entities.Pattern;

public class HeaderTemplate implements Template {

	@Override
	public StringBuffer create(String language, List<Pattern> patterns) {
		return new StringBuffer("<html><head><title>" + language + "</title></head><body>");
	}

}
