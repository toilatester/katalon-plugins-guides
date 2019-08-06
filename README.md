# Guide To Implement Katalon Studio Plugin
> This project will guide you steps to implement a plugin in Katalon Studio
----------
:fire::fire::fire::fire::fire:

***Tutorial steps:***
- Create sample maven project
- Define pom.xml :cold_sweat: (It will include 2 steps before you can develop your first Katalon Plugin)
- Create basic Katalon Studio plugin
- Create advance Katalon Studio plugin with inject tooltips and preference page

----------
# Create Maven Project

***Define your initial pom.xml as config below***

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>

	<groupId>toilatester.vn</groupId>
	<artifactId>plugins</artifactId>
	<version>0.0.1</version>

	<dependencies>
		<!-- Katalon Platform dependencies -->
		<dependency>
			<groupId>com.katalon</groupId>
			<artifactId>com.katalon.platform</artifactId>
			<version>1.0.12</version>
		</dependency>
	</dependencies>
	
	<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-dependency-plugin</artifactId>
				<executions>
					<execution>
						<id>unpack-dependencies</id>
						<phase>prepare-package</phase>
						<goals>
							<goal>unpack-dependencies</goal>
						</goals>
						<configuration>
							<excludes>com/katalon/platform/**,org/eclipse/**,org/osgi/**</excludes>
							<includes>**/*.class</includes>
							<outputDirectory>${project.build.outputDirectory}</outputDirectory>
						</configuration>
					</execution>
				</executions>
			</plugin>
		</plugins>
	</build>
</project>
```

***Install dependencies package***
>Use mvn command with command below:

```
mvn clean install
```

Use IDE (Eclipse) 
1. Right-click to project name
2. Hover-mouse to 'Maven' in menu 
3. Click to "Update Project..."
4. Click "OK" button 
5. :coffee:
