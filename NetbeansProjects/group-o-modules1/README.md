# 1
#Simple compilation
#one by one run this commands:
javac -d build1/modules/org.my.validator.index $(find src/org.my.validator.index -name "*.java")
javac -d build1/modules/org.my.validator.street.name $(find src/org.my.validator.street.name/ -name "*.java")
javac -d build1/modules/org.my.validator.house.number $(find src/org.my.validator.house.number/ -name "*.java")
javac -d build1/modules/org.my.validator.house.apartment.number $(find src/org.my.validator.house.apartment.number/ -name "*.java")

#then run this one
javac -d build1/modules/org.my.validator.address --module-path build1/modules/ $(find src/org.my.validator.address -name "*.java")

# -verbose

javac -verbose -d build1/modules/org.my.validator.address --module-path build1/modules/ $(find src/org.my.validator.address -name "*.java")

# -g
javac -g -d build1/modules/org.my.validator.address --module-path build1/modules/ $(find src/org.my.validator.address -name "*.java")

# -g:none ( a little bit)
#redice class file size
javac -g:none -d build1/modules/org.my.validator.address --module-path build1/modules/ $(find src/org.my.validator.address -name "*.java")

#--module-version
# Add a module version information
javac --module-version 0.1 -g:none -d build1/modules/org.my.validator.address --module-path build1/modules/ $(find src/org.my.validator.address -name "*.java")

#-parameters
# Generarate metadata for reflection on method parameters
# nothing is generated (?)
javac -parameters -d build1/modules/org.my.validator.address --module-path build1/modules/ $(find src/org.my.validator.address -name "*.java")


javac -d build1/modules --module-source-path src $(find src -name "*.java")

#


javac -d build1/modules --module-source-path src/ --module-path classes $(find src -name "*.java")

#jar
#Create jar file for the module org.my.validator.address
jar --create --file dist1/org.my.validator.address.jar  -C build1/modules/org.my.validator.address .
jar --create --file dist1/org.my.validator.address.jar  -C build1/modules/org.my.validator.address

#--verbose
jar --verbose --create --file dist1/org.my.validator.address.jar  -C build1/modules/org.my.validator.address

#--describe-module
jar --describe-module --file dist1/org.my.validator.address.jar

