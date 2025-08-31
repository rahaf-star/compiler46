// Generated from C:/Users/Rahaf/Downloads/Telegram Desktop/compiler (8)/compiler/src/antlr/AngulerParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngulerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN_BRACE=1, CLOSE_BRACE=2, OPEN_PAREN=3, CLOSE_PAREN=4, OPEN_BRACKET=5, 
		CLOSE_BRACKET=6, COMMA=7, SEMICOLON=8, DOT=9, COLON=10, QUOTE=11, EQUAL=12, 
		IS_EQUAL=13, NOT_EQUAL=14, IS_EQUAL_TYPE=15, NOT_EQUAL_TYPE=16, BACK_SLASH=17, 
		ARROW=18, COMPONENT=19, ANGULAR=20, INCREMENT=21, DECREMENT=22, VOID=23, 
		NOT=24, QUESTION=25, OPENTAG=26, CLOSETAG=27, LESS_EQUAL=28, GRETER_EQUAL=29, 
		OPERATORE=30, SLASH=31, SUM=32, MIN=33, MUL=34, MOD=35, DOLLAR=36, AND=37, 
		OR=38, PIPE=39, SELECTOR=40, STANDALONE=41, IMPORTS=42, TEMPLATE=43, TEMPLATE_URL=44, 
		STYLES=45, STYLE_URLS=46, STYLE_URL=47, NG_IF=48, NG_FOR=49, NG_CLASS=50, 
		NG_STYLE=51, NG_MODEL=52, DIRECTIVE=53, HASH=54, NG_CONTENT=55, NG_TEMPLATE=56, 
		INPUT=57, OUTPUT=58, VIEW_CHILD=59, CONTENT_CHILD=60, NG_ON_INIT=61, NG_ON_CHANGES=62, 
		NG_ON_DESTROY=63, ROUTER_LINK=64, ROUTER_OUTLET=65, FORM_CONTROL_NAME=66, 
		FORM_GROUP=67, FORM_ARRAY=68, STYLE_ATTR=69, ALT_ATTR=70, SRC_ATTR=71, 
		HREF_ATTR=72, DIV_TAG=73, H1_TAG=74, H2_TAG=75, H3_TAG=76, P_TAG=77, IMG_TAG=78, 
		A_TAG=79, SPAN_TAG=80, BUTTON_TAG=81, FUNCTION=82, INTERFACE=83, CLASS=84, 
		IMPORT=85, FROM=86, EXPORT=87, IF=88, ELSE=89, FOR=90, WHILE=91, DO=92, 
		SWITCH=93, CASE=94, DEFAULT=95, RETURN=96, BREAK=97, CONTINUE=98, BOOLEAN=99, 
		NULL=100, UNDEFINED=101, STRING=102, NUMBER=103, BOOL=104, ANY=105, CONST=106, 
		LET=107, VAR=108, INT=109, PRIVATE=110, PUBLIC=111, PROTECTED=112, IDENTIFIER=113, 
		STRING_LITERAL=114, TEMPLATE_LITERAL=115, DECIMAL_INTEGER_LITERAL=116, 
		HEX_INTEGER_LITERAL=117, OCTAL_INTEGER_LITERAL=118, BINARY_INTEGER_LITERAL=119, 
		FLOAT_LITERAL=120, LINE_COMMENT=121, BLOCK_COMMENT=122, WS=123;
	public static final int
		RULE_prog = 0, RULE_anguler_import = 1, RULE_component_declaration = 2, 
		RULE_component_metadata = 3, RULE_metadata_property = 4, RULE_type_annotation = 5, 
		RULE_base_type_annotation = 6, RULE_primitive_type = 7, RULE_array_type = 8, 
		RULE_structured_type = 9, RULE_type_pair = 10, RULE_property_declaration = 11, 
		RULE_class_declaration = 12, RULE_class_body = 13, RULE_method_declaration = 14, 
		RULE_method_body = 15, RULE_function_declaration = 16, RULE_function_body = 17, 
		RULE_parameter_list = 18, RULE_parameter = 19, RULE_declaraiton_keywords = 20, 
		RULE_variable_declaration = 21, RULE_primary = 22, RULE_postfix_expression = 23, 
		RULE_value = 24, RULE_assignment = 25, RULE_literal_value = 26, RULE_arithmetic_expression = 27, 
		RULE_unary_expression = 28, RULE_relational_expression = 29, RULE_equality_expression = 30, 
		RULE_logical_expression = 31, RULE_conditional_expression = 32, RULE_expression = 33, 
		RULE_json_object = 34, RULE_json_pair = 35, RULE_imports_array = 36, RULE_array = 37, 
		RULE_instruction = 38, RULE_conditional_statements = 39, RULE_block = 40, 
		RULE_if_statement = 41, RULE_for_statement = 42, RULE_switch_statement = 43, 
		RULE_switch_body = 44, RULE_switch_case = 45, RULE_switch_default = 46, 
		RULE_while_statement = 47, RULE_do_while_statement = 48, RULE_continue_Statement = 49, 
		RULE_return_Statement = 50, RULE_break_statement = 51, RULE_expressionSequence = 52, 
		RULE_interface_Declaration = 53, RULE_generic_Type = 54, RULE_eos = 55, 
		RULE_html_value = 56, RULE_tags = 57, RULE_open_tag = 58, RULE_attrs = 59, 
		RULE_html_attribute = 60, RULE_close_tag = 61, RULE_single_tag = 62, RULE_template_variable = 63, 
		RULE_ng_content = 64, RULE_ng_template = 65;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "anguler_import", "component_declaration", "component_metadata", 
			"metadata_property", "type_annotation", "base_type_annotation", "primitive_type", 
			"array_type", "structured_type", "type_pair", "property_declaration", 
			"class_declaration", "class_body", "method_declaration", "method_body", 
			"function_declaration", "function_body", "parameter_list", "parameter", 
			"declaraiton_keywords", "variable_declaration", "primary", "postfix_expression", 
			"value", "assignment", "literal_value", "arithmetic_expression", "unary_expression", 
			"relational_expression", "equality_expression", "logical_expression", 
			"conditional_expression", "expression", "json_object", "json_pair", "imports_array", 
			"array", "instruction", "conditional_statements", "block", "if_statement", 
			"for_statement", "switch_statement", "switch_body", "switch_case", "switch_default", 
			"while_statement", "do_while_statement", "continue_Statement", "return_Statement", 
			"break_statement", "expressionSequence", "interface_Declaration", "generic_Type", 
			"eos", "html_value", "tags", "open_tag", "attrs", "html_attribute", "close_tag", 
			"single_tag", "template_variable", "ng_content", "ng_template"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "'['", "']'", "','", "';'", "'.'", 
			"':'", "'''", "'='", "'=='", "'!='", "'==='", "'!=='", "'\\'", "'=>'", 
			"'@Component'", "'@angular'", "'++'", "'--'", "'void'", "'!'", "'?'", 
			"'<'", "'>'", "'<='", "'>='", null, "'/'", "'+'", "'_'", "'*'", "'%'", 
			"'$'", "'&&'", "'||'", "'|'", "'selector'", "'standalone'", "'imports'", 
			"'template'", "'templateUrl'", "'styles'", "'styleUrls'", "'styleUrl'", 
			"'*ngIf'", "'*ngFor'", "'[ngClass]'", "'[ngStyle]'", "'[(ngModel)]'", 
			null, "'#'", "'ng-content'", "'ng-template'", "'@Input'", "'@Output'", 
			"'@ViewChild'", "'@ContentChild'", "'ngOnInit'", "'ngOnChanges'", "'ngOnDestroy'", 
			"'routerLink'", "'router-outlet'", "'formControlName'", "'formGroup'", 
			"'formArray'", "'style'", "'alt'", "'src'", "'href'", "'div'", "'h1'", 
			"'h2'", "'h3'", "'p'", "'img'", "'a'", "'span'", "'button'", "'function'", 
			"'interface'", "'class'", "'import'", "'from'", "'export'", "'if'", "'else'", 
			"'for'", "'while'", "'do'", "'switch'", "'case'", "'default'", "'return'", 
			"'break'", "'continue'", null, "'null'", "'undefined'", "'string'", "'number'", 
			"'boolean'", "'any'", "'const'", "'let'", "'var'", "'int'", "'private'", 
			"'public'", "'protected'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPEN_BRACE", "CLOSE_BRACE", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "COMMA", "SEMICOLON", "DOT", "COLON", "QUOTE", "EQUAL", 
			"IS_EQUAL", "NOT_EQUAL", "IS_EQUAL_TYPE", "NOT_EQUAL_TYPE", "BACK_SLASH", 
			"ARROW", "COMPONENT", "ANGULAR", "INCREMENT", "DECREMENT", "VOID", "NOT", 
			"QUESTION", "OPENTAG", "CLOSETAG", "LESS_EQUAL", "GRETER_EQUAL", "OPERATORE", 
			"SLASH", "SUM", "MIN", "MUL", "MOD", "DOLLAR", "AND", "OR", "PIPE", "SELECTOR", 
			"STANDALONE", "IMPORTS", "TEMPLATE", "TEMPLATE_URL", "STYLES", "STYLE_URLS", 
			"STYLE_URL", "NG_IF", "NG_FOR", "NG_CLASS", "NG_STYLE", "NG_MODEL", "DIRECTIVE", 
			"HASH", "NG_CONTENT", "NG_TEMPLATE", "INPUT", "OUTPUT", "VIEW_CHILD", 
			"CONTENT_CHILD", "NG_ON_INIT", "NG_ON_CHANGES", "NG_ON_DESTROY", "ROUTER_LINK", 
			"ROUTER_OUTLET", "FORM_CONTROL_NAME", "FORM_GROUP", "FORM_ARRAY", "STYLE_ATTR", 
			"ALT_ATTR", "SRC_ATTR", "HREF_ATTR", "DIV_TAG", "H1_TAG", "H2_TAG", "H3_TAG", 
			"P_TAG", "IMG_TAG", "A_TAG", "SPAN_TAG", "BUTTON_TAG", "FUNCTION", "INTERFACE", 
			"CLASS", "IMPORT", "FROM", "EXPORT", "IF", "ELSE", "FOR", "WHILE", "DO", 
			"SWITCH", "CASE", "DEFAULT", "RETURN", "BREAK", "CONTINUE", "BOOLEAN", 
			"NULL", "UNDEFINED", "STRING", "NUMBER", "BOOL", "ANY", "CONST", "LET", 
			"VAR", "INT", "PRIVATE", "PUBLIC", "PROTECTED", "IDENTIFIER", "STRING_LITERAL", 
			"TEMPLATE_LITERAL", "DECIMAL_INTEGER_LITERAL", "HEX_INTEGER_LITERAL", 
			"OCTAL_INTEGER_LITERAL", "BINARY_INTEGER_LITERAL", "FLOAT_LITERAL", "LINE_COMMENT", 
			"BLOCK_COMMENT", "WS"
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
	public String getGrammarFileName() { return "AngulerParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngulerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<Anguler_importContext> anguler_import() {
			return getRuleContexts(Anguler_importContext.class);
		}
		public Anguler_importContext anguler_import(int i) {
			return getRuleContext(Anguler_importContext.class,i);
		}
		public List<Component_declarationContext> component_declaration() {
			return getRuleContexts(Component_declarationContext.class);
		}
		public Component_declarationContext component_declaration(int i) {
			return getRuleContext(Component_declarationContext.class,i);
		}
		public TerminalNode EOF() { return getToken(AngulerParser.EOF, 0); }
		public List<TerminalNode> EXPORT() { return getTokens(AngulerParser.EXPORT); }
		public TerminalNode EXPORT(int i) {
			return getToken(AngulerParser.EXPORT, i);
		}
		public List<TerminalNode> INTERFACE() { return getTokens(AngulerParser.INTERFACE); }
		public TerminalNode INTERFACE(int i) {
			return getToken(AngulerParser.INTERFACE, i);
		}
		public List<Class_declarationContext> class_declaration() {
			return getRuleContexts(Class_declarationContext.class);
		}
		public Class_declarationContext class_declaration(int i) {
			return getRuleContext(Class_declarationContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IMPORT) {
					{
					{
					setState(132);
					anguler_import();
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMPONENT) {
					{
					{
					setState(138);
					component_declaration();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EXPORT) {
					{
					{
					setState(144);
					match(EXPORT);
					setState(145);
					match(INTERFACE);
					setState(146);
					class_declaration();
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(152);
				match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Anguler_importContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AngulerParser.IMPORT, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngulerParser.OPEN_BRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngulerParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngulerParser.IDENTIFIER, i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(AngulerParser.CLOSE_BRACE, 0); }
		public TerminalNode FROM() { return getToken(AngulerParser.FROM, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngulerParser.STRING_LITERAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngulerParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngulerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngulerParser.COMMA, i);
		}
		public Anguler_importContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anguler_import; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterAnguler_import(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitAnguler_import(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitAnguler_import(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Anguler_importContext anguler_import() throws RecognitionException {
		Anguler_importContext _localctx = new Anguler_importContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_anguler_import);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(IMPORT);
			setState(156);
			match(OPEN_BRACE);
			setState(157);
			match(IDENTIFIER);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(158);
				match(COMMA);
				setState(159);
				match(IDENTIFIER);
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			match(CLOSE_BRACE);
			setState(166);
			match(FROM);
			setState(167);
			match(STRING_LITERAL);
			setState(168);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Component_declarationContext extends ParserRuleContext {
		public TerminalNode COMPONENT() { return getToken(AngulerParser.COMPONENT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public Component_metadataContext component_metadata() {
			return getRuleContext(Component_metadataContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public Component_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterComponent_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitComponent_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitComponent_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_declarationContext component_declaration() throws RecognitionException {
		Component_declarationContext _localctx = new Component_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_component_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(COMPONENT);
			setState(171);
			match(OPEN_PAREN);
			setState(172);
			component_metadata();
			setState(173);
			match(CLOSE_PAREN);
			setState(174);
			class_declaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Component_metadataContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngulerParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngulerParser.CLOSE_BRACE, 0); }
		public List<Metadata_propertyContext> metadata_property() {
			return getRuleContexts(Metadata_propertyContext.class);
		}
		public Metadata_propertyContext metadata_property(int i) {
			return getRuleContext(Metadata_propertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngulerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngulerParser.COMMA, i);
		}
		public Component_metadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_metadata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterComponent_metadata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitComponent_metadata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitComponent_metadata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_metadataContext component_metadata() throws RecognitionException {
		Component_metadataContext _localctx = new Component_metadataContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_component_metadata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(OPEN_BRACE);
			{
			setState(177);
			metadata_property();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(178);
				match(COMMA);
				setState(179);
				metadata_property();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(185);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Metadata_propertyContext extends ParserRuleContext {
		public Metadata_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadata_property; }
	 
		public Metadata_propertyContext() { }
		public void copyFrom(Metadata_propertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MetadataStyleUrlsContext extends Metadata_propertyContext {
		public TerminalNode STYLE_URLS() { return getToken(AngulerParser.STYLE_URLS, 0); }
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public Imports_arrayContext imports_array() {
			return getRuleContext(Imports_arrayContext.class,0);
		}
		public MetadataStyleUrlsContext(Metadata_propertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterMetadataStyleUrls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitMetadataStyleUrls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitMetadataStyleUrls(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MetadataImportsContext extends Metadata_propertyContext {
		public TerminalNode IMPORTS() { return getToken(AngulerParser.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public Imports_arrayContext imports_array() {
			return getRuleContext(Imports_arrayContext.class,0);
		}
		public MetadataImportsContext(Metadata_propertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterMetadataImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitMetadataImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitMetadataImports(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MetadataTemplateContext extends Metadata_propertyContext {
		public TerminalNode TEMPLATE() { return getToken(AngulerParser.TEMPLATE, 0); }
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public TerminalNode TEMPLATE_LITERAL() { return getToken(AngulerParser.TEMPLATE_LITERAL, 0); }
		public MetadataTemplateContext(Metadata_propertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterMetadataTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitMetadataTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitMetadataTemplate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MetadataStylesContext extends Metadata_propertyContext {
		public TerminalNode STYLES() { return getToken(AngulerParser.STYLES, 0); }
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngulerParser.STRING_LITERAL, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public MetadataStylesContext(Metadata_propertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterMetadataStyles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitMetadataStyles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitMetadataStyles(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MetadataStandaloneContext extends Metadata_propertyContext {
		public TerminalNode STANDALONE() { return getToken(AngulerParser.STANDALONE, 0); }
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public TerminalNode BOOLEAN() { return getToken(AngulerParser.BOOLEAN, 0); }
		public MetadataStandaloneContext(Metadata_propertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterMetadataStandalone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitMetadataStandalone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitMetadataStandalone(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MetadataSelectorContext extends Metadata_propertyContext {
		public TerminalNode SELECTOR() { return getToken(AngulerParser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngulerParser.STRING_LITERAL, 0); }
		public MetadataSelectorContext(Metadata_propertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterMetadataSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitMetadataSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitMetadataSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MetadataTemplateUrlContext extends Metadata_propertyContext {
		public TerminalNode TEMPLATE_URL() { return getToken(AngulerParser.TEMPLATE_URL, 0); }
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngulerParser.STRING_LITERAL, 0); }
		public MetadataTemplateUrlContext(Metadata_propertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterMetadataTemplateUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitMetadataTemplateUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitMetadataTemplateUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Metadata_propertyContext metadata_property() throws RecognitionException {
		Metadata_propertyContext _localctx = new Metadata_propertyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_metadata_property);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new MetadataSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(SELECTOR);
				setState(188);
				match(COLON);
				setState(189);
				match(STRING_LITERAL);
				}
				break;
			case STANDALONE:
				_localctx = new MetadataStandaloneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(STANDALONE);
				setState(191);
				match(COLON);
				setState(192);
				match(BOOLEAN);
				}
				break;
			case IMPORTS:
				_localctx = new MetadataImportsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				match(IMPORTS);
				setState(194);
				match(COLON);
				{
				setState(195);
				imports_array();
				}
				}
				break;
			case TEMPLATE:
				_localctx = new MetadataTemplateContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				match(TEMPLATE);
				setState(197);
				match(COLON);
				setState(198);
				match(TEMPLATE_LITERAL);
				}
				break;
			case TEMPLATE_URL:
				_localctx = new MetadataTemplateUrlContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(199);
				match(TEMPLATE_URL);
				setState(200);
				match(COLON);
				setState(201);
				match(STRING_LITERAL);
				}
				break;
			case STYLES:
				_localctx = new MetadataStylesContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(202);
				match(STYLES);
				setState(203);
				match(COLON);
				setState(206);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_LITERAL:
					{
					setState(204);
					match(STRING_LITERAL);
					}
					break;
				case OPEN_BRACKET:
					{
					setState(205);
					array();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case STYLE_URLS:
				_localctx = new MetadataStyleUrlsContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(208);
				match(STYLE_URLS);
				setState(209);
				match(COLON);
				setState(210);
				imports_array();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_annotationContext extends ParserRuleContext {
		public List<Base_type_annotationContext> base_type_annotation() {
			return getRuleContexts(Base_type_annotationContext.class);
		}
		public Base_type_annotationContext base_type_annotation(int i) {
			return getRuleContext(Base_type_annotationContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(AngulerParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(AngulerParser.PIPE, i);
		}
		public Type_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterType_annotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitType_annotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitType_annotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_annotationContext type_annotation() throws RecognitionException {
		Type_annotationContext _localctx = new Type_annotationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			base_type_annotation();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(214);
				match(PIPE);
				setState(215);
				base_type_annotation();
				}
				}
				setState(220);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Base_type_annotationContext extends ParserRuleContext {
		public Base_type_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type_annotation; }
	 
		public Base_type_annotationContext() { }
		public void copyFrom(Base_type_annotationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleTypeContext extends Base_type_annotationContext {
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public SimpleTypeContext(Base_type_annotationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterSimpleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitSimpleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitSimpleType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeContext extends Base_type_annotationContext {
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public ArrayTypeContext(Base_type_annotationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructuredTypeContext extends Base_type_annotationContext {
		public Structured_typeContext structured_type() {
			return getRuleContext(Structured_typeContext.class,0);
		}
		public StructuredTypeContext(Base_type_annotationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterStructuredType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitStructuredType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitStructuredType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidTypeContext extends Base_type_annotationContext {
		public TerminalNode VOID() { return getToken(AngulerParser.VOID, 0); }
		public VoidTypeContext(Base_type_annotationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterVoidType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitVoidType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitVoidType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveTypeContext extends Base_type_annotationContext {
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public PrimitiveTypeContext(Base_type_annotationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullTypeContext extends Base_type_annotationContext {
		public TerminalNode NULL() { return getToken(AngulerParser.NULL, 0); }
		public NullTypeContext(Base_type_annotationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterNullType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitNullType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitNullType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_type_annotationContext base_type_annotation() throws RecognitionException {
		Base_type_annotationContext _localctx = new Base_type_annotationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_base_type_annotation);
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new SimpleTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new PrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				primitive_type();
				}
				break;
			case 3:
				_localctx = new NullTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(NULL);
				}
				break;
			case 4:
				_localctx = new VoidTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				match(VOID);
				}
				break;
			case 5:
				_localctx = new StructuredTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(225);
				structured_type();
				}
				break;
			case 6:
				_localctx = new ArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(226);
				array_type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Primitive_typeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AngulerParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(AngulerParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(AngulerParser.BOOLEAN, 0); }
		public TerminalNode ANY() { return getToken(AngulerParser.ANY, 0); }
		public TerminalNode UNDEFINED() { return getToken(AngulerParser.UNDEFINED, 0); }
		public Primitive_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterPrimitive_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitPrimitive_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitPrimitive_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_typeContext primitive_type() throws RecognitionException {
		Primitive_typeContext _localctx = new Primitive_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primitive_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_la = _input.LA(1);
			if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 93L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Array_typeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(AngulerParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(AngulerParser.CLOSE_BRACKET, 0); }
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterArray_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitArray_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitArray_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(IDENTIFIER);
			setState(232);
			match(OPEN_BRACKET);
			setState(233);
			match(CLOSE_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Structured_typeContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngulerParser.OPEN_BRACE, 0); }
		public List<Type_pairContext> type_pair() {
			return getRuleContexts(Type_pairContext.class);
		}
		public Type_pairContext type_pair(int i) {
			return getRuleContext(Type_pairContext.class,i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(AngulerParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(AngulerParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AngulerParser.SEMICOLON, i);
		}
		public Structured_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structured_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterStructured_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitStructured_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitStructured_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Structured_typeContext structured_type() throws RecognitionException {
		Structured_typeContext _localctx = new Structured_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_structured_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(OPEN_BRACE);
			setState(236);
			type_pair();
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(237);
					match(SEMICOLON);
					setState(238);
					type_pair();
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(244);
				match(SEMICOLON);
				}
			}

			setState(247);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_pairContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public Base_type_annotationContext base_type_annotation() {
			return getRuleContext(Base_type_annotationContext.class,0);
		}
		public Type_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterType_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitType_pair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitType_pair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_pairContext type_pair() throws RecognitionException {
		Type_pairContext _localctx = new Type_pairContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(IDENTIFIER);
			setState(250);
			match(COLON);
			setState(251);
			base_type_annotation();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Property_declarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AngulerParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngulerParser.SEMICOLON, 0); }
		public TerminalNode PUBLIC() { return getToken(AngulerParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(AngulerParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(AngulerParser.PROTECTED, 0); }
		public TerminalNode OUTPUT() { return getToken(AngulerParser.OUTPUT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public Property_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterProperty_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitProperty_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitProperty_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_declarationContext property_declaration() throws RecognitionException {
		Property_declarationContext _localctx = new Property_declarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_property_declaration);
		int _la;
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIVATE:
			case PUBLIC:
			case PROTECTED:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 7L) != 0)) {
					{
					setState(253);
					_la = _input.LA(1);
					if ( !(((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 7L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(256);
				match(IDENTIFIER);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(257);
					match(COLON);
					setState(258);
					type_annotation();
					}
				}

				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(261);
					match(EQUAL);
					setState(262);
					expression();
					}
				}

				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(265);
					match(SEMICOLON);
					}
				}

				}
				break;
			case OUTPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(OUTPUT);
				setState(269);
				match(OPEN_PAREN);
				setState(270);
				match(CLOSE_PAREN);
				setState(271);
				match(IDENTIFIER);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(272);
					match(EQUAL);
					setState(273);
					expression();
					}
				}

				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(276);
					match(SEMICOLON);
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class Class_declarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(AngulerParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngulerParser.OPEN_BRACE, 0); }
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(AngulerParser.CLOSE_BRACE, 0); }
		public TerminalNode EXPORT() { return getToken(AngulerParser.EXPORT, 0); }
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterClass_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitClass_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitClass_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(281);
				match(EXPORT);
				}
			}

			setState(284);
			match(CLASS);
			setState(285);
			match(IDENTIFIER);
			setState(286);
			match(OPEN_BRACE);
			setState(287);
			class_body();
			setState(288);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Class_bodyContext extends ParserRuleContext {
		public List<Property_declarationContext> property_declaration() {
			return getRuleContexts(Property_declarationContext.class);
		}
		public Property_declarationContext property_declaration(int i) {
			return getRuleContext(Property_declarationContext.class,i);
		}
		public List<Method_declarationContext> method_declaration() {
			return getRuleContexts(Method_declarationContext.class);
		}
		public Method_declarationContext method_declaration(int i) {
			return getRuleContext(Method_declarationContext.class,i);
		}
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
		}
		public List<Class_declarationContext> class_declaration() {
			return getRuleContexts(Class_declarationContext.class);
		}
		public Class_declarationContext class_declaration(int i) {
			return getRuleContext(Class_declarationContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitClass_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288230376151711786L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 154543581107L) != 0)) {
				{
				setState(295);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(290);
					property_declaration();
					}
					break;
				case 2:
					{
					setState(291);
					method_declaration();
					}
					break;
				case 3:
					{
					setState(292);
					function_declaration();
					}
					break;
				case 4:
					{
					setState(293);
					class_declaration();
					}
					break;
				case 5:
					{
					setState(294);
					instruction();
					}
					break;
				}
				}
				setState(299);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Method_declarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public Method_bodyContext method_body() {
			return getRuleContext(Method_bodyContext.class,0);
		}
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterMethod_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitMethod_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitMethod_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(IDENTIFIER);
			setState(301);
			method_body();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Method_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngulerParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngulerParser.CLOSE_BRACE, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public Method_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterMethod_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitMethod_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitMethod_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_bodyContext method_body() throws RecognitionException {
		Method_bodyContext _localctx = new Method_bodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_method_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(OPEN_PAREN);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(304);
				parameter_list();
				}
			}

			setState(307);
			match(CLOSE_PAREN);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(308);
				match(COLON);
				setState(309);
				type_annotation();
				}
			}

			setState(312);
			match(OPEN_BRACE);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 153604057011L) != 0)) {
				{
				{
				setState(313);
				instruction();
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_declarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(IDENTIFIER);
			setState(322);
			function_body();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngulerParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngulerParser.CLOSE_BRACE, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(OPEN_PAREN);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(325);
				parameter_list();
				}
			}

			setState(328);
			match(CLOSE_PAREN);
			setState(329);
			match(OPEN_BRACE);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 153604057011L) != 0)) {
				{
				{
				setState(330);
				instruction();
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_listContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngulerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngulerParser.COMMA, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			parameter();
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(339);
				match(COMMA);
				setState(340);
				parameter();
				}
				}
				setState(345);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public Base_type_annotationContext base_type_annotation() {
			return getRuleContext(Base_type_annotationContext.class,0);
		}
		public Structured_typeContext structured_type() {
			return getRuleContext(Structured_typeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(IDENTIFIER);
			setState(347);
			match(COLON);
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(348);
				base_type_annotation();
				}
				break;
			case 2:
				{
				setState(349);
				structured_type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaraiton_keywordsContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(AngulerParser.CONST, 0); }
		public TerminalNode LET() { return getToken(AngulerParser.LET, 0); }
		public TerminalNode VAR() { return getToken(AngulerParser.VAR, 0); }
		public Declaraiton_keywordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraiton_keywords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterDeclaraiton_keywords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitDeclaraiton_keywords(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitDeclaraiton_keywords(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaraiton_keywordsContext declaraiton_keywords() throws RecognitionException {
		Declaraiton_keywordsContext _localctx = new Declaraiton_keywordsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declaraiton_keywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_la = _input.LA(1);
			if ( !(((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & 7L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_declarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngulerParser.SEMICOLON, 0); }
		public Declaraiton_keywordsContext declaraiton_keywords() {
			return getRuleContext(Declaraiton_keywordsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AngulerParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & 7L) != 0)) {
				{
				setState(354);
				declaraiton_keywords();
				}
			}

			setState(357);
			match(IDENTIFIER);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(358);
				match(COLON);
				setState(359);
				type_annotation();
				}
			}

			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(362);
				match(EQUAL);
				setState(363);
				expression();
				}
			}

			setState(366);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public TerminalNode NULL() { return getToken(AngulerParser.NULL, 0); }
		public Json_objectContext json_object() {
			return getRuleContext(Json_objectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(AngulerParser.BOOLEAN, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_primary);
		try {
			setState(376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
			case TEMPLATE_LITERAL:
			case DECIMAL_INTEGER_LITERAL:
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				literal_value();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				match(IDENTIFIER);
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				match(OPEN_PAREN);
				setState(371);
				match(CLOSE_PAREN);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(372);
				match(NULL);
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(373);
				json_object();
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 6);
				{
				setState(374);
				array();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 7);
				{
				setState(375);
				match(BOOLEAN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Postfix_expressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(AngulerParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngulerParser.DOT, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngulerParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngulerParser.IDENTIFIER, i);
		}
		public List<TerminalNode> OPEN_BRACKET() { return getTokens(AngulerParser.OPEN_BRACKET); }
		public TerminalNode OPEN_BRACKET(int i) {
			return getToken(AngulerParser.OPEN_BRACKET, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> CLOSE_BRACKET() { return getTokens(AngulerParser.CLOSE_BRACKET); }
		public TerminalNode CLOSE_BRACKET(int i) {
			return getToken(AngulerParser.CLOSE_BRACKET, i);
		}
		public List<TerminalNode> OPEN_PAREN() { return getTokens(AngulerParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(AngulerParser.OPEN_PAREN, i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(AngulerParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(AngulerParser.CLOSE_PAREN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngulerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngulerParser.COMMA, i);
		}
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterPostfix_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitPostfix_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitPostfix_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_postfix_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			primary();
			setState(399);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(397);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
						{
						{
						setState(379);
						match(DOT);
						setState(380);
						match(IDENTIFIER);
						}
						}
						break;
					case OPEN_BRACKET:
						{
						{
						setState(381);
						match(OPEN_BRACKET);
						setState(382);
						expression();
						setState(383);
						match(CLOSE_BRACKET);
						}
						}
						break;
					case OPEN_PAREN:
						{
						{
						setState(385);
						match(OPEN_PAREN);
						setState(394);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12907970602L) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 2342915L) != 0)) {
							{
							setState(386);
							expression();
							setState(391);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(387);
								match(COMMA);
								setState(388);
								expression();
								}
								}
								setState(393);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(396);
						match(CLOSE_PAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(401);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierValueContext extends ValueContext {
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public IdentifierValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterIdentifierValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitIdentifierValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitIdentifierValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectValueContext extends ValueContext {
		public Json_objectContext json_object() {
			return getRuleContext(Json_objectContext.class,0);
		}
		public ObjectValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterObjectValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitObjectValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitObjectValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayValueContext extends ValueContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterArrayValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitArrayValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitArrayValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedValueContext extends ValueContext {
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public ParenthesizedValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterParenthesizedValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitParenthesizedValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitParenthesizedValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullValueContext extends ValueContext {
		public TerminalNode NULL() { return getToken(AngulerParser.NULL, 0); }
		public NullValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterNullValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitNullValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitNullValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralValueContext extends ValueContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public LiteralValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterLiteralValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitLiteralValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitLiteralValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_value);
		try {
			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
			case TEMPLATE_LITERAL:
			case DECIMAL_INTEGER_LITERAL:
			case FLOAT_LITERAL:
				_localctx = new LiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				literal_value();
				}
				break;
			case IDENTIFIER:
				_localctx = new IdentifierValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				match(IDENTIFIER);
				}
				break;
			case NULL:
				_localctx = new NullValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(404);
				match(NULL);
				}
				break;
			case OPEN_BRACE:
				_localctx = new ObjectValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(405);
				json_object();
				}
				break;
			case OPEN_BRACKET:
				_localctx = new ArrayValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(406);
				array();
				}
				break;
			case OPEN_PAREN:
				_localctx = new ParenthesizedValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(407);
				match(OPEN_PAREN);
				setState(408);
				expression();
				setState(409);
				match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AngulerParser.EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngulerParser.SEMICOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public List<TerminalNode> DOLLAR() { return getTokens(AngulerParser.DOLLAR); }
		public TerminalNode DOLLAR(int i) {
			return getToken(AngulerParser.DOLLAR, i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assignment);
		int _la;
		try {
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				postfix_expression();
				setState(414);
				match(EQUAL);
				setState(415);
				value();
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(416);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(IDENTIFIER);
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOLLAR) {
					{
					setState(420);
					match(DOLLAR);
					}
				}

				setState(423);
				match(EQUAL);
				setState(424);
				value();
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOLLAR) {
					{
					setState(425);
					match(DOLLAR);
					}
				}

				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(428);
					match(SEMICOLON);
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode DECIMAL_INTEGER_LITERAL() { return getToken(AngulerParser.DECIMAL_INTEGER_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(AngulerParser.FLOAT_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngulerParser.STRING_LITERAL, 0); }
		public TerminalNode TEMPLATE_LITERAL() { return getToken(AngulerParser.TEMPLATE_LITERAL, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_la = _input.LA(1);
			if ( !(((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & 71L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Arithmetic_expressionContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode MUL() { return getToken(AngulerParser.MUL, 0); }
		public TerminalNode SLASH() { return getToken(AngulerParser.SLASH, 0); }
		public TerminalNode MOD() { return getToken(AngulerParser.MOD, 0); }
		public TerminalNode SUM() { return getToken(AngulerParser.SUM, 0); }
		public TerminalNode MIN() { return getToken(AngulerParser.MIN, 0); }
		public Arithmetic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterArithmetic_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitArithmetic_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitArithmetic_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_expressionContext arithmetic_expression() throws RecognitionException {
		Arithmetic_expressionContext _localctx = new Arithmetic_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arithmetic_expression);
		int _la;
		try {
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				value();
				setState(436);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 53687091200L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(437);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				value();
				setState(440);
				_la = _input.LA(1);
				if ( !(_la==SUM || _la==MIN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(441);
				value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Unary_expressionContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SUM() { return getToken(AngulerParser.SUM, 0); }
		public TerminalNode MIN() { return getToken(AngulerParser.MIN, 0); }
		public TerminalNode INCREMENT() { return getToken(AngulerParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(AngulerParser.DECREMENT, 0); }
		public TerminalNode NOT() { return getToken(AngulerParser.NOT, 0); }
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitUnary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_unary_expression);
		int _la;
		try {
			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUM:
			case MIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				_la = _input.LA(1);
				if ( !(_la==SUM || _la==MIN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(446);
				value();
				}
				break;
			case INCREMENT:
			case DECREMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				_la = _input.LA(1);
				if ( !(_la==INCREMENT || _la==DECREMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(448);
				value();
				}
				break;
			case OPEN_BRACE:
			case OPEN_PAREN:
			case OPEN_BRACKET:
			case NULL:
			case IDENTIFIER:
			case STRING_LITERAL:
			case TEMPLATE_LITERAL:
			case DECIMAL_INTEGER_LITERAL:
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(449);
				value();
				setState(450);
				_la = _input.LA(1);
				if ( !(_la==INCREMENT || _la==DECREMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(452);
				match(NOT);
				setState(453);
				value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Relational_expressionContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode OPENTAG() { return getToken(AngulerParser.OPENTAG, 0); }
		public TerminalNode CLOSETAG() { return getToken(AngulerParser.CLOSETAG, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(AngulerParser.LESS_EQUAL, 0); }
		public TerminalNode GRETER_EQUAL() { return getToken(AngulerParser.GRETER_EQUAL, 0); }
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitRelational_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitRelational_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			value();
			setState(457);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1006632960L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(458);
			value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Equality_expressionContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode IS_EQUAL() { return getToken(AngulerParser.IS_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(AngulerParser.NOT_EQUAL, 0); }
		public TerminalNode IS_EQUAL_TYPE() { return getToken(AngulerParser.IS_EQUAL_TYPE, 0); }
		public TerminalNode NOT_EQUAL_TYPE() { return getToken(AngulerParser.NOT_EQUAL_TYPE, 0); }
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitEquality_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitEquality_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			value();
			setState(461);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 122880L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(462);
			value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_expressionContext extends ParserRuleContext {
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(AngulerParser.AND, 0); }
		public TerminalNode OR() { return getToken(AngulerParser.OR, 0); }
		public Logical_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterLogical_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitLogical_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitLogical_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_expressionContext logical_expression() throws RecognitionException {
		return logical_expression(0);
	}

	private Logical_expressionContext logical_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_expressionContext _localctx = new Logical_expressionContext(_ctx, _parentState);
		Logical_expressionContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_logical_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(465);
			equality_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(472);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logical_expression);
					setState(467);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(468);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(469);
					equality_expression();
					}
					} 
				}
				setState(474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Conditional_expressionContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(AngulerParser.QUESTION, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterConditional_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitConditional_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitConditional_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_conditional_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			value();
			setState(476);
			match(QUESTION);
			setState(477);
			expression();
			setState(478);
			match(COLON);
			setState(479);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expression);
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				conditional_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				logical_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(483);
				postfix_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(484);
				relational_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(485);
				equality_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(486);
				arithmetic_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(487);
				unary_expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Json_objectContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngulerParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngulerParser.CLOSE_BRACE, 0); }
		public List<Json_pairContext> json_pair() {
			return getRuleContexts(Json_pairContext.class);
		}
		public Json_pairContext json_pair(int i) {
			return getRuleContext(Json_pairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngulerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngulerParser.COMMA, i);
		}
		public Json_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterJson_object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitJson_object(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitJson_object(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_objectContext json_object() throws RecognitionException {
		Json_objectContext _localctx = new Json_objectContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_json_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(OPEN_BRACE);
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				setState(491);
				json_pair();
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(492);
					match(COMMA);
					setState(493);
					json_pair();
					}
					}
					setState(498);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(501);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Json_pairContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngulerParser.STRING_LITERAL, 0); }
		public Json_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterJson_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitJson_pair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitJson_pair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_pairContext json_pair() throws RecognitionException {
		Json_pairContext _localctx = new Json_pairContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_json_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(504);
			match(COLON);
			setState(505);
			value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Imports_arrayContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(AngulerParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(AngulerParser.CLOSE_BRACKET, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngulerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngulerParser.COMMA, i);
		}
		public Imports_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterImports_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitImports_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitImports_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Imports_arrayContext imports_array() throws RecognitionException {
		Imports_arrayContext _localctx = new Imports_arrayContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_imports_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(OPEN_BRACKET);
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42L) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 1171457L) != 0)) {
				{
				setState(508);
				value();
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(509);
					match(COMMA);
					setState(510);
					value();
					}
					}
					setState(515);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(518);
			match(CLOSE_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(AngulerParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(AngulerParser.CLOSE_BRACKET, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngulerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngulerParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(OPEN_BRACKET);
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42L) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 1171457L) != 0)) {
				{
				setState(521);
				value();
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(522);
					match(COMMA);
					setState(523);
					value();
					}
					}
					setState(528);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(531);
			match(CLOSE_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationStatementContext extends InstructionContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public DeclarationStatementContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalStatementContext extends InstructionContext {
		public Conditional_statementsContext conditional_statements() {
			return getRuleContext(Conditional_statementsContext.class,0);
		}
		public ConditionalStatementContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitConditionalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitConditionalStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportStatementContext extends InstructionContext {
		public TerminalNode EXPORT() { return getToken(AngulerParser.EXPORT, 0); }
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public ExportStatementContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterExportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitExportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitExportStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclarationContext extends InstructionContext {
		public Interface_DeclarationContext interface_Declaration() {
			return getRuleContext(Interface_DeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends InstructionContext {
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public MethodDeclarationContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends InstructionContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentStatementContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Conditional_statementsInsContext extends InstructionContext {
		public Conditional_statementsContext conditional_statements() {
			return getRuleContext(Conditional_statementsContext.class,0);
		}
		public Conditional_statementsInsContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterConditional_statementsIns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitConditional_statementsIns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitConditional_statementsIns(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends InstructionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngulerParser.SEMICOLON, 0); }
		public ExpressionStatementContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GenericTypeContext extends InstructionContext {
		public Generic_TypeContext generic_Type() {
			return getRuleContext(Generic_TypeContext.class,0);
		}
		public GenericTypeContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterGenericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitGenericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitGenericType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends InstructionContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public FunctionDeclarationContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends InstructionContext {
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public ClassDeclarationContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_instruction);
		int _la;
		try {
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				postfix_expression();
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(534);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 2:
				_localctx = new DeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				variable_declaration();
				}
				break;
			case 3:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(538);
				assignment();
				}
				break;
			case 4:
				_localctx = new ClassDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(539);
				class_declaration();
				}
				break;
			case 5:
				_localctx = new FunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(540);
				function_declaration();
				}
				break;
			case 6:
				_localctx = new ExportStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(541);
				match(EXPORT);
				setState(542);
				variable_declaration();
				}
				break;
			case 7:
				_localctx = new ConditionalStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(543);
				conditional_statements();
				}
				break;
			case 8:
				_localctx = new InterfaceDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(544);
				interface_Declaration();
				}
				break;
			case 9:
				_localctx = new GenericTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(545);
				generic_Type();
				}
				break;
			case 10:
				_localctx = new MethodDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(546);
				method_declaration();
				}
				break;
			case 11:
				_localctx = new Conditional_statementsInsContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(547);
				conditional_statements();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Conditional_statementsContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Continue_StatementContext continue_Statement() {
			return getRuleContext(Continue_StatementContext.class,0);
		}
		public Return_StatementContext return_Statement() {
			return getRuleContext(Return_StatementContext.class,0);
		}
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public Conditional_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterConditional_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitConditional_statements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitConditional_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_statementsContext conditional_statements() throws RecognitionException {
		Conditional_statementsContext _localctx = new Conditional_statementsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_conditional_statements);
		try {
			setState(558);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				if_statement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
				switch_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(552);
				while_statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(553);
				do_while_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(554);
				for_statement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(555);
				continue_Statement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 7);
				{
				setState(556);
				return_Statement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 8);
				{
				setState(557);
				break_statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngulerParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngulerParser.CLOSE_BRACE, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(OPEN_BRACE);
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 153604057011L) != 0)) {
				{
				{
				setState(561);
				instruction();
				}
				}
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(567);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AngulerParser.IF, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(AngulerParser.ELSE, 0); }
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(IF);
			setState(570);
			match(OPEN_PAREN);
			setState(571);
			expression();
			setState(572);
			match(CLOSE_PAREN);
			setState(573);
			block();
			setState(578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(574);
				match(ELSE);
				setState(575);
				if_statement();
				}
				break;
			case 2:
				{
				setState(576);
				match(ELSE);
				setState(577);
				block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(AngulerParser.FOR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(AngulerParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AngulerParser.SEMICOLON, i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(FOR);
			setState(581);
			match(OPEN_PAREN);
			setState(585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(582);
				variable_declaration();
				}
				break;
			case 2:
				{
				setState(583);
				expressionSequence();
				}
				break;
			case 3:
				{
				setState(584);
				match(SEMICOLON);
				}
				break;
			}
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42L) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 1171457L) != 0)) {
				{
				setState(587);
				expressionSequence();
				}
			}

			setState(590);
			match(SEMICOLON);
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42L) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 1171457L) != 0)) {
				{
				setState(591);
				expressionSequence();
				}
			}

			setState(594);
			match(CLOSE_PAREN);
			setState(595);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_statementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(AngulerParser.SWITCH, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngulerParser.OPEN_BRACE, 0); }
		public Switch_bodyContext switch_body() {
			return getRuleContext(Switch_bodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(AngulerParser.CLOSE_BRACE, 0); }
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitSwitch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitSwitch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_switch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(SWITCH);
			setState(598);
			match(OPEN_PAREN);
			setState(599);
			value();
			setState(600);
			match(CLOSE_PAREN);
			setState(601);
			match(OPEN_BRACE);
			setState(602);
			switch_body();
			setState(603);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_bodyContext extends ParserRuleContext {
		public List<Switch_caseContext> switch_case() {
			return getRuleContexts(Switch_caseContext.class);
		}
		public Switch_caseContext switch_case(int i) {
			return getRuleContext(Switch_caseContext.class,i);
		}
		public List<Switch_defaultContext> switch_default() {
			return getRuleContexts(Switch_defaultContext.class);
		}
		public Switch_defaultContext switch_default(int i) {
			return getRuleContext(Switch_defaultContext.class,i);
		}
		public Switch_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterSwitch_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitSwitch_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitSwitch_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_bodyContext switch_body() throws RecognitionException {
		Switch_bodyContext _localctx = new Switch_bodyContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_switch_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				setState(607);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CASE:
					{
					setState(605);
					switch_case();
					}
					break;
				case DEFAULT:
					{
					setState(606);
					switch_default();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(611);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_caseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(AngulerParser.CASE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public Switch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterSwitch_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitSwitch_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitSwitch_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_caseContext switch_case() throws RecognitionException {
		Switch_caseContext _localctx = new Switch_caseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_switch_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(CASE);
			setState(613);
			value();
			setState(614);
			match(COLON);
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 153604057011L) != 0)) {
				{
				{
				setState(615);
				instruction();
				}
				}
				setState(620);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_defaultContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(AngulerParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public Switch_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterSwitch_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitSwitch_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitSwitch_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_defaultContext switch_default() throws RecognitionException {
		Switch_defaultContext _localctx = new Switch_defaultContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_switch_default);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(DEFAULT);
			setState(622);
			match(COLON);
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 153604057011L) != 0)) {
				{
				{
				setState(623);
				instruction();
				}
				}
				setState(628);
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

	@SuppressWarnings("CheckReturnValue")
	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AngulerParser.WHILE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			match(WHILE);
			setState(630);
			match(OPEN_PAREN);
			setState(631);
			value();
			setState(632);
			match(CLOSE_PAREN);
			setState(633);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Do_while_statementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(AngulerParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(AngulerParser.WHILE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngulerParser.SEMICOLON, 0); }
		public Do_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterDo_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitDo_while_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitDo_while_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(DO);
			setState(636);
			block();
			setState(637);
			match(WHILE);
			setState(638);
			match(OPEN_PAREN);
			setState(639);
			value();
			setState(640);
			match(CLOSE_PAREN);
			setState(641);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Continue_StatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(AngulerParser.CONTINUE, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public Continue_StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_Statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterContinue_Statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitContinue_Statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitContinue_Statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_StatementContext continue_Statement() throws RecognitionException {
		Continue_StatementContext _localctx = new Continue_StatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_continue_Statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(CONTINUE);
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(644);
				match(IDENTIFIER);
				}
			}

			setState(647);
			eos();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Return_StatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(AngulerParser.RETURN, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public Return_StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_Statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterReturn_Statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitReturn_Statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitReturn_Statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_StatementContext return_Statement() throws RecognitionException {
		Return_StatementContext _localctx = new Return_StatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_return_Statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(RETURN);
			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(650);
				expressionSequence();
				}
				break;
			}
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EOF || _la==SEMICOLON) {
				{
				setState(653);
				eos();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Break_statementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(AngulerParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngulerParser.SEMICOLON, 0); }
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterBreak_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitBreak_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitBreak_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(BREAK);
			setState(657);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionSequenceContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngulerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngulerParser.COMMA, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public ExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterExpressionSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitExpressionSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitExpressionSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionSequenceContext expressionSequence() throws RecognitionException {
		ExpressionSequenceContext _localctx = new ExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_expressionSequence);
		int _la;
		try {
			setState(668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				value();
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(660);
					match(COMMA);
					setState(661);
					value();
					}
					}
					setState(666);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(667);
				match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Interface_DeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(AngulerParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public Structured_typeContext structured_type() {
			return getRuleContext(Structured_typeContext.class,0);
		}
		public Interface_DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_Declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterInterface_Declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitInterface_Declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitInterface_Declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_DeclarationContext interface_Declaration() throws RecognitionException {
		Interface_DeclarationContext _localctx = new Interface_DeclarationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_interface_Declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(INTERFACE);
			setState(671);
			match(IDENTIFIER);
			setState(672);
			structured_type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Generic_TypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public TerminalNode OPENTAG() { return getToken(AngulerParser.OPENTAG, 0); }
		public List<Type_annotationContext> type_annotation() {
			return getRuleContexts(Type_annotationContext.class);
		}
		public Type_annotationContext type_annotation(int i) {
			return getRuleContext(Type_annotationContext.class,i);
		}
		public TerminalNode CLOSETAG() { return getToken(AngulerParser.CLOSETAG, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngulerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngulerParser.COMMA, i);
		}
		public Generic_TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_Type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterGeneric_Type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitGeneric_Type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitGeneric_Type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_TypeContext generic_Type() throws RecognitionException {
		Generic_TypeContext _localctx = new Generic_TypeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_generic_Type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(IDENTIFIER);
			setState(675);
			match(OPENTAG);
			setState(676);
			type_annotation();
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(677);
				match(COMMA);
				setState(678);
				type_annotation();
				}
				}
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(684);
			match(CLOSETAG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EosContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(AngulerParser.SEMICOLON, 0); }
		public TerminalNode EOF() { return getToken(AngulerParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_eos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==SEMICOLON) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Html_valueContext extends ParserRuleContext {
		public Html_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_value; }
	 
		public Html_valueContext() { }
		public void copyFrom(Html_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgContentContext extends Html_valueContext {
		public Ng_contentContext ng_content() {
			return getRuleContext(Ng_contentContext.class,0);
		}
		public NgContentContext(Html_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterNgContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitNgContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitNgContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingTagContext extends Html_valueContext {
		public Single_tagContext single_tag() {
			return getRuleContext(Single_tagContext.class,0);
		}
		public SelfClosingTagContext(Html_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterSelfClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitSelfClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitSelfClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestedHtmlContext extends Html_valueContext {
		public Open_tagContext open_tag() {
			return getRuleContext(Open_tagContext.class,0);
		}
		public List<Html_valueContext> html_value() {
			return getRuleContexts(Html_valueContext.class);
		}
		public Html_valueContext html_value(int i) {
			return getRuleContext(Html_valueContext.class,i);
		}
		public Close_tagContext close_tag() {
			return getRuleContext(Close_tagContext.class,0);
		}
		public NestedHtmlContext(Html_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterNestedHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitNestedHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitNestedHtml(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateVariableContext extends Html_valueContext {
		public Template_variableContext template_variable() {
			return getRuleContext(Template_variableContext.class,0);
		}
		public TemplateVariableContext(Html_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterTemplateVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitTemplateVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitTemplateVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgTemplateContext extends Html_valueContext {
		public Ng_templateContext ng_template() {
			return getRuleContext(Ng_templateContext.class,0);
		}
		public NgTemplateContext(Html_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterNgTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitNgTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitNgTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_valueContext html_value() throws RecognitionException {
		Html_valueContext _localctx = new Html_valueContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_html_value);
		try {
			int _alt;
			setState(702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				_localctx = new NestedHtmlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(688);
				open_tag();
				setState(692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(689);
						html_value();
						}
						} 
					}
					setState(694);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				}
				setState(696);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(695);
					close_tag();
					}
					break;
				}
				}
				}
				break;
			case 2:
				_localctx = new SelfClosingTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(698);
				single_tag();
				}
				break;
			case 3:
				_localctx = new TemplateVariableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(699);
				template_variable();
				}
				break;
			case 4:
				_localctx = new NgContentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(700);
				ng_content();
				}
				break;
			case 5:
				_localctx = new NgTemplateContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(701);
				ng_template();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TagsContext extends ParserRuleContext {
		public TerminalNode DIV_TAG() { return getToken(AngulerParser.DIV_TAG, 0); }
		public TerminalNode H1_TAG() { return getToken(AngulerParser.H1_TAG, 0); }
		public TerminalNode H2_TAG() { return getToken(AngulerParser.H2_TAG, 0); }
		public TerminalNode H3_TAG() { return getToken(AngulerParser.H3_TAG, 0); }
		public TerminalNode P_TAG() { return getToken(AngulerParser.P_TAG, 0); }
		public TerminalNode IMG_TAG() { return getToken(AngulerParser.IMG_TAG, 0); }
		public TerminalNode A_TAG() { return getToken(AngulerParser.A_TAG, 0); }
		public TerminalNode SPAN_TAG() { return getToken(AngulerParser.SPAN_TAG, 0); }
		public TerminalNode BUTTON_TAG() { return getToken(AngulerParser.BUTTON_TAG, 0); }
		public TagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterTags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitTags(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitTags(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagsContext tags() throws RecognitionException {
		TagsContext _localctx = new TagsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_tags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			_la = _input.LA(1);
			if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 511L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Open_tagContext extends ParserRuleContext {
		public TerminalNode CLOSETAG() { return getToken(AngulerParser.CLOSETAG, 0); }
		public TerminalNode OPENTAG() { return getToken(AngulerParser.OPENTAG, 0); }
		public TagsContext tags() {
			return getRuleContext(TagsContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public List<Html_attributeContext> html_attribute() {
			return getRuleContexts(Html_attributeContext.class);
		}
		public Html_attributeContext html_attribute(int i) {
			return getRuleContext(Html_attributeContext.class,i);
		}
		public Open_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterOpen_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitOpen_tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitOpen_tag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Open_tagContext open_tag() throws RecognitionException {
		Open_tagContext _localctx = new Open_tagContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_open_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(706);
			match(OPENTAG);
			}
			setState(709);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIV_TAG:
			case H1_TAG:
			case H2_TAG:
			case H3_TAG:
			case P_TAG:
			case IMG_TAG:
			case A_TAG:
			case SPAN_TAG:
			case BUTTON_TAG:
				{
				setState(707);
				tags();
				}
				break;
			case IDENTIFIER:
				{
				setState(708);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL) {
				{
				{
				setState(711);
				html_attribute();
				}
				}
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(717);
			match(CLOSETAG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttrsContext extends ParserRuleContext {
		public TerminalNode STYLE_ATTR() { return getToken(AngulerParser.STYLE_ATTR, 0); }
		public TerminalNode ALT_ATTR() { return getToken(AngulerParser.ALT_ATTR, 0); }
		public TerminalNode SRC_ATTR() { return getToken(AngulerParser.SRC_ATTR, 0); }
		public TerminalNode HREF_ATTR() { return getToken(AngulerParser.HREF_ATTR, 0); }
		public AttrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterAttrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitAttrs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitAttrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrsContext attrs() throws RecognitionException {
		AttrsContext _localctx = new AttrsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_attrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 15L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Html_attributeContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(AngulerParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Html_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterHtml_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitHtml_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitHtml_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_attributeContext html_attribute() throws RecognitionException {
		Html_attributeContext _localctx = new Html_attributeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_html_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			match(EQUAL);
			setState(722);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Close_tagContext extends ParserRuleContext {
		public TerminalNode SLASH() { return getToken(AngulerParser.SLASH, 0); }
		public TerminalNode CLOSETAG() { return getToken(AngulerParser.CLOSETAG, 0); }
		public TerminalNode OPENTAG() { return getToken(AngulerParser.OPENTAG, 0); }
		public TagsContext tags() {
			return getRuleContext(TagsContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public Close_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterClose_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitClose_tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitClose_tag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Close_tagContext close_tag() throws RecognitionException {
		Close_tagContext _localctx = new Close_tagContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_close_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(724);
			match(OPENTAG);
			}
			setState(725);
			match(SLASH);
			setState(728);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIV_TAG:
			case H1_TAG:
			case H2_TAG:
			case H3_TAG:
			case P_TAG:
			case IMG_TAG:
			case A_TAG:
			case SPAN_TAG:
			case BUTTON_TAG:
				{
				setState(726);
				tags();
				}
				break;
			case IDENTIFIER:
				{
				setState(727);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(730);
			match(CLOSETAG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Single_tagContext extends ParserRuleContext {
		public TerminalNode SLASH() { return getToken(AngulerParser.SLASH, 0); }
		public TerminalNode CLOSETAG() { return getToken(AngulerParser.CLOSETAG, 0); }
		public TerminalNode OPENTAG() { return getToken(AngulerParser.OPENTAG, 0); }
		public TagsContext tags() {
			return getRuleContext(TagsContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public List<Html_attributeContext> html_attribute() {
			return getRuleContexts(Html_attributeContext.class);
		}
		public Html_attributeContext html_attribute(int i) {
			return getRuleContext(Html_attributeContext.class,i);
		}
		public Single_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterSingle_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitSingle_tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitSingle_tag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_tagContext single_tag() throws RecognitionException {
		Single_tagContext _localctx = new Single_tagContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_single_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(732);
			match(OPENTAG);
			}
			setState(735);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIV_TAG:
			case H1_TAG:
			case H2_TAG:
			case H3_TAG:
			case P_TAG:
			case IMG_TAG:
			case A_TAG:
			case SPAN_TAG:
			case BUTTON_TAG:
				{
				setState(733);
				tags();
				}
				break;
			case IDENTIFIER:
				{
				setState(734);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL) {
				{
				{
				setState(737);
				html_attribute();
				}
				}
				setState(742);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(743);
			match(SLASH);
			setState(744);
			match(CLOSETAG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Template_variableContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(AngulerParser.HASH, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public Template_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterTemplate_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitTemplate_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitTemplate_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_variableContext template_variable() throws RecognitionException {
		Template_variableContext _localctx = new Template_variableContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_template_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			match(HASH);
			setState(747);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ng_contentContext extends ParserRuleContext {
		public TerminalNode OPENTAG() { return getToken(AngulerParser.OPENTAG, 0); }
		public TerminalNode NG_CONTENT() { return getToken(AngulerParser.NG_CONTENT, 0); }
		public TerminalNode CLOSETAG() { return getToken(AngulerParser.CLOSETAG, 0); }
		public List<Html_attributeContext> html_attribute() {
			return getRuleContexts(Html_attributeContext.class);
		}
		public Html_attributeContext html_attribute(int i) {
			return getRuleContext(Html_attributeContext.class,i);
		}
		public Ng_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterNg_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitNg_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitNg_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_contentContext ng_content() throws RecognitionException {
		Ng_contentContext _localctx = new Ng_contentContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_ng_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(OPENTAG);
			setState(750);
			match(NG_CONTENT);
			setState(754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL) {
				{
				{
				setState(751);
				html_attribute();
				}
				}
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(757);
			match(CLOSETAG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ng_templateContext extends ParserRuleContext {
		public Ng_templateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_template; }
	 
		public Ng_templateContext() { }
		public void copyFrom(Ng_templateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgTemplateSelfClosingContext extends Ng_templateContext {
		public TerminalNode OPENTAG() { return getToken(AngulerParser.OPENTAG, 0); }
		public TerminalNode NG_TEMPLATE() { return getToken(AngulerParser.NG_TEMPLATE, 0); }
		public TerminalNode SLASH() { return getToken(AngulerParser.SLASH, 0); }
		public TerminalNode CLOSETAG() { return getToken(AngulerParser.CLOSETAG, 0); }
		public List<Html_attributeContext> html_attribute() {
			return getRuleContexts(Html_attributeContext.class);
		}
		public Html_attributeContext html_attribute(int i) {
			return getRuleContext(Html_attributeContext.class,i);
		}
		public NgTemplateSelfClosingContext(Ng_templateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterNgTemplateSelfClosing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitNgTemplateSelfClosing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitNgTemplateSelfClosing(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgTemplateWithContentContext extends Ng_templateContext {
		public List<TerminalNode> OPENTAG() { return getTokens(AngulerParser.OPENTAG); }
		public TerminalNode OPENTAG(int i) {
			return getToken(AngulerParser.OPENTAG, i);
		}
		public List<TerminalNode> NG_TEMPLATE() { return getTokens(AngulerParser.NG_TEMPLATE); }
		public TerminalNode NG_TEMPLATE(int i) {
			return getToken(AngulerParser.NG_TEMPLATE, i);
		}
		public List<TerminalNode> CLOSETAG() { return getTokens(AngulerParser.CLOSETAG); }
		public TerminalNode CLOSETAG(int i) {
			return getToken(AngulerParser.CLOSETAG, i);
		}
		public TerminalNode SLASH() { return getToken(AngulerParser.SLASH, 0); }
		public List<Html_attributeContext> html_attribute() {
			return getRuleContexts(Html_attributeContext.class);
		}
		public Html_attributeContext html_attribute(int i) {
			return getRuleContext(Html_attributeContext.class,i);
		}
		public List<Html_valueContext> html_value() {
			return getRuleContexts(Html_valueContext.class);
		}
		public Html_valueContext html_value(int i) {
			return getRuleContext(Html_valueContext.class,i);
		}
		public NgTemplateWithContentContext(Ng_templateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterNgTemplateWithContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitNgTemplateWithContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitNgTemplateWithContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_templateContext ng_template() throws RecognitionException {
		Ng_templateContext _localctx = new Ng_templateContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_ng_template);
		int _la;
		try {
			int _alt;
			setState(788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				_localctx = new NgTemplateWithContentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(759);
				match(OPENTAG);
				setState(760);
				match(NG_TEMPLATE);
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EQUAL) {
					{
					{
					setState(761);
					html_attribute();
					}
					}
					setState(766);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(767);
				match(CLOSETAG);
				setState(771);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(768);
						html_value();
						}
						} 
					}
					setState(773);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				}
				setState(774);
				match(OPENTAG);
				setState(775);
				match(SLASH);
				setState(776);
				match(NG_TEMPLATE);
				setState(777);
				match(CLOSETAG);
				}
				break;
			case 2:
				_localctx = new NgTemplateSelfClosingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(778);
				match(OPENTAG);
				setState(779);
				match(NG_TEMPLATE);
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EQUAL) {
					{
					{
					setState(780);
					html_attribute();
					}
					}
					setState(785);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(786);
				match(SLASH);
				setState(787);
				match(CLOSETAG);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 31:
			return logical_expression_sempred((Logical_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logical_expression_sempred(Logical_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001{\u0317\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0001\u0000\u0005\u0000\u0086\b\u0000\n\u0000\f\u0000\u0089\t"+
		"\u0000\u0001\u0000\u0005\u0000\u008c\b\u0000\n\u0000\f\u0000\u008f\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0094\b\u0000\n\u0000"+
		"\f\u0000\u0097\t\u0000\u0001\u0000\u0003\u0000\u009a\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u00a1\b\u0001"+
		"\n\u0001\f\u0001\u00a4\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003\u00b5\b\u0003\n\u0003\f\u0003\u00b8\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u00cf\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u00d4\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u00d9\b\u0005\n\u0005\f\u0005\u00dc\t\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00e4\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u00f0\b\t\n\t\f\t\u00f3\t\t\u0001\t\u0003\t\u00f6\b"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0003\u000b"+
		"\u00ff\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0104\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0108\b\u000b\u0001\u000b\u0003"+
		"\u000b\u010b\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0113\b\u000b\u0001\u000b\u0003\u000b\u0116"+
		"\b\u000b\u0003\u000b\u0118\b\u000b\u0001\f\u0003\f\u011b\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u0128\b\r\n\r\f\r\u012b\t\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u0132\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u0137\b\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u013b\b\u000f\n\u000f\f\u000f\u013e\t\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u0147"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u014c\b\u0011"+
		"\n\u0011\f\u0011\u014f\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u0156\b\u0012\n\u0012\f\u0012\u0159\t\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u015f\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0003\u0015\u0164\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u0169\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u016d\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u0179\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u0186\b\u0017\n\u0017\f\u0017\u0189\t\u0017\u0003"+
		"\u0017\u018b\b\u0017\u0001\u0017\u0005\u0017\u018e\b\u0017\n\u0017\f\u0017"+
		"\u0191\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u019c\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01a2\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u01a6\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u01ab\b\u0019\u0001\u0019\u0003\u0019\u01ae\b"+
		"\u0019\u0003\u0019\u01b0\b\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u01bc\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u01c7\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01d7\b\u001f\n"+
		"\u001f\f\u001f\u01da\t\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u01e9\b!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0005\"\u01ef\b\"\n\"\f\"\u01f2\t\"\u0003\""+
		"\u01f4\b\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001"+
		"$\u0001$\u0005$\u0200\b$\n$\f$\u0203\t$\u0003$\u0205\b$\u0001$\u0001$"+
		"\u0001%\u0001%\u0001%\u0001%\u0005%\u020d\b%\n%\f%\u0210\t%\u0003%\u0212"+
		"\b%\u0001%\u0001%\u0001&\u0001&\u0003&\u0218\b&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u0225\b&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u022f"+
		"\b\'\u0001(\u0001(\u0005(\u0233\b(\n(\f(\u0236\t(\u0001(\u0001(\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u0243"+
		"\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u024a\b*\u0001*\u0003*\u024d"+
		"\b*\u0001*\u0001*\u0003*\u0251\b*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0005,\u0260\b,\n,"+
		"\f,\u0263\t,\u0001-\u0001-\u0001-\u0001-\u0005-\u0269\b-\n-\f-\u026c\t"+
		"-\u0001.\u0001.\u0001.\u0005.\u0271\b.\n.\f.\u0274\t.\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00011\u00011\u00031\u0286\b1\u00011\u00011\u00012\u00012\u0003"+
		"2\u028c\b2\u00012\u00032\u028f\b2\u00013\u00013\u00013\u00014\u00014\u0001"+
		"4\u00054\u0297\b4\n4\f4\u029a\t4\u00014\u00034\u029d\b4\u00015\u00015"+
		"\u00015\u00015\u00016\u00016\u00016\u00016\u00016\u00056\u02a8\b6\n6\f"+
		"6\u02ab\t6\u00016\u00016\u00017\u00017\u00018\u00018\u00058\u02b3\b8\n"+
		"8\f8\u02b6\t8\u00018\u00038\u02b9\b8\u00018\u00018\u00018\u00018\u0003"+
		"8\u02bf\b8\u00019\u00019\u0001:\u0001:\u0001:\u0003:\u02c6\b:\u0001:\u0005"+
		":\u02c9\b:\n:\f:\u02cc\t:\u0001:\u0001:\u0001;\u0001;\u0001<\u0001<\u0001"+
		"<\u0001=\u0001=\u0001=\u0001=\u0003=\u02d9\b=\u0001=\u0001=\u0001>\u0001"+
		">\u0001>\u0003>\u02e0\b>\u0001>\u0005>\u02e3\b>\n>\f>\u02e6\t>\u0001>"+
		"\u0001>\u0001>\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0005@\u02f1"+
		"\b@\n@\f@\u02f4\t@\u0001@\u0001@\u0001A\u0001A\u0001A\u0005A\u02fb\bA"+
		"\nA\fA\u02fe\tA\u0001A\u0001A\u0005A\u0302\bA\nA\fA\u0305\tA\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0005A\u030e\bA\nA\fA\u0311\tA\u0001"+
		"A\u0001A\u0003A\u0315\bA\u0001A\u0000\u0001>B\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0000\u000e\u0003"+
		"\u0000ccegii\u0001\u0000np\u0001\u0000jl\u0002\u0000rtxx\u0002\u0000\u001f"+
		"\u001f\"#\u0001\u0000 !\u0001\u0000\u0015\u0016\u0001\u0000\u001a\u001d"+
		"\u0001\u0000\r\u0010\u0001\u0000%&\u0001\u0000qr\u0001\u0001\b\b\u0001"+
		"\u0000IQ\u0001\u0000EH\u035a\u0000\u0099\u0001\u0000\u0000\u0000\u0002"+
		"\u009b\u0001\u0000\u0000\u0000\u0004\u00aa\u0001\u0000\u0000\u0000\u0006"+
		"\u00b0\u0001\u0000\u0000\u0000\b\u00d3\u0001\u0000\u0000\u0000\n\u00d5"+
		"\u0001\u0000\u0000\u0000\f\u00e3\u0001\u0000\u0000\u0000\u000e\u00e5\u0001"+
		"\u0000\u0000\u0000\u0010\u00e7\u0001\u0000\u0000\u0000\u0012\u00eb\u0001"+
		"\u0000\u0000\u0000\u0014\u00f9\u0001\u0000\u0000\u0000\u0016\u0117\u0001"+
		"\u0000\u0000\u0000\u0018\u011a\u0001\u0000\u0000\u0000\u001a\u0129\u0001"+
		"\u0000\u0000\u0000\u001c\u012c\u0001\u0000\u0000\u0000\u001e\u012f\u0001"+
		"\u0000\u0000\u0000 \u0141\u0001\u0000\u0000\u0000\"\u0144\u0001\u0000"+
		"\u0000\u0000$\u0152\u0001\u0000\u0000\u0000&\u015a\u0001\u0000\u0000\u0000"+
		"(\u0160\u0001\u0000\u0000\u0000*\u0163\u0001\u0000\u0000\u0000,\u0178"+
		"\u0001\u0000\u0000\u0000.\u017a\u0001\u0000\u0000\u00000\u019b\u0001\u0000"+
		"\u0000\u00002\u01af\u0001\u0000\u0000\u00004\u01b1\u0001\u0000\u0000\u0000"+
		"6\u01bb\u0001\u0000\u0000\u00008\u01c6\u0001\u0000\u0000\u0000:\u01c8"+
		"\u0001\u0000\u0000\u0000<\u01cc\u0001\u0000\u0000\u0000>\u01d0\u0001\u0000"+
		"\u0000\u0000@\u01db\u0001\u0000\u0000\u0000B\u01e8\u0001\u0000\u0000\u0000"+
		"D\u01ea\u0001\u0000\u0000\u0000F\u01f7\u0001\u0000\u0000\u0000H\u01fb"+
		"\u0001\u0000\u0000\u0000J\u0208\u0001\u0000\u0000\u0000L\u0224\u0001\u0000"+
		"\u0000\u0000N\u022e\u0001\u0000\u0000\u0000P\u0230\u0001\u0000\u0000\u0000"+
		"R\u0239\u0001\u0000\u0000\u0000T\u0244\u0001\u0000\u0000\u0000V\u0255"+
		"\u0001\u0000\u0000\u0000X\u0261\u0001\u0000\u0000\u0000Z\u0264\u0001\u0000"+
		"\u0000\u0000\\\u026d\u0001\u0000\u0000\u0000^\u0275\u0001\u0000\u0000"+
		"\u0000`\u027b\u0001\u0000\u0000\u0000b\u0283\u0001\u0000\u0000\u0000d"+
		"\u0289\u0001\u0000\u0000\u0000f\u0290\u0001\u0000\u0000\u0000h\u029c\u0001"+
		"\u0000\u0000\u0000j\u029e\u0001\u0000\u0000\u0000l\u02a2\u0001\u0000\u0000"+
		"\u0000n\u02ae\u0001\u0000\u0000\u0000p\u02be\u0001\u0000\u0000\u0000r"+
		"\u02c0\u0001\u0000\u0000\u0000t\u02c2\u0001\u0000\u0000\u0000v\u02cf\u0001"+
		"\u0000\u0000\u0000x\u02d1\u0001\u0000\u0000\u0000z\u02d4\u0001\u0000\u0000"+
		"\u0000|\u02dc\u0001\u0000\u0000\u0000~\u02ea\u0001\u0000\u0000\u0000\u0080"+
		"\u02ed\u0001\u0000\u0000\u0000\u0082\u0314\u0001\u0000\u0000\u0000\u0084"+
		"\u0086\u0003\u0002\u0001\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086"+
		"\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\u009a\u0001\u0000\u0000\u0000\u0089"+
		"\u0087\u0001\u0000\u0000\u0000\u008a\u008c\u0003\u0004\u0002\u0000\u008b"+
		"\u008a\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d"+
		"\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e"+
		"\u009a\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0005W\u0000\u0000\u0091\u0092\u0005S\u0000\u0000\u0092\u0094\u0003"+
		"\u0018\f\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000"+
		"\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000"+
		"\u0000\u0000\u0098\u009a\u0005\u0000\u0000\u0001\u0099\u0087\u0001\u0000"+
		"\u0000\u0000\u0099\u008d\u0001\u0000\u0000\u0000\u0099\u0095\u0001\u0000"+
		"\u0000\u0000\u009a\u0001\u0001\u0000\u0000\u0000\u009b\u009c\u0005U\u0000"+
		"\u0000\u009c\u009d\u0005\u0001\u0000\u0000\u009d\u00a2\u0005q\u0000\u0000"+
		"\u009e\u009f\u0005\u0007\u0000\u0000\u009f\u00a1\u0005q\u0000\u0000\u00a0"+
		"\u009e\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0005\u0002\u0000\u0000\u00a6\u00a7\u0005V\u0000\u0000\u00a7\u00a8"+
		"\u0005r\u0000\u0000\u00a8\u00a9\u0005\b\u0000\u0000\u00a9\u0003\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0005\u0013\u0000\u0000\u00ab\u00ac\u0005"+
		"\u0003\u0000\u0000\u00ac\u00ad\u0003\u0006\u0003\u0000\u00ad\u00ae\u0005"+
		"\u0004\u0000\u0000\u00ae\u00af\u0003\u0018\f\u0000\u00af\u0005\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0005\u0001\u0000\u0000\u00b1\u00b6\u0003\b\u0004"+
		"\u0000\u00b2\u00b3\u0005\u0007\u0000\u0000\u00b3\u00b5\u0003\b\u0004\u0000"+
		"\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0005\u0002\u0000\u0000\u00ba\u0007\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0005(\u0000\u0000\u00bc\u00bd\u0005\n\u0000\u0000\u00bd"+
		"\u00d4\u0005r\u0000\u0000\u00be\u00bf\u0005)\u0000\u0000\u00bf\u00c0\u0005"+
		"\n\u0000\u0000\u00c0\u00d4\u0005c\u0000\u0000\u00c1\u00c2\u0005*\u0000"+
		"\u0000\u00c2\u00c3\u0005\n\u0000\u0000\u00c3\u00d4\u0003H$\u0000\u00c4"+
		"\u00c5\u0005+\u0000\u0000\u00c5\u00c6\u0005\n\u0000\u0000\u00c6\u00d4"+
		"\u0005s\u0000\u0000\u00c7\u00c8\u0005,\u0000\u0000\u00c8\u00c9\u0005\n"+
		"\u0000\u0000\u00c9\u00d4\u0005r\u0000\u0000\u00ca\u00cb\u0005-\u0000\u0000"+
		"\u00cb\u00ce\u0005\n\u0000\u0000\u00cc\u00cf\u0005r\u0000\u0000\u00cd"+
		"\u00cf\u0003J%\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d4\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005"+
		".\u0000\u0000\u00d1\u00d2\u0005\n\u0000\u0000\u00d2\u00d4\u0003H$\u0000"+
		"\u00d3\u00bb\u0001\u0000\u0000\u0000\u00d3\u00be\u0001\u0000\u0000\u0000"+
		"\u00d3\u00c1\u0001\u0000\u0000\u0000\u00d3\u00c4\u0001\u0000\u0000\u0000"+
		"\u00d3\u00c7\u0001\u0000\u0000\u0000\u00d3\u00ca\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d0\u0001\u0000\u0000\u0000\u00d4\t\u0001\u0000\u0000\u0000\u00d5"+
		"\u00da\u0003\f\u0006\u0000\u00d6\u00d7\u0005\'\u0000\u0000\u00d7\u00d9"+
		"\u0003\f\u0006\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001"+
		"\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001"+
		"\u0000\u0000\u0000\u00db\u000b\u0001\u0000\u0000\u0000\u00dc\u00da\u0001"+
		"\u0000\u0000\u0000\u00dd\u00e4\u0005q\u0000\u0000\u00de\u00e4\u0003\u000e"+
		"\u0007\u0000\u00df\u00e4\u0005d\u0000\u0000\u00e0\u00e4\u0005\u0017\u0000"+
		"\u0000\u00e1\u00e4\u0003\u0012\t\u0000\u00e2\u00e4\u0003\u0010\b\u0000"+
		"\u00e3\u00dd\u0001\u0000\u0000\u0000\u00e3\u00de\u0001\u0000\u0000\u0000"+
		"\u00e3\u00df\u0001\u0000\u0000\u0000\u00e3\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e4\r\u0001\u0000\u0000\u0000\u00e5\u00e6\u0007\u0000\u0000\u0000\u00e6"+
		"\u000f\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005q\u0000\u0000\u00e8\u00e9"+
		"\u0005\u0005\u0000\u0000\u00e9\u00ea\u0005\u0006\u0000\u0000\u00ea\u0011"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\u0001\u0000\u0000\u00ec\u00f1"+
		"\u0003\u0014\n\u0000\u00ed\u00ee\u0005\b\u0000\u0000\u00ee\u00f0\u0003"+
		"\u0014\n\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f6\u0005\b\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0005\u0002\u0000\u0000\u00f8\u0013\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0005q\u0000\u0000\u00fa\u00fb\u0005\n\u0000\u0000"+
		"\u00fb\u00fc\u0003\f\u0006\u0000\u00fc\u0015\u0001\u0000\u0000\u0000\u00fd"+
		"\u00ff\u0007\u0001\u0000\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100"+
		"\u0103\u0005q\u0000\u0000\u0101\u0102\u0005\n\u0000\u0000\u0102\u0104"+
		"\u0003\n\u0005\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001"+
		"\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0106\u0005"+
		"\f\u0000\u0000\u0106\u0108\u0003B!\u0000\u0107\u0105\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u010a\u0001\u0000\u0000"+
		"\u0000\u0109\u010b\u0005\b\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000"+
		"\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u0118\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0005:\u0000\u0000\u010d\u010e\u0005\u0003\u0000\u0000\u010e"+
		"\u010f\u0005\u0004\u0000\u0000\u010f\u0112\u0005q\u0000\u0000\u0110\u0111"+
		"\u0005\f\u0000\u0000\u0111\u0113\u0003B!\u0000\u0112\u0110\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0115\u0001\u0000"+
		"\u0000\u0000\u0114\u0116\u0005\b\u0000\u0000\u0115\u0114\u0001\u0000\u0000"+
		"\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0118\u0001\u0000\u0000"+
		"\u0000\u0117\u00fe\u0001\u0000\u0000\u0000\u0117\u010c\u0001\u0000\u0000"+
		"\u0000\u0118\u0017\u0001\u0000\u0000\u0000\u0119\u011b\u0005W\u0000\u0000"+
		"\u011a\u0119\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000"+
		"\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011d\u0005T\u0000\u0000\u011d"+
		"\u011e\u0005q\u0000\u0000\u011e\u011f\u0005\u0001\u0000\u0000\u011f\u0120"+
		"\u0003\u001a\r\u0000\u0120\u0121\u0005\u0002\u0000\u0000\u0121\u0019\u0001"+
		"\u0000\u0000\u0000\u0122\u0128\u0003\u0016\u000b\u0000\u0123\u0128\u0003"+
		"\u001c\u000e\u0000\u0124\u0128\u0003 \u0010\u0000\u0125\u0128\u0003\u0018"+
		"\f\u0000\u0126\u0128\u0003L&\u0000\u0127\u0122\u0001\u0000\u0000\u0000"+
		"\u0127\u0123\u0001\u0000\u0000\u0000\u0127\u0124\u0001\u0000\u0000\u0000"+
		"\u0127\u0125\u0001\u0000\u0000\u0000\u0127\u0126\u0001\u0000\u0000\u0000"+
		"\u0128\u012b\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000"+
		"\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u001b\u0001\u0000\u0000\u0000"+
		"\u012b\u0129\u0001\u0000\u0000\u0000\u012c\u012d\u0005q\u0000\u0000\u012d"+
		"\u012e\u0003\u001e\u000f\u0000\u012e\u001d\u0001\u0000\u0000\u0000\u012f"+
		"\u0131\u0005\u0003\u0000\u0000\u0130\u0132\u0003$\u0012\u0000\u0131\u0130"+
		"\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0133"+
		"\u0001\u0000\u0000\u0000\u0133\u0136\u0005\u0004\u0000\u0000\u0134\u0135"+
		"\u0005\n\u0000\u0000\u0135\u0137\u0003\n\u0005\u0000\u0136\u0134\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0138\u0001"+
		"\u0000\u0000\u0000\u0138\u013c\u0005\u0001\u0000\u0000\u0139\u013b\u0003"+
		"L&\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013b\u013e\u0001\u0000\u0000"+
		"\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000"+
		"\u0000\u013d\u013f\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000"+
		"\u0000\u013f\u0140\u0005\u0002\u0000\u0000\u0140\u001f\u0001\u0000\u0000"+
		"\u0000\u0141\u0142\u0005q\u0000\u0000\u0142\u0143\u0003\"\u0011\u0000"+
		"\u0143!\u0001\u0000\u0000\u0000\u0144\u0146\u0005\u0003\u0000\u0000\u0145"+
		"\u0147\u0003$\u0012\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0146\u0147"+
		"\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u0149"+
		"\u0005\u0004\u0000\u0000\u0149\u014d\u0005\u0001\u0000\u0000\u014a\u014c"+
		"\u0003L&\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014c\u014f\u0001\u0000"+
		"\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000"+
		"\u0000\u0000\u014e\u0150\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000"+
		"\u0000\u0000\u0150\u0151\u0005\u0002\u0000\u0000\u0151#\u0001\u0000\u0000"+
		"\u0000\u0152\u0157\u0003&\u0013\u0000\u0153\u0154\u0005\u0007\u0000\u0000"+
		"\u0154\u0156\u0003&\u0013\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156"+
		"\u0159\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157"+
		"\u0158\u0001\u0000\u0000\u0000\u0158%\u0001\u0000\u0000\u0000\u0159\u0157"+
		"\u0001\u0000\u0000\u0000\u015a\u015b\u0005q\u0000\u0000\u015b\u015e\u0005"+
		"\n\u0000\u0000\u015c\u015f\u0003\f\u0006\u0000\u015d\u015f\u0003\u0012"+
		"\t\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015e\u015d\u0001\u0000\u0000"+
		"\u0000\u015f\'\u0001\u0000\u0000\u0000\u0160\u0161\u0007\u0002\u0000\u0000"+
		"\u0161)\u0001\u0000\u0000\u0000\u0162\u0164\u0003(\u0014\u0000\u0163\u0162"+
		"\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0165"+
		"\u0001\u0000\u0000\u0000\u0165\u0168\u0005q\u0000\u0000\u0166\u0167\u0005"+
		"\n\u0000\u0000\u0167\u0169\u0003\n\u0005\u0000\u0168\u0166\u0001\u0000"+
		"\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016c\u0001\u0000"+
		"\u0000\u0000\u016a\u016b\u0005\f\u0000\u0000\u016b\u016d\u0003B!\u0000"+
		"\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000"+
		"\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u016f\u0005\b\u0000\u0000\u016f"+
		"+\u0001\u0000\u0000\u0000\u0170\u0179\u00034\u001a\u0000\u0171\u0179\u0005"+
		"q\u0000\u0000\u0172\u0173\u0005\u0003\u0000\u0000\u0173\u0179\u0005\u0004"+
		"\u0000\u0000\u0174\u0179\u0005d\u0000\u0000\u0175\u0179\u0003D\"\u0000"+
		"\u0176\u0179\u0003J%\u0000\u0177\u0179\u0005c\u0000\u0000\u0178\u0170"+
		"\u0001\u0000\u0000\u0000\u0178\u0171\u0001\u0000\u0000\u0000\u0178\u0172"+
		"\u0001\u0000\u0000\u0000\u0178\u0174\u0001\u0000\u0000\u0000\u0178\u0175"+
		"\u0001\u0000\u0000\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0178\u0177"+
		"\u0001\u0000\u0000\u0000\u0179-\u0001\u0000\u0000\u0000\u017a\u018f\u0003"+
		",\u0016\u0000\u017b\u017c\u0005\t\u0000\u0000\u017c\u018e\u0005q\u0000"+
		"\u0000\u017d\u017e\u0005\u0005\u0000\u0000\u017e\u017f\u0003B!\u0000\u017f"+
		"\u0180\u0005\u0006\u0000\u0000\u0180\u018e\u0001\u0000\u0000\u0000\u0181"+
		"\u018a\u0005\u0003\u0000\u0000\u0182\u0187\u0003B!\u0000\u0183\u0184\u0005"+
		"\u0007\u0000\u0000\u0184\u0186\u0003B!\u0000\u0185\u0183\u0001\u0000\u0000"+
		"\u0000\u0186\u0189\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000"+
		"\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u018b\u0001\u0000\u0000"+
		"\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u018a\u0182\u0001\u0000\u0000"+
		"\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000"+
		"\u0000\u018c\u018e\u0005\u0004\u0000\u0000\u018d\u017b\u0001\u0000\u0000"+
		"\u0000\u018d\u017d\u0001\u0000\u0000\u0000\u018d\u0181\u0001\u0000\u0000"+
		"\u0000\u018e\u0191\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000"+
		"\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190/\u0001\u0000\u0000\u0000"+
		"\u0191\u018f\u0001\u0000\u0000\u0000\u0192\u019c\u00034\u001a\u0000\u0193"+
		"\u019c\u0005q\u0000\u0000\u0194\u019c\u0005d\u0000\u0000\u0195\u019c\u0003"+
		"D\"\u0000\u0196\u019c\u0003J%\u0000\u0197\u0198\u0005\u0003\u0000\u0000"+
		"\u0198\u0199\u0003B!\u0000\u0199\u019a\u0005\u0004\u0000\u0000\u019a\u019c"+
		"\u0001\u0000\u0000\u0000\u019b\u0192\u0001\u0000\u0000\u0000\u019b\u0193"+
		"\u0001\u0000\u0000\u0000\u019b\u0194\u0001\u0000\u0000\u0000\u019b\u0195"+
		"\u0001\u0000\u0000\u0000\u019b\u0196\u0001\u0000\u0000\u0000\u019b\u0197"+
		"\u0001\u0000\u0000\u0000\u019c1\u0001\u0000\u0000\u0000\u019d\u019e\u0003"+
		".\u0017\u0000\u019e\u019f\u0005\f\u0000\u0000\u019f\u01a1\u00030\u0018"+
		"\u0000\u01a0\u01a2\u0005\b\u0000\u0000\u01a1\u01a0\u0001\u0000\u0000\u0000"+
		"\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01b0\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a5\u0005q\u0000\u0000\u01a4\u01a6\u0005$\u0000\u0000\u01a5\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a7"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005\f\u0000\u0000\u01a8\u01aa\u0003"+
		"0\u0018\u0000\u01a9\u01ab\u0005$\u0000\u0000\u01aa\u01a9\u0001\u0000\u0000"+
		"\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ad\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ae\u0005\b\u0000\u0000\u01ad\u01ac\u0001\u0000\u0000\u0000"+
		"\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01b0\u0001\u0000\u0000\u0000"+
		"\u01af\u019d\u0001\u0000\u0000\u0000\u01af\u01a3\u0001\u0000\u0000\u0000"+
		"\u01b03\u0001\u0000\u0000\u0000\u01b1\u01b2\u0007\u0003\u0000\u0000\u01b2"+
		"5\u0001\u0000\u0000\u0000\u01b3\u01b4\u00030\u0018\u0000\u01b4\u01b5\u0007"+
		"\u0004\u0000\u0000\u01b5\u01b6\u00030\u0018\u0000\u01b6\u01bc\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b8\u00030\u0018\u0000\u01b8\u01b9\u0007\u0005\u0000"+
		"\u0000\u01b9\u01ba\u00030\u0018\u0000\u01ba\u01bc\u0001\u0000\u0000\u0000"+
		"\u01bb\u01b3\u0001\u0000\u0000\u0000\u01bb\u01b7\u0001\u0000\u0000\u0000"+
		"\u01bc7\u0001\u0000\u0000\u0000\u01bd\u01be\u0007\u0005\u0000\u0000\u01be"+
		"\u01c7\u00030\u0018\u0000\u01bf\u01c0\u0007\u0006\u0000\u0000\u01c0\u01c7"+
		"\u00030\u0018\u0000\u01c1\u01c2\u00030\u0018\u0000\u01c2\u01c3\u0007\u0006"+
		"\u0000\u0000\u01c3\u01c7\u0001\u0000\u0000\u0000\u01c4\u01c5\u0005\u0018"+
		"\u0000\u0000\u01c5\u01c7\u00030\u0018\u0000\u01c6\u01bd\u0001\u0000\u0000"+
		"\u0000\u01c6\u01bf\u0001\u0000\u0000\u0000\u01c6\u01c1\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c79\u0001\u0000\u0000\u0000"+
		"\u01c8\u01c9\u00030\u0018\u0000\u01c9\u01ca\u0007\u0007\u0000\u0000\u01ca"+
		"\u01cb\u00030\u0018\u0000\u01cb;\u0001\u0000\u0000\u0000\u01cc\u01cd\u0003"+
		"0\u0018\u0000\u01cd\u01ce\u0007\b\u0000\u0000\u01ce\u01cf\u00030\u0018"+
		"\u0000\u01cf=\u0001\u0000\u0000\u0000\u01d0\u01d1\u0006\u001f\uffff\uffff"+
		"\u0000\u01d1\u01d2\u0003<\u001e\u0000\u01d2\u01d8\u0001\u0000\u0000\u0000"+
		"\u01d3\u01d4\n\u0002\u0000\u0000\u01d4\u01d5\u0007\t\u0000\u0000\u01d5"+
		"\u01d7\u0003<\u001e\u0000\u01d6\u01d3\u0001\u0000\u0000\u0000\u01d7\u01da"+
		"\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9"+
		"\u0001\u0000\u0000\u0000\u01d9?\u0001\u0000\u0000\u0000\u01da\u01d8\u0001"+
		"\u0000\u0000\u0000\u01db\u01dc\u00030\u0018\u0000\u01dc\u01dd\u0005\u0019"+
		"\u0000\u0000\u01dd\u01de\u0003B!\u0000\u01de\u01df\u0005\n\u0000\u0000"+
		"\u01df\u01e0\u0003B!\u0000\u01e0A\u0001\u0000\u0000\u0000\u01e1\u01e9"+
		"\u0003@ \u0000\u01e2\u01e9\u0003>\u001f\u0000\u01e3\u01e9\u0003.\u0017"+
		"\u0000\u01e4\u01e9\u0003:\u001d\u0000\u01e5\u01e9\u0003<\u001e\u0000\u01e6"+
		"\u01e9\u00036\u001b\u0000\u01e7\u01e9\u00038\u001c\u0000\u01e8\u01e1\u0001"+
		"\u0000\u0000\u0000\u01e8\u01e2\u0001\u0000\u0000\u0000\u01e8\u01e3\u0001"+
		"\u0000\u0000\u0000\u01e8\u01e4\u0001\u0000\u0000\u0000\u01e8\u01e5\u0001"+
		"\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e8\u01e7\u0001"+
		"\u0000\u0000\u0000\u01e9C\u0001\u0000\u0000\u0000\u01ea\u01f3\u0005\u0001"+
		"\u0000\u0000\u01eb\u01f0\u0003F#\u0000\u01ec\u01ed\u0005\u0007\u0000\u0000"+
		"\u01ed\u01ef\u0003F#\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ef\u01f2"+
		"\u0001\u0000\u0000\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f0\u01f1"+
		"\u0001\u0000\u0000\u0000\u01f1\u01f4\u0001\u0000\u0000\u0000\u01f2\u01f0"+
		"\u0001\u0000\u0000\u0000\u01f3\u01eb\u0001\u0000\u0000\u0000\u01f3\u01f4"+
		"\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f6"+
		"\u0005\u0002\u0000\u0000\u01f6E\u0001\u0000\u0000\u0000\u01f7\u01f8\u0007"+
		"\n\u0000\u0000\u01f8\u01f9\u0005\n\u0000\u0000\u01f9\u01fa\u00030\u0018"+
		"\u0000\u01faG\u0001\u0000\u0000\u0000\u01fb\u0204\u0005\u0005\u0000\u0000"+
		"\u01fc\u0201\u00030\u0018\u0000\u01fd\u01fe\u0005\u0007\u0000\u0000\u01fe"+
		"\u0200\u00030\u0018\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u0200\u0203"+
		"\u0001\u0000\u0000\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0201\u0202"+
		"\u0001\u0000\u0000\u0000\u0202\u0205\u0001\u0000\u0000\u0000\u0203\u0201"+
		"\u0001\u0000\u0000\u0000\u0204\u01fc\u0001\u0000\u0000\u0000\u0204\u0205"+
		"\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u0207"+
		"\u0005\u0006\u0000\u0000\u0207I\u0001\u0000\u0000\u0000\u0208\u0211\u0005"+
		"\u0005\u0000\u0000\u0209\u020e\u00030\u0018\u0000\u020a\u020b\u0005\u0007"+
		"\u0000\u0000\u020b\u020d\u00030\u0018\u0000\u020c\u020a\u0001\u0000\u0000"+
		"\u0000\u020d\u0210\u0001\u0000\u0000\u0000\u020e\u020c\u0001\u0000\u0000"+
		"\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f\u0212\u0001\u0000\u0000"+
		"\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0211\u0209\u0001\u0000\u0000"+
		"\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u0213\u0001\u0000\u0000"+
		"\u0000\u0213\u0214\u0005\u0006\u0000\u0000\u0214K\u0001\u0000\u0000\u0000"+
		"\u0215\u0217\u0003.\u0017\u0000\u0216\u0218\u0005\b\u0000\u0000\u0217"+
		"\u0216\u0001\u0000\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218"+
		"\u0225\u0001\u0000\u0000\u0000\u0219\u0225\u0003*\u0015\u0000\u021a\u0225"+
		"\u00032\u0019\u0000\u021b\u0225\u0003\u0018\f\u0000\u021c\u0225\u0003"+
		" \u0010\u0000\u021d\u021e\u0005W\u0000\u0000\u021e\u0225\u0003*\u0015"+
		"\u0000\u021f\u0225\u0003N\'\u0000\u0220\u0225\u0003j5\u0000\u0221\u0225"+
		"\u0003l6\u0000\u0222\u0225\u0003\u001c\u000e\u0000\u0223\u0225\u0003N"+
		"\'\u0000\u0224\u0215\u0001\u0000\u0000\u0000\u0224\u0219\u0001\u0000\u0000"+
		"\u0000\u0224\u021a\u0001\u0000\u0000\u0000\u0224\u021b\u0001\u0000\u0000"+
		"\u0000\u0224\u021c\u0001\u0000\u0000\u0000\u0224\u021d\u0001\u0000\u0000"+
		"\u0000\u0224\u021f\u0001\u0000\u0000\u0000\u0224\u0220\u0001\u0000\u0000"+
		"\u0000\u0224\u0221\u0001\u0000\u0000\u0000\u0224\u0222\u0001\u0000\u0000"+
		"\u0000\u0224\u0223\u0001\u0000\u0000\u0000\u0225M\u0001\u0000\u0000\u0000"+
		"\u0226\u022f\u0003R)\u0000\u0227\u022f\u0003V+\u0000\u0228\u022f\u0003"+
		"^/\u0000\u0229\u022f\u0003`0\u0000\u022a\u022f\u0003T*\u0000\u022b\u022f"+
		"\u0003b1\u0000\u022c\u022f\u0003d2\u0000\u022d\u022f\u0003f3\u0000\u022e"+
		"\u0226\u0001\u0000\u0000\u0000\u022e\u0227\u0001\u0000\u0000\u0000\u022e"+
		"\u0228\u0001\u0000\u0000\u0000\u022e\u0229\u0001\u0000\u0000\u0000\u022e"+
		"\u022a\u0001\u0000\u0000\u0000\u022e\u022b\u0001\u0000\u0000\u0000\u022e"+
		"\u022c\u0001\u0000\u0000\u0000\u022e\u022d\u0001\u0000\u0000\u0000\u022f"+
		"O\u0001\u0000\u0000\u0000\u0230\u0234\u0005\u0001\u0000\u0000\u0231\u0233"+
		"\u0003L&\u0000\u0232\u0231\u0001\u0000\u0000\u0000\u0233\u0236\u0001\u0000"+
		"\u0000\u0000\u0234\u0232\u0001\u0000\u0000\u0000\u0234\u0235\u0001\u0000"+
		"\u0000\u0000\u0235\u0237\u0001\u0000\u0000\u0000\u0236\u0234\u0001\u0000"+
		"\u0000\u0000\u0237\u0238\u0005\u0002\u0000\u0000\u0238Q\u0001\u0000\u0000"+
		"\u0000\u0239\u023a\u0005X\u0000\u0000\u023a\u023b\u0005\u0003\u0000\u0000"+
		"\u023b\u023c\u0003B!\u0000\u023c\u023d\u0005\u0004\u0000\u0000\u023d\u0242"+
		"\u0003P(\u0000\u023e\u023f\u0005Y\u0000\u0000\u023f\u0243\u0003R)\u0000"+
		"\u0240\u0241\u0005Y\u0000\u0000\u0241\u0243\u0003P(\u0000\u0242\u023e"+
		"\u0001\u0000\u0000\u0000\u0242\u0240\u0001\u0000\u0000\u0000\u0242\u0243"+
		"\u0001\u0000\u0000\u0000\u0243S\u0001\u0000\u0000\u0000\u0244\u0245\u0005"+
		"Z\u0000\u0000\u0245\u0249\u0005\u0003\u0000\u0000\u0246\u024a\u0003*\u0015"+
		"\u0000\u0247\u024a\u0003h4\u0000\u0248\u024a\u0005\b\u0000\u0000\u0249"+
		"\u0246\u0001\u0000\u0000\u0000\u0249\u0247\u0001\u0000\u0000\u0000\u0249"+
		"\u0248\u0001\u0000\u0000\u0000\u024a\u024c\u0001\u0000\u0000\u0000\u024b"+
		"\u024d\u0003h4\u0000\u024c\u024b\u0001\u0000\u0000\u0000\u024c\u024d\u0001"+
		"\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e\u0250\u0005"+
		"\b\u0000\u0000\u024f\u0251\u0003h4\u0000\u0250\u024f\u0001\u0000\u0000"+
		"\u0000\u0250\u0251\u0001\u0000\u0000\u0000\u0251\u0252\u0001\u0000\u0000"+
		"\u0000\u0252\u0253\u0005\u0004\u0000\u0000\u0253\u0254\u0003P(\u0000\u0254"+
		"U\u0001\u0000\u0000\u0000\u0255\u0256\u0005]\u0000\u0000\u0256\u0257\u0005"+
		"\u0003\u0000\u0000\u0257\u0258\u00030\u0018\u0000\u0258\u0259\u0005\u0004"+
		"\u0000\u0000\u0259\u025a\u0005\u0001\u0000\u0000\u025a\u025b\u0003X,\u0000"+
		"\u025b\u025c\u0005\u0002\u0000\u0000\u025cW\u0001\u0000\u0000\u0000\u025d"+
		"\u0260\u0003Z-\u0000\u025e\u0260\u0003\\.\u0000\u025f\u025d\u0001\u0000"+
		"\u0000\u0000\u025f\u025e\u0001\u0000\u0000\u0000\u0260\u0263\u0001\u0000"+
		"\u0000\u0000\u0261\u025f\u0001\u0000\u0000\u0000\u0261\u0262\u0001\u0000"+
		"\u0000\u0000\u0262Y\u0001\u0000\u0000\u0000\u0263\u0261\u0001\u0000\u0000"+
		"\u0000\u0264\u0265\u0005^\u0000\u0000\u0265\u0266\u00030\u0018\u0000\u0266"+
		"\u026a\u0005\n\u0000\u0000\u0267\u0269\u0003L&\u0000\u0268\u0267\u0001"+
		"\u0000\u0000\u0000\u0269\u026c\u0001\u0000\u0000\u0000\u026a\u0268\u0001"+
		"\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b[\u0001\u0000"+
		"\u0000\u0000\u026c\u026a\u0001\u0000\u0000\u0000\u026d\u026e\u0005_\u0000"+
		"\u0000\u026e\u0272\u0005\n\u0000\u0000\u026f\u0271\u0003L&\u0000\u0270"+
		"\u026f\u0001\u0000\u0000\u0000\u0271\u0274\u0001\u0000\u0000\u0000\u0272"+
		"\u0270\u0001\u0000\u0000\u0000\u0272\u0273\u0001\u0000\u0000\u0000\u0273"+
		"]\u0001\u0000\u0000\u0000\u0274\u0272\u0001\u0000\u0000\u0000\u0275\u0276"+
		"\u0005[\u0000\u0000\u0276\u0277\u0005\u0003\u0000\u0000\u0277\u0278\u0003"+
		"0\u0018\u0000\u0278\u0279\u0005\u0004\u0000\u0000\u0279\u027a\u0003P("+
		"\u0000\u027a_\u0001\u0000\u0000\u0000\u027b\u027c\u0005\\\u0000\u0000"+
		"\u027c\u027d\u0003P(\u0000\u027d\u027e\u0005[\u0000\u0000\u027e\u027f"+
		"\u0005\u0003\u0000\u0000\u027f\u0280\u00030\u0018\u0000\u0280\u0281\u0005"+
		"\u0004\u0000\u0000\u0281\u0282\u0005\b\u0000\u0000\u0282a\u0001\u0000"+
		"\u0000\u0000\u0283\u0285\u0005b\u0000\u0000\u0284\u0286\u0005q\u0000\u0000"+
		"\u0285\u0284\u0001\u0000\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000"+
		"\u0286\u0287\u0001\u0000\u0000\u0000\u0287\u0288\u0003n7\u0000\u0288c"+
		"\u0001\u0000\u0000\u0000\u0289\u028b\u0005`\u0000\u0000\u028a\u028c\u0003"+
		"h4\u0000\u028b\u028a\u0001\u0000\u0000\u0000\u028b\u028c\u0001\u0000\u0000"+
		"\u0000\u028c\u028e\u0001\u0000\u0000\u0000\u028d\u028f\u0003n7\u0000\u028e"+
		"\u028d\u0001\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f"+
		"e\u0001\u0000\u0000\u0000\u0290\u0291\u0005a\u0000\u0000\u0291\u0292\u0005"+
		"\b\u0000\u0000\u0292g\u0001\u0000\u0000\u0000\u0293\u0298\u00030\u0018"+
		"\u0000\u0294\u0295\u0005\u0007\u0000\u0000\u0295\u0297\u00030\u0018\u0000"+
		"\u0296\u0294\u0001\u0000\u0000\u0000\u0297\u029a\u0001\u0000\u0000\u0000"+
		"\u0298\u0296\u0001\u0000\u0000\u0000\u0298\u0299\u0001\u0000\u0000\u0000"+
		"\u0299\u029d\u0001\u0000\u0000\u0000\u029a\u0298\u0001\u0000\u0000\u0000"+
		"\u029b\u029d\u0005q\u0000\u0000\u029c\u0293\u0001\u0000\u0000\u0000\u029c"+
		"\u029b\u0001\u0000\u0000\u0000\u029di\u0001\u0000\u0000\u0000\u029e\u029f"+
		"\u0005S\u0000\u0000\u029f\u02a0\u0005q\u0000\u0000\u02a0\u02a1\u0003\u0012"+
		"\t\u0000\u02a1k\u0001\u0000\u0000\u0000\u02a2\u02a3\u0005q\u0000\u0000"+
		"\u02a3\u02a4\u0005\u001a\u0000\u0000\u02a4\u02a9\u0003\n\u0005\u0000\u02a5"+
		"\u02a6\u0005\u0007\u0000\u0000\u02a6\u02a8\u0003\n\u0005\u0000\u02a7\u02a5"+
		"\u0001\u0000\u0000\u0000\u02a8\u02ab\u0001\u0000\u0000\u0000\u02a9\u02a7"+
		"\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000\u02aa\u02ac"+
		"\u0001\u0000\u0000\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ac\u02ad"+
		"\u0005\u001b\u0000\u0000\u02adm\u0001\u0000\u0000\u0000\u02ae\u02af\u0007"+
		"\u000b\u0000\u0000\u02afo\u0001\u0000\u0000\u0000\u02b0\u02b4\u0003t:"+
		"\u0000\u02b1\u02b3\u0003p8\u0000\u02b2\u02b1\u0001\u0000\u0000\u0000\u02b3"+
		"\u02b6\u0001\u0000\u0000\u0000\u02b4\u02b2\u0001\u0000\u0000\u0000\u02b4"+
		"\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b8\u0001\u0000\u0000\u0000\u02b6"+
		"\u02b4\u0001\u0000\u0000\u0000\u02b7\u02b9\u0003z=\u0000\u02b8\u02b7\u0001"+
		"\u0000\u0000\u0000\u02b8\u02b9\u0001\u0000\u0000\u0000\u02b9\u02bf\u0001"+
		"\u0000\u0000\u0000\u02ba\u02bf\u0003|>\u0000\u02bb\u02bf\u0003~?\u0000"+
		"\u02bc\u02bf\u0003\u0080@\u0000\u02bd\u02bf\u0003\u0082A\u0000\u02be\u02b0"+
		"\u0001\u0000\u0000\u0000\u02be\u02ba\u0001\u0000\u0000\u0000\u02be\u02bb"+
		"\u0001\u0000\u0000\u0000\u02be\u02bc\u0001\u0000\u0000\u0000\u02be\u02bd"+
		"\u0001\u0000\u0000\u0000\u02bfq\u0001\u0000\u0000\u0000\u02c0\u02c1\u0007"+
		"\f\u0000\u0000\u02c1s\u0001\u0000\u0000\u0000\u02c2\u02c5\u0005\u001a"+
		"\u0000\u0000\u02c3\u02c6\u0003r9\u0000\u02c4\u02c6\u0005q\u0000\u0000"+
		"\u02c5\u02c3\u0001\u0000\u0000\u0000\u02c5\u02c4\u0001\u0000\u0000\u0000"+
		"\u02c6\u02ca\u0001\u0000\u0000\u0000\u02c7\u02c9\u0003x<\u0000\u02c8\u02c7"+
		"\u0001\u0000\u0000\u0000\u02c9\u02cc\u0001\u0000\u0000\u0000\u02ca\u02c8"+
		"\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000\u02cb\u02cd"+
		"\u0001\u0000\u0000\u0000\u02cc\u02ca\u0001\u0000\u0000\u0000\u02cd\u02ce"+
		"\u0005\u001b\u0000\u0000\u02ceu\u0001\u0000\u0000\u0000\u02cf\u02d0\u0007"+
		"\r\u0000\u0000\u02d0w\u0001\u0000\u0000\u0000\u02d1\u02d2\u0005\f\u0000"+
		"\u0000\u02d2\u02d3\u0003B!\u0000\u02d3y\u0001\u0000\u0000\u0000\u02d4"+
		"\u02d5\u0005\u001a\u0000\u0000\u02d5\u02d8\u0005\u001f\u0000\u0000\u02d6"+
		"\u02d9\u0003r9\u0000\u02d7\u02d9\u0005q\u0000\u0000\u02d8\u02d6\u0001"+
		"\u0000\u0000\u0000\u02d8\u02d7\u0001\u0000\u0000\u0000\u02d9\u02da\u0001"+
		"\u0000\u0000\u0000\u02da\u02db\u0005\u001b\u0000\u0000\u02db{\u0001\u0000"+
		"\u0000\u0000\u02dc\u02df\u0005\u001a\u0000\u0000\u02dd\u02e0\u0003r9\u0000"+
		"\u02de\u02e0\u0005q\u0000\u0000\u02df\u02dd\u0001\u0000\u0000\u0000\u02df"+
		"\u02de\u0001\u0000\u0000\u0000\u02e0\u02e4\u0001\u0000\u0000\u0000\u02e1"+
		"\u02e3\u0003x<\u0000\u02e2\u02e1\u0001\u0000\u0000\u0000\u02e3\u02e6\u0001"+
		"\u0000\u0000\u0000\u02e4\u02e2\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001"+
		"\u0000\u0000\u0000\u02e5\u02e7\u0001\u0000\u0000\u0000\u02e6\u02e4\u0001"+
		"\u0000\u0000\u0000\u02e7\u02e8\u0005\u001f\u0000\u0000\u02e8\u02e9\u0005"+
		"\u001b\u0000\u0000\u02e9}\u0001\u0000\u0000\u0000\u02ea\u02eb\u00056\u0000"+
		"\u0000\u02eb\u02ec\u0005q\u0000\u0000\u02ec\u007f\u0001\u0000\u0000\u0000"+
		"\u02ed\u02ee\u0005\u001a\u0000\u0000\u02ee\u02f2\u00057\u0000\u0000\u02ef"+
		"\u02f1\u0003x<\u0000\u02f0\u02ef\u0001\u0000\u0000\u0000\u02f1\u02f4\u0001"+
		"\u0000\u0000\u0000\u02f2\u02f0\u0001\u0000\u0000\u0000\u02f2\u02f3\u0001"+
		"\u0000\u0000\u0000\u02f3\u02f5\u0001\u0000\u0000\u0000\u02f4\u02f2\u0001"+
		"\u0000\u0000\u0000\u02f5\u02f6\u0005\u001b\u0000\u0000\u02f6\u0081\u0001"+
		"\u0000\u0000\u0000\u02f7\u02f8\u0005\u001a\u0000\u0000\u02f8\u02fc\u0005"+
		"8\u0000\u0000\u02f9\u02fb\u0003x<\u0000\u02fa\u02f9\u0001\u0000\u0000"+
		"\u0000\u02fb\u02fe\u0001\u0000\u0000\u0000\u02fc\u02fa\u0001\u0000\u0000"+
		"\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd\u02ff\u0001\u0000\u0000"+
		"\u0000\u02fe\u02fc\u0001\u0000\u0000\u0000\u02ff\u0303\u0005\u001b\u0000"+
		"\u0000\u0300\u0302\u0003p8\u0000\u0301\u0300\u0001\u0000\u0000\u0000\u0302"+
		"\u0305\u0001\u0000\u0000\u0000\u0303\u0301\u0001\u0000\u0000\u0000\u0303"+
		"\u0304\u0001\u0000\u0000\u0000\u0304\u0306\u0001\u0000\u0000\u0000\u0305"+
		"\u0303\u0001\u0000\u0000\u0000\u0306\u0307\u0005\u001a\u0000\u0000\u0307"+
		"\u0308\u0005\u001f\u0000\u0000\u0308\u0309\u00058\u0000\u0000\u0309\u0315"+
		"\u0005\u001b\u0000\u0000\u030a\u030b\u0005\u001a\u0000\u0000\u030b\u030f"+
		"\u00058\u0000\u0000\u030c\u030e\u0003x<\u0000\u030d\u030c\u0001\u0000"+
		"\u0000\u0000\u030e\u0311\u0001\u0000\u0000\u0000\u030f\u030d\u0001\u0000"+
		"\u0000\u0000\u030f\u0310\u0001\u0000\u0000\u0000\u0310\u0312\u0001\u0000"+
		"\u0000\u0000\u0311\u030f\u0001\u0000\u0000\u0000\u0312\u0313\u0005\u001f"+
		"\u0000\u0000\u0313\u0315\u0005\u001b\u0000\u0000\u0314\u02f7\u0001\u0000"+
		"\u0000\u0000\u0314\u030a\u0001\u0000\u0000\u0000\u0315\u0083\u0001\u0000"+
		"\u0000\u0000T\u0087\u008d\u0095\u0099\u00a2\u00b6\u00ce\u00d3\u00da\u00e3"+
		"\u00f1\u00f5\u00fe\u0103\u0107\u010a\u0112\u0115\u0117\u011a\u0127\u0129"+
		"\u0131\u0136\u013c\u0146\u014d\u0157\u015e\u0163\u0168\u016c\u0178\u0187"+
		"\u018a\u018d\u018f\u019b\u01a1\u01a5\u01aa\u01ad\u01af\u01bb\u01c6\u01d8"+
		"\u01e8\u01f0\u01f3\u0201\u0204\u020e\u0211\u0217\u0224\u022e\u0234\u0242"+
		"\u0249\u024c\u0250\u025f\u0261\u026a\u0272\u0285\u028b\u028e\u0298\u029c"+
		"\u02a9\u02b4\u02b8\u02be\u02c5\u02ca\u02d8\u02df\u02e4\u02f2\u02fc\u0303"+
		"\u030f\u0314";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}