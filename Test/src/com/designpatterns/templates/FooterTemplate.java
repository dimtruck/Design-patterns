package com.designpatterns.templates;

import java.util.List;

import org.json.simple.JSONArray;

import com.designpatterns.entities.Pattern;

public class FooterTemplate implements Template {

	@Override
	public StringBuffer create(String language, List<Pattern> patterns) {
		return new StringBuffer().append("</body></html");
	}

	@Override
	public JSONArray createJson(String language, JSONArray patterns) {
		// TODO Auto-generated method stub
		return null;
	}

}
