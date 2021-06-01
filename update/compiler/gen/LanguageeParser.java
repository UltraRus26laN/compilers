// Generated from C:/Users/Lenovo/Desktop/vitareal/grammar\Languagee.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LanguageeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, BEGIN=6, END=7, PRINT=8, INT=9, 
		FLOAT=10, VAR=11, WHILE=12, IF=13, THEN=14, CALL=15, RETURN=16, ID=17, 
		NUMBER=18, WS=19, PLUS=20, MINUS=21, MULTIPLY=22, DIVIDE=23, NEGATION=24, 
		EQUAL=25, NON_EQUAL=26, LESS=27, LESS_OR_EQUALS=28, GREATER=29, GREATER_OR_EQUALS=30, 
		PERCENT=31, DEGREE=32, O_BRACKET=33, C_BRACKET=34;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statement = 2, RULE_expression = 3, 
		RULE_type = 4, RULE_arif = 5, RULE_compare_op = 6, RULE_string = 7, RULE_signature_method = 8, 
		RULE_method = 9, RULE_assign_var = 10, RULE_print_expr = 11, RULE_br_expr = 12, 
		RULE_neg_expr = 13, RULE_while_cycle = 14, RULE_if_then = 15, RULE_block_then = 16, 
		RULE_signature = 17, RULE_block_return = 18, RULE_block_non_return = 19, 
		RULE_subprogram_return = 20, RULE_subprogram_non_return = 21, RULE_global_program = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "statement", "expression", "type", "arif", "compare_op", 
			"string", "signature_method", "method", "assign_var", "print_expr", "br_expr", 
			"neg_expr", "while_cycle", "if_then", "block_then", "signature", "block_return", 
			"block_non_return", "subprogram_return", "subprogram_non_return", "global_program"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main_program'", "'\"'", "','", "'='", "'sub_program'", "'begin'", 
			"'end'", "'print'", "'int'", "'float'", "'var'", "'while'", "'if'", "'then'", 
			"'call'", "'return'", null, null, null, "'+'", "'-'", "'*'", "'/'", "'!'", 
			"'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'%'", "'^'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "BEGIN", "END", "PRINT", "INT", "FLOAT", 
			"VAR", "WHILE", "IF", "THEN", "CALL", "RETURN", "ID", "NUMBER", "WS", 
			"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "NEGATION", "EQUAL", "NON_EQUAL", 
			"LESS", "LESS_OR_EQUALS", "GREATER", "GREATER_OR_EQUALS", "PERCENT", 
			"DEGREE", "O_BRACKET", "C_BRACKET"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Languagee.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LanguageeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageeVisitor ) return ((LanguageeVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__0);
			setState(47);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(LanguageeParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(LanguageeParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageeVisitor ) return ((LanguageeVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(BEGIN);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << VAR) | (1L << WHILE) | (1L << IF) | (1L << CALL) | (1L << ID))) != 0)) {
				{
				{
				setState(50);
				statement();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(END);
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

	public static class StatementContext extends ParserRuleContext {
		public Assign_varContext assign_var() {
			return getRuleContext(Assign_varContext.class,0);
		}
		public While_cycleContext while_cycle() {
			return getRuleContext(While_cycleContext.class,0);
		}
		public If_thenContext if_then() {
			return getRuleContext(If_thenContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public Print_exprContext print_expr() {
			return getRuleContext(Print_exprContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageeVisitor ) return ((LanguageeVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case VAR:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				assign_var();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				while_cycle();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				if_then();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				method();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				print_expr();
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageeParser.ID, 0); }
		public Br_exprContext br_expr() {
			return getRuleContext(Br_exprContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(LanguageeParser.NUMBER, 0); }
		public Neg_exprContext neg_expr() {
			return getRuleContext(Neg_exprContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArifContext arif() {
			return getRuleContext(ArifContext.class,0);
		}
		public Compare_opContext compare_op() {
			return getRuleContext(Compare_opContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageeVisitor ) return ((LanguageeVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(66);
				match(ID);
				}
				break;
			case O_BRACKET:
				{
				setState(67);
				br_expr();
				}
				break;
			case NUMBER:
				{
				setState(68);
				match(NUMBER);
				}
				break;
			case NEGATION:
				{
				setState(69);
				neg_expr();
				}
				break;
			case CALL:
				{
				setState(70);
				method();
				}
				break;
			case T__1:
				{
				setState(71);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(74);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(77);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PLUS:
					case MINUS:
					case MULTIPLY:
					case DIVIDE:
					case PERCENT:
					case DEGREE:
						{
						setState(75);
						arif();
						}
						break;
					case EQUAL:
					case NON_EQUAL:
					case LESS:
					case LESS_OR_EQUALS:
					case GREATER:
					case GREATER_OR_EQUALS:
						{
						setState(76);
						compare_op();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(79);
					expression(8);
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LanguageeParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(LanguageeParser.FLOAT, 0); }
		public TerminalNode VAR() { return getToken(LanguageeParser.VAR, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageeVisitor ) return ((LanguageeVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << VAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ArifContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(LanguageeParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(LanguageeParser.DIVIDE, 0); }
		public TerminalNode PLUS() { return getToken(LanguageeParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LanguageeParser.MINUS, 0); }
		public TerminalNode PERCENT() { return getToken(LanguageeParser.PERCENT, 0); }
		public TerminalNode DEGREE() { return getToken(LanguageeParser.DEGREE, 0); }
		public ArifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).enterArif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).exitArif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageeVisitor ) return ((LanguageeVisitor<? extends T>)visitor).visitArif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArifContext arif() throws RecognitionException {
		ArifContext _localctx = new ArifContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << PERCENT) | (1L << DEGREE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Compare_opContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(LanguageeParser.EQUAL, 0); }
		public TerminalNode NON_EQUAL() { return getToken(LanguageeParser.NON_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(LanguageeParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(LanguageeParser.GREATER, 0); }
		public TerminalNode LESS_OR_EQUALS() { return getToken(LanguageeParser.LESS_OR_EQUALS, 0); }
		public TerminalNode GREATER_OR_EQUALS() { return getToken(LanguageeParser.GREATER_OR_EQUALS, 0); }
		public Compare_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).enterCompare_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).exitCompare_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageeVisitor ) return ((LanguageeVisitor<? extends T>)visitor).visitCompare_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compare_opContext compare_op() throws RecognitionException {
		Compare_opContext _localctx = new Compare_opContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_compare_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NON_EQUAL) | (1L << LESS) | (1L << LESS_OR_EQUALS) | (1L << GREATER) | (1L << GREATER_OR_EQUALS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageeParser.ID, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageeVisitor ) return ((LanguageeVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__1);
			setState(93);
			match(ID);
			setState(94);
			match(T__1);
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

	public static class Signature_methodContext extends ParserRuleContext {
		public TerminalNode O_BRACKET() { return getToken(LanguageeParser.O_BRACKET, 0); }
		public List<TerminalNode> ID() { return getTokens(LanguageeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LanguageeParser.ID, i);
		}
		public TerminalNode C_BRACKET() { return getToken(LanguageeParser.C_BRACKET, 0); }
		public Signature_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).enterSignature_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).exitSignature_method(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageeVisitor ) return ((LanguageeVisitor<? extends T>)visitor).visitSignature_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signature_methodContext signature_method() throws RecognitionException {
		Signature_methodContext _localctx = new Signature_methodContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_signature_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(96);
			match(O_BRACKET);
			setState(97);
			match(ID);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(98);
				match(T__2);
				setState(99);
				match(ID);
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(C_BRACKET);
			}
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

	public static class MethodContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(LanguageeParser.CALL, 0); }
		public TerminalNode ID() { return getToken(LanguageeParser.ID, 0); }
		public Signature_methodContext signature_method() {
			return getRuleContext(Signature_methodContext.class,0);
		}
		public TerminalNode O_BRACKET() { return getToken(LanguageeParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(LanguageeParser.C_BRACKET, 0); }
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageeVisitor ) return ((LanguageeVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(CALL);
			setState(108);
			match(ID);
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(109);
				signature_method();
				}
				break;
			case 2:
				{
				{
				setState(110);
				match(O_BRACKET);
				setState(111);
				match(C_BRACKET);
				}
				}
				break;
			}
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

	public static class Assign_varContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageeParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public Assign_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).enterAssign_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).exitAssign_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageeVisitor ) return ((LanguageeVisitor<? extends T>)visitor).visitAssign_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_varContext assign_var() throws RecognitionException {
		Assign_varContext _localctx = new Assign_varContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assign_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << VAR))) != 0)) {
				{
				setState(114);
				type();
				}
			}

			setState(117);
			match(ID);
			setState(118);
			match(T__3);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << VAR))) != 0)) {
				{
				setState(119);
				type();
				}
			}

			setState(122);
			expression(0);
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

	public static class Print_exprContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(LanguageeParser.PRINT, 0); }
		public TerminalNode O_BRACKET() { return getToken(LanguageeParser.O_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode C_BRACKET() { return getToken(LanguageeParser.C_BRACKET, 0); }
		public Print_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).enterPrint_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).exitPrint_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageeVisitor ) return ((LanguageeVisitor<? extends T>)visitor).visitPrint_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_exprContext print_expr() throws RecognitionException {
		Print_exprContext _localctx = new Print_exprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_print_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(PRINT);
			setState(125);
			match(O_BRACKET);
			setState(126);
			expression(0);
			setState(127);
			match(C_BRACKET);
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

	public static class Br_exprContext extends ParserRuleContext {
		public TerminalNode O_BRACKET() { return getToken(LanguageeParser.O_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode C_BRACKET() { return getToken(LanguageeParser.C_BRACKET, 0); }
		public Br_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_br_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).enterBr_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).exitBr_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageeVisitor ) return ((LanguageeVisitor<? extends T>)visitor).visitBr_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Br_exprContext br_expr() throws RecognitionException {
		Br_exprContext _localctx = new Br_exprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_br_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(O_BRACKET);
			setState(130);
			expression(0);
			setState(131);
			match(C_BRACKET);
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

	public static class Neg_exprContext extends ParserRuleContext {
		public TerminalNode NEGATION() { return getToken(LanguageeParser.NEGATION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Neg_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neg_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).enterNeg_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).exitNeg_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageeVisitor ) return ((LanguageeVisitor<? extends T>)visitor).visitNeg_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Neg_exprContext neg_expr() throws RecognitionException {
		Neg_exprContext _localctx = new Neg_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_neg_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(NEGATION);
			setState(134);
			expression(0);
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

	public static class While_cycleContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LanguageeParser.WHILE, 0); }
		public TerminalNode O_BRACKET() { return getToken(LanguageeParser.O_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode C_BRACKET() { return getToken(LanguageeParser.C_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_cycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_cycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).enterWhile_cycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).exitWhile_cycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageeVisitor ) return ((LanguageeVisitor<? extends T>)visitor).visitWhile_cycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_cycleContext while_cycle() throws RecognitionException {
		While_cycleContext _localctx = new While_cycleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_while_cycle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(WHILE);
			setState(137);
			match(O_BRACKET);
			setState(138);
			expression(0);
			setState(139);
			match(C_BRACKET);
			setState(140);
			block();
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

	public static class If_thenContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LanguageeParser.IF, 0); }
		public TerminalNode O_BRACKET() { return getToken(LanguageeParser.O_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode C_BRACKET() { return getToken(LanguageeParser.C_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode THEN() { return getToken(LanguageeParser.THEN, 0); }
		public Block_thenContext block_then() {
			return getRuleContext(Block_thenContext.class,0);
		}
		public If_thenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_then; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).enterIf_then(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).exitIf_then(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageeVisitor ) return ((LanguageeVisitor<? extends T>)visitor).visitIf_then(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_thenContext if_then() throws RecognitionException {
		If_thenContext _localctx = new If_thenContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if_then);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(IF);
			setState(143);
			match(O_BRACKET);
			setState(144);
			expression(0);
			setState(145);
			match(C_BRACKET);
			setState(146);
			block();
			setState(147);
			match(THEN);
			setState(148);
			block_then();
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

	public static class Block_thenContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_thenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_then; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).enterBlock_then(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).exitBlock_then(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageeVisitor ) return ((LanguageeVisitor<? extends T>)visitor).visitBlock_then(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_thenContext block_then() throws RecognitionException {
		Block_thenContext _localctx = new Block_thenContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_block_then);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			block();
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

	public static class SignatureContext extends ParserRuleContext {
		public TerminalNode O_BRACKET() { return getToken(LanguageeParser.O_BRACKET, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(LanguageeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LanguageeParser.ID, i);
		}
		public TerminalNode C_BRACKET() { return getToken(LanguageeParser.C_BRACKET, 0); }
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).enterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).exitSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageeVisitor ) return ((LanguageeVisitor<? extends T>)visitor).visitSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(152);
			match(O_BRACKET);
			setState(153);
			type();
			setState(154);
			match(ID);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(155);
				match(T__2);
				setState(156);
				type();
				setState(157);
				match(ID);
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(C_BRACKET);
			}
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

	public static class Block_returnContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(LanguageeParser.BEGIN, 0); }
		public TerminalNode RETURN() { return getToken(LanguageeParser.RETURN, 0); }
		public TerminalNode ID() { return getToken(LanguageeParser.ID, 0); }
		public TerminalNode END() { return getToken(LanguageeParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Block_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).enterBlock_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).exitBlock_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageeVisitor ) return ((LanguageeVisitor<? extends T>)visitor).visitBlock_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_returnContext block_return() throws RecognitionException {
		Block_returnContext _localctx = new Block_returnContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_block_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(BEGIN);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << VAR) | (1L << WHILE) | (1L << IF) | (1L << CALL) | (1L << ID))) != 0)) {
				{
				{
				setState(167);
				statement();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			match(RETURN);
			setState(174);
			match(ID);
			setState(175);
			match(END);
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

	public static class Block_non_returnContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(LanguageeParser.BEGIN, 0); }
		public TerminalNode RETURN() { return getToken(LanguageeParser.RETURN, 0); }
		public TerminalNode END() { return getToken(LanguageeParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Block_non_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_non_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).enterBlock_non_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).exitBlock_non_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageeVisitor ) return ((LanguageeVisitor<? extends T>)visitor).visitBlock_non_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_non_returnContext block_non_return() throws RecognitionException {
		Block_non_returnContext _localctx = new Block_non_returnContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_block_non_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(BEGIN);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << VAR) | (1L << WHILE) | (1L << IF) | (1L << CALL) | (1L << ID))) != 0)) {
				{
				{
				setState(178);
				statement();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			match(RETURN);
			setState(185);
			match(END);
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

	public static class Subprogram_returnContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LanguageeParser.ID, 0); }
		public Block_returnContext block_return() {
			return getRuleContext(Block_returnContext.class,0);
		}
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public TerminalNode O_BRACKET() { return getToken(LanguageeParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(LanguageeParser.C_BRACKET, 0); }
		public Subprogram_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).enterSubprogram_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).exitSubprogram_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageeVisitor ) return ((LanguageeVisitor<? extends T>)visitor).visitSubprogram_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_returnContext subprogram_return() throws RecognitionException {
		Subprogram_returnContext _localctx = new Subprogram_returnContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_subprogram_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__4);
			setState(188);
			type();
			setState(189);
			match(ID);
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(190);
				signature();
				}
				break;
			case 2:
				{
				{
				setState(191);
				match(O_BRACKET);
				setState(192);
				match(C_BRACKET);
				}
				}
				break;
			}
			setState(195);
			block_return();
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

	public static class Subprogram_non_returnContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageeParser.ID, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public Block_non_returnContext block_non_return() {
			return getRuleContext(Block_non_returnContext.class,0);
		}
		public TerminalNode O_BRACKET() { return getToken(LanguageeParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(LanguageeParser.C_BRACKET, 0); }
		public Subprogram_non_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_non_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).enterSubprogram_non_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).exitSubprogram_non_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageeVisitor ) return ((LanguageeVisitor<? extends T>)visitor).visitSubprogram_non_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_non_returnContext subprogram_non_return() throws RecognitionException {
		Subprogram_non_returnContext _localctx = new Subprogram_non_returnContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_subprogram_non_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__4);
			setState(198);
			match(ID);
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(199);
				signature();
				}
				break;
			case 2:
				{
				{
				setState(200);
				match(O_BRACKET);
				setState(201);
				match(C_BRACKET);
				}
				}
				break;
			}
			{
			setState(204);
			block_non_return();
			}
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

	public static class Global_programContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public List<Subprogram_non_returnContext> subprogram_non_return() {
			return getRuleContexts(Subprogram_non_returnContext.class);
		}
		public Subprogram_non_returnContext subprogram_non_return(int i) {
			return getRuleContext(Subprogram_non_returnContext.class,i);
		}
		public List<Subprogram_returnContext> subprogram_return() {
			return getRuleContexts(Subprogram_returnContext.class);
		}
		public Subprogram_returnContext subprogram_return(int i) {
			return getRuleContext(Subprogram_returnContext.class,i);
		}
		public Global_programContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).enterGlobal_program(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageeListener ) ((LanguageeListener)listener).exitGlobal_program(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageeVisitor ) return ((LanguageeVisitor<? extends T>)visitor).visitGlobal_program(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_programContext global_program() throws RecognitionException {
		Global_programContext _localctx = new Global_programContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_global_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			program();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				setState(209);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(207);
					subprogram_non_return();
					}
					break;
				case 2:
					{
					setState(208);
					subprogram_return();
					}
					break;
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00d9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\3\3\3\7\3\66\n\3\f\3\16\39\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4B"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5K\n\5\3\5\3\5\3\5\5\5P\n\5\3\5\3\5"+
		"\7\5T\n\5\f\5\16\5W\13\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\7\ng\n\n\f\n\16\nj\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5"+
		"\13s\n\13\3\f\5\fv\n\f\3\f\3\f\3\f\5\f{\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\7\23\u00a2\n\23\f\23\16\23\u00a5\13\23\3\23\3\23\3\24\3"+
		"\24\7\24\u00ab\n\24\f\24\16\24\u00ae\13\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\7\25\u00b6\n\25\f\25\16\25\u00b9\13\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u00c4\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u00cd\n\27\3\27\3\27\3\30\3\30\3\30\7\30\u00d4\n\30\f\30\16\30\u00d7"+
		"\13\30\3\30\2\3\b\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2"+
		"\5\3\2\13\r\4\2\26\31!\"\3\2\33 \2\u00d8\2\60\3\2\2\2\4\63\3\2\2\2\6A"+
		"\3\2\2\2\bJ\3\2\2\2\nX\3\2\2\2\fZ\3\2\2\2\16\\\3\2\2\2\20^\3\2\2\2\22"+
		"b\3\2\2\2\24m\3\2\2\2\26u\3\2\2\2\30~\3\2\2\2\32\u0083\3\2\2\2\34\u0087"+
		"\3\2\2\2\36\u008a\3\2\2\2 \u0090\3\2\2\2\"\u0098\3\2\2\2$\u009a\3\2\2"+
		"\2&\u00a8\3\2\2\2(\u00b3\3\2\2\2*\u00bd\3\2\2\2,\u00c7\3\2\2\2.\u00d0"+
		"\3\2\2\2\60\61\7\3\2\2\61\62\5\4\3\2\62\3\3\2\2\2\63\67\7\b\2\2\64\66"+
		"\5\6\4\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\2"+
		"9\67\3\2\2\2:;\7\t\2\2;\5\3\2\2\2<B\5\26\f\2=B\5\36\20\2>B\5 \21\2?B\5"+
		"\24\13\2@B\5\30\r\2A<\3\2\2\2A=\3\2\2\2A>\3\2\2\2A?\3\2\2\2A@\3\2\2\2"+
		"B\7\3\2\2\2CD\b\5\1\2DK\7\23\2\2EK\5\32\16\2FK\7\24\2\2GK\5\34\17\2HK"+
		"\5\24\13\2IK\5\20\t\2JC\3\2\2\2JE\3\2\2\2JF\3\2\2\2JG\3\2\2\2JH\3\2\2"+
		"\2JI\3\2\2\2KU\3\2\2\2LO\f\t\2\2MP\5\f\7\2NP\5\16\b\2OM\3\2\2\2ON\3\2"+
		"\2\2PQ\3\2\2\2QR\5\b\5\nRT\3\2\2\2SL\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2"+
		"\2\2V\t\3\2\2\2WU\3\2\2\2XY\t\2\2\2Y\13\3\2\2\2Z[\t\3\2\2[\r\3\2\2\2\\"+
		"]\t\4\2\2]\17\3\2\2\2^_\7\4\2\2_`\7\23\2\2`a\7\4\2\2a\21\3\2\2\2bc\7#"+
		"\2\2ch\7\23\2\2de\7\5\2\2eg\7\23\2\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3"+
		"\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7$\2\2l\23\3\2\2\2mn\7\21\2\2nr\7\23\2\2"+
		"os\5\22\n\2pq\7#\2\2qs\7$\2\2ro\3\2\2\2rp\3\2\2\2s\25\3\2\2\2tv\5\n\6"+
		"\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\23\2\2xz\7\6\2\2y{\5\n\6\2zy\3\2"+
		"\2\2z{\3\2\2\2{|\3\2\2\2|}\5\b\5\2}\27\3\2\2\2~\177\7\n\2\2\177\u0080"+
		"\7#\2\2\u0080\u0081\5\b\5\2\u0081\u0082\7$\2\2\u0082\31\3\2\2\2\u0083"+
		"\u0084\7#\2\2\u0084\u0085\5\b\5\2\u0085\u0086\7$\2\2\u0086\33\3\2\2\2"+
		"\u0087\u0088\7\32\2\2\u0088\u0089\5\b\5\2\u0089\35\3\2\2\2\u008a\u008b"+
		"\7\16\2\2\u008b\u008c\7#\2\2\u008c\u008d\5\b\5\2\u008d\u008e\7$\2\2\u008e"+
		"\u008f\5\4\3\2\u008f\37\3\2\2\2\u0090\u0091\7\17\2\2\u0091\u0092\7#\2"+
		"\2\u0092\u0093\5\b\5\2\u0093\u0094\7$\2\2\u0094\u0095\5\4\3\2\u0095\u0096"+
		"\7\20\2\2\u0096\u0097\5\"\22\2\u0097!\3\2\2\2\u0098\u0099\5\4\3\2\u0099"+
		"#\3\2\2\2\u009a\u009b\7#\2\2\u009b\u009c\5\n\6\2\u009c\u00a3\7\23\2\2"+
		"\u009d\u009e\7\5\2\2\u009e\u009f\5\n\6\2\u009f\u00a0\7\23\2\2\u00a0\u00a2"+
		"\3\2\2\2\u00a1\u009d\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7$"+
		"\2\2\u00a7%\3\2\2\2\u00a8\u00ac\7\b\2\2\u00a9\u00ab\5\6\4\2\u00aa\u00a9"+
		"\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\22\2\2\u00b0\u00b1\7"+
		"\23\2\2\u00b1\u00b2\7\t\2\2\u00b2\'\3\2\2\2\u00b3\u00b7\7\b\2\2\u00b4"+
		"\u00b6\5\6\4\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba"+
		"\u00bb\7\22\2\2\u00bb\u00bc\7\t\2\2\u00bc)\3\2\2\2\u00bd\u00be\7\7\2\2"+
		"\u00be\u00bf\5\n\6\2\u00bf\u00c3\7\23\2\2\u00c0\u00c4\5$\23\2\u00c1\u00c2"+
		"\7#\2\2\u00c2\u00c4\7$\2\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\5&\24\2\u00c6+\3\2\2\2\u00c7\u00c8\7\7\2\2"+
		"\u00c8\u00cc\7\23\2\2\u00c9\u00cd\5$\23\2\u00ca\u00cb\7#\2\2\u00cb\u00cd"+
		"\7$\2\2\u00cc\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cf\5(\25\2\u00cf-\3\2\2\2\u00d0\u00d5\5\2\2\2\u00d1\u00d4\5,\27\2"+
		"\u00d2\u00d4\5*\26\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7"+
		"\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6/\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\22\67AJOUhruz\u00a3\u00ac\u00b7\u00c3\u00cc\u00d3\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}