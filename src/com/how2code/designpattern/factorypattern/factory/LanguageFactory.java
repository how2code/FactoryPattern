package com.how2code.designpattern.factorypattern.factory;

import com.how2code.designpattern.factorypattern.entity.C;
import com.how2code.designpattern.factorypattern.entity.CSharp;
import com.how2code.designpattern.factorypattern.entity.Java;
import com.how2code.designpattern.factorypattern.entity.ProgrammingLanguage;

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
