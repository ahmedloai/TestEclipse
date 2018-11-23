package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.hamcrest.core.AllOf;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;
import org.omg.PortableInterceptor.SUCCESSFUL;

import main.TestClass;

class testTestClass {
	@Test
	void divideByZeroIsNotPossible() {
		fail("this will always fails");
	}

}
