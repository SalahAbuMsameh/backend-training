package com.digitinary.training.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.digitinary.training.model.ErrorModel;

/**
 * 
 * Jul 31, 2021
 * @author Salah Abu Msameh
 */
@ControllerAdvice
public class CustomerServiceReposneEntityExceptionHandling extends ResponseEntityExceptionHandler {
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(ex.getAllErrors());
	}
	
	/**
	 * 
	 * @param ex
	 * @return
	 */
	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<ErrorModel> handleCustomerNotFoundException(CustomerNotFoundException ex) {
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
				.body(new ErrorModel("ERR-005", ex.getMessage()));
	}
}
