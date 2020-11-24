package com.example.restful.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @date : 2020. 10. 28. 오후 10:06:28
 * @version : 
 * @author : Jun
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse {
	private Date timestamp;
	private String message;
	private String details;
}
