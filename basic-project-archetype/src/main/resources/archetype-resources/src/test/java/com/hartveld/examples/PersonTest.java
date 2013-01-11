package com.hartveld.examples;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		Person p = new Person("David", null, "Hartveld");

		assertThat(p.getMiddleName(), is(nullValue()));
	}

}
