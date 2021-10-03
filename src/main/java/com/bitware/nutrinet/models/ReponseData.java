package com.bitware.nutrinet.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReponseData <T> {
	@JsonProperty("Cve_Error")
	private String code;
	@JsonProperty("Cve_Mensaje")
	private String description;
	@JsonProperty("Datos")
    private T result;
	
    public String getCode() {
    	return code;
    }
    
    public void setCode(String code) {
    	this.code = code;
    }
    public String getDescription() {
    	return description;
    }
    
    public void setDescription(String description) {
    	this.description = description;
    }
    
    public T getResult() {
    	return result;
    }
    
    public void setResult(T result) {
    	this.result = result;
    }
    
}
