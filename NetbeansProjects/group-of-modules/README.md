#compile all by one command
# I hope one day IDE can do it
javac -d build1/modules --module-source-path src $(find src -name "*.java")

#jar
#Create jar file for the module org.my.validator.address
jar --create --file dist1/org.my.validator.address.jar  -C build1/modules/org.my.validator.address .
jar --create --file dist1/org.my.validator.address.jar  -C build1/modules/org.my.validator.address

#--verbose
jar --verbose --create --file dist1/org.my.validator.address.jar  -C build1/modules/org.my.validator.address

#--describe-module
jar --describe-module --file dist1/org.my.validator.address.jar

