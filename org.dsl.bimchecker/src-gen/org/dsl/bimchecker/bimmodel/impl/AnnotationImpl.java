/**
 * generated by Xtext 2.10.0
 */
package org.dsl.bimchecker.bimmodel.impl;

import org.dsl.bimchecker.bimmodel.Annotation;
import org.dsl.bimchecker.bimmodel.AnnotationDetail;
import org.dsl.bimchecker.bimmodel.BimmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dsl.bimchecker.bimmodel.impl.AnnotationImpl#getAnnotationName <em>Annotation Name</em>}</li>
 *   <li>{@link org.dsl.bimchecker.bimmodel.impl.AnnotationImpl#getAnnodetail <em>Annodetail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationImpl extends MinimalEObjectImpl.Container implements Annotation
{
  /**
   * The default value of the '{@link #getAnnotationName() <em>Annotation Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotationName()
   * @generated
   * @ordered
   */
  protected static final String ANNOTATION_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAnnotationName() <em>Annotation Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotationName()
   * @generated
   * @ordered
   */
  protected String annotationName = ANNOTATION_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAnnodetail() <em>Annodetail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnodetail()
   * @generated
   * @ordered
   */
  protected AnnotationDetail annodetail;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnnotationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BimmodelPackage.Literals.ANNOTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAnnotationName()
  {
    return annotationName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnnotationName(String newAnnotationName)
  {
    String oldAnnotationName = annotationName;
    annotationName = newAnnotationName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BimmodelPackage.ANNOTATION__ANNOTATION_NAME, oldAnnotationName, annotationName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationDetail getAnnodetail()
  {
    return annodetail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnnodetail(AnnotationDetail newAnnodetail, NotificationChain msgs)
  {
    AnnotationDetail oldAnnodetail = annodetail;
    annodetail = newAnnodetail;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BimmodelPackage.ANNOTATION__ANNODETAIL, oldAnnodetail, newAnnodetail);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnnodetail(AnnotationDetail newAnnodetail)
  {
    if (newAnnodetail != annodetail)
    {
      NotificationChain msgs = null;
      if (annodetail != null)
        msgs = ((InternalEObject)annodetail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BimmodelPackage.ANNOTATION__ANNODETAIL, null, msgs);
      if (newAnnodetail != null)
        msgs = ((InternalEObject)newAnnodetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BimmodelPackage.ANNOTATION__ANNODETAIL, null, msgs);
      msgs = basicSetAnnodetail(newAnnodetail, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BimmodelPackage.ANNOTATION__ANNODETAIL, newAnnodetail, newAnnodetail));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BimmodelPackage.ANNOTATION__ANNODETAIL:
        return basicSetAnnodetail(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BimmodelPackage.ANNOTATION__ANNOTATION_NAME:
        return getAnnotationName();
      case BimmodelPackage.ANNOTATION__ANNODETAIL:
        return getAnnodetail();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BimmodelPackage.ANNOTATION__ANNOTATION_NAME:
        setAnnotationName((String)newValue);
        return;
      case BimmodelPackage.ANNOTATION__ANNODETAIL:
        setAnnodetail((AnnotationDetail)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BimmodelPackage.ANNOTATION__ANNOTATION_NAME:
        setAnnotationName(ANNOTATION_NAME_EDEFAULT);
        return;
      case BimmodelPackage.ANNOTATION__ANNODETAIL:
        setAnnodetail((AnnotationDetail)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BimmodelPackage.ANNOTATION__ANNOTATION_NAME:
        return ANNOTATION_NAME_EDEFAULT == null ? annotationName != null : !ANNOTATION_NAME_EDEFAULT.equals(annotationName);
      case BimmodelPackage.ANNOTATION__ANNODETAIL:
        return annodetail != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (annotationName: ");
    result.append(annotationName);
    result.append(')');
    return result.toString();
  }

} //AnnotationImpl
