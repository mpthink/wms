package com.think.wms.exception;

public class WMSException extends RuntimeException {

	private static final long serialVersionUID = -1385532935758764318L;

	public WMSException(String message, Throwable cause) {
		super(message, cause);
	}

	public WMSException(String message) {
		super(message);
	}

}
