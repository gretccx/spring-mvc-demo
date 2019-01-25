package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class courseCodeConstraintValidator
	implements ConstraintValidator<CourseCode, String>{
	
	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}

	@Override
	public boolean isValid(String theCode,
			ConstraintValidatorContext theConstraintValidatorContext) {
		if (theCode == null) {
			return true;
		}
		return theCode.startsWith(coursePrefix);
	}

}
