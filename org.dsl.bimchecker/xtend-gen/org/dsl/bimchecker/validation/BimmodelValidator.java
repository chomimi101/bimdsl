/**
 * generated by Xtext 2.10.0
 */
package org.dsl.bimchecker.validation;

import com.google.common.base.Objects;
import java.util.HashSet;
import org.dsl.bimchecker.bimmodel.Aliass;
import org.dsl.bimchecker.bimmodel.Annotation;
import org.dsl.bimchecker.bimmodel.AnnotationDetail;
import org.dsl.bimchecker.bimmodel.Bimmodel;
import org.dsl.bimchecker.bimmodel.BimmodelPackage;
import org.dsl.bimchecker.bimmodel.Rule;
import org.dsl.bimchecker.validation.AbstractBimmodelValidator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class BimmodelValidator extends AbstractBimmodelValidator {
  public final static String DUBPLICATE_NAME = "duplicateName";
  
  @Check
  public void checkRuleNameIsUnique(final Bimmodel m) {
    final HashSet<String> ruleNames = CollectionLiterals.<String>newHashSet();
    EList<Rule> _rules = m.getRules();
    for (final Rule rule : _rules) {
      {
        String _name = rule.getName();
        boolean _add = ruleNames.add(_name);
        boolean _not = (!_add);
        if (_not) {
          this.error("Rule names must be unique.", rule, BimmodelPackage.Literals.RULE__NAME);
        }
        final Aliass tmp = rule.getAlialist();
        EList<String> _aliass = tmp.getAliass();
        boolean _contains = _aliass.contains("ifcspace");
        if (_contains) {
          Annotation _annoinfo = rule.getAnnoinfo();
          String annoname = _annoinfo.getAnnotationName();
          Annotation _annoinfo_1 = rule.getAnnoinfo();
          AnnotationDetail annovalue = _annoinfo_1.getAnnodetail();
          boolean _not_1 = (!((annoname.compareTo("Longname") == 0) && Objects.equal(annovalue, null)));
          if (_not_1) {
            this.error("Rule with alia ifcspace can only have annotation \'LongName\'", rule, BimmodelPackage.Literals.RULE__NAME);
          }
        }
      }
    }
  }
}
