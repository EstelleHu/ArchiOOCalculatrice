package test.calculatrice.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import calculatrice.utils.ExceptionEnum;

public class ExceptionEnumTest {

	@Test
	public void getNameFromCodeTestOK() {
		assertEquals(ExceptionEnum.getNameFromCode(1),"DIVISION_BY_ZERO");
	}
	@Test
	public void getNameFromCodeTestNULL() {
		assertEquals(ExceptionEnum.getNameFromCode(6),null);
	}
}
