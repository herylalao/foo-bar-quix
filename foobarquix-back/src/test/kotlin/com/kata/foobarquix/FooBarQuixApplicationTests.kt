package com.kata.foobarquix

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.junit.jupiter.api.Assertions.*
import com.kata.foobarquix.services.FooBarQuixService

@SpringBootTest
class FooBarQuixApplicationTests {

	private val objService = FooBarQuixService()


	@Test
	fun test_FBQ_1_E_1() {
		val retour = objService.convertNumber(1)
		assertEquals("1", retour, "fbq(1)=1")
	}

	@Test
	fun test_FBQ_3_E_FooFoo() {
		val retour = objService.convertNumber(3)
		assertEquals("FooFoo", retour, "fbq(3)=FooFoo")
	}

	@Test
	fun test_FBQ_5_E_BarBar() {
		val retour = objService.convertNumber(5)
		assertEquals("BarBar", retour, "fbq(5)=BarBar")
	}

	@Test
	fun test_FBQ_7_E_Quix() {
		val retour = objService.convertNumber(7)
		assertEquals("Quix", retour, "fbq(7)=Quix")
	}

	@Test
	fun test_FBQ_9_E_Foo() {
		val retour = objService.convertNumber(9)
		assertEquals("Foo", retour, "fbq(9)=Foo")
	}

	@Test
	fun test_FBQ_51_E_FooBar() {
		val retour = objService.convertNumber(51)
		assertEquals("FooBar", retour, "fbq(51)=FooBar")
	}

	@Test
	fun test_FBQ_53_E_BarFoo() {
		val retour = objService.convertNumber(53)
		assertEquals("BarFoo", retour, "fbq(53)=BarFoo")
	}

	@Test
	fun test_FBQ_33_E_FooFooFoo() {
		val retour = objService.convertNumber(33)
		assertEquals("FooFooFoo", retour, "fbq(33)=FooFooFoo")
	}

	@Test
	fun test_FBQ_27_E_FooQuix() {
		val retour = objService.convertNumber(27)
		assertEquals("FooQuix", retour, "fbq(27)=FooQuix")
	}

	@Test
	fun test_FBQ_15_E_FooBarBar() {
		val retour = objService.convertNumber(15)
		assertEquals("FooBarBar", retour, "fbq(15)=FooBarBar")
	}

}
