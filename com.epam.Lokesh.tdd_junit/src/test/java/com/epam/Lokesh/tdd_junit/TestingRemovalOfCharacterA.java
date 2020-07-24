package com.epam.Lokesh.tdd_junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestingRemovalOfCharacterA {

	RemoveCharacterAFromString removingAObject;

	@BeforeEach
	void setUp() {
		removingAObject = new RemoveCharacterAFromString();
	}

	@Test
	void test1() {
		assertEquals("WOW", removingAObject.removeCharacterA("WOW"));
	}

	@Test
	void test2() {
		assertEquals("BCD", removingAObject.removeCharacterA("ABCD"));
	}

	@Test
	void test3() {
		assertEquals("", removingAObject.removeCharacterA("AAAAA"));
	}

	@Test
	void test4() {
		assertEquals("", removingAObject.removeCharacterA(""));
	}

	@Test
	void test5() {
		assertEquals("MNGO", removingAObject.removeCharacterA("MANGO"));
	}

}
