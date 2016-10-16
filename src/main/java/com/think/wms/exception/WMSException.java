package com.think.wms.exception;

public class WMSException extends RuntimeException {

	public WMSException(String message, Throwable cause) {
		super(message, cause);
	}

	public WMSException(String message) {
		super(message);
	}

}
