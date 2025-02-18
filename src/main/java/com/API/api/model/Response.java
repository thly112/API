package com.API.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {
	public Response(boolean b, String string, Object allCategories) {
		// TODO Auto-generated constructor stub
	}
	private boolean status;
	private String message;
	private Object body;
}
