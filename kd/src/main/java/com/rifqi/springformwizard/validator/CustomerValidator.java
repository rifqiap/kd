package com.rifqi.springformwizard.validator;

import com.rifqi.springformwizard.entity.Customer;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author Agung Setiawan
 */
public class CustomerValidator implements  Validator{

    @Override
    public boolean supports(Class<?> type) {
        return Customer.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {        
        validatePage1(o, errors);
        validatePage2(o, errors);
        validatePage3(o, errors);
    }
    
    public void validatePage1(Object o,Errors errors){
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "required"); 
    }
    
    public void validatePage2(Object o,Errors errors){
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "required");
    }
    
    public void validatePage3(Object o,Errors errors){
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "country", "required");
    }
    
}
