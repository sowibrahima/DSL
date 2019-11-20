/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.browser.Affectation
import org.xtext.example.browser.CheckContains
import org.xtext.example.browser.Click
import org.xtext.example.browser.Declaration
import org.xtext.example.browser.Get
import org.xtext.example.browser.Insert
import org.xtext.example.browser.Program
import org.xtext.example.browser.FindElements

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class BrowserGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		 
		for (program : resource.allContents.toIterable.filter(Program)) {
			fsa.generateFile(program.name + ".java", program.compile)
        }       
        
    }
    
    def dispatch label(Program p) { 
     	p.set.toFirstUpper()
   	}
    
    def compile(Program p) '''
        
        import org.openqa.selenium.By;
        import org.openqa.selenium.Keys;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.«p.set».«p.set.toFirstUpper()»Driver;
        
        public class «p.name» {
        	public static void main(String[] args){
        		WebDriver driver = new «p.set.toFirstUpper()»Driver();
        		«FOR l : p.lines»
        		«l.compileFunc»
				«ENDFOR»
        	}
        }
    	'''
    
	def dispatch compileFunc(Declaration declaration) '''
    	«declaration.type» «declaration.variable»;
    	'''
    	
	def dispatch compileFunc(Affectation affectation) '''
    	«affectation.variable» = «affectation.expr»;
    	'''
    	
    def dispatch compileFunc(Get get) '''
    	driver.get("«get.url»");
    	'''
  	
  	
  	def dispatch compileFunc(CheckContains contains) '''
    	driver.findElement(By.«contains.attribute»(«IF contains.variable !== null»«contains.variable»«ELSE»"«contains.param»"«ENDIF»));	    
    	'''
  	
  	def dispatch compileFunc(FindElements elem) '''
    	driver.findElements(By.«elem.option»(«IF elem.variable !== null»«elem.variable»«ELSE»"«elem.param»"«ENDIF»))«elem.method.compileMethod»
    	'''
    	
   	def dispatch compileMethod(Click click) '''
    	.get(«click.position»).click();
    	'''
    	
    def dispatch compileMethod(Insert insert) '''
    	.get(«insert.position»).insert(«IF insert.ref !== null»«insert.ref»«ELSE»"«insert.param»"«ENDIF»);
    	'''
    	
    
    
}
