package net.unit8.sastruts.easyapi.dto;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@SuppressWarnings("serial")
@XStreamAlias("failure")
public class FailureDto implements Serializable {
	@XStreamAsAttribute
	private String code;
	
	@XStreamAsAttribute
	private String message;

	public FailureDto(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
