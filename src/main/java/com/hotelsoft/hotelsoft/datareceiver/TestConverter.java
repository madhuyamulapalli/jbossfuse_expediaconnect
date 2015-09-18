package com.hotelsoft.hotelsoft.datareceiver;

import org.dozer.CustomConverter;

public class TestConverter implements CustomConverter {


	
	  public Object convert(Object destination, Object source, 
		      Class destClass, Class sourceClass) {
		    if (source == null) {
		      return null;
		    }
		    
		    consolidatedperson.Person dest = null;
		    if(destination == null) {
		    	dest = new consolidatedperson.Person();
		    } else {
		    	dest = (consolidatedperson.Person) destination;
		    }
		    
		    person.Person sourceObj = (person.Person) source;
		    dest.setMailingAddress(String.valueOf(sourceObj.getAddress().getHouseNo()).trim()+" "+sourceObj.getAddress().getStreet().trim()+", "+sourceObj.getAddress().getCity().trim()+", "+sourceObj.getAddress().getState().trim());
		    dest.setFullName(sourceObj.getFirstName().trim()+" "+sourceObj.getLastName().trim());
		    
		    return dest;

	  }

}
