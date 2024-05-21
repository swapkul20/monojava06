package com.techlabs.jpacrud.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class StudentErrorResponse {
	
	private int status;
	private String message;
	private long timestamp;
	

}
