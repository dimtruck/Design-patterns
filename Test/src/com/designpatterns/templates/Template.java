package com.designpatterns.templates;

import java.util.List;

import org.json.simple.JSONArray;

import com.designpatterns.entities.Pattern;

public interface Template {
	StringBuffer create(String language, List<Pattern> patterns);
	JSONArray createJson(String language,JSONArray patterns);
}
