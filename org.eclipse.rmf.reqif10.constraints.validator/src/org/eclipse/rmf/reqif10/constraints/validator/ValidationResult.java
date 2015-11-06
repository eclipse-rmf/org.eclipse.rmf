package org.eclipse.rmf.reqif10.constraints.validator;

import java.io.StringWriter;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
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
	
	private String toolId;
	
	public String getToolId() {
		return toolId;
	}

	@XmlAttribute( name = "toolId" )
	public void setToolId(String toolId) {
		this.toolId = toolId;
	}

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
	
	
	public static String getXMLResult(ValidationResult validationResult) {
		try {
			JAXBContext context = JAXBContext
					.newInstance(ValidationResult.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			StringWriter stringWriter = new StringWriter();
			m.marshal(validationResult, stringWriter);
			
			return stringWriter.toString();

		} catch (JAXBException e) {
			e.printStackTrace();
			return "An Error occured while generating XML Data : " + e.getLocalizedMessage();
		}
	}
	
	
	
}



