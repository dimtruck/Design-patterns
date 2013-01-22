package com.designpatterns.templates;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.designpatterns.entities.Pattern;
import com.designpatterns.enums.PatternType;

public class CreationalTemplate implements Template {

	@Override
	public StringBuffer create(String language, List<Pattern> patterns) {
		StringBuffer sb = new StringBuffer();
		sb.append("<h2>Creational Patterns</h2>");
		sb.append("<ul>");
		for(Pattern pattern: patterns){
			if(pattern.getPatternType() == PatternType.CREATIONAL){
				sb.append("<li class='pattern'>");
				sb.append("<span class='" + pattern.getName().replace(' ', '_') + "'>");
				sb.append(pattern.getName() + "</span>");
				sb.append("<p><span class='title'>WHAT IT IS:</span>" + pattern.getDescription() + "</p>");
				sb.append("<p><span class='title'>WHEN SHOULD I USE IT:</span>" + pattern.getUseCase() + "</p>");
				sb.append("</li>");
			}
		}
		sb.append("</ul>");
		return sb;
	}

	@Override
	public JSONArray createJson(String language, JSONArray patterns) {
		JSONArray array = new JSONArray();
		for(Object pattern: patterns){
			if(retrievePatternType((String)((JSONObject)pattern).get("type")) == PatternType.CREATIONAL){
				array.add(pattern);
			}
		}
		return array;
	}
	
	private static PatternType retrievePatternType(String patternType) {
		for(PatternType patternTypeEnum : PatternType.values()){
			if(patternTypeEnum.patternName().equals(patternType))
			{
				return patternTypeEnum;
			}
		}
		
		return PatternType.NONE;
	}

}
