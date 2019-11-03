package org.xtext.example.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.services.BrowserGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBrowserParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_URL", "RULE_STRING", "RULE_PROTOCOL", "RULE_EXTENTION", "RULE_DOMAIN", "RULE_PATH", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'WebDriver'", "'WebElement'", "'String'", "'='", "'FirefoxDriver'", "'ChromeDriver'", "'InternetExplorerDriver'", "'link'", "'input'", "'button'", "'text'", "'checkbox'", "'combobox'", "'image'", "'.get('", "');'", "'.contains('", "'.click();'", "'.readElement();'", "'.checkContainsLink(By.'", "'('", "')'", "'.checkContainsText(By.'", "'.findElement(By.'", "'.findFirstElement(By.'", "'.findSecondElement(By.'", "'.getTitle()'", "'.insert('", "'.check();'", "'.clearCheckBox();'", "'.select('"
    };
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ID=4;
    public static final int RULE_PATH=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int RULE_URL=5;
    public static final int T__22=22;
    public static final int RULE_EXTENTION=8;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_PROTOCOL=7;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_DOMAIN=9;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalBrowserParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBrowserParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBrowserParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBrowser.g"; }



     	private BrowserGrammarAccess grammarAccess;

        public InternalBrowserParser(TokenStream input, BrowserGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected BrowserGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalBrowser.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalBrowser.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalBrowser.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalBrowser.g:71:1: ruleProgram returns [EObject current=null] : ( (lv_lines_0_0= ruleLines ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_lines_0_0 = null;



        	enterRule();

        try {
            // InternalBrowser.g:77:2: ( ( (lv_lines_0_0= ruleLines ) )* )
            // InternalBrowser.g:78:2: ( (lv_lines_0_0= ruleLines ) )*
            {
            // InternalBrowser.g:78:2: ( (lv_lines_0_0= ruleLines ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=17 && LA1_0<=19)||LA1_0==32) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBrowser.g:79:3: (lv_lines_0_0= ruleLines )
            	    {
            	    // InternalBrowser.g:79:3: (lv_lines_0_0= ruleLines )
            	    // InternalBrowser.g:80:4: lv_lines_0_0= ruleLines
            	    {

            	    				newCompositeNode(grammarAccess.getProgramAccess().getLinesLinesParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_lines_0_0=ruleLines();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"lines",
            	    					lv_lines_0_0,
            	    					"org.xtext.example.Browser.Lines");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleLines"
    // InternalBrowser.g:100:1: entryRuleLines returns [EObject current=null] : iv_ruleLines= ruleLines EOF ;
    public final EObject entryRuleLines() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLines = null;


        try {
            // InternalBrowser.g:100:46: (iv_ruleLines= ruleLines EOF )
            // InternalBrowser.g:101:2: iv_ruleLines= ruleLines EOF
            {
             newCompositeNode(grammarAccess.getLinesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLines=ruleLines();

            state._fsp--;

             current =iv_ruleLines; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLines"


    // $ANTLR start "ruleLines"
    // InternalBrowser.g:107:1: ruleLines returns [EObject current=null] : (this_Declaration_0= ruleDeclaration | this_Affectation_1= ruleAffectation | this_FunctionCall_2= ruleFunctionCall | this_CheckContainsLink_3= ruleCheckContainsLink | this_CheckContainsText_4= ruleCheckContainsText | this_FindProperty_5= ruleFindProperty | this_FindFirstProperty_6= ruleFindFirstProperty | this_FindSecondProperty_7= ruleFindSecondProperty | this_GetTitle_8= ruleGetTitle ) ;
    public final EObject ruleLines() throws RecognitionException {
        EObject current = null;

        EObject this_Declaration_0 = null;

        EObject this_Affectation_1 = null;

        EObject this_FunctionCall_2 = null;

        EObject this_CheckContainsLink_3 = null;

        EObject this_CheckContainsText_4 = null;

        EObject this_FindProperty_5 = null;

        EObject this_FindFirstProperty_6 = null;

        EObject this_FindSecondProperty_7 = null;

        EObject this_GetTitle_8 = null;



        	enterRule();

        try {
            // InternalBrowser.g:113:2: ( (this_Declaration_0= ruleDeclaration | this_Affectation_1= ruleAffectation | this_FunctionCall_2= ruleFunctionCall | this_CheckContainsLink_3= ruleCheckContainsLink | this_CheckContainsText_4= ruleCheckContainsText | this_FindProperty_5= ruleFindProperty | this_FindFirstProperty_6= ruleFindFirstProperty | this_FindSecondProperty_7= ruleFindSecondProperty | this_GetTitle_8= ruleGetTitle ) )
            // InternalBrowser.g:114:2: (this_Declaration_0= ruleDeclaration | this_Affectation_1= ruleAffectation | this_FunctionCall_2= ruleFunctionCall | this_CheckContainsLink_3= ruleCheckContainsLink | this_CheckContainsText_4= ruleCheckContainsText | this_FindProperty_5= ruleFindProperty | this_FindFirstProperty_6= ruleFindFirstProperty | this_FindSecondProperty_7= ruleFindSecondProperty | this_GetTitle_8= ruleGetTitle )
            {
            // InternalBrowser.g:114:2: (this_Declaration_0= ruleDeclaration | this_Affectation_1= ruleAffectation | this_FunctionCall_2= ruleFunctionCall | this_CheckContainsLink_3= ruleCheckContainsLink | this_CheckContainsText_4= ruleCheckContainsText | this_FindProperty_5= ruleFindProperty | this_FindFirstProperty_6= ruleFindFirstProperty | this_FindSecondProperty_7= ruleFindSecondProperty | this_GetTitle_8= ruleGetTitle )
            int alt2=9;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalBrowser.g:115:3: this_Declaration_0= ruleDeclaration
                    {

                    			newCompositeNode(grammarAccess.getLinesAccess().getDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Declaration_0=ruleDeclaration();

                    state._fsp--;


                    			current = this_Declaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowser.g:124:3: this_Affectation_1= ruleAffectation
                    {

                    			newCompositeNode(grammarAccess.getLinesAccess().getAffectationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Affectation_1=ruleAffectation();

                    state._fsp--;


                    			current = this_Affectation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowser.g:133:3: this_FunctionCall_2= ruleFunctionCall
                    {

                    			newCompositeNode(grammarAccess.getLinesAccess().getFunctionCallParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_2=ruleFunctionCall();

                    state._fsp--;


                    			current = this_FunctionCall_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBrowser.g:142:3: this_CheckContainsLink_3= ruleCheckContainsLink
                    {

                    			newCompositeNode(grammarAccess.getLinesAccess().getCheckContainsLinkParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CheckContainsLink_3=ruleCheckContainsLink();

                    state._fsp--;


                    			current = this_CheckContainsLink_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBrowser.g:151:3: this_CheckContainsText_4= ruleCheckContainsText
                    {

                    			newCompositeNode(grammarAccess.getLinesAccess().getCheckContainsTextParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_CheckContainsText_4=ruleCheckContainsText();

                    state._fsp--;


                    			current = this_CheckContainsText_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalBrowser.g:160:3: this_FindProperty_5= ruleFindProperty
                    {

                    			newCompositeNode(grammarAccess.getLinesAccess().getFindPropertyParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_FindProperty_5=ruleFindProperty();

                    state._fsp--;


                    			current = this_FindProperty_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalBrowser.g:169:3: this_FindFirstProperty_6= ruleFindFirstProperty
                    {

                    			newCompositeNode(grammarAccess.getLinesAccess().getFindFirstPropertyParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_FindFirstProperty_6=ruleFindFirstProperty();

                    state._fsp--;


                    			current = this_FindFirstProperty_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalBrowser.g:178:3: this_FindSecondProperty_7= ruleFindSecondProperty
                    {

                    			newCompositeNode(grammarAccess.getLinesAccess().getFindSecondPropertyParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_FindSecondProperty_7=ruleFindSecondProperty();

                    state._fsp--;


                    			current = this_FindSecondProperty_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalBrowser.g:187:3: this_GetTitle_8= ruleGetTitle
                    {

                    			newCompositeNode(grammarAccess.getLinesAccess().getGetTitleParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_GetTitle_8=ruleGetTitle();

                    state._fsp--;


                    			current = this_GetTitle_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLines"


    // $ANTLR start "entryRuleDeclaration"
    // InternalBrowser.g:199:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalBrowser.g:199:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalBrowser.g:200:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalBrowser.g:206:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_var_1_0= ruleVariable ) ) otherlv_2= ';' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_type_0_0 = null;

        EObject lv_var_1_0 = null;



        	enterRule();

        try {
            // InternalBrowser.g:212:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_var_1_0= ruleVariable ) ) otherlv_2= ';' ) )
            // InternalBrowser.g:213:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_var_1_0= ruleVariable ) ) otherlv_2= ';' )
            {
            // InternalBrowser.g:213:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_var_1_0= ruleVariable ) ) otherlv_2= ';' )
            // InternalBrowser.g:214:3: ( (lv_type_0_0= ruleType ) ) ( (lv_var_1_0= ruleVariable ) ) otherlv_2= ';'
            {
            // InternalBrowser.g:214:3: ( (lv_type_0_0= ruleType ) )
            // InternalBrowser.g:215:4: (lv_type_0_0= ruleType )
            {
            // InternalBrowser.g:215:4: (lv_type_0_0= ruleType )
            // InternalBrowser.g:216:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getDeclarationAccess().getTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.example.Browser.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBrowser.g:233:3: ( (lv_var_1_0= ruleVariable ) )
            // InternalBrowser.g:234:4: (lv_var_1_0= ruleVariable )
            {
            // InternalBrowser.g:234:4: (lv_var_1_0= ruleVariable )
            // InternalBrowser.g:235:5: lv_var_1_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getDeclarationAccess().getVarVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_var_1_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarationRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_1_0,
            						"org.xtext.example.Browser.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleType"
    // InternalBrowser.g:260:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalBrowser.g:260:45: (iv_ruleType= ruleType EOF )
            // InternalBrowser.g:261:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalBrowser.g:267:1: ruleType returns [EObject current=null] : ( ( (lv_type_0_1= 'WebDriver' | lv_type_0_2= 'WebElement' | lv_type_0_3= 'String' ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;


        	enterRule();

        try {
            // InternalBrowser.g:273:2: ( ( ( (lv_type_0_1= 'WebDriver' | lv_type_0_2= 'WebElement' | lv_type_0_3= 'String' ) ) ) )
            // InternalBrowser.g:274:2: ( ( (lv_type_0_1= 'WebDriver' | lv_type_0_2= 'WebElement' | lv_type_0_3= 'String' ) ) )
            {
            // InternalBrowser.g:274:2: ( ( (lv_type_0_1= 'WebDriver' | lv_type_0_2= 'WebElement' | lv_type_0_3= 'String' ) ) )
            // InternalBrowser.g:275:3: ( (lv_type_0_1= 'WebDriver' | lv_type_0_2= 'WebElement' | lv_type_0_3= 'String' ) )
            {
            // InternalBrowser.g:275:3: ( (lv_type_0_1= 'WebDriver' | lv_type_0_2= 'WebElement' | lv_type_0_3= 'String' ) )
            // InternalBrowser.g:276:4: (lv_type_0_1= 'WebDriver' | lv_type_0_2= 'WebElement' | lv_type_0_3= 'String' )
            {
            // InternalBrowser.g:276:4: (lv_type_0_1= 'WebDriver' | lv_type_0_2= 'WebElement' | lv_type_0_3= 'String' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalBrowser.g:277:5: lv_type_0_1= 'WebDriver'
                    {
                    lv_type_0_1=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_type_0_1, grammarAccess.getTypeAccess().getTypeWebDriverKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalBrowser.g:288:5: lv_type_0_2= 'WebElement'
                    {
                    lv_type_0_2=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_type_0_2, grammarAccess.getTypeAccess().getTypeWebElementKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalBrowser.g:299:5: lv_type_0_3= 'String'
                    {
                    lv_type_0_3=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_type_0_3, grammarAccess.getTypeAccess().getTypeStringKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_3, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleVariable"
    // InternalBrowser.g:315:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalBrowser.g:315:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalBrowser.g:316:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalBrowser.g:322:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | this_URL_1= RULE_URL ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_URL_1=null;


        	enterRule();

        try {
            // InternalBrowser.g:328:2: ( ( ( (lv_name_0_0= RULE_ID ) ) | this_URL_1= RULE_URL ) )
            // InternalBrowser.g:329:2: ( ( (lv_name_0_0= RULE_ID ) ) | this_URL_1= RULE_URL )
            {
            // InternalBrowser.g:329:2: ( ( (lv_name_0_0= RULE_ID ) ) | this_URL_1= RULE_URL )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_URL) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBrowser.g:330:3: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // InternalBrowser.g:330:3: ( (lv_name_0_0= RULE_ID ) )
                    // InternalBrowser.g:331:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalBrowser.g:331:4: (lv_name_0_0= RULE_ID )
                    // InternalBrowser.g:332:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVariableRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBrowser.g:349:3: this_URL_1= RULE_URL
                    {
                    this_URL_1=(Token)match(input,RULE_URL,FOLLOW_2); 

                    			newLeafNode(this_URL_1, grammarAccess.getVariableAccess().getURLTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleAffectation"
    // InternalBrowser.g:357:1: entryRuleAffectation returns [EObject current=null] : iv_ruleAffectation= ruleAffectation EOF ;
    public final EObject entryRuleAffectation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectation = null;


        try {
            // InternalBrowser.g:357:52: (iv_ruleAffectation= ruleAffectation EOF )
            // InternalBrowser.g:358:2: iv_ruleAffectation= ruleAffectation EOF
            {
             newCompositeNode(grammarAccess.getAffectationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAffectation=ruleAffectation();

            state._fsp--;

             current =iv_ruleAffectation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAffectation"


    // $ANTLR start "ruleAffectation"
    // InternalBrowser.g:364:1: ruleAffectation returns [EObject current=null] : ( ( (lv_ref_0_0= ruleVarReference ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleAffectation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ref_0_0 = null;

        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalBrowser.g:370:2: ( ( ( (lv_ref_0_0= ruleVarReference ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // InternalBrowser.g:371:2: ( ( (lv_ref_0_0= ruleVarReference ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // InternalBrowser.g:371:2: ( ( (lv_ref_0_0= ruleVarReference ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ';' )
            // InternalBrowser.g:372:3: ( (lv_ref_0_0= ruleVarReference ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            // InternalBrowser.g:372:3: ( (lv_ref_0_0= ruleVarReference ) )
            // InternalBrowser.g:373:4: (lv_ref_0_0= ruleVarReference )
            {
            // InternalBrowser.g:373:4: (lv_ref_0_0= ruleVarReference )
            // InternalBrowser.g:374:5: lv_ref_0_0= ruleVarReference
            {

            					newCompositeNode(grammarAccess.getAffectationAccess().getRefVarReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_ref_0_0=ruleVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAffectationRule());
            					}
            					set(
            						current,
            						"ref",
            						lv_ref_0_0,
            						"org.xtext.example.Browser.VarReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getAffectationAccess().getEqualsSignKeyword_1());
            		
            // InternalBrowser.g:395:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalBrowser.g:396:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalBrowser.g:396:4: (lv_expr_2_0= ruleExpression )
            // InternalBrowser.g:397:5: lv_expr_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAffectationAccess().getExprExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_expr_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAffectationRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"org.xtext.example.Browser.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAffectationAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAffectation"


    // $ANTLR start "entryRuleVarReference"
    // InternalBrowser.g:422:1: entryRuleVarReference returns [EObject current=null] : iv_ruleVarReference= ruleVarReference EOF ;
    public final EObject entryRuleVarReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarReference = null;


        try {
            // InternalBrowser.g:422:53: (iv_ruleVarReference= ruleVarReference EOF )
            // InternalBrowser.g:423:2: iv_ruleVarReference= ruleVarReference EOF
            {
             newCompositeNode(grammarAccess.getVarReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarReference=ruleVarReference();

            state._fsp--;

             current =iv_ruleVarReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarReference"


    // $ANTLR start "ruleVarReference"
    // InternalBrowser.g:429:1: ruleVarReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVarReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalBrowser.g:435:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalBrowser.g:436:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalBrowser.g:436:2: ( (otherlv_0= RULE_ID ) )
            // InternalBrowser.g:437:3: (otherlv_0= RULE_ID )
            {
            // InternalBrowser.g:437:3: (otherlv_0= RULE_ID )
            // InternalBrowser.g:438:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVarReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getVarReferenceAccess().getValVariableCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarReference"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalBrowser.g:452:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalBrowser.g:452:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalBrowser.g:453:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalBrowser.g:459:1: ruleFunctionCall returns [EObject current=null] : (this_Go_0= ruleGo | this_Contains_1= ruleContains | this_Interractions_2= ruleInterractions ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject this_Go_0 = null;

        EObject this_Contains_1 = null;

        EObject this_Interractions_2 = null;



        	enterRule();

        try {
            // InternalBrowser.g:465:2: ( (this_Go_0= ruleGo | this_Contains_1= ruleContains | this_Interractions_2= ruleInterractions ) )
            // InternalBrowser.g:466:2: (this_Go_0= ruleGo | this_Contains_1= ruleContains | this_Interractions_2= ruleInterractions )
            {
            // InternalBrowser.g:466:2: (this_Go_0= ruleGo | this_Contains_1= ruleContains | this_Interractions_2= ruleInterractions )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 20:
                case 32:
                case 34:
                case 44:
                case 45:
                case 46:
                case 47:
                    {
                    alt5=3;
                    }
                    break;
                case 33:
                    {
                    alt5=2;
                    }
                    break;
                case 31:
                    {
                    alt5=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA5_0==32) ) {
                alt5=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBrowser.g:467:3: this_Go_0= ruleGo
                    {

                    			newCompositeNode(grammarAccess.getFunctionCallAccess().getGoParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Go_0=ruleGo();

                    state._fsp--;


                    			current = this_Go_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowser.g:476:3: this_Contains_1= ruleContains
                    {

                    			newCompositeNode(grammarAccess.getFunctionCallAccess().getContainsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Contains_1=ruleContains();

                    state._fsp--;


                    			current = this_Contains_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowser.g:485:3: this_Interractions_2= ruleInterractions
                    {

                    			newCompositeNode(grammarAccess.getFunctionCallAccess().getInterractionsParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interractions_2=ruleInterractions();

                    state._fsp--;


                    			current = this_Interractions_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleExpression"
    // InternalBrowser.g:497:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalBrowser.g:497:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalBrowser.g:498:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalBrowser.g:504:1: ruleExpression returns [EObject current=null] : ( ruleWebDriverType | this_WebElementType_1= ruleWebElementType | this_STRING_2= RULE_STRING | this_URL_3= RULE_URL ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token this_STRING_2=null;
        Token this_URL_3=null;
        EObject this_WebElementType_1 = null;



        	enterRule();

        try {
            // InternalBrowser.g:510:2: ( ( ruleWebDriverType | this_WebElementType_1= ruleWebElementType | this_STRING_2= RULE_STRING | this_URL_3= RULE_URL ) )
            // InternalBrowser.g:511:2: ( ruleWebDriverType | this_WebElementType_1= ruleWebElementType | this_STRING_2= RULE_STRING | this_URL_3= RULE_URL )
            {
            // InternalBrowser.g:511:2: ( ruleWebDriverType | this_WebElementType_1= ruleWebElementType | this_STRING_2= RULE_STRING | this_URL_3= RULE_URL )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 21:
            case 22:
            case 23:
                {
                alt6=1;
                }
                break;
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                {
                alt6=2;
                }
                break;
            case RULE_STRING:
                {
                alt6=3;
                }
                break;
            case RULE_URL:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalBrowser.g:512:3: ruleWebDriverType
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getWebDriverTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    ruleWebDriverType();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowser.g:520:3: this_WebElementType_1= ruleWebElementType
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getWebElementTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WebElementType_1=ruleWebElementType();

                    state._fsp--;


                    			current = this_WebElementType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowser.g:529:3: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(this_STRING_2, grammarAccess.getExpressionAccess().getSTRINGTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBrowser.g:534:3: this_URL_3= RULE_URL
                    {
                    this_URL_3=(Token)match(input,RULE_URL,FOLLOW_2); 

                    			newLeafNode(this_URL_3, grammarAccess.getExpressionAccess().getURLTerminalRuleCall_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleWebDriverType"
    // InternalBrowser.g:542:1: entryRuleWebDriverType returns [String current=null] : iv_ruleWebDriverType= ruleWebDriverType EOF ;
    public final String entryRuleWebDriverType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWebDriverType = null;


        try {
            // InternalBrowser.g:542:53: (iv_ruleWebDriverType= ruleWebDriverType EOF )
            // InternalBrowser.g:543:2: iv_ruleWebDriverType= ruleWebDriverType EOF
            {
             newCompositeNode(grammarAccess.getWebDriverTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWebDriverType=ruleWebDriverType();

            state._fsp--;

             current =iv_ruleWebDriverType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWebDriverType"


    // $ANTLR start "ruleWebDriverType"
    // InternalBrowser.g:549:1: ruleWebDriverType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'FirefoxDriver' | kw= 'ChromeDriver' | kw= 'InternetExplorerDriver' ) ;
    public final AntlrDatatypeRuleToken ruleWebDriverType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBrowser.g:555:2: ( (kw= 'FirefoxDriver' | kw= 'ChromeDriver' | kw= 'InternetExplorerDriver' ) )
            // InternalBrowser.g:556:2: (kw= 'FirefoxDriver' | kw= 'ChromeDriver' | kw= 'InternetExplorerDriver' )
            {
            // InternalBrowser.g:556:2: (kw= 'FirefoxDriver' | kw= 'ChromeDriver' | kw= 'InternetExplorerDriver' )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt7=1;
                }
                break;
            case 22:
                {
                alt7=2;
                }
                break;
            case 23:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBrowser.g:557:3: kw= 'FirefoxDriver'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getWebDriverTypeAccess().getFirefoxDriverKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowser.g:563:3: kw= 'ChromeDriver'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getWebDriverTypeAccess().getChromeDriverKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowser.g:569:3: kw= 'InternetExplorerDriver'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getWebDriverTypeAccess().getInternetExplorerDriverKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWebDriverType"


    // $ANTLR start "entryRuleWebElementType"
    // InternalBrowser.g:578:1: entryRuleWebElementType returns [EObject current=null] : iv_ruleWebElementType= ruleWebElementType EOF ;
    public final EObject entryRuleWebElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebElementType = null;


        try {
            // InternalBrowser.g:578:55: (iv_ruleWebElementType= ruleWebElementType EOF )
            // InternalBrowser.g:579:2: iv_ruleWebElementType= ruleWebElementType EOF
            {
             newCompositeNode(grammarAccess.getWebElementTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWebElementType=ruleWebElementType();

            state._fsp--;

             current =iv_ruleWebElementType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWebElementType"


    // $ANTLR start "ruleWebElementType"
    // InternalBrowser.g:585:1: ruleWebElementType returns [EObject current=null] : (this_Link_0= ruleLink | this_Input_1= ruleInput | this_Button_2= ruleButton | this_Text_3= ruleText | this_Checkbox_4= ruleCheckbox | this_Combobox_5= ruleCombobox | this_Image_6= ruleImage ) ;
    public final EObject ruleWebElementType() throws RecognitionException {
        EObject current = null;

        EObject this_Link_0 = null;

        EObject this_Input_1 = null;

        EObject this_Button_2 = null;

        EObject this_Text_3 = null;

        EObject this_Checkbox_4 = null;

        EObject this_Combobox_5 = null;

        EObject this_Image_6 = null;



        	enterRule();

        try {
            // InternalBrowser.g:591:2: ( (this_Link_0= ruleLink | this_Input_1= ruleInput | this_Button_2= ruleButton | this_Text_3= ruleText | this_Checkbox_4= ruleCheckbox | this_Combobox_5= ruleCombobox | this_Image_6= ruleImage ) )
            // InternalBrowser.g:592:2: (this_Link_0= ruleLink | this_Input_1= ruleInput | this_Button_2= ruleButton | this_Text_3= ruleText | this_Checkbox_4= ruleCheckbox | this_Combobox_5= ruleCombobox | this_Image_6= ruleImage )
            {
            // InternalBrowser.g:592:2: (this_Link_0= ruleLink | this_Input_1= ruleInput | this_Button_2= ruleButton | this_Text_3= ruleText | this_Checkbox_4= ruleCheckbox | this_Combobox_5= ruleCombobox | this_Image_6= ruleImage )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt8=1;
                }
                break;
            case 25:
                {
                alt8=2;
                }
                break;
            case 26:
                {
                alt8=3;
                }
                break;
            case 27:
                {
                alt8=4;
                }
                break;
            case 28:
                {
                alt8=5;
                }
                break;
            case 29:
                {
                alt8=6;
                }
                break;
            case 30:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalBrowser.g:593:3: this_Link_0= ruleLink
                    {

                    			newCompositeNode(grammarAccess.getWebElementTypeAccess().getLinkParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Link_0=ruleLink();

                    state._fsp--;


                    			current = this_Link_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowser.g:602:3: this_Input_1= ruleInput
                    {

                    			newCompositeNode(grammarAccess.getWebElementTypeAccess().getInputParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Input_1=ruleInput();

                    state._fsp--;


                    			current = this_Input_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowser.g:611:3: this_Button_2= ruleButton
                    {

                    			newCompositeNode(grammarAccess.getWebElementTypeAccess().getButtonParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Button_2=ruleButton();

                    state._fsp--;


                    			current = this_Button_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBrowser.g:620:3: this_Text_3= ruleText
                    {

                    			newCompositeNode(grammarAccess.getWebElementTypeAccess().getTextParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Text_3=ruleText();

                    state._fsp--;


                    			current = this_Text_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBrowser.g:629:3: this_Checkbox_4= ruleCheckbox
                    {

                    			newCompositeNode(grammarAccess.getWebElementTypeAccess().getCheckboxParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Checkbox_4=ruleCheckbox();

                    state._fsp--;


                    			current = this_Checkbox_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalBrowser.g:638:3: this_Combobox_5= ruleCombobox
                    {

                    			newCompositeNode(grammarAccess.getWebElementTypeAccess().getComboboxParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Combobox_5=ruleCombobox();

                    state._fsp--;


                    			current = this_Combobox_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalBrowser.g:647:3: this_Image_6= ruleImage
                    {

                    			newCompositeNode(grammarAccess.getWebElementTypeAccess().getImageParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Image_6=ruleImage();

                    state._fsp--;


                    			current = this_Image_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWebElementType"


    // $ANTLR start "entryRuleWebElementVarReference"
    // InternalBrowser.g:659:1: entryRuleWebElementVarReference returns [EObject current=null] : iv_ruleWebElementVarReference= ruleWebElementVarReference EOF ;
    public final EObject entryRuleWebElementVarReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebElementVarReference = null;


        try {
            // InternalBrowser.g:659:63: (iv_ruleWebElementVarReference= ruleWebElementVarReference EOF )
            // InternalBrowser.g:660:2: iv_ruleWebElementVarReference= ruleWebElementVarReference EOF
            {
             newCompositeNode(grammarAccess.getWebElementVarReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWebElementVarReference=ruleWebElementVarReference();

            state._fsp--;

             current =iv_ruleWebElementVarReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWebElementVarReference"


    // $ANTLR start "ruleWebElementVarReference"
    // InternalBrowser.g:666:1: ruleWebElementVarReference returns [EObject current=null] : this_VarReference_0= ruleVarReference ;
    public final EObject ruleWebElementVarReference() throws RecognitionException {
        EObject current = null;

        EObject this_VarReference_0 = null;



        	enterRule();

        try {
            // InternalBrowser.g:672:2: (this_VarReference_0= ruleVarReference )
            // InternalBrowser.g:673:2: this_VarReference_0= ruleVarReference
            {

            		newCompositeNode(grammarAccess.getWebElementVarReferenceAccess().getVarReferenceParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_VarReference_0=ruleVarReference();

            state._fsp--;


            		current = this_VarReference_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWebElementVarReference"


    // $ANTLR start "entryRuleWebDriverVarReference"
    // InternalBrowser.g:684:1: entryRuleWebDriverVarReference returns [EObject current=null] : iv_ruleWebDriverVarReference= ruleWebDriverVarReference EOF ;
    public final EObject entryRuleWebDriverVarReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebDriverVarReference = null;


        try {
            // InternalBrowser.g:684:62: (iv_ruleWebDriverVarReference= ruleWebDriverVarReference EOF )
            // InternalBrowser.g:685:2: iv_ruleWebDriverVarReference= ruleWebDriverVarReference EOF
            {
             newCompositeNode(grammarAccess.getWebDriverVarReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWebDriverVarReference=ruleWebDriverVarReference();

            state._fsp--;

             current =iv_ruleWebDriverVarReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWebDriverVarReference"


    // $ANTLR start "ruleWebDriverVarReference"
    // InternalBrowser.g:691:1: ruleWebDriverVarReference returns [EObject current=null] : this_VarReference_0= ruleVarReference ;
    public final EObject ruleWebDriverVarReference() throws RecognitionException {
        EObject current = null;

        EObject this_VarReference_0 = null;



        	enterRule();

        try {
            // InternalBrowser.g:697:2: (this_VarReference_0= ruleVarReference )
            // InternalBrowser.g:698:2: this_VarReference_0= ruleVarReference
            {

            		newCompositeNode(grammarAccess.getWebDriverVarReferenceAccess().getVarReferenceParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_VarReference_0=ruleVarReference();

            state._fsp--;


            		current = this_VarReference_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWebDriverVarReference"


    // $ANTLR start "entryRuleLink"
    // InternalBrowser.g:709:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalBrowser.g:709:45: (iv_ruleLink= ruleLink EOF )
            // InternalBrowser.g:710:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalBrowser.g:716:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_url_2_0= RULE_STRING ) ) ( (lv_class_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_url_2_0=null;
        Token lv_class_3_0=null;


        	enterRule();

        try {
            // InternalBrowser.g:722:2: ( (otherlv_0= 'link' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_url_2_0= RULE_STRING ) ) ( (lv_class_3_0= RULE_STRING ) ) ) )
            // InternalBrowser.g:723:2: (otherlv_0= 'link' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_url_2_0= RULE_STRING ) ) ( (lv_class_3_0= RULE_STRING ) ) )
            {
            // InternalBrowser.g:723:2: (otherlv_0= 'link' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_url_2_0= RULE_STRING ) ) ( (lv_class_3_0= RULE_STRING ) ) )
            // InternalBrowser.g:724:3: otherlv_0= 'link' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_url_2_0= RULE_STRING ) ) ( (lv_class_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalBrowser.g:728:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBrowser.g:729:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBrowser.g:729:4: (lv_name_1_0= RULE_STRING )
            // InternalBrowser.g:730:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLinkAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalBrowser.g:746:3: ( (lv_url_2_0= RULE_STRING ) )
            // InternalBrowser.g:747:4: (lv_url_2_0= RULE_STRING )
            {
            // InternalBrowser.g:747:4: (lv_url_2_0= RULE_STRING )
            // InternalBrowser.g:748:5: lv_url_2_0= RULE_STRING
            {
            lv_url_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_url_2_0, grammarAccess.getLinkAccess().getUrlSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalBrowser.g:764:3: ( (lv_class_3_0= RULE_STRING ) )
            // InternalBrowser.g:765:4: (lv_class_3_0= RULE_STRING )
            {
            // InternalBrowser.g:765:4: (lv_class_3_0= RULE_STRING )
            // InternalBrowser.g:766:5: lv_class_3_0= RULE_STRING
            {
            lv_class_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_class_3_0, grammarAccess.getLinkAccess().getClassSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"class",
            						lv_class_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleInput"
    // InternalBrowser.g:786:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalBrowser.g:786:46: (iv_ruleInput= ruleInput EOF )
            // InternalBrowser.g:787:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalBrowser.g:793:1: ruleInput returns [EObject current=null] : (otherlv_0= 'input' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) ( (lv_type_3_0= RULE_STRING ) ) ( (lv_class_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_0=null;
        Token lv_type_3_0=null;
        Token lv_class_4_0=null;


        	enterRule();

        try {
            // InternalBrowser.g:799:2: ( (otherlv_0= 'input' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) ( (lv_type_3_0= RULE_STRING ) ) ( (lv_class_4_0= RULE_STRING ) ) ) )
            // InternalBrowser.g:800:2: (otherlv_0= 'input' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) ( (lv_type_3_0= RULE_STRING ) ) ( (lv_class_4_0= RULE_STRING ) ) )
            {
            // InternalBrowser.g:800:2: (otherlv_0= 'input' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) ( (lv_type_3_0= RULE_STRING ) ) ( (lv_class_4_0= RULE_STRING ) ) )
            // InternalBrowser.g:801:3: otherlv_0= 'input' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) ( (lv_type_3_0= RULE_STRING ) ) ( (lv_class_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getInputAccess().getInputKeyword_0());
            		
            // InternalBrowser.g:805:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBrowser.g:806:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBrowser.g:806:4: (lv_name_1_0= RULE_STRING )
            // InternalBrowser.g:807:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInputAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalBrowser.g:823:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalBrowser.g:824:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalBrowser.g:824:4: (lv_value_2_0= RULE_STRING )
            // InternalBrowser.g:825:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_value_2_0, grammarAccess.getInputAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalBrowser.g:841:3: ( (lv_type_3_0= RULE_STRING ) )
            // InternalBrowser.g:842:4: (lv_type_3_0= RULE_STRING )
            {
            // InternalBrowser.g:842:4: (lv_type_3_0= RULE_STRING )
            // InternalBrowser.g:843:5: lv_type_3_0= RULE_STRING
            {
            lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_type_3_0, grammarAccess.getInputAccess().getTypeSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalBrowser.g:859:3: ( (lv_class_4_0= RULE_STRING ) )
            // InternalBrowser.g:860:4: (lv_class_4_0= RULE_STRING )
            {
            // InternalBrowser.g:860:4: (lv_class_4_0= RULE_STRING )
            // InternalBrowser.g:861:5: lv_class_4_0= RULE_STRING
            {
            lv_class_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_class_4_0, grammarAccess.getInputAccess().getClassSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"class",
            						lv_class_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleButton"
    // InternalBrowser.g:881:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalBrowser.g:881:47: (iv_ruleButton= ruleButton EOF )
            // InternalBrowser.g:882:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalBrowser.g:888:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= ruleWebElementVarReference ) ) ( (lv_class_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_class_3_0=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalBrowser.g:894:2: ( (otherlv_0= 'button' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= ruleWebElementVarReference ) ) ( (lv_class_3_0= RULE_STRING ) ) ) )
            // InternalBrowser.g:895:2: (otherlv_0= 'button' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= ruleWebElementVarReference ) ) ( (lv_class_3_0= RULE_STRING ) ) )
            {
            // InternalBrowser.g:895:2: (otherlv_0= 'button' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= ruleWebElementVarReference ) ) ( (lv_class_3_0= RULE_STRING ) ) )
            // InternalBrowser.g:896:3: otherlv_0= 'button' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= ruleWebElementVarReference ) ) ( (lv_class_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
            		
            // InternalBrowser.g:900:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBrowser.g:901:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBrowser.g:901:4: (lv_name_1_0= RULE_STRING )
            // InternalBrowser.g:902:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getButtonAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalBrowser.g:918:3: ( (lv_value_2_0= ruleWebElementVarReference ) )
            // InternalBrowser.g:919:4: (lv_value_2_0= ruleWebElementVarReference )
            {
            // InternalBrowser.g:919:4: (lv_value_2_0= ruleWebElementVarReference )
            // InternalBrowser.g:920:5: lv_value_2_0= ruleWebElementVarReference
            {

            					newCompositeNode(grammarAccess.getButtonAccess().getValueWebElementVarReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_value_2_0=ruleWebElementVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getButtonRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.Browser.WebElementVarReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBrowser.g:937:3: ( (lv_class_3_0= RULE_STRING ) )
            // InternalBrowser.g:938:4: (lv_class_3_0= RULE_STRING )
            {
            // InternalBrowser.g:938:4: (lv_class_3_0= RULE_STRING )
            // InternalBrowser.g:939:5: lv_class_3_0= RULE_STRING
            {
            lv_class_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_class_3_0, grammarAccess.getButtonAccess().getClassSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"class",
            						lv_class_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleText"
    // InternalBrowser.g:959:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalBrowser.g:959:45: (iv_ruleText= ruleText EOF )
            // InternalBrowser.g:960:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalBrowser.g:966:1: ruleText returns [EObject current=null] : (otherlv_0= 'text' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= ruleWebElementVarReference ) ) ( (lv_class_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_class_3_0=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalBrowser.g:972:2: ( (otherlv_0= 'text' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= ruleWebElementVarReference ) ) ( (lv_class_3_0= RULE_STRING ) ) ) )
            // InternalBrowser.g:973:2: (otherlv_0= 'text' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= ruleWebElementVarReference ) ) ( (lv_class_3_0= RULE_STRING ) ) )
            {
            // InternalBrowser.g:973:2: (otherlv_0= 'text' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= ruleWebElementVarReference ) ) ( (lv_class_3_0= RULE_STRING ) ) )
            // InternalBrowser.g:974:3: otherlv_0= 'text' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= ruleWebElementVarReference ) ) ( (lv_class_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getTextAccess().getTextKeyword_0());
            		
            // InternalBrowser.g:978:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBrowser.g:979:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBrowser.g:979:4: (lv_name_1_0= RULE_STRING )
            // InternalBrowser.g:980:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTextAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalBrowser.g:996:3: ( (lv_value_2_0= ruleWebElementVarReference ) )
            // InternalBrowser.g:997:4: (lv_value_2_0= ruleWebElementVarReference )
            {
            // InternalBrowser.g:997:4: (lv_value_2_0= ruleWebElementVarReference )
            // InternalBrowser.g:998:5: lv_value_2_0= ruleWebElementVarReference
            {

            					newCompositeNode(grammarAccess.getTextAccess().getValueWebElementVarReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_value_2_0=ruleWebElementVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.Browser.WebElementVarReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBrowser.g:1015:3: ( (lv_class_3_0= RULE_STRING ) )
            // InternalBrowser.g:1016:4: (lv_class_3_0= RULE_STRING )
            {
            // InternalBrowser.g:1016:4: (lv_class_3_0= RULE_STRING )
            // InternalBrowser.g:1017:5: lv_class_3_0= RULE_STRING
            {
            lv_class_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_class_3_0, grammarAccess.getTextAccess().getClassSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"class",
            						lv_class_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleCheckbox"
    // InternalBrowser.g:1037:1: entryRuleCheckbox returns [EObject current=null] : iv_ruleCheckbox= ruleCheckbox EOF ;
    public final EObject entryRuleCheckbox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckbox = null;


        try {
            // InternalBrowser.g:1037:49: (iv_ruleCheckbox= ruleCheckbox EOF )
            // InternalBrowser.g:1038:2: iv_ruleCheckbox= ruleCheckbox EOF
            {
             newCompositeNode(grammarAccess.getCheckboxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckbox=ruleCheckbox();

            state._fsp--;

             current =iv_ruleCheckbox; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheckbox"


    // $ANTLR start "ruleCheckbox"
    // InternalBrowser.g:1044:1: ruleCheckbox returns [EObject current=null] : (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= ruleListValue ) ) ( (lv_class_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleCheckbox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_class_3_0=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalBrowser.g:1050:2: ( (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= ruleListValue ) ) ( (lv_class_3_0= RULE_STRING ) ) ) )
            // InternalBrowser.g:1051:2: (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= ruleListValue ) ) ( (lv_class_3_0= RULE_STRING ) ) )
            {
            // InternalBrowser.g:1051:2: (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= ruleListValue ) ) ( (lv_class_3_0= RULE_STRING ) ) )
            // InternalBrowser.g:1052:3: otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= ruleListValue ) ) ( (lv_class_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckboxAccess().getCheckboxKeyword_0());
            		
            // InternalBrowser.g:1056:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBrowser.g:1057:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBrowser.g:1057:4: (lv_name_1_0= RULE_STRING )
            // InternalBrowser.g:1058:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCheckboxAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheckboxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalBrowser.g:1074:3: ( (lv_value_2_0= ruleListValue ) )
            // InternalBrowser.g:1075:4: (lv_value_2_0= ruleListValue )
            {
            // InternalBrowser.g:1075:4: (lv_value_2_0= ruleListValue )
            // InternalBrowser.g:1076:5: lv_value_2_0= ruleListValue
            {

            					newCompositeNode(grammarAccess.getCheckboxAccess().getValueListValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_value_2_0=ruleListValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckboxRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.Browser.ListValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBrowser.g:1093:3: ( (lv_class_3_0= RULE_STRING ) )
            // InternalBrowser.g:1094:4: (lv_class_3_0= RULE_STRING )
            {
            // InternalBrowser.g:1094:4: (lv_class_3_0= RULE_STRING )
            // InternalBrowser.g:1095:5: lv_class_3_0= RULE_STRING
            {
            lv_class_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_class_3_0, grammarAccess.getCheckboxAccess().getClassSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheckboxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"class",
            						lv_class_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheckbox"


    // $ANTLR start "entryRuleCombobox"
    // InternalBrowser.g:1115:1: entryRuleCombobox returns [EObject current=null] : iv_ruleCombobox= ruleCombobox EOF ;
    public final EObject entryRuleCombobox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCombobox = null;


        try {
            // InternalBrowser.g:1115:49: (iv_ruleCombobox= ruleCombobox EOF )
            // InternalBrowser.g:1116:2: iv_ruleCombobox= ruleCombobox EOF
            {
             newCompositeNode(grammarAccess.getComboboxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCombobox=ruleCombobox();

            state._fsp--;

             current =iv_ruleCombobox; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCombobox"


    // $ANTLR start "ruleCombobox"
    // InternalBrowser.g:1122:1: ruleCombobox returns [EObject current=null] : (otherlv_0= 'combobox' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= ruleListValue ) ) ( (lv_class_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleCombobox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_class_3_0=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalBrowser.g:1128:2: ( (otherlv_0= 'combobox' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= ruleListValue ) ) ( (lv_class_3_0= RULE_STRING ) ) ) )
            // InternalBrowser.g:1129:2: (otherlv_0= 'combobox' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= ruleListValue ) ) ( (lv_class_3_0= RULE_STRING ) ) )
            {
            // InternalBrowser.g:1129:2: (otherlv_0= 'combobox' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= ruleListValue ) ) ( (lv_class_3_0= RULE_STRING ) ) )
            // InternalBrowser.g:1130:3: otherlv_0= 'combobox' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= ruleListValue ) ) ( (lv_class_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getComboboxAccess().getComboboxKeyword_0());
            		
            // InternalBrowser.g:1134:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBrowser.g:1135:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBrowser.g:1135:4: (lv_name_1_0= RULE_STRING )
            // InternalBrowser.g:1136:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComboboxAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComboboxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalBrowser.g:1152:3: ( (lv_value_2_0= ruleListValue ) )
            // InternalBrowser.g:1153:4: (lv_value_2_0= ruleListValue )
            {
            // InternalBrowser.g:1153:4: (lv_value_2_0= ruleListValue )
            // InternalBrowser.g:1154:5: lv_value_2_0= ruleListValue
            {

            					newCompositeNode(grammarAccess.getComboboxAccess().getValueListValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_value_2_0=ruleListValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComboboxRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.Browser.ListValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBrowser.g:1171:3: ( (lv_class_3_0= RULE_STRING ) )
            // InternalBrowser.g:1172:4: (lv_class_3_0= RULE_STRING )
            {
            // InternalBrowser.g:1172:4: (lv_class_3_0= RULE_STRING )
            // InternalBrowser.g:1173:5: lv_class_3_0= RULE_STRING
            {
            lv_class_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_class_3_0, grammarAccess.getComboboxAccess().getClassSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComboboxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"class",
            						lv_class_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCombobox"


    // $ANTLR start "entryRuleListValue"
    // InternalBrowser.g:1193:1: entryRuleListValue returns [String current=null] : iv_ruleListValue= ruleListValue EOF ;
    public final String entryRuleListValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleListValue = null;


        try {
            // InternalBrowser.g:1193:49: (iv_ruleListValue= ruleListValue EOF )
            // InternalBrowser.g:1194:2: iv_ruleListValue= ruleListValue EOF
            {
             newCompositeNode(grammarAccess.getListValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListValue=ruleListValue();

            state._fsp--;

             current =iv_ruleListValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListValue"


    // $ANTLR start "ruleListValue"
    // InternalBrowser.g:1200:1: ruleListValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING )* ;
    public final AntlrDatatypeRuleToken ruleListValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalBrowser.g:1206:2: ( (this_STRING_0= RULE_STRING )* )
            // InternalBrowser.g:1207:2: (this_STRING_0= RULE_STRING )*
            {
            // InternalBrowser.g:1207:2: (this_STRING_0= RULE_STRING )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==EOF) ) {
                        int LA9_3 = input.LA(3);

                        if ( (LA9_3==EOF) ) {
                            alt9=1;
                        }


                    }
                    else if ( (LA9_1==RULE_STRING) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalBrowser.g:1208:3: this_STRING_0= RULE_STRING
            	    {
            	    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    			current.merge(this_STRING_0);
            	    		

            	    			newLeafNode(this_STRING_0, grammarAccess.getListValueAccess().getSTRINGTerminalRuleCall());
            	    		

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListValue"


    // $ANTLR start "entryRuleImage"
    // InternalBrowser.g:1219:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalBrowser.g:1219:46: (iv_ruleImage= ruleImage EOF )
            // InternalBrowser.g:1220:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // InternalBrowser.g:1226:1: ruleImage returns [EObject current=null] : (otherlv_0= 'image' ( (lv_value_1_0= ruleWebElementVarReference ) ) ( (lv_class_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_class_2_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalBrowser.g:1232:2: ( (otherlv_0= 'image' ( (lv_value_1_0= ruleWebElementVarReference ) ) ( (lv_class_2_0= RULE_STRING ) ) ) )
            // InternalBrowser.g:1233:2: (otherlv_0= 'image' ( (lv_value_1_0= ruleWebElementVarReference ) ) ( (lv_class_2_0= RULE_STRING ) ) )
            {
            // InternalBrowser.g:1233:2: (otherlv_0= 'image' ( (lv_value_1_0= ruleWebElementVarReference ) ) ( (lv_class_2_0= RULE_STRING ) ) )
            // InternalBrowser.g:1234:3: otherlv_0= 'image' ( (lv_value_1_0= ruleWebElementVarReference ) ) ( (lv_class_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImageKeyword_0());
            		
            // InternalBrowser.g:1238:3: ( (lv_value_1_0= ruleWebElementVarReference ) )
            // InternalBrowser.g:1239:4: (lv_value_1_0= ruleWebElementVarReference )
            {
            // InternalBrowser.g:1239:4: (lv_value_1_0= ruleWebElementVarReference )
            // InternalBrowser.g:1240:5: lv_value_1_0= ruleWebElementVarReference
            {

            					newCompositeNode(grammarAccess.getImageAccess().getValueWebElementVarReferenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_value_1_0=ruleWebElementVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImageRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.Browser.WebElementVarReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBrowser.g:1257:3: ( (lv_class_2_0= RULE_STRING ) )
            // InternalBrowser.g:1258:4: (lv_class_2_0= RULE_STRING )
            {
            // InternalBrowser.g:1258:4: (lv_class_2_0= RULE_STRING )
            // InternalBrowser.g:1259:5: lv_class_2_0= RULE_STRING
            {
            lv_class_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_class_2_0, grammarAccess.getImageAccess().getClassSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"class",
            						lv_class_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleGo"
    // InternalBrowser.g:1279:1: entryRuleGo returns [EObject current=null] : iv_ruleGo= ruleGo EOF ;
    public final EObject entryRuleGo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGo = null;


        try {
            // InternalBrowser.g:1279:43: (iv_ruleGo= ruleGo EOF )
            // InternalBrowser.g:1280:2: iv_ruleGo= ruleGo EOF
            {
             newCompositeNode(grammarAccess.getGoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGo=ruleGo();

            state._fsp--;

             current =iv_ruleGo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGo"


    // $ANTLR start "ruleGo"
    // InternalBrowser.g:1286:1: ruleGo returns [EObject current=null] : ( ( (lv_val_0_0= ruleWebDriverVarReference ) ) otherlv_1= '.get(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ');' ) ;
    public final EObject ruleGo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_url_2_0=null;
        Token otherlv_3=null;
        EObject lv_val_0_0 = null;



        	enterRule();

        try {
            // InternalBrowser.g:1292:2: ( ( ( (lv_val_0_0= ruleWebDriverVarReference ) ) otherlv_1= '.get(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ');' ) )
            // InternalBrowser.g:1293:2: ( ( (lv_val_0_0= ruleWebDriverVarReference ) ) otherlv_1= '.get(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ');' )
            {
            // InternalBrowser.g:1293:2: ( ( (lv_val_0_0= ruleWebDriverVarReference ) ) otherlv_1= '.get(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ');' )
            // InternalBrowser.g:1294:3: ( (lv_val_0_0= ruleWebDriverVarReference ) ) otherlv_1= '.get(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ');'
            {
            // InternalBrowser.g:1294:3: ( (lv_val_0_0= ruleWebDriverVarReference ) )
            // InternalBrowser.g:1295:4: (lv_val_0_0= ruleWebDriverVarReference )
            {
            // InternalBrowser.g:1295:4: (lv_val_0_0= ruleWebDriverVarReference )
            // InternalBrowser.g:1296:5: lv_val_0_0= ruleWebDriverVarReference
            {

            					newCompositeNode(grammarAccess.getGoAccess().getValWebDriverVarReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_val_0_0=ruleWebDriverVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGoRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_0_0,
            						"org.xtext.example.Browser.WebDriverVarReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getGoAccess().getGetKeyword_1());
            		
            // InternalBrowser.g:1317:3: ( (lv_url_2_0= RULE_STRING ) )
            // InternalBrowser.g:1318:4: (lv_url_2_0= RULE_STRING )
            {
            // InternalBrowser.g:1318:4: (lv_url_2_0= RULE_STRING )
            // InternalBrowser.g:1319:5: lv_url_2_0= RULE_STRING
            {
            lv_url_2_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_url_2_0, grammarAccess.getGoAccess().getUrlSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getGoAccess().getRightParenthesisSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGo"


    // $ANTLR start "entryRuleContains"
    // InternalBrowser.g:1343:1: entryRuleContains returns [EObject current=null] : iv_ruleContains= ruleContains EOF ;
    public final EObject entryRuleContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains = null;


        try {
            // InternalBrowser.g:1343:49: (iv_ruleContains= ruleContains EOF )
            // InternalBrowser.g:1344:2: iv_ruleContains= ruleContains EOF
            {
             newCompositeNode(grammarAccess.getContainsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContains=ruleContains();

            state._fsp--;

             current =iv_ruleContains; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContains"


    // $ANTLR start "ruleContains"
    // InternalBrowser.g:1350:1: ruleContains returns [EObject current=null] : ( ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.contains(' ( (lv_param_2_0= RULE_STRING ) ) otherlv_3= ');' ) ;
    public final EObject ruleContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_param_2_0=null;
        Token otherlv_3=null;
        EObject lv_val_0_0 = null;



        	enterRule();

        try {
            // InternalBrowser.g:1356:2: ( ( ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.contains(' ( (lv_param_2_0= RULE_STRING ) ) otherlv_3= ');' ) )
            // InternalBrowser.g:1357:2: ( ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.contains(' ( (lv_param_2_0= RULE_STRING ) ) otherlv_3= ');' )
            {
            // InternalBrowser.g:1357:2: ( ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.contains(' ( (lv_param_2_0= RULE_STRING ) ) otherlv_3= ');' )
            // InternalBrowser.g:1358:3: ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.contains(' ( (lv_param_2_0= RULE_STRING ) ) otherlv_3= ');'
            {
            // InternalBrowser.g:1358:3: ( (lv_val_0_0= ruleWebElementVarReference ) )
            // InternalBrowser.g:1359:4: (lv_val_0_0= ruleWebElementVarReference )
            {
            // InternalBrowser.g:1359:4: (lv_val_0_0= ruleWebElementVarReference )
            // InternalBrowser.g:1360:5: lv_val_0_0= ruleWebElementVarReference
            {

            					newCompositeNode(grammarAccess.getContainsAccess().getValWebElementVarReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_val_0_0=ruleWebElementVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainsRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_0_0,
            						"org.xtext.example.Browser.WebElementVarReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getContainsAccess().getContainsKeyword_1());
            		
            // InternalBrowser.g:1381:3: ( (lv_param_2_0= RULE_STRING ) )
            // InternalBrowser.g:1382:4: (lv_param_2_0= RULE_STRING )
            {
            // InternalBrowser.g:1382:4: (lv_param_2_0= RULE_STRING )
            // InternalBrowser.g:1383:5: lv_param_2_0= RULE_STRING
            {
            lv_param_2_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_param_2_0, grammarAccess.getContainsAccess().getParamSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"param",
            						lv_param_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getContainsAccess().getRightParenthesisSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContains"


    // $ANTLR start "entryRuleInterractions"
    // InternalBrowser.g:1407:1: entryRuleInterractions returns [EObject current=null] : iv_ruleInterractions= ruleInterractions EOF ;
    public final EObject entryRuleInterractions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterractions = null;


        try {
            // InternalBrowser.g:1407:54: (iv_ruleInterractions= ruleInterractions EOF )
            // InternalBrowser.g:1408:2: iv_ruleInterractions= ruleInterractions EOF
            {
             newCompositeNode(grammarAccess.getInterractionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterractions=ruleInterractions();

            state._fsp--;

             current =iv_ruleInterractions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterractions"


    // $ANTLR start "ruleInterractions"
    // InternalBrowser.g:1414:1: ruleInterractions returns [EObject current=null] : (this_Click_0= ruleClick | this_ReadElement_1= ruleReadElement | this_Insert_2= ruleInsert | this_CheckCheckbox_3= ruleCheckCheckbox | this_ClearCheckbox_4= ruleClearCheckbox | this_SelectCombobox_5= ruleSelectCombobox ) ;
    public final EObject ruleInterractions() throws RecognitionException {
        EObject current = null;

        EObject this_Click_0 = null;

        EObject this_ReadElement_1 = null;

        EObject this_Insert_2 = null;

        EObject this_CheckCheckbox_3 = null;

        EObject this_ClearCheckbox_4 = null;

        EObject this_SelectCombobox_5 = null;



        	enterRule();

        try {
            // InternalBrowser.g:1420:2: ( (this_Click_0= ruleClick | this_ReadElement_1= ruleReadElement | this_Insert_2= ruleInsert | this_CheckCheckbox_3= ruleCheckCheckbox | this_ClearCheckbox_4= ruleClearCheckbox | this_SelectCombobox_5= ruleSelectCombobox ) )
            // InternalBrowser.g:1421:2: (this_Click_0= ruleClick | this_ReadElement_1= ruleReadElement | this_Insert_2= ruleInsert | this_CheckCheckbox_3= ruleCheckCheckbox | this_ClearCheckbox_4= ruleClearCheckbox | this_SelectCombobox_5= ruleSelectCombobox )
            {
            // InternalBrowser.g:1421:2: (this_Click_0= ruleClick | this_ReadElement_1= ruleReadElement | this_Insert_2= ruleInsert | this_CheckCheckbox_3= ruleCheckCheckbox | this_ClearCheckbox_4= ruleClearCheckbox | this_SelectCombobox_5= ruleSelectCombobox )
            int alt10=6;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 34:
                    {
                    alt10=1;
                    }
                    break;
                case 32:
                case 44:
                    {
                    alt10=3;
                    }
                    break;
                case 45:
                    {
                    alt10=4;
                    }
                    break;
                case 47:
                    {
                    alt10=6;
                    }
                    break;
                case 46:
                    {
                    alt10=5;
                    }
                    break;
                case 20:
                    {
                    alt10=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA10_0==32) ) {
                alt10=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalBrowser.g:1422:3: this_Click_0= ruleClick
                    {

                    			newCompositeNode(grammarAccess.getInterractionsAccess().getClickParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Click_0=ruleClick();

                    state._fsp--;


                    			current = this_Click_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBrowser.g:1431:3: this_ReadElement_1= ruleReadElement
                    {

                    			newCompositeNode(grammarAccess.getInterractionsAccess().getReadElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReadElement_1=ruleReadElement();

                    state._fsp--;


                    			current = this_ReadElement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBrowser.g:1440:3: this_Insert_2= ruleInsert
                    {

                    			newCompositeNode(grammarAccess.getInterractionsAccess().getInsertParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Insert_2=ruleInsert();

                    state._fsp--;


                    			current = this_Insert_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBrowser.g:1449:3: this_CheckCheckbox_3= ruleCheckCheckbox
                    {

                    			newCompositeNode(grammarAccess.getInterractionsAccess().getCheckCheckboxParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CheckCheckbox_3=ruleCheckCheckbox();

                    state._fsp--;


                    			current = this_CheckCheckbox_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBrowser.g:1458:3: this_ClearCheckbox_4= ruleClearCheckbox
                    {

                    			newCompositeNode(grammarAccess.getInterractionsAccess().getClearCheckboxParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClearCheckbox_4=ruleClearCheckbox();

                    state._fsp--;


                    			current = this_ClearCheckbox_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalBrowser.g:1467:3: this_SelectCombobox_5= ruleSelectCombobox
                    {

                    			newCompositeNode(grammarAccess.getInterractionsAccess().getSelectComboboxParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelectCombobox_5=ruleSelectCombobox();

                    state._fsp--;


                    			current = this_SelectCombobox_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterractions"


    // $ANTLR start "entryRuleClick"
    // InternalBrowser.g:1479:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // InternalBrowser.g:1479:46: (iv_ruleClick= ruleClick EOF )
            // InternalBrowser.g:1480:2: iv_ruleClick= ruleClick EOF
            {
             newCompositeNode(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClick=ruleClick();

            state._fsp--;

             current =iv_ruleClick; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClick"


    // $ANTLR start "ruleClick"
    // InternalBrowser.g:1486:1: ruleClick returns [EObject current=null] : ( ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.click();' ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_val_0_0 = null;



        	enterRule();

        try {
            // InternalBrowser.g:1492:2: ( ( ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.click();' ) )
            // InternalBrowser.g:1493:2: ( ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.click();' )
            {
            // InternalBrowser.g:1493:2: ( ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.click();' )
            // InternalBrowser.g:1494:3: ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.click();'
            {
            // InternalBrowser.g:1494:3: ( (lv_val_0_0= ruleWebElementVarReference ) )
            // InternalBrowser.g:1495:4: (lv_val_0_0= ruleWebElementVarReference )
            {
            // InternalBrowser.g:1495:4: (lv_val_0_0= ruleWebElementVarReference )
            // InternalBrowser.g:1496:5: lv_val_0_0= ruleWebElementVarReference
            {

            					newCompositeNode(grammarAccess.getClickAccess().getValWebElementVarReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_val_0_0=ruleWebElementVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClickRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_0_0,
            						"org.xtext.example.Browser.WebElementVarReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getClickAccess().getClickKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleReadElement"
    // InternalBrowser.g:1521:1: entryRuleReadElement returns [EObject current=null] : iv_ruleReadElement= ruleReadElement EOF ;
    public final EObject entryRuleReadElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadElement = null;


        try {
            // InternalBrowser.g:1521:52: (iv_ruleReadElement= ruleReadElement EOF )
            // InternalBrowser.g:1522:2: iv_ruleReadElement= ruleReadElement EOF
            {
             newCompositeNode(grammarAccess.getReadElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReadElement=ruleReadElement();

            state._fsp--;

             current =iv_ruleReadElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReadElement"


    // $ANTLR start "ruleReadElement"
    // InternalBrowser.g:1528:1: ruleReadElement returns [EObject current=null] : ( ( (lv_ref_0_0= ruleVarReference ) ) otherlv_1= '=' ( (lv_val_2_0= ruleWebElementVarReference ) ) otherlv_3= '.readElement();' ) ;
    public final EObject ruleReadElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ref_0_0 = null;

        EObject lv_val_2_0 = null;



        	enterRule();

        try {
            // InternalBrowser.g:1534:2: ( ( ( (lv_ref_0_0= ruleVarReference ) ) otherlv_1= '=' ( (lv_val_2_0= ruleWebElementVarReference ) ) otherlv_3= '.readElement();' ) )
            // InternalBrowser.g:1535:2: ( ( (lv_ref_0_0= ruleVarReference ) ) otherlv_1= '=' ( (lv_val_2_0= ruleWebElementVarReference ) ) otherlv_3= '.readElement();' )
            {
            // InternalBrowser.g:1535:2: ( ( (lv_ref_0_0= ruleVarReference ) ) otherlv_1= '=' ( (lv_val_2_0= ruleWebElementVarReference ) ) otherlv_3= '.readElement();' )
            // InternalBrowser.g:1536:3: ( (lv_ref_0_0= ruleVarReference ) ) otherlv_1= '=' ( (lv_val_2_0= ruleWebElementVarReference ) ) otherlv_3= '.readElement();'
            {
            // InternalBrowser.g:1536:3: ( (lv_ref_0_0= ruleVarReference ) )
            // InternalBrowser.g:1537:4: (lv_ref_0_0= ruleVarReference )
            {
            // InternalBrowser.g:1537:4: (lv_ref_0_0= ruleVarReference )
            // InternalBrowser.g:1538:5: lv_ref_0_0= ruleVarReference
            {

            					newCompositeNode(grammarAccess.getReadElementAccess().getRefVarReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_ref_0_0=ruleVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReadElementRule());
            					}
            					set(
            						current,
            						"ref",
            						lv_ref_0_0,
            						"org.xtext.example.Browser.VarReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getReadElementAccess().getEqualsSignKeyword_1());
            		
            // InternalBrowser.g:1559:3: ( (lv_val_2_0= ruleWebElementVarReference ) )
            // InternalBrowser.g:1560:4: (lv_val_2_0= ruleWebElementVarReference )
            {
            // InternalBrowser.g:1560:4: (lv_val_2_0= ruleWebElementVarReference )
            // InternalBrowser.g:1561:5: lv_val_2_0= ruleWebElementVarReference
            {

            					newCompositeNode(grammarAccess.getReadElementAccess().getValWebElementVarReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_val_2_0=ruleWebElementVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReadElementRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_2_0,
            						"org.xtext.example.Browser.WebElementVarReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getReadElementAccess().getReadElementKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReadElement"


    // $ANTLR start "entryRuleCheckContainsLink"
    // InternalBrowser.g:1586:1: entryRuleCheckContainsLink returns [EObject current=null] : iv_ruleCheckContainsLink= ruleCheckContainsLink EOF ;
    public final EObject entryRuleCheckContainsLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckContainsLink = null;


        try {
            // InternalBrowser.g:1586:58: (iv_ruleCheckContainsLink= ruleCheckContainsLink EOF )
            // InternalBrowser.g:1587:2: iv_ruleCheckContainsLink= ruleCheckContainsLink EOF
            {
             newCompositeNode(grammarAccess.getCheckContainsLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckContainsLink=ruleCheckContainsLink();

            state._fsp--;

             current =iv_ruleCheckContainsLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheckContainsLink"


    // $ANTLR start "ruleCheckContainsLink"
    // InternalBrowser.g:1593:1: ruleCheckContainsLink returns [EObject current=null] : ( ( (lv_val_0_0= ruleWebDriverVarReference ) ) otherlv_1= '.checkContainsLink(By.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_param_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ');' ) ;
    public final EObject ruleCheckContainsLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_param_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_val_0_0 = null;



        	enterRule();

        try {
            // InternalBrowser.g:1599:2: ( ( ( (lv_val_0_0= ruleWebDriverVarReference ) ) otherlv_1= '.checkContainsLink(By.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_param_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ');' ) )
            // InternalBrowser.g:1600:2: ( ( (lv_val_0_0= ruleWebDriverVarReference ) ) otherlv_1= '.checkContainsLink(By.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_param_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ');' )
            {
            // InternalBrowser.g:1600:2: ( ( (lv_val_0_0= ruleWebDriverVarReference ) ) otherlv_1= '.checkContainsLink(By.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_param_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ');' )
            // InternalBrowser.g:1601:3: ( (lv_val_0_0= ruleWebDriverVarReference ) ) otherlv_1= '.checkContainsLink(By.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_param_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ');'
            {
            // InternalBrowser.g:1601:3: ( (lv_val_0_0= ruleWebDriverVarReference ) )
            // InternalBrowser.g:1602:4: (lv_val_0_0= ruleWebDriverVarReference )
            {
            // InternalBrowser.g:1602:4: (lv_val_0_0= ruleWebDriverVarReference )
            // InternalBrowser.g:1603:5: lv_val_0_0= ruleWebDriverVarReference
            {

            					newCompositeNode(grammarAccess.getCheckContainsLinkAccess().getValWebDriverVarReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_val_0_0=ruleWebDriverVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckContainsLinkRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_0_0,
            						"org.xtext.example.Browser.WebDriverVarReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getCheckContainsLinkAccess().getCheckContainsLinkByKeyword_1());
            		
            // InternalBrowser.g:1624:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBrowser.g:1625:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBrowser.g:1625:4: (lv_name_2_0= RULE_ID )
            // InternalBrowser.g:1626:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCheckContainsLinkAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheckContainsLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getCheckContainsLinkAccess().getLeftParenthesisKeyword_3());
            		
            // InternalBrowser.g:1646:3: ( (lv_param_4_0= RULE_STRING ) )
            // InternalBrowser.g:1647:4: (lv_param_4_0= RULE_STRING )
            {
            // InternalBrowser.g:1647:4: (lv_param_4_0= RULE_STRING )
            // InternalBrowser.g:1648:5: lv_param_4_0= RULE_STRING
            {
            lv_param_4_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_param_4_0, grammarAccess.getCheckContainsLinkAccess().getParamSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheckContainsLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"param",
            						lv_param_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,38,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getCheckContainsLinkAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCheckContainsLinkAccess().getRightParenthesisSemicolonKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheckContainsLink"


    // $ANTLR start "entryRuleCheckContainsText"
    // InternalBrowser.g:1676:1: entryRuleCheckContainsText returns [EObject current=null] : iv_ruleCheckContainsText= ruleCheckContainsText EOF ;
    public final EObject entryRuleCheckContainsText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckContainsText = null;


        try {
            // InternalBrowser.g:1676:58: (iv_ruleCheckContainsText= ruleCheckContainsText EOF )
            // InternalBrowser.g:1677:2: iv_ruleCheckContainsText= ruleCheckContainsText EOF
            {
             newCompositeNode(grammarAccess.getCheckContainsTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckContainsText=ruleCheckContainsText();

            state._fsp--;

             current =iv_ruleCheckContainsText; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheckContainsText"


    // $ANTLR start "ruleCheckContainsText"
    // InternalBrowser.g:1683:1: ruleCheckContainsText returns [EObject current=null] : ( ( (lv_val_0_0= ruleWebDriverVarReference ) ) otherlv_1= '.checkContainsText(By.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_param_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ');' ) ;
    public final EObject ruleCheckContainsText() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_param_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_val_0_0 = null;



        	enterRule();

        try {
            // InternalBrowser.g:1689:2: ( ( ( (lv_val_0_0= ruleWebDriverVarReference ) ) otherlv_1= '.checkContainsText(By.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_param_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ');' ) )
            // InternalBrowser.g:1690:2: ( ( (lv_val_0_0= ruleWebDriverVarReference ) ) otherlv_1= '.checkContainsText(By.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_param_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ');' )
            {
            // InternalBrowser.g:1690:2: ( ( (lv_val_0_0= ruleWebDriverVarReference ) ) otherlv_1= '.checkContainsText(By.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_param_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ');' )
            // InternalBrowser.g:1691:3: ( (lv_val_0_0= ruleWebDriverVarReference ) ) otherlv_1= '.checkContainsText(By.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_param_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ');'
            {
            // InternalBrowser.g:1691:3: ( (lv_val_0_0= ruleWebDriverVarReference ) )
            // InternalBrowser.g:1692:4: (lv_val_0_0= ruleWebDriverVarReference )
            {
            // InternalBrowser.g:1692:4: (lv_val_0_0= ruleWebDriverVarReference )
            // InternalBrowser.g:1693:5: lv_val_0_0= ruleWebDriverVarReference
            {

            					newCompositeNode(grammarAccess.getCheckContainsTextAccess().getValWebDriverVarReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_val_0_0=ruleWebDriverVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckContainsTextRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_0_0,
            						"org.xtext.example.Browser.WebDriverVarReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getCheckContainsTextAccess().getCheckContainsTextByKeyword_1());
            		
            // InternalBrowser.g:1714:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBrowser.g:1715:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBrowser.g:1715:4: (lv_name_2_0= RULE_ID )
            // InternalBrowser.g:1716:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCheckContainsTextAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheckContainsTextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getCheckContainsTextAccess().getLeftParenthesisKeyword_3());
            		
            // InternalBrowser.g:1736:3: ( (lv_param_4_0= RULE_STRING ) )
            // InternalBrowser.g:1737:4: (lv_param_4_0= RULE_STRING )
            {
            // InternalBrowser.g:1737:4: (lv_param_4_0= RULE_STRING )
            // InternalBrowser.g:1738:5: lv_param_4_0= RULE_STRING
            {
            lv_param_4_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_param_4_0, grammarAccess.getCheckContainsTextAccess().getParamSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheckContainsTextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"param",
            						lv_param_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,38,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getCheckContainsTextAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCheckContainsTextAccess().getRightParenthesisSemicolonKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheckContainsText"


    // $ANTLR start "entryRuleFindProperty"
    // InternalBrowser.g:1766:1: entryRuleFindProperty returns [EObject current=null] : iv_ruleFindProperty= ruleFindProperty EOF ;
    public final EObject entryRuleFindProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFindProperty = null;


        try {
            // InternalBrowser.g:1766:53: (iv_ruleFindProperty= ruleFindProperty EOF )
            // InternalBrowser.g:1767:2: iv_ruleFindProperty= ruleFindProperty EOF
            {
             newCompositeNode(grammarAccess.getFindPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFindProperty=ruleFindProperty();

            state._fsp--;

             current =iv_ruleFindProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFindProperty"


    // $ANTLR start "ruleFindProperty"
    // InternalBrowser.g:1773:1: ruleFindProperty returns [EObject current=null] : ( ( (lv_ref_0_0= ruleVarReference ) ) otherlv_1= '=' ( (lv_val_2_0= ruleWebDriverVarReference ) ) otherlv_3= '.findElement(By.' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_param_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ');' ) ;
    public final EObject ruleFindProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_param_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_ref_0_0 = null;

        EObject lv_val_2_0 = null;



        	enterRule();

        try {
            // InternalBrowser.g:1779:2: ( ( ( (lv_ref_0_0= ruleVarReference ) ) otherlv_1= '=' ( (lv_val_2_0= ruleWebDriverVarReference ) ) otherlv_3= '.findElement(By.' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_param_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ');' ) )
            // InternalBrowser.g:1780:2: ( ( (lv_ref_0_0= ruleVarReference ) ) otherlv_1= '=' ( (lv_val_2_0= ruleWebDriverVarReference ) ) otherlv_3= '.findElement(By.' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_param_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ');' )
            {
            // InternalBrowser.g:1780:2: ( ( (lv_ref_0_0= ruleVarReference ) ) otherlv_1= '=' ( (lv_val_2_0= ruleWebDriverVarReference ) ) otherlv_3= '.findElement(By.' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_param_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ');' )
            // InternalBrowser.g:1781:3: ( (lv_ref_0_0= ruleVarReference ) ) otherlv_1= '=' ( (lv_val_2_0= ruleWebDriverVarReference ) ) otherlv_3= '.findElement(By.' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_param_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ');'
            {
            // InternalBrowser.g:1781:3: ( (lv_ref_0_0= ruleVarReference ) )
            // InternalBrowser.g:1782:4: (lv_ref_0_0= ruleVarReference )
            {
            // InternalBrowser.g:1782:4: (lv_ref_0_0= ruleVarReference )
            // InternalBrowser.g:1783:5: lv_ref_0_0= ruleVarReference
            {

            					newCompositeNode(grammarAccess.getFindPropertyAccess().getRefVarReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_ref_0_0=ruleVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFindPropertyRule());
            					}
            					set(
            						current,
            						"ref",
            						lv_ref_0_0,
            						"org.xtext.example.Browser.VarReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getFindPropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalBrowser.g:1804:3: ( (lv_val_2_0= ruleWebDriverVarReference ) )
            // InternalBrowser.g:1805:4: (lv_val_2_0= ruleWebDriverVarReference )
            {
            // InternalBrowser.g:1805:4: (lv_val_2_0= ruleWebDriverVarReference )
            // InternalBrowser.g:1806:5: lv_val_2_0= ruleWebDriverVarReference
            {

            					newCompositeNode(grammarAccess.getFindPropertyAccess().getValWebDriverVarReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_val_2_0=ruleWebDriverVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFindPropertyRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_2_0,
            						"org.xtext.example.Browser.WebDriverVarReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getFindPropertyAccess().getFindElementByKeyword_3());
            		
            // InternalBrowser.g:1827:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalBrowser.g:1828:4: (lv_name_4_0= RULE_ID )
            {
            // InternalBrowser.g:1828:4: (lv_name_4_0= RULE_ID )
            // InternalBrowser.g:1829:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_4_0, grammarAccess.getFindPropertyAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFindPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getFindPropertyAccess().getLeftParenthesisKeyword_5());
            		
            // InternalBrowser.g:1849:3: ( (lv_param_6_0= RULE_STRING ) )
            // InternalBrowser.g:1850:4: (lv_param_6_0= RULE_STRING )
            {
            // InternalBrowser.g:1850:4: (lv_param_6_0= RULE_STRING )
            // InternalBrowser.g:1851:5: lv_param_6_0= RULE_STRING
            {
            lv_param_6_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_param_6_0, grammarAccess.getFindPropertyAccess().getParamSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFindPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"param",
            						lv_param_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,38,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getFindPropertyAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getFindPropertyAccess().getRightParenthesisSemicolonKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFindProperty"


    // $ANTLR start "entryRuleFindFirstProperty"
    // InternalBrowser.g:1879:1: entryRuleFindFirstProperty returns [EObject current=null] : iv_ruleFindFirstProperty= ruleFindFirstProperty EOF ;
    public final EObject entryRuleFindFirstProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFindFirstProperty = null;


        try {
            // InternalBrowser.g:1879:58: (iv_ruleFindFirstProperty= ruleFindFirstProperty EOF )
            // InternalBrowser.g:1880:2: iv_ruleFindFirstProperty= ruleFindFirstProperty EOF
            {
             newCompositeNode(grammarAccess.getFindFirstPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFindFirstProperty=ruleFindFirstProperty();

            state._fsp--;

             current =iv_ruleFindFirstProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFindFirstProperty"


    // $ANTLR start "ruleFindFirstProperty"
    // InternalBrowser.g:1886:1: ruleFindFirstProperty returns [EObject current=null] : ( ( (lv_ref_0_0= ruleVarReference ) ) otherlv_1= '=' ( (lv_val_2_0= ruleWebDriverVarReference ) ) otherlv_3= '.findFirstElement(By.' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_param_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ');' ) ;
    public final EObject ruleFindFirstProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_param_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_ref_0_0 = null;

        EObject lv_val_2_0 = null;



        	enterRule();

        try {
            // InternalBrowser.g:1892:2: ( ( ( (lv_ref_0_0= ruleVarReference ) ) otherlv_1= '=' ( (lv_val_2_0= ruleWebDriverVarReference ) ) otherlv_3= '.findFirstElement(By.' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_param_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ');' ) )
            // InternalBrowser.g:1893:2: ( ( (lv_ref_0_0= ruleVarReference ) ) otherlv_1= '=' ( (lv_val_2_0= ruleWebDriverVarReference ) ) otherlv_3= '.findFirstElement(By.' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_param_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ');' )
            {
            // InternalBrowser.g:1893:2: ( ( (lv_ref_0_0= ruleVarReference ) ) otherlv_1= '=' ( (lv_val_2_0= ruleWebDriverVarReference ) ) otherlv_3= '.findFirstElement(By.' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_param_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ');' )
            // InternalBrowser.g:1894:3: ( (lv_ref_0_0= ruleVarReference ) ) otherlv_1= '=' ( (lv_val_2_0= ruleWebDriverVarReference ) ) otherlv_3= '.findFirstElement(By.' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_param_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ');'
            {
            // InternalBrowser.g:1894:3: ( (lv_ref_0_0= ruleVarReference ) )
            // InternalBrowser.g:1895:4: (lv_ref_0_0= ruleVarReference )
            {
            // InternalBrowser.g:1895:4: (lv_ref_0_0= ruleVarReference )
            // InternalBrowser.g:1896:5: lv_ref_0_0= ruleVarReference
            {

            					newCompositeNode(grammarAccess.getFindFirstPropertyAccess().getRefVarReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_ref_0_0=ruleVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFindFirstPropertyRule());
            					}
            					set(
            						current,
            						"ref",
            						lv_ref_0_0,
            						"org.xtext.example.Browser.VarReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getFindFirstPropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalBrowser.g:1917:3: ( (lv_val_2_0= ruleWebDriverVarReference ) )
            // InternalBrowser.g:1918:4: (lv_val_2_0= ruleWebDriverVarReference )
            {
            // InternalBrowser.g:1918:4: (lv_val_2_0= ruleWebDriverVarReference )
            // InternalBrowser.g:1919:5: lv_val_2_0= ruleWebDriverVarReference
            {

            					newCompositeNode(grammarAccess.getFindFirstPropertyAccess().getValWebDriverVarReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_val_2_0=ruleWebDriverVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFindFirstPropertyRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_2_0,
            						"org.xtext.example.Browser.WebDriverVarReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,41,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getFindFirstPropertyAccess().getFindFirstElementByKeyword_3());
            		
            // InternalBrowser.g:1940:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalBrowser.g:1941:4: (lv_name_4_0= RULE_ID )
            {
            // InternalBrowser.g:1941:4: (lv_name_4_0= RULE_ID )
            // InternalBrowser.g:1942:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_4_0, grammarAccess.getFindFirstPropertyAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFindFirstPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getFindFirstPropertyAccess().getLeftParenthesisKeyword_5());
            		
            // InternalBrowser.g:1962:3: ( (lv_param_6_0= RULE_STRING ) )
            // InternalBrowser.g:1963:4: (lv_param_6_0= RULE_STRING )
            {
            // InternalBrowser.g:1963:4: (lv_param_6_0= RULE_STRING )
            // InternalBrowser.g:1964:5: lv_param_6_0= RULE_STRING
            {
            lv_param_6_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_param_6_0, grammarAccess.getFindFirstPropertyAccess().getParamSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFindFirstPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"param",
            						lv_param_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,38,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getFindFirstPropertyAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getFindFirstPropertyAccess().getRightParenthesisSemicolonKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFindFirstProperty"


    // $ANTLR start "entryRuleFindSecondProperty"
    // InternalBrowser.g:1992:1: entryRuleFindSecondProperty returns [EObject current=null] : iv_ruleFindSecondProperty= ruleFindSecondProperty EOF ;
    public final EObject entryRuleFindSecondProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFindSecondProperty = null;


        try {
            // InternalBrowser.g:1992:59: (iv_ruleFindSecondProperty= ruleFindSecondProperty EOF )
            // InternalBrowser.g:1993:2: iv_ruleFindSecondProperty= ruleFindSecondProperty EOF
            {
             newCompositeNode(grammarAccess.getFindSecondPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFindSecondProperty=ruleFindSecondProperty();

            state._fsp--;

             current =iv_ruleFindSecondProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFindSecondProperty"


    // $ANTLR start "ruleFindSecondProperty"
    // InternalBrowser.g:1999:1: ruleFindSecondProperty returns [EObject current=null] : ( ( (lv_ref_0_0= ruleVarReference ) ) otherlv_1= '=' ( (lv_val_2_0= ruleWebDriverVarReference ) ) otherlv_3= '.findSecondElement(By.' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_param_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ');' ) ;
    public final EObject ruleFindSecondProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_param_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_ref_0_0 = null;

        EObject lv_val_2_0 = null;



        	enterRule();

        try {
            // InternalBrowser.g:2005:2: ( ( ( (lv_ref_0_0= ruleVarReference ) ) otherlv_1= '=' ( (lv_val_2_0= ruleWebDriverVarReference ) ) otherlv_3= '.findSecondElement(By.' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_param_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ');' ) )
            // InternalBrowser.g:2006:2: ( ( (lv_ref_0_0= ruleVarReference ) ) otherlv_1= '=' ( (lv_val_2_0= ruleWebDriverVarReference ) ) otherlv_3= '.findSecondElement(By.' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_param_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ');' )
            {
            // InternalBrowser.g:2006:2: ( ( (lv_ref_0_0= ruleVarReference ) ) otherlv_1= '=' ( (lv_val_2_0= ruleWebDriverVarReference ) ) otherlv_3= '.findSecondElement(By.' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_param_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ');' )
            // InternalBrowser.g:2007:3: ( (lv_ref_0_0= ruleVarReference ) ) otherlv_1= '=' ( (lv_val_2_0= ruleWebDriverVarReference ) ) otherlv_3= '.findSecondElement(By.' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_param_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ');'
            {
            // InternalBrowser.g:2007:3: ( (lv_ref_0_0= ruleVarReference ) )
            // InternalBrowser.g:2008:4: (lv_ref_0_0= ruleVarReference )
            {
            // InternalBrowser.g:2008:4: (lv_ref_0_0= ruleVarReference )
            // InternalBrowser.g:2009:5: lv_ref_0_0= ruleVarReference
            {

            					newCompositeNode(grammarAccess.getFindSecondPropertyAccess().getRefVarReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_ref_0_0=ruleVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFindSecondPropertyRule());
            					}
            					set(
            						current,
            						"ref",
            						lv_ref_0_0,
            						"org.xtext.example.Browser.VarReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getFindSecondPropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalBrowser.g:2030:3: ( (lv_val_2_0= ruleWebDriverVarReference ) )
            // InternalBrowser.g:2031:4: (lv_val_2_0= ruleWebDriverVarReference )
            {
            // InternalBrowser.g:2031:4: (lv_val_2_0= ruleWebDriverVarReference )
            // InternalBrowser.g:2032:5: lv_val_2_0= ruleWebDriverVarReference
            {

            					newCompositeNode(grammarAccess.getFindSecondPropertyAccess().getValWebDriverVarReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_val_2_0=ruleWebDriverVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFindSecondPropertyRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_2_0,
            						"org.xtext.example.Browser.WebDriverVarReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getFindSecondPropertyAccess().getFindSecondElementByKeyword_3());
            		
            // InternalBrowser.g:2053:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalBrowser.g:2054:4: (lv_name_4_0= RULE_ID )
            {
            // InternalBrowser.g:2054:4: (lv_name_4_0= RULE_ID )
            // InternalBrowser.g:2055:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_4_0, grammarAccess.getFindSecondPropertyAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFindSecondPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getFindSecondPropertyAccess().getLeftParenthesisKeyword_5());
            		
            // InternalBrowser.g:2075:3: ( (lv_param_6_0= RULE_STRING ) )
            // InternalBrowser.g:2076:4: (lv_param_6_0= RULE_STRING )
            {
            // InternalBrowser.g:2076:4: (lv_param_6_0= RULE_STRING )
            // InternalBrowser.g:2077:5: lv_param_6_0= RULE_STRING
            {
            lv_param_6_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_param_6_0, grammarAccess.getFindSecondPropertyAccess().getParamSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFindSecondPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"param",
            						lv_param_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,38,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getFindSecondPropertyAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getFindSecondPropertyAccess().getRightParenthesisSemicolonKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFindSecondProperty"


    // $ANTLR start "entryRuleGetTitle"
    // InternalBrowser.g:2105:1: entryRuleGetTitle returns [EObject current=null] : iv_ruleGetTitle= ruleGetTitle EOF ;
    public final EObject entryRuleGetTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetTitle = null;


        try {
            // InternalBrowser.g:2105:49: (iv_ruleGetTitle= ruleGetTitle EOF )
            // InternalBrowser.g:2106:2: iv_ruleGetTitle= ruleGetTitle EOF
            {
             newCompositeNode(grammarAccess.getGetTitleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetTitle=ruleGetTitle();

            state._fsp--;

             current =iv_ruleGetTitle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetTitle"


    // $ANTLR start "ruleGetTitle"
    // InternalBrowser.g:2112:1: ruleGetTitle returns [EObject current=null] : ( ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.getTitle()' ) ;
    public final EObject ruleGetTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_val_0_0 = null;



        	enterRule();

        try {
            // InternalBrowser.g:2118:2: ( ( ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.getTitle()' ) )
            // InternalBrowser.g:2119:2: ( ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.getTitle()' )
            {
            // InternalBrowser.g:2119:2: ( ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.getTitle()' )
            // InternalBrowser.g:2120:3: ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.getTitle()'
            {
            // InternalBrowser.g:2120:3: ( (lv_val_0_0= ruleWebElementVarReference ) )
            // InternalBrowser.g:2121:4: (lv_val_0_0= ruleWebElementVarReference )
            {
            // InternalBrowser.g:2121:4: (lv_val_0_0= ruleWebElementVarReference )
            // InternalBrowser.g:2122:5: lv_val_0_0= ruleWebElementVarReference
            {

            					newCompositeNode(grammarAccess.getGetTitleAccess().getValWebElementVarReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_val_0_0=ruleWebElementVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGetTitleRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_0_0,
            						"org.xtext.example.Browser.WebElementVarReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getGetTitleAccess().getGetTitleKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGetTitle"


    // $ANTLR start "entryRuleInsert"
    // InternalBrowser.g:2147:1: entryRuleInsert returns [EObject current=null] : iv_ruleInsert= ruleInsert EOF ;
    public final EObject entryRuleInsert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert = null;


        try {
            // InternalBrowser.g:2147:47: (iv_ruleInsert= ruleInsert EOF )
            // InternalBrowser.g:2148:2: iv_ruleInsert= ruleInsert EOF
            {
             newCompositeNode(grammarAccess.getInsertRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsert=ruleInsert();

            state._fsp--;

             current =iv_ruleInsert; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInsert"


    // $ANTLR start "ruleInsert"
    // InternalBrowser.g:2154:1: ruleInsert returns [EObject current=null] : ( ( ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.insert(' ( (lv_param_2_0= RULE_STRING ) )? ) | ( ( (lv_ref_3_0= ruleVarReference ) )? otherlv_4= ');' ) ) ;
    public final EObject ruleInsert() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_param_2_0=null;
        Token otherlv_4=null;
        EObject lv_val_0_0 = null;

        EObject lv_ref_3_0 = null;



        	enterRule();

        try {
            // InternalBrowser.g:2160:2: ( ( ( ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.insert(' ( (lv_param_2_0= RULE_STRING ) )? ) | ( ( (lv_ref_3_0= ruleVarReference ) )? otherlv_4= ');' ) ) )
            // InternalBrowser.g:2161:2: ( ( ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.insert(' ( (lv_param_2_0= RULE_STRING ) )? ) | ( ( (lv_ref_3_0= ruleVarReference ) )? otherlv_4= ');' ) )
            {
            // InternalBrowser.g:2161:2: ( ( ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.insert(' ( (lv_param_2_0= RULE_STRING ) )? ) | ( ( (lv_ref_3_0= ruleVarReference ) )? otherlv_4= ');' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==44) ) {
                    alt13=1;
                }
                else if ( (LA13_1==32) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA13_0==32) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalBrowser.g:2162:3: ( ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.insert(' ( (lv_param_2_0= RULE_STRING ) )? )
                    {
                    // InternalBrowser.g:2162:3: ( ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.insert(' ( (lv_param_2_0= RULE_STRING ) )? )
                    // InternalBrowser.g:2163:4: ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.insert(' ( (lv_param_2_0= RULE_STRING ) )?
                    {
                    // InternalBrowser.g:2163:4: ( (lv_val_0_0= ruleWebElementVarReference ) )
                    // InternalBrowser.g:2164:5: (lv_val_0_0= ruleWebElementVarReference )
                    {
                    // InternalBrowser.g:2164:5: (lv_val_0_0= ruleWebElementVarReference )
                    // InternalBrowser.g:2165:6: lv_val_0_0= ruleWebElementVarReference
                    {

                    						newCompositeNode(grammarAccess.getInsertAccess().getValWebElementVarReferenceParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_val_0_0=ruleWebElementVarReference();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInsertRule());
                    						}
                    						set(
                    							current,
                    							"val",
                    							lv_val_0_0,
                    							"org.xtext.example.Browser.WebElementVarReference");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,44,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getInsertAccess().getInsertKeyword_0_1());
                    			
                    // InternalBrowser.g:2186:4: ( (lv_param_2_0= RULE_STRING ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_STRING) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalBrowser.g:2187:5: (lv_param_2_0= RULE_STRING )
                            {
                            // InternalBrowser.g:2187:5: (lv_param_2_0= RULE_STRING )
                            // InternalBrowser.g:2188:6: lv_param_2_0= RULE_STRING
                            {
                            lv_param_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                            						newLeafNode(lv_param_2_0, grammarAccess.getInsertAccess().getParamSTRINGTerminalRuleCall_0_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getInsertRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"param",
                            							lv_param_2_0,
                            							"org.eclipse.xtext.common.Terminals.STRING");
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBrowser.g:2206:3: ( ( (lv_ref_3_0= ruleVarReference ) )? otherlv_4= ');' )
                    {
                    // InternalBrowser.g:2206:3: ( ( (lv_ref_3_0= ruleVarReference ) )? otherlv_4= ');' )
                    // InternalBrowser.g:2207:4: ( (lv_ref_3_0= ruleVarReference ) )? otherlv_4= ');'
                    {
                    // InternalBrowser.g:2207:4: ( (lv_ref_3_0= ruleVarReference ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_ID) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalBrowser.g:2208:5: (lv_ref_3_0= ruleVarReference )
                            {
                            // InternalBrowser.g:2208:5: (lv_ref_3_0= ruleVarReference )
                            // InternalBrowser.g:2209:6: lv_ref_3_0= ruleVarReference
                            {

                            						newCompositeNode(grammarAccess.getInsertAccess().getRefVarReferenceParserRuleCall_1_0_0());
                            					
                            pushFollow(FOLLOW_12);
                            lv_ref_3_0=ruleVarReference();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getInsertRule());
                            						}
                            						set(
                            							current,
                            							"ref",
                            							lv_ref_3_0,
                            							"org.xtext.example.Browser.VarReference");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getInsertAccess().getRightParenthesisSemicolonKeyword_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInsert"


    // $ANTLR start "entryRuleCheckCheckbox"
    // InternalBrowser.g:2235:1: entryRuleCheckCheckbox returns [EObject current=null] : iv_ruleCheckCheckbox= ruleCheckCheckbox EOF ;
    public final EObject entryRuleCheckCheckbox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckCheckbox = null;


        try {
            // InternalBrowser.g:2235:54: (iv_ruleCheckCheckbox= ruleCheckCheckbox EOF )
            // InternalBrowser.g:2236:2: iv_ruleCheckCheckbox= ruleCheckCheckbox EOF
            {
             newCompositeNode(grammarAccess.getCheckCheckboxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckCheckbox=ruleCheckCheckbox();

            state._fsp--;

             current =iv_ruleCheckCheckbox; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheckCheckbox"


    // $ANTLR start "ruleCheckCheckbox"
    // InternalBrowser.g:2242:1: ruleCheckCheckbox returns [EObject current=null] : ( ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.check();' ) ;
    public final EObject ruleCheckCheckbox() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_val_0_0 = null;



        	enterRule();

        try {
            // InternalBrowser.g:2248:2: ( ( ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.check();' ) )
            // InternalBrowser.g:2249:2: ( ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.check();' )
            {
            // InternalBrowser.g:2249:2: ( ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.check();' )
            // InternalBrowser.g:2250:3: ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.check();'
            {
            // InternalBrowser.g:2250:3: ( (lv_val_0_0= ruleWebElementVarReference ) )
            // InternalBrowser.g:2251:4: (lv_val_0_0= ruleWebElementVarReference )
            {
            // InternalBrowser.g:2251:4: (lv_val_0_0= ruleWebElementVarReference )
            // InternalBrowser.g:2252:5: lv_val_0_0= ruleWebElementVarReference
            {

            					newCompositeNode(grammarAccess.getCheckCheckboxAccess().getValWebElementVarReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_val_0_0=ruleWebElementVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckCheckboxRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_0_0,
            						"org.xtext.example.Browser.WebElementVarReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCheckCheckboxAccess().getCheckKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheckCheckbox"


    // $ANTLR start "entryRuleClearCheckbox"
    // InternalBrowser.g:2277:1: entryRuleClearCheckbox returns [EObject current=null] : iv_ruleClearCheckbox= ruleClearCheckbox EOF ;
    public final EObject entryRuleClearCheckbox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClearCheckbox = null;


        try {
            // InternalBrowser.g:2277:54: (iv_ruleClearCheckbox= ruleClearCheckbox EOF )
            // InternalBrowser.g:2278:2: iv_ruleClearCheckbox= ruleClearCheckbox EOF
            {
             newCompositeNode(grammarAccess.getClearCheckboxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClearCheckbox=ruleClearCheckbox();

            state._fsp--;

             current =iv_ruleClearCheckbox; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClearCheckbox"


    // $ANTLR start "ruleClearCheckbox"
    // InternalBrowser.g:2284:1: ruleClearCheckbox returns [EObject current=null] : ( ( (lv_val_0_0= ruleWebDriverVarReference ) ) otherlv_1= '.clearCheckBox();' ) ;
    public final EObject ruleClearCheckbox() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_val_0_0 = null;



        	enterRule();

        try {
            // InternalBrowser.g:2290:2: ( ( ( (lv_val_0_0= ruleWebDriverVarReference ) ) otherlv_1= '.clearCheckBox();' ) )
            // InternalBrowser.g:2291:2: ( ( (lv_val_0_0= ruleWebDriverVarReference ) ) otherlv_1= '.clearCheckBox();' )
            {
            // InternalBrowser.g:2291:2: ( ( (lv_val_0_0= ruleWebDriverVarReference ) ) otherlv_1= '.clearCheckBox();' )
            // InternalBrowser.g:2292:3: ( (lv_val_0_0= ruleWebDriverVarReference ) ) otherlv_1= '.clearCheckBox();'
            {
            // InternalBrowser.g:2292:3: ( (lv_val_0_0= ruleWebDriverVarReference ) )
            // InternalBrowser.g:2293:4: (lv_val_0_0= ruleWebDriverVarReference )
            {
            // InternalBrowser.g:2293:4: (lv_val_0_0= ruleWebDriverVarReference )
            // InternalBrowser.g:2294:5: lv_val_0_0= ruleWebDriverVarReference
            {

            					newCompositeNode(grammarAccess.getClearCheckboxAccess().getValWebDriverVarReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_val_0_0=ruleWebDriverVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClearCheckboxRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_0_0,
            						"org.xtext.example.Browser.WebDriverVarReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getClearCheckboxAccess().getClearCheckBoxKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClearCheckbox"


    // $ANTLR start "entryRuleSelectCombobox"
    // InternalBrowser.g:2319:1: entryRuleSelectCombobox returns [EObject current=null] : iv_ruleSelectCombobox= ruleSelectCombobox EOF ;
    public final EObject entryRuleSelectCombobox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectCombobox = null;


        try {
            // InternalBrowser.g:2319:55: (iv_ruleSelectCombobox= ruleSelectCombobox EOF )
            // InternalBrowser.g:2320:2: iv_ruleSelectCombobox= ruleSelectCombobox EOF
            {
             newCompositeNode(grammarAccess.getSelectComboboxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectCombobox=ruleSelectCombobox();

            state._fsp--;

             current =iv_ruleSelectCombobox; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectCombobox"


    // $ANTLR start "ruleSelectCombobox"
    // InternalBrowser.g:2326:1: ruleSelectCombobox returns [EObject current=null] : ( ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.select(' ( (lv_param_2_0= RULE_STRING ) ) otherlv_3= ');' ) ;
    public final EObject ruleSelectCombobox() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_param_2_0=null;
        Token otherlv_3=null;
        EObject lv_val_0_0 = null;



        	enterRule();

        try {
            // InternalBrowser.g:2332:2: ( ( ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.select(' ( (lv_param_2_0= RULE_STRING ) ) otherlv_3= ');' ) )
            // InternalBrowser.g:2333:2: ( ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.select(' ( (lv_param_2_0= RULE_STRING ) ) otherlv_3= ');' )
            {
            // InternalBrowser.g:2333:2: ( ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.select(' ( (lv_param_2_0= RULE_STRING ) ) otherlv_3= ');' )
            // InternalBrowser.g:2334:3: ( (lv_val_0_0= ruleWebElementVarReference ) ) otherlv_1= '.select(' ( (lv_param_2_0= RULE_STRING ) ) otherlv_3= ');'
            {
            // InternalBrowser.g:2334:3: ( (lv_val_0_0= ruleWebElementVarReference ) )
            // InternalBrowser.g:2335:4: (lv_val_0_0= ruleWebElementVarReference )
            {
            // InternalBrowser.g:2335:4: (lv_val_0_0= ruleWebElementVarReference )
            // InternalBrowser.g:2336:5: lv_val_0_0= ruleWebElementVarReference
            {

            					newCompositeNode(grammarAccess.getSelectComboboxAccess().getValWebElementVarReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
            lv_val_0_0=ruleWebElementVarReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectComboboxRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_0_0,
            						"org.xtext.example.Browser.WebElementVarReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,47,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectComboboxAccess().getSelectKeyword_1());
            		
            // InternalBrowser.g:2357:3: ( (lv_param_2_0= RULE_STRING ) )
            // InternalBrowser.g:2358:4: (lv_param_2_0= RULE_STRING )
            {
            // InternalBrowser.g:2358:4: (lv_param_2_0= RULE_STRING )
            // InternalBrowser.g:2359:5: lv_param_2_0= RULE_STRING
            {
            lv_param_2_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_param_2_0, grammarAccess.getSelectComboboxAccess().getParamSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectComboboxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"param",
            						lv_param_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSelectComboboxAccess().getRightParenthesisSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectCombobox"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\24\2\uffff\1\4\2\uffff\1\43\4\uffff";
    static final String dfa_3s = "\1\40\1\uffff\1\57\2\uffff\1\36\2\uffff\1\52\4\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\3\1\11\1\uffff\1\5\1\4\1\uffff\1\2\1\6\1\10\1\7";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\14\uffff\3\1\14\uffff\1\3",
            "",
            "\1\5\12\uffff\4\3\1\uffff\1\7\2\uffff\1\6\3\uffff\1\4\4\3",
            "",
            "",
            "\1\10\2\11\16\uffff\12\11",
            "",
            "",
            "\1\3\4\uffff\1\12\1\14\1\13",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "114:2: (this_Declaration_0= ruleDeclaration | this_Affectation_1= ruleAffectation | this_FunctionCall_2= ruleFunctionCall | this_CheckContainsLink_3= ruleCheckContainsLink | this_CheckContainsText_4= ruleCheckContainsText | this_FindProperty_5= ruleFindProperty | this_FindFirstProperty_6= ruleFindFirstProperty | this_FindSecondProperty_7= ruleFindSecondProperty | this_GetTitle_8= ruleGetTitle )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000001000E0012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000007FE00060L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000800000000000L});

}