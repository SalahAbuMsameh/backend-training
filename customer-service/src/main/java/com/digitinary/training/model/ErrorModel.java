package com.digitinary.training.model;

/**
 * 
 * Jul 31, 2021
 * @author Salah Abu Msameh
 */
public class ErrorModel {
	
	private String code;
	private String message;
	
	/**
	 * 
	 * @param code
	 * @param message
	 */
	public ErrorModel(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
