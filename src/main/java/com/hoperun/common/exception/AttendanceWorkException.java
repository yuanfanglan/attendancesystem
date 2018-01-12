package com.hoperun.common.exception;

/** 
* @description 出勤记录异常
* @author XHX
* @date 2017年12月26日 下午2:47:56 
*/  
public class AttendanceWorkException extends Exception {
	private static final long serialVersionUID = 1L;

	private String msg;

	public AttendanceWorkException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public AttendanceWorkException(String msg, Throwable e) {
		super(msg, e);
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
