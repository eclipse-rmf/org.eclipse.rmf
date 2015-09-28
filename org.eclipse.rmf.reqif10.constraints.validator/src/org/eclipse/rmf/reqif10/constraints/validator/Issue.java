package org.eclipse.rmf.reqif10.constraints.validator;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

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

	public Issue() {
	}

	public void setReqif(ReqIF reqif) {
		this.reqif = reqif;
	}

	public ReqIF getReqif() {
		return reqif;
	}

	public Issue(int line, String message) {
		this.line = line;
		this.message = message;
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
	
	@Override
	public String toString() {
		return severity + " at " + line + ": " + getMessage();
	}
}
