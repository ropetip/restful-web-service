package com.example.restful.helloworld;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @date : 2020. 10. 20. 오후 5:02:14
 * @version : 
 * @author : Jun
 */

// 롬복(Lombok)은 Java에서 반복적으로 작성되는 getters/setters나 equals, hashCode, toString 또는 생성자 관련 코드들을 간결하게 만들어주는 라이브러리다.

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HelloWorldBean {
	private String message;
	
}
