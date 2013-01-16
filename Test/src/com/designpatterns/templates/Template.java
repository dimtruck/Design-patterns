package com.designpatterns.templates;

import java.util.List;

import com.designpatterns.entities.Pattern;

public interface Template {
	StringBuffer create(String language, List<Pattern> patterns);
}
