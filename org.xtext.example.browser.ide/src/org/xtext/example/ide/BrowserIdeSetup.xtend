/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.example.BrowserRuntimeModule
import org.xtext.example.BrowserStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class BrowserIdeSetup extends BrowserStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new BrowserRuntimeModule, new BrowserIdeModule))
	}
	
}
