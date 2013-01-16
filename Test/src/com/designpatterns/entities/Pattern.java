package com.designpatterns.entities;

import java.util.List;

import com.designpatterns.enums.Language;
import com.designpatterns.enums.PatternType;

public class Pattern {

	private String name;
	private Language language;
	private String image;
	private List<PatternExample> example;
	private String description;
	private PatternType patternType;
	private String useCase;
	
	public String getName(){return this.name;}
	public void setName(String name){this.name = name;}
	
	public Language getLanguage(){return this.language;}
	public void setLanguage(Language language){this.language = language;}
	
	public String getImage(){return this.image;}
	public void setImage(String image){this.image = image;}
	
	public List<PatternExample> getExample(){return this.example;}
	public void setExample(List<PatternExample> example){this.example = example;}
	
	public String getDescription(){return this.description;}
	public void setDescription(String description){this.description = description;}
	
	public PatternType getPatternType(){return this.patternType;}
	public void setPatternType(PatternType patternType){this.patternType = patternType; }
	
	public String getUseCase(){return this.useCase;}
	public void setUseCase(String useCase){this.useCase = useCase;}
	
	private Pattern(){}
	
	private Pattern(String name, String description, Language language, 
			String image, PatternType patternType, String useCase, List<PatternExample> example){
		this.name = name;
		this.description = description;
		this.language = language;
		this.image = image;
		this.example = example;		
		this.patternType = patternType;
		this.useCase= useCase;
	}
	
	public static Pattern createPattern(String name, String description, Language language, 
			String image, PatternType patternType, String useCase, List<PatternExample> example){
		return new Pattern(name,description,language,image, patternType, useCase, example);
	}
}
