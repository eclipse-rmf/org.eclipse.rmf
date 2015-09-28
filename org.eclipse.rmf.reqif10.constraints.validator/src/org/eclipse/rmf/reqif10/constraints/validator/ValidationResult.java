package org.eclipse.rmf.reqif10.constraints.validator;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "validation_result")
public class ValidationResult{
	
	/** 
	 * The files the validator was run on
	 * This does not contain files that were implicitly visited to resolve references
	 * */
	private List<String> files;
	
	/**
	 * All Issues found by the validator 
	 */
	private List<Issue> issues;

	private Date date = new Date();
	
	@XmlAttribute( name = "date" )
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Date getDate() {
		return date;
	}
	
	@XmlElementWrapper( name = "files")
	@XmlElement( name = "file" )
	public void setFiles(List<String> files) {
		this.files = files;
	}
	
	public List<String> getFiles() {
		return files;
	}

	
	@XmlElementWrapper( name = "issues")
	@XmlElement(name="issue")
	public void setIssues(List<Issue> issues){
		this.issues = issues;
	}
	
	public List<Issue> getIssues() {
		return issues;
	}
	
}



