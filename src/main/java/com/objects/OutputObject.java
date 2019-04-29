package com.objects;

public class OutputObject {
	public OutputObject(String message, boolean error, String detail) {
		super();
		this.message = message;
		this.error = error;
		this.detail = detail;
	}

	private String message;
	private boolean error;
	private String detail;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

}
