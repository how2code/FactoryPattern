package com.how2code.designpattern.factorypattern;

import com.how2code.designpattern.factorypattern.entity.ProgrammingLanguage;
import com.how2code.designpattern.factorypattern.factory.LanguageFactory;

public class Main {

	public static void main(String[] args) {
		
		ProgrammingLanguage language1 = LanguageFactory.getProgrammingLanguage("JAVA");
		language1.execute();
		
		ProgrammingLanguage language2 = LanguageFactory.getProgrammingLanguage("C");
		language2.execute();
		
		ProgrammingLanguage language3 = LanguageFactory.getProgrammingLanguage("CSHARP");
		language3.execute();
		
	}

}
