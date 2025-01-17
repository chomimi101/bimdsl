/**
 * generated by Xtext 2.10.0
 */
package org.dsl.bimchecker.bimmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.dsl.bimchecker.bimmodel.BimmodelFactory
 * @model kind="package"
 * @generated
 */
public interface BimmodelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "bimmodel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.dsl.org/bimchecker/Bimmodel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "bimmodel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BimmodelPackage eINSTANCE = org.dsl.bimchecker.bimmodel.impl.BimmodelPackageImpl.init();

  /**
   * The meta object id for the '{@link org.dsl.bimchecker.bimmodel.impl.BimmodelImpl <em>Bimmodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dsl.bimchecker.bimmodel.impl.BimmodelImpl
   * @see org.dsl.bimchecker.bimmodel.impl.BimmodelPackageImpl#getBimmodel()
   * @generated
   */
  int BIMMODEL = 0;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIMMODEL__RULES = 0;

  /**
   * The number of structural features of the '<em>Bimmodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIMMODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.dsl.bimchecker.bimmodel.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dsl.bimchecker.bimmodel.impl.RuleImpl
   * @see org.dsl.bimchecker.bimmodel.impl.BimmodelPackageImpl#getRule()
   * @generated
   */
  int RULE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Alialist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__ALIALIST = 1;

  /**
   * The feature id for the '<em><b>Annoinfo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__ANNOINFO = 2;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.dsl.bimchecker.bimmodel.impl.AliassImpl <em>Aliass</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dsl.bimchecker.bimmodel.impl.AliassImpl
   * @see org.dsl.bimchecker.bimmodel.impl.BimmodelPackageImpl#getAliass()
   * @generated
   */
  int ALIASS = 2;

  /**
   * The feature id for the '<em><b>Aliass</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIASS__ALIASS = 0;

  /**
   * The number of structural features of the '<em>Aliass</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIASS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.dsl.bimchecker.bimmodel.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dsl.bimchecker.bimmodel.impl.AnnotationImpl
   * @see org.dsl.bimchecker.bimmodel.impl.BimmodelPackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 3;

  /**
   * The feature id for the '<em><b>Annotation Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__ANNOTATION_NAME = 0;

  /**
   * The feature id for the '<em><b>Annodetail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__ANNODETAIL = 1;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.dsl.bimchecker.bimmodel.impl.AnnotationDetailImpl <em>Annotation Detail</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dsl.bimchecker.bimmodel.impl.AnnotationDetailImpl
   * @see org.dsl.bimchecker.bimmodel.impl.BimmodelPackageImpl#getAnnotationDetail()
   * @generated
   */
  int ANNOTATION_DETAIL = 4;

  /**
   * The feature id for the '<em><b>Annos</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_DETAIL__ANNOS = 0;

  /**
   * The number of structural features of the '<em>Annotation Detail</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_DETAIL_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.dsl.bimchecker.bimmodel.Bimmodel <em>Bimmodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bimmodel</em>'.
   * @see org.dsl.bimchecker.bimmodel.Bimmodel
   * @generated
   */
  EClass getBimmodel();

  /**
   * Returns the meta object for the containment reference list '{@link org.dsl.bimchecker.bimmodel.Bimmodel#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see org.dsl.bimchecker.bimmodel.Bimmodel#getRules()
   * @see #getBimmodel()
   * @generated
   */
  EReference getBimmodel_Rules();

  /**
   * Returns the meta object for class '{@link org.dsl.bimchecker.bimmodel.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see org.dsl.bimchecker.bimmodel.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the attribute '{@link org.dsl.bimchecker.bimmodel.Rule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.dsl.bimchecker.bimmodel.Rule#getName()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.dsl.bimchecker.bimmodel.Rule#getAlialist <em>Alialist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alialist</em>'.
   * @see org.dsl.bimchecker.bimmodel.Rule#getAlialist()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Alialist();

  /**
   * Returns the meta object for the containment reference '{@link org.dsl.bimchecker.bimmodel.Rule#getAnnoinfo <em>Annoinfo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annoinfo</em>'.
   * @see org.dsl.bimchecker.bimmodel.Rule#getAnnoinfo()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Annoinfo();

  /**
   * Returns the meta object for class '{@link org.dsl.bimchecker.bimmodel.Aliass <em>Aliass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aliass</em>'.
   * @see org.dsl.bimchecker.bimmodel.Aliass
   * @generated
   */
  EClass getAliass();

  /**
   * Returns the meta object for the attribute list '{@link org.dsl.bimchecker.bimmodel.Aliass#getAliass <em>Aliass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Aliass</em>'.
   * @see org.dsl.bimchecker.bimmodel.Aliass#getAliass()
   * @see #getAliass()
   * @generated
   */
  EAttribute getAliass_Aliass();

  /**
   * Returns the meta object for class '{@link org.dsl.bimchecker.bimmodel.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see org.dsl.bimchecker.bimmodel.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the attribute '{@link org.dsl.bimchecker.bimmodel.Annotation#getAnnotationName <em>Annotation Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Annotation Name</em>'.
   * @see org.dsl.bimchecker.bimmodel.Annotation#getAnnotationName()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_AnnotationName();

  /**
   * Returns the meta object for the containment reference '{@link org.dsl.bimchecker.bimmodel.Annotation#getAnnodetail <em>Annodetail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annodetail</em>'.
   * @see org.dsl.bimchecker.bimmodel.Annotation#getAnnodetail()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_Annodetail();

  /**
   * Returns the meta object for class '{@link org.dsl.bimchecker.bimmodel.AnnotationDetail <em>Annotation Detail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Detail</em>'.
   * @see org.dsl.bimchecker.bimmodel.AnnotationDetail
   * @generated
   */
  EClass getAnnotationDetail();

  /**
   * Returns the meta object for the attribute list '{@link org.dsl.bimchecker.bimmodel.AnnotationDetail#getAnnos <em>Annos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Annos</em>'.
   * @see org.dsl.bimchecker.bimmodel.AnnotationDetail#getAnnos()
   * @see #getAnnotationDetail()
   * @generated
   */
  EAttribute getAnnotationDetail_Annos();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BimmodelFactory getBimmodelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.dsl.bimchecker.bimmodel.impl.BimmodelImpl <em>Bimmodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dsl.bimchecker.bimmodel.impl.BimmodelImpl
     * @see org.dsl.bimchecker.bimmodel.impl.BimmodelPackageImpl#getBimmodel()
     * @generated
     */
    EClass BIMMODEL = eINSTANCE.getBimmodel();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIMMODEL__RULES = eINSTANCE.getBimmodel_Rules();

    /**
     * The meta object literal for the '{@link org.dsl.bimchecker.bimmodel.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dsl.bimchecker.bimmodel.impl.RuleImpl
     * @see org.dsl.bimchecker.bimmodel.impl.BimmodelPackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__NAME = eINSTANCE.getRule_Name();

    /**
     * The meta object literal for the '<em><b>Alialist</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__ALIALIST = eINSTANCE.getRule_Alialist();

    /**
     * The meta object literal for the '<em><b>Annoinfo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__ANNOINFO = eINSTANCE.getRule_Annoinfo();

    /**
     * The meta object literal for the '{@link org.dsl.bimchecker.bimmodel.impl.AliassImpl <em>Aliass</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dsl.bimchecker.bimmodel.impl.AliassImpl
     * @see org.dsl.bimchecker.bimmodel.impl.BimmodelPackageImpl#getAliass()
     * @generated
     */
    EClass ALIASS = eINSTANCE.getAliass();

    /**
     * The meta object literal for the '<em><b>Aliass</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALIASS__ALIASS = eINSTANCE.getAliass_Aliass();

    /**
     * The meta object literal for the '{@link org.dsl.bimchecker.bimmodel.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dsl.bimchecker.bimmodel.impl.AnnotationImpl
     * @see org.dsl.bimchecker.bimmodel.impl.BimmodelPackageImpl#getAnnotation()
     * @generated
     */
    EClass ANNOTATION = eINSTANCE.getAnnotation();

    /**
     * The meta object literal for the '<em><b>Annotation Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION__ANNOTATION_NAME = eINSTANCE.getAnnotation_AnnotationName();

    /**
     * The meta object literal for the '<em><b>Annodetail</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION__ANNODETAIL = eINSTANCE.getAnnotation_Annodetail();

    /**
     * The meta object literal for the '{@link org.dsl.bimchecker.bimmodel.impl.AnnotationDetailImpl <em>Annotation Detail</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dsl.bimchecker.bimmodel.impl.AnnotationDetailImpl
     * @see org.dsl.bimchecker.bimmodel.impl.BimmodelPackageImpl#getAnnotationDetail()
     * @generated
     */
    EClass ANNOTATION_DETAIL = eINSTANCE.getAnnotationDetail();

    /**
     * The meta object literal for the '<em><b>Annos</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION_DETAIL__ANNOS = eINSTANCE.getAnnotationDetail_Annos();

  }

} //BimmodelPackage
