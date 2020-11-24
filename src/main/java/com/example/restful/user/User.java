package com.example.restful.user;

import java.util.Date;

import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 
 * @date : 2020. 10. 22. 오후 10:59:35
 * @version : 
 * @author : Jun
 */
@Data
@AllArgsConstructor
public class User {
	private Integer id;
	
	@Size(min=2)
	private String name;
	private Date joinDate;
}
