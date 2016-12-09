// Generated from Grammatik.g by ANTLR 4.5.3
package dsl;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammatikParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, ID_PALAVRA=20, ID_NUMERICO=21;
	public static final int
		RULE_tipo = 0, RULE_op_atribuicao = 1, RULE_op_condicional = 2, RULE_op_logica = 3, 
		RULE_op_condicional_se = 4, RULE_op_mostra = 5, RULE_op_matematica = 6, 
		RULE_exp_mostra = 7, RULE_exp_se = 8, RULE_exp_logica = 9, RULE_exp_condicional = 10, 
		RULE_exp_matematica = 11, RULE_exp_atribuicao = 12, RULE_dec_variavel = 13;
	public static final String[] ruleNames = {
		"tipo", "op_atribuicao", "op_condicional", "op_logica", "op_condicional_se", 
		"op_mostra", "op_matematica", "exp_mostra", "exp_se", "exp_logica", "exp_condicional", 
		"exp_matematica", "exp_atribuicao", "dec_variavel"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Numerisch'", "'<-'", "'Gleich'", "'Anders'", "'Groessrer'", "'Kleiner'", 
		"'Und'", "'Oder'", "'Nein'", "'Ob'", "'Anzeigen'", "'Summe'", "'Subtraktion'", 
		"'Multiplikation'", "'Aufteilung'", "' '", "';'", "'Anfang'", "'Ende'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "ID_PALAVRA", "ID_NUMERICO"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grammatik.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammatikParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tipo);
		try {
			setState(30);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_atribuicaoContext extends ParserRuleContext {
		public Op_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).enterOp_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).exitOp_atribuicao(this);
		}
	}

	public final Op_atribuicaoContext op_atribuicao() throws RecognitionException {
		Op_atribuicaoContext _localctx = new Op_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_op_atribuicao);
		try {
			setState(34);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_condicionalContext extends ParserRuleContext {
		public Op_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).enterOp_condicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).exitOp_condicional(this);
		}
	}

	public final Op_condicionalContext op_condicional() throws RecognitionException {
		Op_condicionalContext _localctx = new Op_condicionalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_op_condicional);
		try {
			setState(41);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_logicaContext extends ParserRuleContext {
		public Op_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).enterOp_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).exitOp_logica(this);
		}
	}

	public final Op_logicaContext op_logica() throws RecognitionException {
		Op_logicaContext _localctx = new Op_logicaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_op_logica);
		try {
			setState(47);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_condicional_seContext extends ParserRuleContext {
		public Op_condicional_seContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_condicional_se; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).enterOp_condicional_se(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).exitOp_condicional_se(this);
		}
	}

	public final Op_condicional_seContext op_condicional_se() throws RecognitionException {
		Op_condicional_seContext _localctx = new Op_condicional_seContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_op_condicional_se);
		try {
			setState(51);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_mostraContext extends ParserRuleContext {
		public Op_mostraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_mostra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).enterOp_mostra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).exitOp_mostra(this);
		}
	}

	public final Op_mostraContext op_mostra() throws RecognitionException {
		Op_mostraContext _localctx = new Op_mostraContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_op_mostra);
		try {
			setState(55);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_matematicaContext extends ParserRuleContext {
		public Op_matematicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_matematica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).enterOp_matematica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).exitOp_matematica(this);
		}
	}

	public final Op_matematicaContext op_matematica() throws RecognitionException {
		Op_matematicaContext _localctx = new Op_matematicaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_op_matematica);
		try {
			setState(62);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				match(T__14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_mostraContext extends ParserRuleContext {
		public Op_mostraContext op_mostra() {
			return getRuleContext(Op_mostraContext.class,0);
		}
		public TerminalNode ID_PALAVRA() { return getToken(GrammatikParser.ID_PALAVRA, 0); }
		public Exp_mostraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_mostra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).enterExp_mostra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).exitExp_mostra(this);
		}
	}

	public final Exp_mostraContext exp_mostra() throws RecognitionException {
		Exp_mostraContext _localctx = new Exp_mostraContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exp_mostra);
		try {
			setState(70);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__10:
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				op_mostra();
				setState(66);
				match(T__15);
				setState(67);
				match(ID_PALAVRA);
				setState(68);
				match(T__16);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_seContext extends ParserRuleContext {
		public Op_condicional_seContext op_condicional_se() {
			return getRuleContext(Op_condicional_seContext.class,0);
		}
		public Exp_logicaContext exp_logica() {
			return getRuleContext(Exp_logicaContext.class,0);
		}
		public Exp_matematicaContext exp_matematica() {
			return getRuleContext(Exp_matematicaContext.class,0);
		}
		public Exp_atribuicaoContext exp_atribuicao() {
			return getRuleContext(Exp_atribuicaoContext.class,0);
		}
		public Exp_seContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_se; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).enterExp_se(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).exitExp_se(this);
		}
	}

	public final Exp_seContext exp_se() throws RecognitionException {
		Exp_seContext _localctx = new Exp_seContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exp_se);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				op_condicional_se();
				setState(74);
				match(T__15);
				setState(75);
				exp_logica();
				setState(76);
				match(T__15);
				setState(77);
				match(T__17);
				setState(78);
				match(T__15);
				setState(79);
				exp_matematica();
				setState(80);
				match(T__15);
				setState(81);
				match(T__18);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				op_condicional_se();
				setState(84);
				match(T__15);
				setState(85);
				exp_logica();
				setState(86);
				match(T__15);
				setState(87);
				match(T__17);
				setState(88);
				match(T__15);
				setState(89);
				exp_atribuicao();
				setState(90);
				match(T__15);
				setState(91);
				match(T__18);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_logicaContext extends ParserRuleContext {
		public List<Exp_condicionalContext> exp_condicional() {
			return getRuleContexts(Exp_condicionalContext.class);
		}
		public Exp_condicionalContext exp_condicional(int i) {
			return getRuleContext(Exp_condicionalContext.class,i);
		}
		public Op_logicaContext op_logica() {
			return getRuleContext(Op_logicaContext.class,0);
		}
		public Exp_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).enterExp_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).exitExp_logica(this);
		}
	}

	public final Exp_logicaContext exp_logica() throws RecognitionException {
		Exp_logicaContext _localctx = new Exp_logicaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exp_logica);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				exp_condicional();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				exp_condicional();
				setState(98);
				match(T__15);
				setState(99);
				op_logica();
				setState(100);
				match(T__15);
				setState(101);
				exp_condicional();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_condicionalContext extends ParserRuleContext {
		public List<TerminalNode> ID_PALAVRA() { return getTokens(GrammatikParser.ID_PALAVRA); }
		public TerminalNode ID_PALAVRA(int i) {
			return getToken(GrammatikParser.ID_PALAVRA, i);
		}
		public Op_condicionalContext op_condicional() {
			return getRuleContext(Op_condicionalContext.class,0);
		}
		public List<TerminalNode> ID_NUMERICO() { return getTokens(GrammatikParser.ID_NUMERICO); }
		public TerminalNode ID_NUMERICO(int i) {
			return getToken(GrammatikParser.ID_NUMERICO, i);
		}
		public Exp_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).enterExp_condicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).exitExp_condicional(this);
		}
	}

	public final Exp_condicionalContext exp_condicional() throws RecognitionException {
		Exp_condicionalContext _localctx = new Exp_condicionalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exp_condicional);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(ID_PALAVRA);
				setState(107);
				match(T__15);
				setState(108);
				op_condicional();
				setState(109);
				match(T__15);
				setState(110);
				match(ID_PALAVRA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				match(ID_PALAVRA);
				setState(113);
				match(T__15);
				setState(114);
				op_condicional();
				setState(115);
				match(T__15);
				setState(116);
				match(ID_NUMERICO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				match(ID_NUMERICO);
				setState(119);
				match(T__15);
				setState(120);
				op_condicional();
				setState(121);
				match(T__15);
				setState(122);
				match(ID_PALAVRA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				match(ID_NUMERICO);
				setState(125);
				match(T__15);
				setState(126);
				op_condicional();
				setState(127);
				match(T__15);
				setState(128);
				match(ID_NUMERICO);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_matematicaContext extends ParserRuleContext {
		public List<TerminalNode> ID_NUMERICO() { return getTokens(GrammatikParser.ID_NUMERICO); }
		public TerminalNode ID_NUMERICO(int i) {
			return getToken(GrammatikParser.ID_NUMERICO, i);
		}
		public Op_matematicaContext op_matematica() {
			return getRuleContext(Op_matematicaContext.class,0);
		}
		public List<TerminalNode> ID_PALAVRA() { return getTokens(GrammatikParser.ID_PALAVRA); }
		public TerminalNode ID_PALAVRA(int i) {
			return getToken(GrammatikParser.ID_PALAVRA, i);
		}
		public Exp_matematicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_matematica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).enterExp_matematica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).exitExp_matematica(this);
		}
	}

	public final Exp_matematicaContext exp_matematica() throws RecognitionException {
		Exp_matematicaContext _localctx = new Exp_matematicaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exp_matematica);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(ID_NUMERICO);
				setState(134);
				match(T__15);
				setState(135);
				op_matematica();
				setState(136);
				match(T__15);
				setState(137);
				match(ID_NUMERICO);
				setState(138);
				match(T__16);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(ID_PALAVRA);
				setState(141);
				match(T__15);
				setState(142);
				op_matematica();
				setState(143);
				match(T__15);
				setState(144);
				match(ID_NUMERICO);
				setState(145);
				match(T__16);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				match(ID_PALAVRA);
				setState(148);
				match(T__15);
				setState(149);
				op_matematica();
				setState(150);
				match(T__15);
				setState(151);
				match(ID_PALAVRA);
				setState(152);
				match(T__16);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
				match(ID_NUMERICO);
				setState(155);
				match(T__15);
				setState(156);
				op_matematica();
				setState(157);
				match(T__15);
				setState(158);
				match(ID_PALAVRA);
				setState(159);
				match(T__16);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_atribuicaoContext extends ParserRuleContext {
		public List<TerminalNode> ID_PALAVRA() { return getTokens(GrammatikParser.ID_PALAVRA); }
		public TerminalNode ID_PALAVRA(int i) {
			return getToken(GrammatikParser.ID_PALAVRA, i);
		}
		public Op_atribuicaoContext op_atribuicao() {
			return getRuleContext(Op_atribuicaoContext.class,0);
		}
		public TerminalNode ID_NUMERICO() { return getToken(GrammatikParser.ID_NUMERICO, 0); }
		public Exp_matematicaContext exp_matematica() {
			return getRuleContext(Exp_matematicaContext.class,0);
		}
		public Exp_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).enterExp_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).exitExp_atribuicao(this);
		}
	}

	public final Exp_atribuicaoContext exp_atribuicao() throws RecognitionException {
		Exp_atribuicaoContext _localctx = new Exp_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exp_atribuicao);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(ID_PALAVRA);
				setState(165);
				match(T__15);
				setState(166);
				op_atribuicao();
				setState(167);
				match(T__15);
				setState(168);
				match(ID_NUMERICO);
				setState(169);
				match(T__16);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				match(ID_PALAVRA);
				setState(172);
				match(T__15);
				setState(173);
				op_atribuicao();
				setState(174);
				match(T__15);
				setState(175);
				exp_matematica();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(ID_PALAVRA);
				setState(178);
				match(T__15);
				setState(179);
				op_atribuicao();
				setState(180);
				match(T__15);
				setState(181);
				match(ID_PALAVRA);
				setState(182);
				match(T__16);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dec_variavelContext extends ParserRuleContext {
		public TerminalNode ID_PALAVRA() { return getToken(GrammatikParser.ID_PALAVRA, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Dec_variavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).enterDec_variavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).exitDec_variavel(this);
		}
	}

	public final Dec_variavelContext dec_variavel() throws RecognitionException {
		Dec_variavelContext _localctx = new Dec_variavelContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dec_variavel);
		try {
			setState(192);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ID_PALAVRA:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(ID_PALAVRA);
				setState(188);
				match(T__15);
				setState(189);
				tipo();
				setState(190);
				match(T__16);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u00c5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\5\2!\n\2\3\3\3\3\5\3"+
		"%\n\3\3\4\3\4\3\4\3\4\3\4\5\4,\n\4\3\5\3\5\3\5\3\5\5\5\62\n\5\3\6\3\6"+
		"\5\6\66\n\6\3\7\3\7\5\7:\n\7\3\b\3\b\3\b\3\b\3\b\5\bA\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\tI\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n`\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13j\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0085\n\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a4\n\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u00bb\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00c3\n\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2\u00d6"+
		"\2 \3\2\2\2\4$\3\2\2\2\6+\3\2\2\2\b\61\3\2\2\2\n\65\3\2\2\2\f9\3\2\2\2"+
		"\16@\3\2\2\2\20H\3\2\2\2\22_\3\2\2\2\24i\3\2\2\2\26\u0084\3\2\2\2\30\u00a3"+
		"\3\2\2\2\32\u00ba\3\2\2\2\34\u00c2\3\2\2\2\36!\3\2\2\2\37!\7\3\2\2 \36"+
		"\3\2\2\2 \37\3\2\2\2!\3\3\2\2\2\"%\3\2\2\2#%\7\4\2\2$\"\3\2\2\2$#\3\2"+
		"\2\2%\5\3\2\2\2&,\3\2\2\2\',\7\5\2\2(,\7\6\2\2),\7\7\2\2*,\7\b\2\2+&\3"+
		"\2\2\2+\'\3\2\2\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,\7\3\2\2\2-\62\3\2\2\2"+
		".\62\7\t\2\2/\62\7\n\2\2\60\62\7\13\2\2\61-\3\2\2\2\61.\3\2\2\2\61/\3"+
		"\2\2\2\61\60\3\2\2\2\62\t\3\2\2\2\63\66\3\2\2\2\64\66\7\f\2\2\65\63\3"+
		"\2\2\2\65\64\3\2\2\2\66\13\3\2\2\2\67:\3\2\2\28:\7\r\2\29\67\3\2\2\29"+
		"8\3\2\2\2:\r\3\2\2\2;A\3\2\2\2<A\7\16\2\2=A\7\17\2\2>A\7\20\2\2?A\7\21"+
		"\2\2@;\3\2\2\2@<\3\2\2\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2A\17\3\2\2\2BI\3"+
		"\2\2\2CD\5\f\7\2DE\7\22\2\2EF\7\26\2\2FG\7\23\2\2GI\3\2\2\2HB\3\2\2\2"+
		"HC\3\2\2\2I\21\3\2\2\2J`\3\2\2\2KL\5\n\6\2LM\7\22\2\2MN\5\24\13\2NO\7"+
		"\22\2\2OP\7\24\2\2PQ\7\22\2\2QR\5\30\r\2RS\7\22\2\2ST\7\25\2\2T`\3\2\2"+
		"\2UV\5\n\6\2VW\7\22\2\2WX\5\24\13\2XY\7\22\2\2YZ\7\24\2\2Z[\7\22\2\2["+
		"\\\5\32\16\2\\]\7\22\2\2]^\7\25\2\2^`\3\2\2\2_J\3\2\2\2_K\3\2\2\2_U\3"+
		"\2\2\2`\23\3\2\2\2aj\3\2\2\2bj\5\26\f\2cd\5\26\f\2de\7\22\2\2ef\5\b\5"+
		"\2fg\7\22\2\2gh\5\26\f\2hj\3\2\2\2ia\3\2\2\2ib\3\2\2\2ic\3\2\2\2j\25\3"+
		"\2\2\2k\u0085\3\2\2\2lm\7\26\2\2mn\7\22\2\2no\5\6\4\2op\7\22\2\2pq\7\26"+
		"\2\2q\u0085\3\2\2\2rs\7\26\2\2st\7\22\2\2tu\5\6\4\2uv\7\22\2\2vw\7\27"+
		"\2\2w\u0085\3\2\2\2xy\7\27\2\2yz\7\22\2\2z{\5\6\4\2{|\7\22\2\2|}\7\26"+
		"\2\2}\u0085\3\2\2\2~\177\7\27\2\2\177\u0080\7\22\2\2\u0080\u0081\5\6\4"+
		"\2\u0081\u0082\7\22\2\2\u0082\u0083\7\27\2\2\u0083\u0085\3\2\2\2\u0084"+
		"k\3\2\2\2\u0084l\3\2\2\2\u0084r\3\2\2\2\u0084x\3\2\2\2\u0084~\3\2\2\2"+
		"\u0085\27\3\2\2\2\u0086\u00a4\3\2\2\2\u0087\u0088\7\27\2\2\u0088\u0089"+
		"\7\22\2\2\u0089\u008a\5\16\b\2\u008a\u008b\7\22\2\2\u008b\u008c\7\27\2"+
		"\2\u008c\u008d\7\23\2\2\u008d\u00a4\3\2\2\2\u008e\u008f\7\26\2\2\u008f"+
		"\u0090\7\22\2\2\u0090\u0091\5\16\b\2\u0091\u0092\7\22\2\2\u0092\u0093"+
		"\7\27\2\2\u0093\u0094\7\23\2\2\u0094\u00a4\3\2\2\2\u0095\u0096\7\26\2"+
		"\2\u0096\u0097\7\22\2\2\u0097\u0098\5\16\b\2\u0098\u0099\7\22\2\2\u0099"+
		"\u009a\7\26\2\2\u009a\u009b\7\23\2\2\u009b\u00a4\3\2\2\2\u009c\u009d\7"+
		"\27\2\2\u009d\u009e\7\22\2\2\u009e\u009f\5\16\b\2\u009f\u00a0\7\22\2\2"+
		"\u00a0\u00a1\7\26\2\2\u00a1\u00a2\7\23\2\2\u00a2\u00a4\3\2\2\2\u00a3\u0086"+
		"\3\2\2\2\u00a3\u0087\3\2\2\2\u00a3\u008e\3\2\2\2\u00a3\u0095\3\2\2\2\u00a3"+
		"\u009c\3\2\2\2\u00a4\31\3\2\2\2\u00a5\u00bb\3\2\2\2\u00a6\u00a7\7\26\2"+
		"\2\u00a7\u00a8\7\22\2\2\u00a8\u00a9\5\4\3\2\u00a9\u00aa\7\22\2\2\u00aa"+
		"\u00ab\7\27\2\2\u00ab\u00ac\7\23\2\2\u00ac\u00bb\3\2\2\2\u00ad\u00ae\7"+
		"\26\2\2\u00ae\u00af\7\22\2\2\u00af\u00b0\5\4\3\2\u00b0\u00b1\7\22\2\2"+
		"\u00b1\u00b2\5\30\r\2\u00b2\u00bb\3\2\2\2\u00b3\u00b4\7\26\2\2\u00b4\u00b5"+
		"\7\22\2\2\u00b5\u00b6\5\4\3\2\u00b6\u00b7\7\22\2\2\u00b7\u00b8\7\26\2"+
		"\2\u00b8\u00b9\7\23\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00a5\3\2\2\2\u00ba"+
		"\u00a6\3\2\2\2\u00ba\u00ad\3\2\2\2\u00ba\u00b3\3\2\2\2\u00bb\33\3\2\2"+
		"\2\u00bc\u00c3\3\2\2\2\u00bd\u00be\7\26\2\2\u00be\u00bf\7\22\2\2\u00bf"+
		"\u00c0\5\2\2\2\u00c0\u00c1\7\23\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00bc\3"+
		"\2\2\2\u00c2\u00bd\3\2\2\2\u00c3\35\3\2\2\2\20 $+\61\659@H_i\u0084\u00a3"+
		"\u00ba\u00c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}