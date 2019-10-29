/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.browser.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.browser.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.browser.BrowserPackage
 * @generated
 */
public class BrowserSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BrowserPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BrowserSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = BrowserPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case BrowserPackage.PROGRAM:
      {
        Program program = (Program)theEObject;
        T result = caseProgram(program);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserPackage.LINES:
      {
        Lines lines = (Lines)theEObject;
        T result = caseLines(lines);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserPackage.FUNCTION_CALL:
      {
        FunctionCall functionCall = (FunctionCall)theEObject;
        T result = caseFunctionCall(functionCall);
        if (result == null) result = caseLines(functionCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserPackage.DECLARATION:
      {
        Declaration declaration = (Declaration)theEObject;
        T result = caseDeclaration(declaration);
        if (result == null) result = caseLines(declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserPackage.AFFECTATION:
      {
        Affectation affectation = (Affectation)theEObject;
        T result = caseAffectation(affectation);
        if (result == null) result = caseLines(affectation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserPackage.VAR_REFERENCE:
      {
        VarReference varReference = (VarReference)theEObject;
        T result = caseVarReference(varReference);
        if (result == null) result = caseWebElementVarReference(varReference);
        if (result == null) result = caseWebDriverVarReference(varReference);
        if (result == null) result = caseLines(varReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserPackage.WEB_ELEMENT_VAR_REFERENCE:
      {
        WebElementVarReference webElementVarReference = (WebElementVarReference)theEObject;
        T result = caseWebElementVarReference(webElementVarReference);
        if (result == null) result = caseLines(webElementVarReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserPackage.WEB_DRIVER_VAR_REFERENCE:
      {
        WebDriverVarReference webDriverVarReference = (WebDriverVarReference)theEObject;
        T result = caseWebDriverVarReference(webDriverVarReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserPackage.WEB_ELEMENT_TYPE:
      {
        WebElementType webElementType = (WebElementType)theEObject;
        T result = caseWebElementType(webElementType);
        if (result == null) result = caseExpression(webElementType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserPackage.LINK:
      {
        Link link = (Link)theEObject;
        T result = caseLink(link);
        if (result == null) result = caseWebElementType(link);
        if (result == null) result = caseExpression(link);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserPackage.INPUT:
      {
        Input input = (Input)theEObject;
        T result = caseInput(input);
        if (result == null) result = caseWebElementType(input);
        if (result == null) result = caseExpression(input);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserPackage.BUTTON:
      {
        Button button = (Button)theEObject;
        T result = caseButton(button);
        if (result == null) result = caseWebElementType(button);
        if (result == null) result = caseExpression(button);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserPackage.TEXT:
      {
        Text text = (Text)theEObject;
        T result = caseText(text);
        if (result == null) result = caseWebElementType(text);
        if (result == null) result = caseExpression(text);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserPackage.CHECKBOX:
      {
        Checkbox checkbox = (Checkbox)theEObject;
        T result = caseCheckbox(checkbox);
        if (result == null) result = caseWebElementType(checkbox);
        if (result == null) result = caseExpression(checkbox);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserPackage.COMBOBOX:
      {
        Combobox combobox = (Combobox)theEObject;
        T result = caseCombobox(combobox);
        if (result == null) result = caseWebElementType(combobox);
        if (result == null) result = caseExpression(combobox);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserPackage.IMAGE:
      {
        Image image = (Image)theEObject;
        T result = caseImage(image);
        if (result == null) result = caseWebElementType(image);
        if (result == null) result = caseExpression(image);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserPackage.GO:
      {
        Go go = (Go)theEObject;
        T result = caseGo(go);
        if (result == null) result = caseFunctionCall(go);
        if (result == null) result = caseLines(go);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserPackage.CONTAINS:
      {
        Contains contains = (Contains)theEObject;
        T result = caseContains(contains);
        if (result == null) result = caseFunctionCall(contains);
        if (result == null) result = caseLines(contains);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserPackage.INTERRACTIONS:
      {
        Interractions interractions = (Interractions)theEObject;
        T result = caseInterractions(interractions);
        if (result == null) result = caseFunctionCall(interractions);
        if (result == null) result = caseLines(interractions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserPackage.CLICK:
      {
        Click click = (Click)theEObject;
        T result = caseClick(click);
        if (result == null) result = caseInterractions(click);
        if (result == null) result = caseFunctionCall(click);
        if (result == null) result = caseLines(click);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserPackage.FIND_PROPERTY:
      {
        FindProperty findProperty = (FindProperty)theEObject;
        T result = caseFindProperty(findProperty);
        if (result == null) result = caseLines(findProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserPackage.STRING:
      {
        STRING string = (STRING)theEObject;
        T result = caseSTRING(string);
        if (result == null) result = caseLines(string);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserPackage.INSERT:
      {
        Insert insert = (Insert)theEObject;
        T result = caseInsert(insert);
        if (result == null) result = caseInterractions(insert);
        if (result == null) result = caseFunctionCall(insert);
        if (result == null) result = caseLines(insert);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserPackage.CHECK_CHECKBOX:
      {
        CheckCheckbox checkCheckbox = (CheckCheckbox)theEObject;
        T result = caseCheckCheckbox(checkCheckbox);
        if (result == null) result = caseInterractions(checkCheckbox);
        if (result == null) result = caseFunctionCall(checkCheckbox);
        if (result == null) result = caseLines(checkCheckbox);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserPackage.CLEAR_CHECKBOX:
      {
        ClearCheckbox clearCheckbox = (ClearCheckbox)theEObject;
        T result = caseClearCheckbox(clearCheckbox);
        if (result == null) result = caseInterractions(clearCheckbox);
        if (result == null) result = caseFunctionCall(clearCheckbox);
        if (result == null) result = caseLines(clearCheckbox);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BrowserPackage.SELECT_COMBOBOX:
      {
        SelectCombobox selectCombobox = (SelectCombobox)theEObject;
        T result = caseSelectCombobox(selectCombobox);
        if (result == null) result = caseInterractions(selectCombobox);
        if (result == null) result = caseFunctionCall(selectCombobox);
        if (result == null) result = caseLines(selectCombobox);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProgram(Program object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lines</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lines</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLines(Lines object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionCall(FunctionCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclaration(Declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Affectation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Affectation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAffectation(Affectation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVarReference(VarReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Web Element Var Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Web Element Var Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWebElementVarReference(WebElementVarReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Web Driver Var Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Web Driver Var Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWebDriverVarReference(WebDriverVarReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Web Element Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Web Element Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWebElementType(WebElementType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLink(Link object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInput(Input object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseButton(Button object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseText(Text object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Checkbox</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Checkbox</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckbox(Checkbox object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Combobox</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Combobox</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCombobox(Combobox object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Image</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImage(Image object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Go</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Go</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGo(Go object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contains</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contains</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContains(Contains object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interractions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interractions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterractions(Interractions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Click</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Click</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClick(Click object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Find Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Find Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFindProperty(FindProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>STRING</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>STRING</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSTRING(STRING object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Insert</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Insert</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInsert(Insert object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Check Checkbox</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Check Checkbox</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckCheckbox(CheckCheckbox object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Clear Checkbox</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clear Checkbox</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClearCheckbox(ClearCheckbox object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Combobox</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Combobox</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectCombobox(SelectCombobox object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //BrowserSwitch
