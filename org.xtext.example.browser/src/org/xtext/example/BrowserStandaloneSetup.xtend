/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class BrowserStandaloneSetup extends BrowserStandaloneSetupGenerated {

	def static void doSetup() {
		new BrowserStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}