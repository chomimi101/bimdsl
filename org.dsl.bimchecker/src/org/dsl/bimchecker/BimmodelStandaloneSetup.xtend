/*
 * generated by Xtext 2.10.0
 */
package org.dsl.bimchecker


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class BimmodelStandaloneSetup extends BimmodelStandaloneSetupGenerated {

	def static void doSetup() {
		new BimmodelStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
