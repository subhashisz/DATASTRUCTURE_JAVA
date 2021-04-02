package com.myapp.common;

/**
 * Declaring un-checked exception
 */
public class AppUncheckedException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AppUncheckedException() {
		super();
	}

	public AppUncheckedException(String message) {
		super(message);
	}

}
