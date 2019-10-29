/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.browser;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.browser.Insert#getVal <em>Val</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.browser.Insert#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.browser.BrowserPackage#getInsert()
 * @model
 * @generated
 */
public interface Insert extends Interractions
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' containment reference.
   * @see #setVal(WebElementVarReference)
   * @see org.xtext.example.mydsl.browser.BrowserPackage#getInsert_Val()
   * @model containment="true"
   * @generated
   */
  WebElementVarReference getVal();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.browser.Insert#getVal <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' containment reference.
   * @see #getVal()
   * @generated
   */
  void setVal(WebElementVarReference value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.browser.BrowserPackage#getInsert_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.browser.Insert#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Insert
