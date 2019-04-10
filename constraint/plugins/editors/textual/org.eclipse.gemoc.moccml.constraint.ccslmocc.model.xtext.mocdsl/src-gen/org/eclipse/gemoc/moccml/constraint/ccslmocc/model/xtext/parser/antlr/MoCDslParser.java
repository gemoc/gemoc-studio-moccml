/*
 * generated by Xtext
 */
package org.eclipse.gemoc.moccml.constraint.ccslmocc.model.xtext.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.gemoc.moccml.constraint.ccslmocc.model.xtext.services.MoCDslGrammarAccess;

public class MoCDslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private MoCDslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclipse.gemoc.moccml.constraint.ccslmocc.model.xtext.parser.antlr.internal.InternalMoCDslParser createParser(XtextTokenStream stream) {
		return new org.eclipse.gemoc.moccml.constraint.ccslmocc.model.xtext.parser.antlr.internal.InternalMoCDslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "StateRelationBasedLibrary";
	}
	
	public MoCDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MoCDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
