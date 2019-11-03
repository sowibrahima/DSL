/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.browser;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.browser.ReadElement#getRef <em>Ref</em>}</li>
 *   <li>{@link org.xtext.example.browser.ReadElement#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.browser.BrowserPackage#getReadElement()
 * @model
 * @generated
 */
public interface ReadElement extends Interractions
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference.
   * @see #setRef(VarReference)
   * @see org.xtext.example.browser.BrowserPackage#getReadElement_Ref()
   * @model containment="true"
   * @generated
   */
  VarReference getRef();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.ReadElement#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(VarReference value);

  /**
   * Returns the value of the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' containment reference.
   * @see #setVal(WebElementVarReference)
   * @see org.xtext.example.browser.BrowserPackage#getReadElement_Val()
   * @model containment="true"
   * @generated
   */
  WebElementVarReference getVal();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.ReadElement#getVal <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' containment reference.
   * @see #getVal()
   * @generated
   */
  void setVal(WebElementVarReference value);

} // ReadElement
