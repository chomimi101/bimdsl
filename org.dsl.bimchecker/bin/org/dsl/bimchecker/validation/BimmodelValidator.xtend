/*
 * generated by Xtext 2.10.0
 */
package org.dsl.bimchecker.validation

import org.dsl.bimchecker.bimmodel.Rule
import org.eclipse.xtext.validation.Check
import org.dsl.bimchecker.bimmodel.Bimmodel
import org.dsl.bimchecker.bimmodel.BimmodelPackage


import static org.dsl.bimchecker.bimmodel.BimmodelPackage.Literals.*
import static org.eclipse.xtext.xbase.XbasePackage.Literals.*

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class BimmodelValidator extends AbstractBimmodelValidator {
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					BimmodelPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

	public static val DUBPLICATE_NAME = 'duplicateName'
	
	@Check
	def checkRuleNameIsUnique(Bimmodel m){
		//var superRule = (r.eContainer as Rule)
		val ruleNames = newHashSet
		for (rule : m.rules) {
			if (!ruleNames.add(rule.name)) {
				error('Rule names must be unique.', rule, RULE__NAME)
			}
		}
	}
	
}
