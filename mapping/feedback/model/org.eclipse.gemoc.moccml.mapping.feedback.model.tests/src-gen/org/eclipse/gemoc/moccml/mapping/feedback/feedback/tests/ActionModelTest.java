/*******************************************************************************
 * Copyright (c) 2017 I3S laboratory and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     I3S laboratory - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.gemoc.moccml.mapping.feedback.feedback.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.gemoc.moccml.mapping.feedback.feedback.ActionModel;
import org.eclipse.gemoc.moccml.mapping.feedback.feedback.FeedbackFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Action Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionModelTest extends TestCase {

	/**
	 * The fixture for this Action Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActionModelTest.class);
	}

	/**
	 * Constructs a new Action Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Action Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ActionModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Action Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionModel getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FeedbackFactory.eINSTANCE.createActionModel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ActionModelTest
