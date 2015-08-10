Building RMF from the command line.  Note that there is also a launch configuration in "launcher".

mvn clean verify -P platform-luna

Tests take very long - to skip, add

-Dmaven.test.skip=true 

