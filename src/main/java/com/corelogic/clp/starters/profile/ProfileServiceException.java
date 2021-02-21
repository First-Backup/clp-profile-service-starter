package com.corelogic.clp.starters.profile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class ProfileServiceException extends Exception{
    private static final long serialVersionUID = 1L;
	private static final Logger LOG = LoggerFactory.getLogger(ProfileServiceException.class);

	public ProfileServiceException(String message){
		super();
		LOG.error(String.format("Failed To Obtain Profile "+message+ "is null"));
	}

	public ProfileServiceException(Exception ex) {
		LOG.error(String.format("The follwoing error has occured with the exception" +ex.getMessage()));
	}
}
