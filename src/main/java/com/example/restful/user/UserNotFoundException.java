package com.example.restful.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 
 * @date : 2020. 10. 28. 오후 9:58:57
 * @version : 
 * @author : Jun
 */

/*
 HTTP Status code
 2XX -> OK
 4XX -> Client
 5XX -> Server
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public UserNotFoundException(String message) {
		super(message);
	}
}
