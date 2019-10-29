/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.browser;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Go</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.browser.Go#getVal <em>Val</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.browser.Go#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.browser.BrowserPackage#getGo()
 * @model
 * @generated
 */
public interface Go extends FunctionCall
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' containment reference.
   * @see #setVal(WebDriverVarReference)
   * @see org.xtext.example.mydsl.browser.BrowserPackage#getGo_Val()
   * @model containment="true"
   * @generated
   */
  WebDriverVarReference getVal();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.browser.Go#getVal <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' containment reference.
   * @see #getVal()
   * @generated
   */
  void setVal(WebDriverVarReference value);

  /**
   * Returns the value of the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' attribute.
   * @see #setUrl(String)
   * @see org.xtext.example.mydsl.browser.BrowserPackage#getGo_Url()
   * @model
   * @generated
   */
  String getUrl();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.browser.Go#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(String value);

} // Go
