package org.eclipse.rmf.reqif10.model.test;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.xml.XMLConstants;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.rmf.reqif10.ReqIf;
import org.eclipse.rmf.reqif10.model.test.modelbuilder.TC1000ModelBuilder;
import org.eclipse.rmf.reqif10.resource.ReqIf1ResourceImpl;
import org.junit.Test;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class TC1000SimpleContentTests  {
	
	private static final String WORKING_DIRECTORY = "work";

	
	@Test
	public void testSave() throws IOException {
		ReqIf reqIf = new TC1000ModelBuilder().getReqIf();
		saveReqifFile(reqIf, "TC1000.reqif");
	} 
	
/**
 * 
	public void testSchema() throws Throwable {
		validateSchema(WORKING_DIRECTORY + IPath.SEPARATOR + "TC1000.reqif");
	}
	*/
	public static void saveReqifFile(ReqIf reqif, String fileName) throws IOException {
		URI emfURI = createEMFURI(fileName);
		Resource resource = new ReqIf1ResourceImpl(emfURI); 	
		resource.getContents().add(reqif);
		resource.save(null);
	}
	
	private static URI createEMFURI(String fileName) {
		return URI.createURI(WORKING_DIRECTORY + IPath.SEPARATOR + fileName, true);
	}
	
	
	private static void validateSchema(String fileName) throws Exception {
		// 1. Lookup a factory for the W3C XML Schema language
        SchemaFactory factory = 
            SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
        
        // 2. Compile the schema. 
        URL reqIfSchemaUrl = new URL("http://www.omg.org/spec/ReqIF/20110401/reqif.xsd");
        //URL xhtmlSchemaUrl = new URL("http://www.omg.org/spec/ReqIF/20110402/driver.xsd");
        Schema reqIfSchema = factory.newSchema(reqIfSchemaUrl);
        //Schema xhtmlSchema = factory.newSchema(xhtmlSchemaUrl);
    
        // 3. Get a validator from the schema.
        Validator validator = reqIfSchema.newValidator();

        
        // 4. Parse the document you want to check.
        Source source = new StreamSource(fileName);
        
        // 5. Check the document
        try {
            validator.validate(source);
            System.out.println(fileName + " is valid.");
        }
        catch (SAXException ex) {
            System.out.println(fileName + " is not valid because ");
            System.out.println(ex.getMessage());
        }  
	}
	
	private static void validateSchema2(String fileName) throws Throwable {
		Reader reader = new FileReader(WORKING_DIRECTORY + IPath.SEPARATOR + fileName);
		InputSource inputSource = new InputSource(reader);
		
		
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		
		// Retrieve application-defined XMLReader features (see http://xerces.apache.org/xerces2-j/features.html for
		// available features and their details)
		@SuppressWarnings("unchecked")
		Map<String, Boolean> parserFeatures = new HashMap<String, Boolean>();

		// Retrieve application-defined XMLReader properties (see http://xerces.apache.org/xerces2-j/properties.html
		// for available properties and their details)
		@SuppressWarnings("unchecked")
		Map<String, Object> parserProperties = new HashMap<String, Object>();

		// Perform namespace processing (prefixes will be stripped off element and attribute names and replaced with the
		// corresponding namespace URIs) but do not report attributes used for namespace declarations, and do not report
		// original prefixed names
		//parserFeatures.put(Constants.SAX_FEATURE_PREFIX + Constants.NAMESPACES_FEATURE, true);
		//parserFeatures.put(Constants.SAX_FEATURE_PREFIX + Constants.NAMESPACE_PREFIXES_FEATURE, false);

		// Optionally enable schema validation unless document has been migrated before; in this case schema validation
		// is subject to the applicable model converter
		parserFeatures.put("http://xml.org/sax/features/validation", true);
		parserFeatures.put("http://apache.org/xml/features/validation/schema", true);
		parserProperties.put("http://java.sun.com/xml/jaxp/properties/schemaLanguage", XMLConstants.W3C_XML_SCHEMA_NS_URI);

		DefaultHandler handler = null;
		
//		handler = makeDefaultHandler();

		// Set features and properties
		if (parserFeatures != null) {
			for (String feature : parserFeatures.keySet()) {
				parser.getXMLReader().setFeature(feature, parserFeatures.get(feature).booleanValue());
			}
		}
		if (parserProperties != null) {
			for (String property : parserProperties.keySet()) {
				parser.getXMLReader().setProperty(property, parserProperties.get(property));
			}
		}

		parser.parse(inputSource, handler);
		
	}


}
