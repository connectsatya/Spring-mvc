package com.gontuseries.studentadmissioncontroller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String>{

	@Override
	public void initialize(IsValidHobby isValidHobby) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext ctx) {
		if(studentHobby==null)
		{
			return false;
		}
		if(studentHobby.matches("music|hockey"))
		{
			return true;
		}
		else {
			return false;
		}
		
	}

}
