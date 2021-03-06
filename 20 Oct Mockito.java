package com.mokito;

@FunctionalInterface
public interface MobileCheck {
	boolean checkMobileNumber(String number);
}
----------------------------------------------------------------------------
public class NumberCheck {
	private MobileCheck mobileCheck;

	public NumberCheck(MobileCheck mobileCheck) {
		this.mobileCheck = mobileCheck;
	}

	public boolean check(String number) {
		return mobileCheck.checkMobileNumber(number);
	}
}
----------------------------------------------------------------------------
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.Answer;

import com.mokito.MobileCheck;
import com.mokito.NumberCheck;

public class NumberTest {
	@Mock
	private MobileCheck mobileCheck;

	@InjectMocks
	private NumberCheck numberCheck;

	Answer<Boolean> answer = (invocation) -> {
		Object[] args = invocation.getArguments();
		String contact = (String) args[0];
		Pattern compile = Pattern.compile("[6-9][0-9]{9}");
		Matcher matcher = compile.matcher(contact);
		if (matcher.find()) {
			return true;
		}
		return false;
	};

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void testMobileNumber10Digit() {
		String number = "9730981155";
		when(mobileCheck.checkMobileNumber(number)).then(answer);
		boolean actual = numberCheck.check(number);
		assertTrue(actual);

	}

}
--------------------------------------------------------------------------------------------
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>com.mokito</groupId>
	<artifactId>Mokito</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>Mokito</name>
	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<maven.compiler.source>1.8</maven.compiler.source>
		<maven.compiler.target>${maven.compiler.source}</maven.compiler.target>
		<junit.jupiter.version>5.5.2</junit.jupiter.version>
		<junit.platform.version>1.5.2</junit.platform.version>
	</properties>
	<dependencies>
		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-engine</artifactId>
			<version>${junit.jupiter.version}</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-params</artifactId>
			<version>${junit.jupiter.version}</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.junit.platform</groupId>
			<artifactId>junit-platform-runner</artifactId>
			<version>${junit.platform.version}</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.mockito</groupId>
			<artifactId>mockito-all</artifactId>
			<version>1.9.5</version>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>org.mockito</groupId>
			<artifactId>mockito-junit-jupiter</artifactId>
			<version>2.17.0</version>
			<scope>test</scope>
		</dependency>
	</dependencies>
</project>