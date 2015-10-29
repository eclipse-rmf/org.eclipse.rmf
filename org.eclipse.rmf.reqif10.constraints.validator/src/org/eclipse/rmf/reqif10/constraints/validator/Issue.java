package org.eclipse.rmf.reqif10.constraints.validator;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.eclipse.rmf.reqif10.ReqIF;

@XmlRootElement(name = "issue")
public class Issue {
	public enum Severity {
		ERROR, WARNING, INFO
	}

	private Severity severity;
	private String message;
	private String location;
	private Integer line;
	private ReqIF reqif;
	private Object target;

	public Issue() {
	}
	
	public Issue(int line, String message) {
		this.line = line;
		this.message = message;
	}

	public void setReqif(ReqIF reqif) {
		this.reqif = reqif;
	}

	@XmlTransient
	public ReqIF getReqif() {
		return reqif;
	}

	@XmlAttribute(name = "line_number")
	public void setLine(Integer line) {
		this.line = line;
	}

	public Integer getLine() {
		return line;
	}

	@XmlAttribute(name = "severity")
	public void setSeverity(Severity severity) {
		this.severity = severity;
	}

	public Severity getSeverity() {
		return severity;
	}

	@XmlAttribute(name = "message")
	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	@XmlAttribute(name = "location")
	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocation() {
		return location;
	}
	
	
	public void setTarget(Object target) {
		this.target = target;
	}
	
	@XmlTransient
	public Object getTarget() {
		return target;
	}
	

	@XmlAttribute(name = "uri")
	public String getFile(){
		if (reqif == null){
			return null;
		}
		try{
			return reqif.eResource().getURI().toString();
		}catch(NullPointerException e){
			return null;
		}
	}
	
	public void setFile(){
	}
	
	@Override
	public String toString() {
		return severity + " at " + line + ": " + getMessage();
	}
}
