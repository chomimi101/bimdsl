/**
 * generated by Xtext 2.10.0
 */
package org.dsl.bimchecker.bimmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.dsl.bimchecker.bimmodel.AnnotationDetail#getAnnos <em>Annos</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.dsl.bimchecker.bimmodel.BimmodelPackage#getAnnotationDetail()
 * @model
 * @generated
 */
public interface AnnotationDetail extends EObject
{
  /**
   * Returns the value of the '<em><b>Annos</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annos</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annos</em>' attribute list.
   * @see org.dsl.bimchecker.bimmodel.BimmodelPackage#getAnnotationDetail_Annos()
   * @model unique="false"
   * @generated
   */
  EList<String> getAnnos();

} // AnnotationDetail
