package com.example.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestLifeCycle {
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("## BeforeAll Annotation 호출 ##\n");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("## afterAll Annotation 호출 ##\n");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("## beforeEach Annotation 호출 ##\n");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("## afterEach Annotation 호출 ##\n");
	}
	
	@Test
	void test1() {
		System.out.println("## test1 호출 ##\n");
	}
	@Test
	@DisplayName("Test Case 2!!")
	void test2() {
		System.out.println("## test2 호출 ##\n");
	}
	@Test
	@Disabled
	void test3() {
		System.out.println("## disabled test3 호출 ##\n");
	}
}
