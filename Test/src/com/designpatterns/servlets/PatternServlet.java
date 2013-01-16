package com.designpatterns.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.EnumSet;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.designpatterns.enums.Language;
import com.designpatterns.enums.PatternType;
import com.designpatterns.factories.interfaces.LanguageFactory;
import com.designpatterns.factories.interfaces.PatternFactory;
import com.designpatterns.templates.Template;

/**
 * Servlet implementation class Home
 */
@WebServlet( name="PatternServlet", displayName="Pattern Servlet", urlPatterns = {"/pattern"}, loadOnStartup=1)
public class PatternServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Map<PatternType,Template> patternTypeMap = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatternServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//get pattern requested from request 
		//retrieve all patterns from json file
		//load on page
		String languageRequest = request.getParameter("language");
		LanguageFactory languageFactory = retrieveLanguageFactory(languageRequest);

		String patternRequest = request.getParameter("pattern");
		ServletContext context = request.getSession().getServletContext();
		String realContextPath = context.getRealPath(request.getContextPath()); 
		
		PrintWriter printWriter = response.getWriter();
		if(patternRequest == null)
			printWriter.write(languageFactory.buildPage(realContextPath));
		else 
			printWriter.write(languageFactory.buildPatternTypePage(null));
		printWriter.flush();
	}

	private LanguageFactory retrieveLanguageFactory(String languageRequest) {
		for(Language language : Language.values()){
			if(language.languageName().equals(languageRequest))
			{
				return language.getFactory();
			}
		}
		
		return Language.NONE.getFactory();
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
