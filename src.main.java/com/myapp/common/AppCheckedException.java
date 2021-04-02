package com.myapp.common;

/*
 * Declaring checked exception
 */
public class AppCheckedException extends Exception {

	private static final long serialVersionUID = 1L;

	public AppCheckedException() {
		super();
	}

	public AppCheckedException(String message) {
		super(message);
	}

}
