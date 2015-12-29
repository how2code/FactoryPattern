package com.how2code.designpattern.factory.factory;

import com.how2code.designpattern.factory.entity.C;
import com.how2code.designpattern.factory.entity.CSharp;
import com.how2code.designpattern.factory.entity.Java;
import com.how2code.designpattern.factory.entity.ProgrammingLanguage;

public class LanguageFactory {

	public static ProgrammingLanguage getProgrammingLanguage(String type) {

		switch (type) {
		case "JAVA":
			return new Java();
		case "C":
			return new C();
		case "CSHARP":
			return new CSharp();
		default:
			return null;
		}
	}

}
