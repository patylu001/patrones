/*
 * Copyright 2013 ${company}.
 */
package com.mayab.desarrollo.orm;

import javax.inject.Inject;

import javax.persistence.EntityManager;

import static org.assertj.core.api.Assertions.assertThat;
import org.atteo.moonshine.Moonshine;
import org.atteo.moonshine.jta.Transactional;
import org.atteo.moonshine.tests.MoonshineConfiguration;
import org.atteo.moonshine.tests.MoonshineTest;
import org.junit.Test;

@MoonshineConfiguration(autoConfiguration = true)
public class UserTest extends MoonshineTest {
	@Inject
	private EntityManager entityManager;

	@Test
	@Transactional
	public void shouldStoreUser() {
		User user = new User();
		user.setName("Test Name");

		entityManager.persist(user);
	}
}
