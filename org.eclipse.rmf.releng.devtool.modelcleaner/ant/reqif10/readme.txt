(0)
download and patch the reqif.cmof file from OMG:
=> run ant script 'ant/reqif10/0_prepare.xml' using the launch config /launch/ReqIF - 00 Prepare.launch 
The patch will make sure, that primitive types in cmof are properly found

(1) 
generate the ecore files
=> Open 'gen/reqif10/reqif.cmof' and convert package ReqIF to ecore. 
   Make sure that 'camel case names' is set to 'Ignore'. 
   This will create a new file 'gen/reqif10/ReqIF.ecore' and types.ecore

(2)
patch the ecore files.
This makes sure that 
- order of elements are correct
- mapping of xml names are properly set
- all estructural features are explicitly set to unsettable
- redundant back linkages are removed.
=> run ant script 'ant/reqif10/2_patchEcoreFiles.xml'. 
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


   
