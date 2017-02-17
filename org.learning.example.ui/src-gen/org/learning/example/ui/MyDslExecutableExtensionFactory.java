/*
 * generated by Xtext 2.11.0
 */
package org.learning.example.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.learning.example.ui.internal.ExampleActivator;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ExampleActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ExampleActivator.getInstance().getInjector(ExampleActivator.ORG_LEARNING_EXAMPLE_MYDSL);
	}
	
}