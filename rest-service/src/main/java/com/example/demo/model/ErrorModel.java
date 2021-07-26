package com.example.demo.model;

/**
 * Error response.
 * 
 * Jul 26, 2021
 * @author Salah Abu Msameh
 */
public class ErrorModel implements ApiResponse {
	
	private String errorCode;
	private String errorMsg;
	
	
	public ErrorModel(String errorCode, String errorMsg) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return errorCode;
	}
	
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	public String getErrorMsg() {
		return errorMsg;
	}
	
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
