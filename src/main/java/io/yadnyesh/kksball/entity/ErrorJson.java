package io.yadnyesh.kksball.entity;

public class ErrorJson {
	private Integer status;
	private String error;
	private String message;
	private String timeStamp;
	private String trace;
	
	public ErrorJson(Integer status, String error, String message, String timeStamp, String trace) {
		this.status = status;
		this.error = error;
		this.message = message;
		this.timeStamp = timeStamp;
		this.trace = trace;
	}
	
	public Integer getStatus() {
		return status;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public String getError() {
		return error;
	}
	
	public void setError(String error) {
		this.error = error;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getTimeStamp() {
		return timeStamp;
	}
	
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	public String getTrace() {
		return trace;
	}
	
	public void setTrace(String trace) {
		this.trace = trace;
	}
}
