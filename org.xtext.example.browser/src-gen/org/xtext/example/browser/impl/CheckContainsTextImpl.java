/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.browser.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.browser.BrowserPackage;
import org.xtext.example.browser.CheckContainsText;
import org.xtext.example.browser.WebDriverVarReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check Contains Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.browser.impl.CheckContainsTextImpl#getVal <em>Val</em>}</li>
 *   <li>{@link org.xtext.example.browser.impl.CheckContainsTextImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.browser.impl.CheckContainsTextImpl#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CheckContainsTextImpl extends LinesImpl implements CheckContainsText
{
  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected WebDriverVarReference val;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getParam() <em>Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
  protected static final String PARAM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParam() <em>Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
  protected String param = PARAM_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CheckContainsTextImpl()
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
    return BrowserPackage.Literals.CHECK_CONTAINS_TEXT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WebDriverVarReference getVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVal(WebDriverVarReference newVal, NotificationChain msgs)
  {
    WebDriverVarReference oldVal = val;
    val = newVal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.CHECK_CONTAINS_TEXT__VAL, oldVal, newVal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVal(WebDriverVarReference newVal)
  {
    if (newVal != val)
    {
      NotificationChain msgs = null;
      if (val != null)
        msgs = ((InternalEObject)val).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.CHECK_CONTAINS_TEXT__VAL, null, msgs);
      if (newVal != null)
        msgs = ((InternalEObject)newVal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.CHECK_CONTAINS_TEXT__VAL, null, msgs);
      msgs = basicSetVal(newVal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.CHECK_CONTAINS_TEXT__VAL, newVal, newVal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.CHECK_CONTAINS_TEXT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getParam()
  {
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setParam(String newParam)
  {
    String oldParam = param;
    param = newParam;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.CHECK_CONTAINS_TEXT__PARAM, oldParam, param));
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
      case BrowserPackage.CHECK_CONTAINS_TEXT__VAL:
        return basicSetVal(null, msgs);
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
      case BrowserPackage.CHECK_CONTAINS_TEXT__VAL:
        return getVal();
      case BrowserPackage.CHECK_CONTAINS_TEXT__NAME:
        return getName();
      case BrowserPackage.CHECK_CONTAINS_TEXT__PARAM:
        return getParam();
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
      case BrowserPackage.CHECK_CONTAINS_TEXT__VAL:
        setVal((WebDriverVarReference)newValue);
        return;
      case BrowserPackage.CHECK_CONTAINS_TEXT__NAME:
        setName((String)newValue);
        return;
      case BrowserPackage.CHECK_CONTAINS_TEXT__PARAM:
        setParam((String)newValue);
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
      case BrowserPackage.CHECK_CONTAINS_TEXT__VAL:
        setVal((WebDriverVarReference)null);
        return;
      case BrowserPackage.CHECK_CONTAINS_TEXT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BrowserPackage.CHECK_CONTAINS_TEXT__PARAM:
        setParam(PARAM_EDEFAULT);
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
      case BrowserPackage.CHECK_CONTAINS_TEXT__VAL:
        return val != null;
      case BrowserPackage.CHECK_CONTAINS_TEXT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BrowserPackage.CHECK_CONTAINS_TEXT__PARAM:
        return PARAM_EDEFAULT == null ? param != null : !PARAM_EDEFAULT.equals(param);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", param: ");
    result.append(param);
    result.append(')');
    return result.toString();
  }

} //CheckContainsTextImpl
