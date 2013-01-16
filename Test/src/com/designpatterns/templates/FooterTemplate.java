package com.designpatterns.templates;

import java.util.List;

import com.designpatterns.entities.Pattern;

public class FooterTemplate implements Template {

	@Override
	public StringBuffer create(String language, List<Pattern> patterns) {
		return new StringBuffer().append("</body></html");
	}

}
