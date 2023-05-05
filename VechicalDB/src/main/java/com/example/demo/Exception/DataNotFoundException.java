package com.example.demo.Exception;

public class DataNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String resourcname;
	private String fieldname;
	private Object fieldvalue;
	public DataNotFoundException(String resourcname, String fieldname, Object fieldvalue) {
		super( resourcname+"not found for"+fieldname+"with value :"+fieldvalue);
		this.resourcname = resourcname;
		this.fieldname = fieldname;
		this.fieldvalue = fieldvalue;
	}
	public String getResourcname() {
		return resourcname;
	}
	public void setResourcname(String resourcname) {
		this.resourcname = resourcname;
	}
	public String getFieldname() {
		return fieldname;
	}
	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}
	public Object getFieldvalue() {
		return fieldvalue;
	}
	public void setFieldvalue(Object fieldvalue) {
		this.fieldvalue = fieldvalue;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
