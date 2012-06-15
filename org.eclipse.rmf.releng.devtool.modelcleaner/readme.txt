(0)
download the spec files from w3c and omg:
=> run ant script 'ant/0_downloadSpecFiles.xml'

(1)
patch the original xsd and cmof files.
- make sure that the xsds are usable without internet access
- make sure that primitive types in cmof are properly found
=> run ant script 'ant/1_patchOriginalXsdAndCmof.xml'

(2) 
generate the ecore files
=> Open 'gen/patched1/cmof/reqif.cmof' and convert package ReqIF to ecore. 
   Make sure that 'camel case names' is set to 'Ignore'. 
   This will create a new file 'gen/patched1/cmof/ReqIF.ecore'</echo>
=> Create genmodel and ecore from 'gen/patched1/schema/reqif.xsd' 
   (New->other->Eclipse Modeling Framework/EMF Generator Model -> XML Schema; select XML Namespace from platform / other models from input)

(3)
patch the ecore files.
This makes sure that 
- order of elements are correct
- mapping of xml names are properly set
- all estructural features are explicitly set to unsettable
- redundant back linkages are removed.
- reqif.ecore generated from .cmof is properly integrated with xhtml.ecore generated from xsd.
=> run ant script 'ant/2_patchEcoreFiles.xml'. 
   Make sure that the ant files is executed in the same JVM as the current Eclipse Runtime
   Make sure that QVTO is installed in your Eclipse IDE
   
(4)
copy the generated ecore files to 
org.eclipse.rmf.reqif10

(5)
regenerate code
select the genmodel in org.eclipse.rmf.reqif10/model
right-click -> reload...
generate "model"

(6)
fix the plugin.xml

take section 
   <extension point="org.eclipse.emf.ecore.content_parser">
      <parser
            contentTypeIdentifier="org.eclipse.rmf.reqif10.reqif10XMLFile"
            class="org.eclipse.rmf.serialization.ReqIFResourceFactoryImpl"/>
   </extension>
   
and move it into
org.eclipse.rmf.serialization/plugin.xml


   
