/**
 * generated by Xtext 2.10.0
 */
package org.dsl.bimchecker;

import org.dsl.bimchecker.BimmodelStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class BimmodelStandaloneSetup extends BimmodelStandaloneSetupGenerated {
  public static void doSetup() {
    BimmodelStandaloneSetup _bimmodelStandaloneSetup = new BimmodelStandaloneSetup();
    _bimmodelStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
