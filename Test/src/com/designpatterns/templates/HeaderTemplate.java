package com.designpatterns.templates;

import java.util.List;

import org.json.simple.JSONArray;

import com.designpatterns.entities.Pattern;

public class HeaderTemplate implements Template {

	@Override
	public StringBuffer create(String language, List<Pattern> patterns) {
		return new StringBuffer("<html><head><title>" + language + "</title></head><body>");
	}

	@Override
	public JSONArray createJson(String language, JSONArray patterns) {
		// TODO Auto-generated method stub
		return null;
	}

}
