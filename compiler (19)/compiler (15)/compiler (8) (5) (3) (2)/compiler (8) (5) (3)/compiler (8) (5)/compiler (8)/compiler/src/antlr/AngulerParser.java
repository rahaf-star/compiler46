// Generated from C:/Users/Lenovo/Downloads/Telegram Desktop/compiler (8) (5) (5)/compiler (8) (5) (3)/compiler (8) (5)/compiler (8)/compiler/src/antlr/AngulerParser.g4 by ANTLR 4.13.2
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
		WS=1, LINE_COMMENT=2, BLOCK_COMMENT=3, COMPONENT=4, INJECTABLE=5, INPUT=6, 
		OUTPUT=7, VIEW_CHILD=8, CONTENT_CHILD=9, SELECTOR=10, STANDALONE=11, IMPORTS=12, 
		TEMPLATE=13, TEMPLATE_URL=14, STYLES=15, STYLE_URLS=16, STYLE_URL=17, 
		PROVIDED_IN=18, NG_IF=19, NG_FOR=20, NG_CLASS=21, NG_STYLE=22, NG_MODEL=23, 
		NG_ON_INIT=24, NG_ON_CHANGES=25, NG_ON_DESTROY=26, PRIVATE=27, PUBLIC=28, 
		PROTECTED=29, CLASS=30, IMPORT=31, FROM=32, EXPORT=33, CONST=34, LET=35, 
		VAR=36, IF=37, ELSE=38, FOR=39, WHILE=40, DO=41, SWITCH=42, CASE=43, DEFAULT=44, 
		RETURN=45, BREAK=46, CONTINUE=47, NEW=48, THIS=49, SUPER=50, FUNCTION=51, 
		INTERFACE=52, VOID=53, NULL=54, UNDEFINED=55, EMIT=56, STRING=57, NUMBER=58, 
		BOOLEAN=59, ANY=60, ELLIPSIS=61, INCREMENT=62, DECREMENT=63, NOT=64, QUESTION=65, 
		SUM=66, MIN=67, MUL=68, SLASH=69, MOD=70, AND=71, OR=72, PIPE=73, ARROW=74, 
		IS_EQUAL=75, NOT_EQUAL=76, IS_EQUAL_TYPE=77, NOT_EQUAL_TYPE=78, LESS_EQUAL=79, 
		GREATER_EQUAL=80, OPEN_BRACE=81, CLOSE_BRACE=82, OPEN_PAREN=83, CLOSE_PAREN=84, 
		OPEN_BRACKET=85, CLOSE_BRACKET=86, COMMA=87, SEMICOLON=88, DOT=89, COLON=90, 
		EQUAL=91, DOLLAR=92, HASH=93, OPENTAG=94, CLOSETAG=95, DIV_TAG=96, H1_TAG=97, 
		H2_TAG=98, H3_TAG=99, P_TAG=100, IMG_TAG=101, A_TAG=102, SPAN_TAG=103, 
		BUTTON_TAG=104, NG_CONTENT=105, NG_TEMPLATE=106, STYLE_ATTR=107, ALT_ATTR=108, 
		SRC_ATTR=109, HREF_ATTR=110, ROUTER_LINK=111, ROUTER_OUTLET=112, FORM_CONTROL_NAME=113, 
		FORM_GROUP=114, FORM_ARRAY=115, BOOLEAN_LITERAL=116, DECIMAL_INTEGER_LITERAL=117, 
		FLOAT_LITERAL=118, STRING_LITERAL=119, TEMPLATE_LITERAL=120, IDENTIFIER=121, 
		ANGULAR=122, UNEXPECTED_TOKEN=123;
	public static final int
		RULE_prog = 0, RULE_injectable_declaration = 1, RULE_injectable_metadata = 2, 
		RULE_injectable_metadata_property = 3, RULE_export_statement = 4, RULE_anguler_import = 5, 
		RULE_component_declaration = 6, RULE_component_metadata = 7, RULE_metadata_property = 8, 
		RULE_type_annotation = 9, RULE_base_type_annotation = 10, RULE_primitive_type = 11, 
		RULE_array_type = 12, RULE_structured_type = 13, RULE_type_pair = 14, 
		RULE_class_declaration = 15, RULE_class_body = 16, RULE_property_declaration = 17, 
		RULE_method_declaration = 18, RULE_method_body = 19, RULE_function_declaration = 20, 
		RULE_function_body = 21, RULE_emit_statement = 22, RULE_parameter_list = 23, 
		RULE_parameter = 24, RULE_declaraiton_keywords = 25, RULE_variable_declaration = 26, 
		RULE_primary = 27, RULE_type_arguments = 28, RULE_postfix_expression = 29, 
		RULE_postfix_operator = 30, RULE_value = 31, RULE_assignment = 32, RULE_literal_value = 33, 
		RULE_unary_expression = 34, RULE_logical_expression = 35, RULE_relational_expression = 36, 
		RULE_equality_expression = 37, RULE_arithmetic_expression = 38, RULE_conditional_expression = 39, 
		RULE_expression = 40, RULE_json_object = 41, RULE_json_pair = 42, RULE_imports_array = 43, 
		RULE_array = 44, RULE_array_element = 45, RULE_instruction = 46, RULE_conditional_statements = 47, 
		RULE_block = 48, RULE_if_statement = 49, RULE_for_statement = 50, RULE_switch_statement = 51, 
		RULE_switch_body = 52, RULE_switch_case = 53, RULE_switch_default = 54, 
		RULE_while_statement = 55, RULE_do_while_statement = 56, RULE_continue_Statement = 57, 
		RULE_return_Statement = 58, RULE_break_statement = 59, RULE_expressionSequence = 60, 
		RULE_interface_Declaration = 61, RULE_generic_Type = 62, RULE_eos = 63, 
		RULE_html_value = 64, RULE_tags = 65, RULE_open_tag = 66, RULE_html_attribute = 67, 
		RULE_close_tag = 68, RULE_single_tag = 69, RULE_template_variable = 70, 
		RULE_ng_content = 71, RULE_ng_template = 72;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "injectable_declaration", "injectable_metadata", "injectable_metadata_property", 
			"export_statement", "anguler_import", "component_declaration", "component_metadata", 
			"metadata_property", "type_annotation", "base_type_annotation", "primitive_type", 
			"array_type", "structured_type", "type_pair", "class_declaration", "class_body", 
			"property_declaration", "method_declaration", "method_body", "function_declaration", 
			"function_body", "emit_statement", "parameter_list", "parameter", "declaraiton_keywords", 
			"variable_declaration", "primary", "type_arguments", "postfix_expression", 
			"postfix_operator", "value", "assignment", "literal_value", "unary_expression", 
			"logical_expression", "relational_expression", "equality_expression", 
			"arithmetic_expression", "conditional_expression", "expression", "json_object", 
			"json_pair", "imports_array", "array", "array_element", "instruction", 
			"conditional_statements", "block", "if_statement", "for_statement", "switch_statement", 
			"switch_body", "switch_case", "switch_default", "while_statement", "do_while_statement", 
			"continue_Statement", "return_Statement", "break_statement", "expressionSequence", 
			"interface_Declaration", "generic_Type", "eos", "html_value", "tags", 
			"open_tag", "html_attribute", "close_tag", "single_tag", "template_variable", 
			"ng_content", "ng_template"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'@Component'", "'@Injectable'", "'@Input'", 
			"'@Output'", "'@ViewChild'", "'@ContentChild'", "'selector'", "'standalone'", 
			"'imports'", "'template'", "'templateUrl'", "'styles'", "'styleUrls'", 
			"'styleUrl'", "'providedIn'", "'*ngIf'", "'*ngFor'", "'ngClass'", "'ngStyle'", 
			"'ngModel'", "'ngOnInit'", "'ngOnChanges'", "'ngOnDestroy'", "'private'", 
			"'public'", "'protected'", "'class'", "'import'", "'from'", "'export'", 
			"'const'", "'let'", "'var'", "'if'", "'else'", "'for'", "'while'", "'do'", 
			"'switch'", "'case'", "'default'", "'return'", "'break'", "'continue'", 
			"'new'", "'this'", "'super'", "'function'", "'interface'", "'void'", 
			"'null'", "'undefined'", "'emit'", "'string'", "'number'", "'boolean'", 
			"'any'", "'...'", "'++'", "'--'", "'!'", "'?'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'&&'", "'||'", "'|'", "'=>'", "'=='", "'!='", "'==='", 
			"'!=='", "'<='", "'>='", "'{'", "'}'", "'('", "')'", "'['", "']'", "','", 
			"';'", "'.'", "':'", "'='", "'$'", "'#'", "'<'", "'>'", "'div'", "'h1'", 
			"'h2'", "'h3'", "'p'", "'img'", "'a'", "'span'", "'button'", "'ng-content'", 
			"'ng-template'", "'style'", "'alt'", "'src'", "'href'", "'routerLink'", 
			"'router-outlet'", "'formControlName'", "'formGroup'", "'formArray'", 
			null, null, null, null, null, null, "'@angular'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LINE_COMMENT", "BLOCK_COMMENT", "COMPONENT", "INJECTABLE", 
			"INPUT", "OUTPUT", "VIEW_CHILD", "CONTENT_CHILD", "SELECTOR", "STANDALONE", 
			"IMPORTS", "TEMPLATE", "TEMPLATE_URL", "STYLES", "STYLE_URLS", "STYLE_URL", 
			"PROVIDED_IN", "NG_IF", "NG_FOR", "NG_CLASS", "NG_STYLE", "NG_MODEL", 
			"NG_ON_INIT", "NG_ON_CHANGES", "NG_ON_DESTROY", "PRIVATE", "PUBLIC", 
			"PROTECTED", "CLASS", "IMPORT", "FROM", "EXPORT", "CONST", "LET", "VAR", 
			"IF", "ELSE", "FOR", "WHILE", "DO", "SWITCH", "CASE", "DEFAULT", "RETURN", 
			"BREAK", "CONTINUE", "NEW", "THIS", "SUPER", "FUNCTION", "INTERFACE", 
			"VOID", "NULL", "UNDEFINED", "EMIT", "STRING", "NUMBER", "BOOLEAN", "ANY", 
			"ELLIPSIS", "INCREMENT", "DECREMENT", "NOT", "QUESTION", "SUM", "MIN", 
			"MUL", "SLASH", "MOD", "AND", "OR", "PIPE", "ARROW", "IS_EQUAL", "NOT_EQUAL", 
			"IS_EQUAL_TYPE", "NOT_EQUAL_TYPE", "LESS_EQUAL", "GREATER_EQUAL", "OPEN_BRACE", 
			"CLOSE_BRACE", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"COMMA", "SEMICOLON", "DOT", "COLON", "EQUAL", "DOLLAR", "HASH", "OPENTAG", 
			"CLOSETAG", "DIV_TAG", "H1_TAG", "H2_TAG", "H3_TAG", "P_TAG", "IMG_TAG", 
			"A_TAG", "SPAN_TAG", "BUTTON_TAG", "NG_CONTENT", "NG_TEMPLATE", "STYLE_ATTR", 
			"ALT_ATTR", "SRC_ATTR", "HREF_ATTR", "ROUTER_LINK", "ROUTER_OUTLET", 
			"FORM_CONTROL_NAME", "FORM_GROUP", "FORM_ARRAY", "BOOLEAN_LITERAL", "DECIMAL_INTEGER_LITERAL", 
			"FLOAT_LITERAL", "STRING_LITERAL", "TEMPLATE_LITERAL", "IDENTIFIER", 
			"ANGULAR", "UNEXPECTED_TOKEN"
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
		public TerminalNode EOF() { return getToken(AngulerParser.EOF, 0); }
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
		public List<Injectable_declarationContext> injectable_declaration() {
			return getRuleContexts(Injectable_declarationContext.class);
		}
		public Injectable_declarationContext injectable_declaration(int i) {
			return getRuleContext(Injectable_declarationContext.class,i);
		}
		public List<Export_statementContext> export_statement() {
			return getRuleContexts(Export_statementContext.class);
		}
		public Export_statementContext export_statement(int i) {
			return getRuleContext(Export_statementContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 11811160112L) != 0)) {
				{
				setState(151);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(146);
					anguler_import();
					}
					break;
				case 2:
					{
					setState(147);
					component_declaration();
					}
					break;
				case 3:
					{
					setState(148);
					injectable_declaration();
					}
					break;
				case 4:
					{
					setState(149);
					export_statement();
					}
					break;
				case 5:
					{
					setState(150);
					class_declaration();
					}
					break;
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			match(EOF);
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
	public static class Injectable_declarationContext extends ParserRuleContext {
		public TerminalNode INJECTABLE() { return getToken(AngulerParser.INJECTABLE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public Injectable_metadataContext injectable_metadata() {
			return getRuleContext(Injectable_metadataContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public Injectable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injectable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterInjectable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitInjectable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitInjectable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Injectable_declarationContext injectable_declaration() throws RecognitionException {
		Injectable_declarationContext _localctx = new Injectable_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_injectable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(INJECTABLE);
			setState(159);
			match(OPEN_PAREN);
			setState(160);
			injectable_metadata();
			setState(161);
			match(CLOSE_PAREN);
			setState(162);
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
	public static class Injectable_metadataContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngulerParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngulerParser.CLOSE_BRACE, 0); }
		public List<Injectable_metadata_propertyContext> injectable_metadata_property() {
			return getRuleContexts(Injectable_metadata_propertyContext.class);
		}
		public Injectable_metadata_propertyContext injectable_metadata_property(int i) {
			return getRuleContext(Injectable_metadata_propertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngulerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngulerParser.COMMA, i);
		}
		public Injectable_metadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injectable_metadata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterInjectable_metadata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitInjectable_metadata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitInjectable_metadata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Injectable_metadataContext injectable_metadata() throws RecognitionException {
		Injectable_metadataContext _localctx = new Injectable_metadataContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_injectable_metadata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(OPEN_BRACE);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROVIDED_IN) {
				{
				setState(165);
				injectable_metadata_property();
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(166);
					match(COMMA);
					setState(167);
					injectable_metadata_property();
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(175);
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
	public static class Injectable_metadata_propertyContext extends ParserRuleContext {
		public TerminalNode PROVIDED_IN() { return getToken(AngulerParser.PROVIDED_IN, 0); }
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngulerParser.STRING_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public Injectable_metadata_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injectable_metadata_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterInjectable_metadata_property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitInjectable_metadata_property(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitInjectable_metadata_property(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Injectable_metadata_propertyContext injectable_metadata_property() throws RecognitionException {
		Injectable_metadata_propertyContext _localctx = new Injectable_metadata_propertyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_injectable_metadata_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(PROVIDED_IN);
			setState(178);
			match(COLON);
			setState(179);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL || _la==IDENTIFIER) ) {
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
	public static class Export_statementContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(AngulerParser.EXPORT, 0); }
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Interface_DeclarationContext interface_Declaration() {
			return getRuleContext(Interface_DeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngulerParser.SEMICOLON, 0); }
		public Export_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterExport_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitExport_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitExport_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Export_statementContext export_statement() throws RecognitionException {
		Export_statementContext _localctx = new Export_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_export_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(EXPORT);
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(182);
				variable_declaration();
				}
				break;
			case 2:
				{
				setState(183);
				method_declaration();
				}
				break;
			case 3:
				{
				setState(184);
				function_declaration();
				}
				break;
			case 4:
				{
				setState(185);
				interface_Declaration();
				}
				break;
			}
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(188);
				match(SEMICOLON);
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
		enterRule(_localctx, 10, RULE_anguler_import);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(IMPORT);
			setState(192);
			match(OPEN_BRACE);
			setState(193);
			match(IDENTIFIER);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(194);
				match(COMMA);
				setState(195);
				match(IDENTIFIER);
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			match(CLOSE_BRACE);
			setState(202);
			match(FROM);
			setState(203);
			match(STRING_LITERAL);
			setState(204);
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
		enterRule(_localctx, 12, RULE_component_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(COMPONENT);
			setState(207);
			match(OPEN_PAREN);
			setState(208);
			component_metadata();
			setState(209);
			match(CLOSE_PAREN);
			setState(210);
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
		enterRule(_localctx, 14, RULE_component_metadata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(OPEN_BRACE);
			{
			setState(213);
			metadata_property();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(214);
				match(COMMA);
				setState(215);
				metadata_property();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(221);
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
		public TerminalNode BOOLEAN_LITERAL() { return getToken(AngulerParser.BOOLEAN_LITERAL, 0); }
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
		enterRule(_localctx, 16, RULE_metadata_property);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new MetadataSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(SELECTOR);
				setState(224);
				match(COLON);
				setState(225);
				match(STRING_LITERAL);
				}
				break;
			case STANDALONE:
				_localctx = new MetadataStandaloneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(STANDALONE);
				setState(227);
				match(COLON);
				setState(228);
				match(BOOLEAN_LITERAL);
				}
				break;
			case IMPORTS:
				_localctx = new MetadataImportsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				match(IMPORTS);
				setState(230);
				match(COLON);
				{
				setState(231);
				imports_array();
				}
				}
				break;
			case TEMPLATE:
				_localctx = new MetadataTemplateContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				match(TEMPLATE);
				setState(233);
				match(COLON);
				setState(234);
				match(TEMPLATE_LITERAL);
				}
				break;
			case TEMPLATE_URL:
				_localctx = new MetadataTemplateUrlContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(235);
				match(TEMPLATE_URL);
				setState(236);
				match(COLON);
				setState(237);
				match(STRING_LITERAL);
				}
				break;
			case STYLES:
				_localctx = new MetadataStylesContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(238);
				match(STYLES);
				setState(239);
				match(COLON);
				setState(242);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_LITERAL:
					{
					setState(240);
					match(STRING_LITERAL);
					}
					break;
				case OPEN_BRACKET:
					{
					setState(241);
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
				setState(244);
				match(STYLE_URLS);
				setState(245);
				match(COLON);
				setState(246);
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
		enterRule(_localctx, 18, RULE_type_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			base_type_annotation();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(250);
				match(PIPE);
				setState(251);
				base_type_annotation();
				}
				}
				setState(256);
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
		enterRule(_localctx, 20, RULE_base_type_annotation);
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new SimpleTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new PrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				primitive_type();
				}
				break;
			case 3:
				_localctx = new NullTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				match(NULL);
				}
				break;
			case 4:
				_localctx = new VoidTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
				match(VOID);
				}
				break;
			case 5:
				_localctx = new StructuredTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(261);
				structured_type();
				}
				break;
			case 6:
				_localctx = new ArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(262);
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
		enterRule(_localctx, 22, RULE_primitive_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2197756618156802048L) != 0)) ) {
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
		enterRule(_localctx, 24, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(IDENTIFIER);
			setState(268);
			match(OPEN_BRACKET);
			setState(269);
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
		enterRule(_localctx, 26, RULE_structured_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(OPEN_BRACE);
			setState(272);
			type_pair();
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(273);
					match(SEMICOLON);
					setState(274);
					type_pair();
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(280);
				match(SEMICOLON);
				}
			}

			setState(283);
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
		enterRule(_localctx, 28, RULE_type_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(IDENTIFIER);
			setState(286);
			match(COLON);
			setState(287);
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
		enterRule(_localctx, 30, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(289);
				match(EXPORT);
				}
			}

			setState(292);
			match(CLASS);
			setState(293);
			match(IDENTIFIER);
			setState(294);
			match(OPEN_BRACE);
			setState(295);
			class_body();
			setState(296);
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
		enterRule(_localctx, 32, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1704639128693374848L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 860187528830517261L) != 0)) {
				{
				setState(303);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(298);
					property_declaration();
					}
					break;
				case 2:
					{
					setState(299);
					method_declaration();
					}
					break;
				case 3:
					{
					setState(300);
					function_declaration();
					}
					break;
				case 4:
					{
					setState(301);
					class_declaration();
					}
					break;
				case 5:
					{
					setState(302);
					instruction();
					}
					break;
				}
				}
				setState(307);
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
		enterRule(_localctx, 34, RULE_property_declaration);
		int _la;
		try {
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIVATE:
			case PUBLIC:
			case PROTECTED:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) {
					{
					setState(308);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(311);
				match(IDENTIFIER);
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(312);
					match(COLON);
					setState(313);
					type_annotation();
					}
				}

				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(316);
					match(EQUAL);
					setState(317);
					expression();
					}
				}

				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(320);
					match(SEMICOLON);
					}
				}

				}
				break;
			case OUTPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(OUTPUT);
				setState(324);
				match(OPEN_PAREN);
				setState(325);
				match(CLOSE_PAREN);
				setState(326);
				match(IDENTIFIER);
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(327);
					match(EQUAL);
					setState(328);
					expression();
					}
				}

				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(331);
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
	public static class Method_declarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public Method_bodyContext method_body() {
			return getRuleContext(Method_bodyContext.class,0);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(AngulerParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(AngulerParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(AngulerParser.PROTECTED, 0); }
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
		enterRule(_localctx, 36, RULE_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) {
				{
				setState(336);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(339);
			match(IDENTIFIER);
			setState(340);
			match(OPEN_PAREN);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(341);
				parameter_list();
				}
			}

			setState(344);
			match(CLOSE_PAREN);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(345);
				match(COLON);
				setState(346);
				type_annotation();
				}
			}

			setState(349);
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
		public TerminalNode OPEN_BRACE() { return getToken(AngulerParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngulerParser.CLOSE_BRACE, 0); }
		public List<Variable_declarationContext> variable_declaration() {
			return getRuleContexts(Variable_declarationContext.class);
		}
		public Variable_declarationContext variable_declaration(int i) {
			return getRuleContext(Variable_declarationContext.class,i);
		}
		public List<Return_StatementContext> return_Statement() {
			return getRuleContexts(Return_StatementContext.class);
		}
		public Return_StatementContext return_Statement(int i) {
			return getRuleContext(Return_StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(AngulerParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AngulerParser.SEMICOLON, i);
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
		enterRule(_localctx, 38, RULE_method_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(OPEN_BRACE);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1709362228932640768L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 283726776527093773L) != 0)) {
				{
				setState(358);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(352);
					variable_declaration();
					}
					break;
				case 2:
					{
					setState(353);
					return_Statement();
					}
					break;
				case 3:
					{
					setState(354);
					expression();
					setState(356);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(355);
						match(SEMICOLON);
						}
					}

					}
					break;
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363);
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
		enterRule(_localctx, 40, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(IDENTIFIER);
			setState(366);
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
		enterRule(_localctx, 42, RULE_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(OPEN_PAREN);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(369);
				parameter_list();
				}
			}

			setState(372);
			match(CLOSE_PAREN);
			setState(373);
			match(OPEN_BRACE);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1704639128693374976L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 860187528830517261L) != 0)) {
				{
				{
				setState(374);
				instruction();
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(380);
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
	public static class Emit_statementContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(AngulerParser.THIS, 0); }
		public List<TerminalNode> DOT() { return getTokens(AngulerParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngulerParser.DOT, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public TerminalNode EMIT() { return getToken(AngulerParser.EMIT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public Json_objectContext json_object() {
			return getRuleContext(Json_objectContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngulerParser.SEMICOLON, 0); }
		public Emit_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emit_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterEmit_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitEmit_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitEmit_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Emit_statementContext emit_statement() throws RecognitionException {
		Emit_statementContext _localctx = new Emit_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_emit_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(THIS);
			setState(383);
			match(DOT);
			setState(384);
			match(IDENTIFIER);
			setState(385);
			match(DOT);
			setState(386);
			match(EMIT);
			setState(387);
			match(OPEN_PAREN);
			setState(388);
			json_object();
			setState(389);
			match(CLOSE_PAREN);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(390);
				match(SEMICOLON);
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
		enterRule(_localctx, 46, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			parameter();
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(394);
				match(COMMA);
				setState(395);
				parameter();
				}
				}
				setState(400);
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
		enterRule(_localctx, 48, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(IDENTIFIER);
			setState(402);
			match(COLON);
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(403);
				base_type_annotation();
				}
				break;
			case 2:
				{
				setState(404);
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
		enterRule(_localctx, 50, RULE_declaraiton_keywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) ) {
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
		public TerminalNode SEMICOLON() { return getToken(AngulerParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 52, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) {
				{
				setState(409);
				declaraiton_keywords();
				}
			}

			setState(412);
			match(IDENTIFIER);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(413);
				match(COLON);
				setState(414);
				type_annotation();
				}
			}

			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(417);
				match(EQUAL);
				setState(418);
				expression();
				}
			}

			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(421);
				match(SEMICOLON);
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
	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryEmptyParensContext extends PrimaryContext {
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public PrimaryEmptyParensContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterPrimaryEmptyParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitPrimaryEmptyParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitPrimaryEmptyParens(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryJsonObjectContext extends PrimaryContext {
		public Json_objectContext json_object() {
			return getRuleContext(Json_objectContext.class,0);
		}
		public PrimaryJsonObjectContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterPrimaryJsonObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitPrimaryJsonObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitPrimaryJsonObject(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimarySuperContext extends PrimaryContext {
		public TerminalNode SUPER() { return getToken(AngulerParser.SUPER, 0); }
		public PrimarySuperContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterPrimarySuper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitPrimarySuper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitPrimarySuper(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SpreadExpressionContext extends PrimaryContext {
		public TerminalNode ELLIPSIS() { return getToken(AngulerParser.ELLIPSIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SpreadExpressionContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterSpreadExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitSpreadExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitSpreadExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewExpressionContext extends PrimaryContext {
		public TerminalNode NEW() { return getToken(AngulerParser.NEW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public Type_argumentsContext type_arguments() {
			return getRuleContext(Type_argumentsContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngulerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngulerParser.COMMA, i);
		}
		public NewExpressionContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryArrayContext extends PrimaryContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public PrimaryArrayContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterPrimaryArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitPrimaryArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitPrimaryArray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryThisContext extends PrimaryContext {
		public TerminalNode THIS() { return getToken(AngulerParser.THIS, 0); }
		public PrimaryThisContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterPrimaryThis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitPrimaryThis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitPrimaryThis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryBooleanContext extends PrimaryContext {
		public TerminalNode BOOLEAN() { return getToken(AngulerParser.BOOLEAN, 0); }
		public PrimaryBooleanContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterPrimaryBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitPrimaryBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitPrimaryBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryIdentifierContext extends PrimaryContext {
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public PrimaryIdentifierContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterPrimaryIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitPrimaryIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitPrimaryIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryNullContext extends PrimaryContext {
		public TerminalNode NULL() { return getToken(AngulerParser.NULL, 0); }
		public PrimaryNullContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterPrimaryNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitPrimaryNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitPrimaryNull(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryLiteralContext extends PrimaryContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public PrimaryLiteralContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterPrimaryLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitPrimaryLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitPrimaryLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_primary);
		int _la;
		try {
			setState(453);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case TEMPLATE_LITERAL:
				_localctx = new PrimaryLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				literal_value();
				}
				break;
			case IDENTIFIER:
				_localctx = new PrimaryIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				match(IDENTIFIER);
				}
				break;
			case OPEN_PAREN:
				_localctx = new PrimaryEmptyParensContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
				match(OPEN_PAREN);
				setState(427);
				match(CLOSE_PAREN);
				}
				break;
			case NULL:
				_localctx = new PrimaryNullContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(428);
				match(NULL);
				}
				break;
			case OPEN_BRACE:
				_localctx = new PrimaryJsonObjectContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(429);
				json_object();
				}
				break;
			case OPEN_BRACKET:
				_localctx = new PrimaryArrayContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(430);
				array();
				}
				break;
			case BOOLEAN:
				_localctx = new PrimaryBooleanContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(431);
				match(BOOLEAN);
				}
				break;
			case THIS:
				_localctx = new PrimaryThisContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(432);
				match(THIS);
				}
				break;
			case SUPER:
				_localctx = new PrimarySuperContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(433);
				match(SUPER);
				}
				break;
			case NEW:
				_localctx = new NewExpressionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(434);
				match(NEW);
				setState(435);
				match(IDENTIFIER);
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPENTAG) {
					{
					setState(436);
					type_arguments();
					}
				}

				setState(439);
				match(OPEN_PAREN);
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1709397533563813888L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 283726776527093773L) != 0)) {
					{
					setState(440);
					expression();
					setState(445);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(441);
						match(COMMA);
						setState(442);
						expression();
						}
						}
						setState(447);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(450);
				match(CLOSE_PAREN);
				}
				break;
			case ELLIPSIS:
				_localctx = new SpreadExpressionContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(451);
				match(ELLIPSIS);
				setState(452);
				expression();
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
	public static class Type_argumentsContext extends ParserRuleContext {
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
		public Type_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterType_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitType_arguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitType_arguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_argumentsContext type_arguments() throws RecognitionException {
		Type_argumentsContext _localctx = new Type_argumentsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_type_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(OPENTAG);
			setState(456);
			type_annotation();
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(457);
				match(COMMA);
				setState(458);
				type_annotation();
				}
				}
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(464);
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
	public static class Postfix_expressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<Postfix_operatorContext> postfix_operator() {
			return getRuleContexts(Postfix_operatorContext.class);
		}
		public Postfix_operatorContext postfix_operator(int i) {
			return getRuleContext(Postfix_operatorContext.class,i);
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
		enterRule(_localctx, 58, RULE_postfix_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			primary();
			setState(470);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(467);
					postfix_operator();
					}
					} 
				}
				setState(472);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
	public static class Postfix_operatorContext extends ParserRuleContext {
		public Postfix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_operator; }
	 
		public Postfix_operatorContext() { }
		public void copyFrom(Postfix_operatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberAccessContext extends Postfix_operatorContext {
		public TerminalNode DOT() { return getToken(AngulerParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngulerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngulerParser.COMMA, i);
		}
		public MemberAccessContext(Postfix_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends Postfix_operatorContext {
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngulerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngulerParser.COMMA, i);
		}
		public FunctionCallContext(Postfix_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessContext extends Postfix_operatorContext {
		public TerminalNode OPEN_BRACKET() { return getToken(AngulerParser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(AngulerParser.CLOSE_BRACKET, 0); }
		public ArrayAccessContext(Postfix_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_operatorContext postfix_operator() throws RecognitionException {
		Postfix_operatorContext _localctx = new Postfix_operatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_postfix_operator);
		int _la;
		try {
			setState(505);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new MemberAccessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				match(DOT);
				setState(474);
				match(IDENTIFIER);
				setState(487);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(475);
					match(OPEN_PAREN);
					setState(484);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1709397533563813888L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 283726776527093773L) != 0)) {
						{
						setState(476);
						expression();
						setState(481);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(477);
							match(COMMA);
							setState(478);
							expression();
							}
							}
							setState(483);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(486);
					match(CLOSE_PAREN);
					}
					break;
				}
				}
				break;
			case OPEN_BRACKET:
				_localctx = new ArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(489);
				match(OPEN_BRACKET);
				setState(490);
				expression();
				setState(491);
				match(CLOSE_BRACKET);
				}
				break;
			case OPEN_PAREN:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(493);
				match(OPEN_PAREN);
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1709397533563813888L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 283726776527093773L) != 0)) {
					{
					setState(494);
					expression();
					setState(499);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(495);
						match(COMMA);
						setState(496);
						expression();
						}
						}
						setState(501);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(504);
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
	public static class SpreadValueContext extends ValueContext {
		public TerminalNode ELLIPSIS() { return getToken(AngulerParser.ELLIPSIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SpreadValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterSpreadValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitSpreadValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitSpreadValue(this);
			else return visitor.visitChildren(this);
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
		enterRule(_localctx, 62, RULE_value);
		try {
			setState(518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case TEMPLATE_LITERAL:
				_localctx = new LiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				literal_value();
				}
				break;
			case IDENTIFIER:
				_localctx = new IdentifierValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				match(IDENTIFIER);
				}
				break;
			case NULL:
				_localctx = new NullValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
				match(NULL);
				}
				break;
			case OPEN_BRACE:
				_localctx = new ObjectValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(510);
				json_object();
				}
				break;
			case OPEN_BRACKET:
				_localctx = new ArrayValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(511);
				array();
				}
				break;
			case OPEN_PAREN:
				_localctx = new ParenthesizedValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(512);
				match(OPEN_PAREN);
				setState(513);
				expression();
				setState(514);
				match(CLOSE_PAREN);
				}
				break;
			case ELLIPSIS:
				_localctx = new SpreadValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(516);
				match(ELLIPSIS);
				setState(517);
				expression();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 64, RULE_assignment);
		int _la;
		try {
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				postfix_expression();
				setState(521);
				match(EQUAL);
				setState(522);
				expression();
				setState(524);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(523);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				match(IDENTIFIER);
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOLLAR) {
					{
					setState(527);
					match(DOLLAR);
					}
				}

				setState(530);
				match(EQUAL);
				setState(531);
				expression();
				setState(533);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(532);
					match(DOLLAR);
					}
					break;
				}
				setState(536);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(535);
					match(SEMICOLON);
					}
					break;
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
		enterRule(_localctx, 66, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			_la = _input.LA(1);
			if ( !(((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & 15L) != 0)) ) {
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
		enterRule(_localctx, 68, RULE_unary_expression);
		int _la;
		try {
			setState(551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUM:
			case MIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				_la = _input.LA(1);
				if ( !(_la==SUM || _la==MIN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(543);
				value();
				}
				break;
			case INCREMENT:
			case DECREMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(544);
				_la = _input.LA(1);
				if ( !(_la==INCREMENT || _la==DECREMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(545);
				value();
				}
				break;
			case NULL:
			case ELLIPSIS:
			case OPEN_BRACE:
			case OPEN_PAREN:
			case OPEN_BRACKET:
			case DECIMAL_INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case TEMPLATE_LITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(546);
				value();
				setState(547);
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
				setState(549);
				match(NOT);
				setState(550);
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
	public static class Logical_expressionContext extends ParserRuleContext {
		public List<Postfix_expressionContext> postfix_expression() {
			return getRuleContexts(Postfix_expressionContext.class);
		}
		public Postfix_expressionContext postfix_expression(int i) {
			return getRuleContext(Postfix_expressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(AngulerParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(AngulerParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(AngulerParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(AngulerParser.OR, i);
		}
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
		Logical_expressionContext _localctx = new Logical_expressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_logical_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			postfix_expression();
			setState(558);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(554);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(555);
					postfix_expression();
					}
					} 
				}
				setState(560);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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
	public static class Relational_expressionContext extends ParserRuleContext {
		public List<Postfix_expressionContext> postfix_expression() {
			return getRuleContexts(Postfix_expressionContext.class);
		}
		public Postfix_expressionContext postfix_expression(int i) {
			return getRuleContext(Postfix_expressionContext.class,i);
		}
		public List<TerminalNode> OPENTAG() { return getTokens(AngulerParser.OPENTAG); }
		public TerminalNode OPENTAG(int i) {
			return getToken(AngulerParser.OPENTAG, i);
		}
		public List<TerminalNode> CLOSETAG() { return getTokens(AngulerParser.CLOSETAG); }
		public TerminalNode CLOSETAG(int i) {
			return getToken(AngulerParser.CLOSETAG, i);
		}
		public List<TerminalNode> LESS_EQUAL() { return getTokens(AngulerParser.LESS_EQUAL); }
		public TerminalNode LESS_EQUAL(int i) {
			return getToken(AngulerParser.LESS_EQUAL, i);
		}
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
		enterRule(_localctx, 72, RULE_relational_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			postfix_expression();
			setState(566);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(562);
					_la = _input.LA(1);
					if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 98305L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(563);
					postfix_expression();
					}
					} 
				}
				setState(568);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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
	public static class Equality_expressionContext extends ParserRuleContext {
		public List<Postfix_expressionContext> postfix_expression() {
			return getRuleContexts(Postfix_expressionContext.class);
		}
		public Postfix_expressionContext postfix_expression(int i) {
			return getRuleContext(Postfix_expressionContext.class,i);
		}
		public List<TerminalNode> IS_EQUAL() { return getTokens(AngulerParser.IS_EQUAL); }
		public TerminalNode IS_EQUAL(int i) {
			return getToken(AngulerParser.IS_EQUAL, i);
		}
		public List<TerminalNode> NOT_EQUAL() { return getTokens(AngulerParser.NOT_EQUAL); }
		public TerminalNode NOT_EQUAL(int i) {
			return getToken(AngulerParser.NOT_EQUAL, i);
		}
		public List<TerminalNode> IS_EQUAL_TYPE() { return getTokens(AngulerParser.IS_EQUAL_TYPE); }
		public TerminalNode IS_EQUAL_TYPE(int i) {
			return getToken(AngulerParser.IS_EQUAL_TYPE, i);
		}
		public List<TerminalNode> NOT_EQUAL_TYPE() { return getTokens(AngulerParser.NOT_EQUAL_TYPE); }
		public TerminalNode NOT_EQUAL_TYPE(int i) {
			return getToken(AngulerParser.NOT_EQUAL_TYPE, i);
		}
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
		enterRule(_localctx, 74, RULE_equality_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			postfix_expression();
			setState(574);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(570);
					_la = _input.LA(1);
					if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 15L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(571);
					postfix_expression();
					}
					} 
				}
				setState(576);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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
		public List<Postfix_expressionContext> postfix_expression() {
			return getRuleContexts(Postfix_expressionContext.class);
		}
		public Postfix_expressionContext postfix_expression(int i) {
			return getRuleContext(Postfix_expressionContext.class,i);
		}
		public List<TerminalNode> SUM() { return getTokens(AngulerParser.SUM); }
		public TerminalNode SUM(int i) {
			return getToken(AngulerParser.SUM, i);
		}
		public List<TerminalNode> MIN() { return getTokens(AngulerParser.MIN); }
		public TerminalNode MIN(int i) {
			return getToken(AngulerParser.MIN, i);
		}
		public List<TerminalNode> MUL() { return getTokens(AngulerParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(AngulerParser.MUL, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(AngulerParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(AngulerParser.SLASH, i);
		}
		public List<TerminalNode> MOD() { return getTokens(AngulerParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(AngulerParser.MOD, i);
		}
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
		enterRule(_localctx, 76, RULE_arithmetic_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			postfix_expression();
			setState(582);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(578);
					_la = _input.LA(1);
					if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 31L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(579);
					postfix_expression();
					}
					} 
				}
				setState(584);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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
	public static class Conditional_expressionContext extends ParserRuleContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
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
		enterRule(_localctx, 78, RULE_conditional_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			postfix_expression();
			setState(586);
			match(QUESTION);
			setState(587);
			expression();
			setState(588);
			match(COLON);
			setState(589);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExprContext extends ExpressionContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterAssignmentExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitAssignmentExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitAssignmentExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprContext extends ExpressionContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public UnaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExprContext extends ExpressionContext {
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public LogicalExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterLogicalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitLogicalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitLogicalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixExprContext extends ExpressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public PostfixExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterPostfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitPostfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitPostfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticExprContext extends ExpressionContext {
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public ArithmeticExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterArithmeticExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitArithmeticExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitArithmeticExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExprContext extends ExpressionContext {
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public RelationalExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitRelationalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentBooleanContext extends ExpressionContext {
		public TerminalNode BOOLEAN_LITERAL() { return getToken(AngulerParser.BOOLEAN_LITERAL, 0); }
		public AssignmentBooleanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterAssignmentBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitAssignmentBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitAssignmentBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExprContext extends ExpressionContext {
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public EqualityExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalExprContext extends ExpressionContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public ConditionalExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterConditionalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitConditionalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitConditionalExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expression);
		try {
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				_localctx = new PostfixExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				postfix_expression();
				}
				break;
			case 2:
				_localctx = new UnaryExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				unary_expression();
				}
				break;
			case 3:
				_localctx = new ArithmeticExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(593);
				arithmetic_expression();
				}
				break;
			case 4:
				_localctx = new EqualityExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(594);
				equality_expression();
				}
				break;
			case 5:
				_localctx = new RelationalExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(595);
				relational_expression();
				}
				break;
			case 6:
				_localctx = new LogicalExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(596);
				logical_expression();
				}
				break;
			case 7:
				_localctx = new ConditionalExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(597);
				conditional_expression();
				}
				break;
			case 8:
				_localctx = new AssignmentExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(598);
				assignment();
				}
				break;
			case 9:
				_localctx = new AssignmentBooleanContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(599);
				match(BOOLEAN_LITERAL);
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
		enterRule(_localctx, 82, RULE_json_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(OPEN_BRACE);
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_LITERAL || _la==IDENTIFIER) {
				{
				setState(603);
				json_pair();
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(604);
					match(COMMA);
					setState(605);
					json_pair();
					}
					}
					setState(610);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(613);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 84, RULE_json_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(616);
			match(COLON);
			setState(617);
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
		enterRule(_localctx, 86, RULE_imports_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(OPEN_BRACKET);
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULL || _la==ELLIPSIS || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 2130303778837L) != 0)) {
				{
				setState(620);
				value();
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(621);
					match(COMMA);
					setState(622);
					value();
					}
					}
					setState(627);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(630);
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
		public List<Array_elementContext> array_element() {
			return getRuleContexts(Array_elementContext.class);
		}
		public Array_elementContext array_element(int i) {
			return getRuleContext(Array_elementContext.class,i);
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
		enterRule(_localctx, 88, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(OPEN_BRACKET);
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1709397533563813888L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 283726776527093773L) != 0)) {
				{
				setState(633);
				array_element();
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(634);
					match(COMMA);
					setState(635);
					array_element();
					}
					}
					setState(640);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(643);
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
	public static class Array_elementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(AngulerParser.ELLIPSIS, 0); }
		public Array_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterArray_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitArray_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitArray_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_elementContext array_element() throws RecognitionException {
		Array_elementContext _localctx = new Array_elementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_array_element);
		try {
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				match(ELLIPSIS);
				setState(647);
				expression();
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
		public TerminalNode SEMICOLON() { return getToken(AngulerParser.SEMICOLON, 0); }
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
	public static class ExportStatementContext extends InstructionContext {
		public TerminalNode EXPORT() { return getToken(AngulerParser.EXPORT, 0); }
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngulerParser.SEMICOLON, 0); }
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
	public static class AssignmentStatementContext extends InstructionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngulerParser.SEMICOLON, 0); }
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
	public static class ErrorStatementContext extends InstructionContext {
		public TerminalNode UNEXPECTED_TOKEN() { return getToken(AngulerParser.UNEXPECTED_TOKEN, 0); }
		public ErrorStatementContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterErrorStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitErrorStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitErrorStatement(this);
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
	public static class EmitStatementContext extends InstructionContext {
		public Emit_statementContext emit_statement() {
			return getRuleContext(Emit_statementContext.class,0);
		}
		public EmitStatementContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterEmitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitEmitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitEmitStatement(this);
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
		enterRule(_localctx, 92, RULE_instruction);
		int _la;
		try {
			setState(675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				_localctx = new DeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(650);
				variable_declaration();
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(651);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 2:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
				expression();
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(655);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 3:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(658);
				postfix_expression();
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(659);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 4:
				_localctx = new EmitStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(662);
				emit_statement();
				}
				break;
			case 5:
				_localctx = new ClassDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(663);
				class_declaration();
				}
				break;
			case 6:
				_localctx = new MethodDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(664);
				method_declaration();
				}
				break;
			case 7:
				_localctx = new FunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(665);
				function_declaration();
				}
				break;
			case 8:
				_localctx = new ConditionalStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(666);
				conditional_statements();
				}
				break;
			case 9:
				_localctx = new InterfaceDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(667);
				interface_Declaration();
				}
				break;
			case 10:
				_localctx = new GenericTypeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(668);
				generic_Type();
				}
				break;
			case 11:
				_localctx = new ExportStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(669);
				match(EXPORT);
				setState(670);
				variable_declaration();
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(671);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 12:
				_localctx = new ErrorStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(674);
				match(UNEXPECTED_TOKEN);
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
		public Conditional_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_statements; }
	 
		public Conditional_statementsContext() { }
		public void copyFrom(Conditional_statementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementRuleContext extends Conditional_statementsContext {
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public ForStatementRuleContext(Conditional_statementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterForStatementRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitForStatementRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitForStatementRule(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementRuleContext extends Conditional_statementsContext {
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public BreakStatementRuleContext(Conditional_statementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterBreakStatementRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitBreakStatementRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitBreakStatementRule(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementRuleContext extends Conditional_statementsContext {
		public Return_StatementContext return_Statement() {
			return getRuleContext(Return_StatementContext.class,0);
		}
		public ReturnStatementRuleContext(Conditional_statementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterReturnStatementRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitReturnStatementRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitReturnStatementRule(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStatementRuleContext extends Conditional_statementsContext {
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
		}
		public DoWhileStatementRuleContext(Conditional_statementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterDoWhileStatementRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitDoWhileStatementRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitDoWhileStatementRule(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatementRuleContext extends Conditional_statementsContext {
		public Continue_StatementContext continue_Statement() {
			return getRuleContext(Continue_StatementContext.class,0);
		}
		public ContinueStatementRuleContext(Conditional_statementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterContinueStatementRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitContinueStatementRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitContinueStatementRule(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementRuleContext extends Conditional_statementsContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public IfStatementRuleContext(Conditional_statementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterIfStatementRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitIfStatementRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitIfStatementRule(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStatementRuleContext extends Conditional_statementsContext {
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public SwitchStatementRuleContext(Conditional_statementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterSwitchStatementRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitSwitchStatementRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitSwitchStatementRule(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementRuleContext extends Conditional_statementsContext {
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public WhileStatementRuleContext(Conditional_statementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterWhileStatementRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitWhileStatementRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitWhileStatementRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_statementsContext conditional_statements() throws RecognitionException {
		Conditional_statementsContext _localctx = new Conditional_statementsContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_conditional_statements);
		try {
			setState(685);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfStatementRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(677);
				if_statement();
				}
				break;
			case SWITCH:
				_localctx = new SwitchStatementRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				switch_statement();
				}
				break;
			case WHILE:
				_localctx = new WhileStatementRuleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(679);
				while_statement();
				}
				break;
			case DO:
				_localctx = new DoWhileStatementRuleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(680);
				do_while_statement();
				}
				break;
			case FOR:
				_localctx = new ForStatementRuleContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(681);
				for_statement();
				}
				break;
			case CONTINUE:
				_localctx = new ContinueStatementRuleContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(682);
				continue_Statement();
				}
				break;
			case RETURN:
				_localctx = new ReturnStatementRuleContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(683);
				return_Statement();
				}
				break;
			case BREAK:
				_localctx = new BreakStatementRuleContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(684);
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
		enterRule(_localctx, 96, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(OPEN_BRACE);
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1704639128693374976L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 860187528830517261L) != 0)) {
				{
				{
				setState(688);
				instruction();
				}
				}
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(694);
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
		enterRule(_localctx, 98, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			match(IF);
			setState(697);
			match(OPEN_PAREN);
			setState(698);
			expression();
			setState(699);
			match(CLOSE_PAREN);
			setState(700);
			block();
			setState(705);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(701);
				match(ELSE);
				setState(702);
				if_statement();
				}
				break;
			case 2:
				{
				setState(703);
				match(ELSE);
				setState(704);
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
		enterRule(_localctx, 100, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(FOR);
			setState(708);
			match(OPEN_PAREN);
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(709);
				variable_declaration();
				}
				break;
			case 2:
				{
				setState(710);
				expressionSequence();
				}
				break;
			case 3:
				{
				setState(711);
				match(SEMICOLON);
				}
				break;
			}
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULL || _la==ELLIPSIS || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 2130303778837L) != 0)) {
				{
				setState(714);
				expressionSequence();
				}
			}

			setState(717);
			match(SEMICOLON);
			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULL || _la==ELLIPSIS || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 2130303778837L) != 0)) {
				{
				setState(718);
				expressionSequence();
				}
			}

			setState(721);
			match(CLOSE_PAREN);
			setState(722);
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
		enterRule(_localctx, 102, RULE_switch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(SWITCH);
			setState(725);
			match(OPEN_PAREN);
			setState(726);
			value();
			setState(727);
			match(CLOSE_PAREN);
			setState(728);
			match(OPEN_BRACE);
			setState(729);
			switch_body();
			setState(730);
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
		enterRule(_localctx, 104, RULE_switch_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				setState(734);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CASE:
					{
					setState(732);
					switch_case();
					}
					break;
				case DEFAULT:
					{
					setState(733);
					switch_default();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(738);
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
		enterRule(_localctx, 106, RULE_switch_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			match(CASE);
			setState(740);
			value();
			setState(741);
			match(COLON);
			setState(745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1704639128693374976L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 860187528830517261L) != 0)) {
				{
				{
				setState(742);
				instruction();
				}
				}
				setState(747);
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
		enterRule(_localctx, 108, RULE_switch_default);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			match(DEFAULT);
			setState(749);
			match(COLON);
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1704639128693374976L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 860187528830517261L) != 0)) {
				{
				{
				setState(750);
				instruction();
				}
				}
				setState(755);
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
		enterRule(_localctx, 110, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(WHILE);
			setState(757);
			match(OPEN_PAREN);
			setState(758);
			value();
			setState(759);
			match(CLOSE_PAREN);
			setState(760);
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
		enterRule(_localctx, 112, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(DO);
			setState(763);
			block();
			setState(764);
			match(WHILE);
			setState(765);
			match(OPEN_PAREN);
			setState(766);
			value();
			setState(767);
			match(CLOSE_PAREN);
			setState(768);
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
		enterRule(_localctx, 114, RULE_continue_Statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			match(CONTINUE);
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(771);
				match(IDENTIFIER);
				}
			}

			setState(774);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 116, RULE_return_Statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			match(RETURN);
			setState(778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(777);
				expression();
				}
				break;
			}
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EOF || _la==SEMICOLON) {
				{
				setState(780);
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
		enterRule(_localctx, 118, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(BREAK);
			setState(784);
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
		enterRule(_localctx, 120, RULE_expressionSequence);
		int _la;
		try {
			setState(795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(786);
				value();
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(787);
					match(COMMA);
					setState(788);
					value();
					}
					}
					setState(793);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(794);
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
		enterRule(_localctx, 122, RULE_interface_Declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			match(INTERFACE);
			setState(798);
			match(IDENTIFIER);
			setState(799);
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
		enterRule(_localctx, 124, RULE_generic_Type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			match(IDENTIFIER);
			setState(802);
			match(OPENTAG);
			setState(803);
			type_annotation();
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(804);
				match(COMMA);
				setState(805);
				type_annotation();
				}
				}
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(811);
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
		enterRule(_localctx, 126, RULE_eos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
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
		enterRule(_localctx, 128, RULE_html_value);
		try {
			int _alt;
			setState(829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				_localctx = new NestedHtmlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(815);
				open_tag();
				setState(819);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(816);
						html_value();
						}
						} 
					}
					setState(821);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				}
				setState(823);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(822);
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
				setState(825);
				single_tag();
				}
				break;
			case 3:
				_localctx = new TemplateVariableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(826);
				template_variable();
				}
				break;
			case 4:
				_localctx = new NgContentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(827);
				ng_content();
				}
				break;
			case 5:
				_localctx = new NgTemplateContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(828);
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
		enterRule(_localctx, 130, RULE_tags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			_la = _input.LA(1);
			if ( !(((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 511L) != 0)) ) {
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
		enterRule(_localctx, 132, RULE_open_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(833);
			match(OPENTAG);
			}
			setState(836);
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
				setState(834);
				tags();
				}
				break;
			case IDENTIFIER:
				{
				setState(835);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL) {
				{
				{
				setState(838);
				html_attribute();
				}
				}
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(844);
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
		enterRule(_localctx, 134, RULE_html_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(EQUAL);
			setState(847);
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
		enterRule(_localctx, 136, RULE_close_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(849);
			match(OPENTAG);
			}
			setState(850);
			match(SLASH);
			setState(853);
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
				setState(851);
				tags();
				}
				break;
			case IDENTIFIER:
				{
				setState(852);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(855);
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
		enterRule(_localctx, 138, RULE_single_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(857);
			match(OPENTAG);
			}
			setState(860);
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
				setState(858);
				tags();
				}
				break;
			case IDENTIFIER:
				{
				setState(859);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL) {
				{
				{
				setState(862);
				html_attribute();
				}
				}
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(868);
			match(SLASH);
			setState(869);
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
		enterRule(_localctx, 140, RULE_template_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			match(HASH);
			setState(872);
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
		enterRule(_localctx, 142, RULE_ng_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			match(OPENTAG);
			setState(875);
			match(NG_CONTENT);
			setState(879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL) {
				{
				{
				setState(876);
				html_attribute();
				}
				}
				setState(881);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(882);
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
		enterRule(_localctx, 144, RULE_ng_template);
		int _la;
		try {
			int _alt;
			setState(913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				_localctx = new NgTemplateWithContentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(884);
				match(OPENTAG);
				setState(885);
				match(NG_TEMPLATE);
				setState(889);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EQUAL) {
					{
					{
					setState(886);
					html_attribute();
					}
					}
					setState(891);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(892);
				match(CLOSETAG);
				setState(896);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(893);
						html_value();
						}
						} 
					}
					setState(898);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				}
				setState(899);
				match(OPENTAG);
				setState(900);
				match(SLASH);
				setState(901);
				match(NG_TEMPLATE);
				setState(902);
				match(CLOSETAG);
				}
				break;
			case 2:
				_localctx = new NgTemplateSelfClosingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(903);
				match(OPENTAG);
				setState(904);
				match(NG_TEMPLATE);
				setState(908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EQUAL) {
					{
					{
					setState(905);
					html_attribute();
					}
					}
					setState(910);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(911);
				match(SLASH);
				setState(912);
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

	public static final String _serializedATN =
		"\u0004\u0001{\u0394\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000\u0098\b\u0000\n\u0000\f\u0000\u009b"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002\u00a9\b\u0002\n\u0002\f\u0002\u00ac\t\u0002\u0003\u0002"+
		"\u00ae\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u00bb\b\u0004\u0001\u0004\u0003\u0004\u00be\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00c5"+
		"\b\u0005\n\u0005\f\u0005\u00c8\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u00d9\b\u0007\n\u0007\f\u0007\u00dc\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00f3\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u00f8"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0005\t\u00fd\b\t\n\t\f\t\u0100\t\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0108\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u0114\b\r\n\r\f\r\u0117\t\r\u0001\r\u0003\r\u011a\b\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0003\u000f\u0123\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u0130\b\u0010\n\u0010\f\u0010\u0133\t\u0010\u0001"+
		"\u0011\u0003\u0011\u0136\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u013b\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u013f\b\u0011"+
		"\u0001\u0011\u0003\u0011\u0142\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u014a\b\u0011\u0001\u0011"+
		"\u0003\u0011\u014d\b\u0011\u0003\u0011\u014f\b\u0011\u0001\u0012\u0003"+
		"\u0012\u0152\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0157"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u015c\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u0165\b\u0013\u0005\u0013\u0167\b\u0013\n\u0013"+
		"\f\u0013\u016a\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u0173\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u0178\b\u0015\n\u0015\f\u0015\u017b"+
		"\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u0188\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u018d"+
		"\b\u0017\n\u0017\f\u0017\u0190\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u0196\b\u0018\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0003\u001a\u019b\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u01a0\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01a4\b\u001a\u0001"+
		"\u001a\u0003\u001a\u01a7\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01b6\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u01bc\b\u001b\n"+
		"\u001b\f\u001b\u01bf\t\u001b\u0003\u001b\u01c1\b\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u01c6\b\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0005\u001c\u01cc\b\u001c\n\u001c\f\u001c\u01cf\t\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0005\u001d\u01d5\b\u001d"+
		"\n\u001d\f\u001d\u01d8\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u01e0\b\u001e\n\u001e\f\u001e"+
		"\u01e3\t\u001e\u0003\u001e\u01e5\b\u001e\u0001\u001e\u0003\u001e\u01e8"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u01f2\b\u001e\n\u001e\f\u001e"+
		"\u01f5\t\u001e\u0003\u001e\u01f7\b\u001e\u0001\u001e\u0003\u001e\u01fa"+
		"\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u0207\b\u001f\u0001 \u0001 \u0001 \u0001 \u0003 \u020d\b \u0001"+
		" \u0001 \u0003 \u0211\b \u0001 \u0001 \u0001 \u0003 \u0216\b \u0001 \u0003"+
		" \u0219\b \u0003 \u021b\b \u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0228\b\"\u0001#\u0001"+
		"#\u0001#\u0005#\u022d\b#\n#\f#\u0230\t#\u0001$\u0001$\u0001$\u0005$\u0235"+
		"\b$\n$\f$\u0238\t$\u0001%\u0001%\u0001%\u0005%\u023d\b%\n%\f%\u0240\t"+
		"%\u0001&\u0001&\u0001&\u0005&\u0245\b&\n&\f&\u0248\t&\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0003(\u0259\b(\u0001)\u0001)\u0001)\u0001)\u0005"+
		")\u025f\b)\n)\f)\u0262\t)\u0003)\u0264\b)\u0001)\u0001)\u0001*\u0001*"+
		"\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0005+\u0270\b+\n+\f+\u0273"+
		"\t+\u0003+\u0275\b+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0005,\u027d"+
		"\b,\n,\f,\u0280\t,\u0003,\u0282\b,\u0001,\u0001,\u0001-\u0001-\u0001-"+
		"\u0003-\u0289\b-\u0001.\u0001.\u0003.\u028d\b.\u0001.\u0001.\u0003.\u0291"+
		"\b.\u0001.\u0001.\u0003.\u0295\b.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0003.\u02a1\b.\u0001.\u0003.\u02a4\b.\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u02ae\b/\u0001"+
		"0\u00010\u00050\u02b2\b0\n0\f0\u02b5\t0\u00010\u00010\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00031\u02c2\b1\u00012\u0001"+
		"2\u00012\u00012\u00012\u00032\u02c9\b2\u00012\u00032\u02cc\b2\u00012\u0001"+
		"2\u00032\u02d0\b2\u00012\u00012\u00012\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00014\u00014\u00054\u02df\b4\n4\f4\u02e2\t4\u0001"+
		"5\u00015\u00015\u00015\u00055\u02e8\b5\n5\f5\u02eb\t5\u00016\u00016\u0001"+
		"6\u00056\u02f0\b6\n6\f6\u02f3\t6\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00019\u0001"+
		"9\u00039\u0305\b9\u00019\u00019\u0001:\u0001:\u0003:\u030b\b:\u0001:\u0003"+
		":\u030e\b:\u0001;\u0001;\u0001;\u0001<\u0001<\u0001<\u0005<\u0316\b<\n"+
		"<\f<\u0319\t<\u0001<\u0003<\u031c\b<\u0001=\u0001=\u0001=\u0001=\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0005>\u0327\b>\n>\f>\u032a\t>\u0001>\u0001"+
		">\u0001?\u0001?\u0001@\u0001@\u0005@\u0332\b@\n@\f@\u0335\t@\u0001@\u0003"+
		"@\u0338\b@\u0001@\u0001@\u0001@\u0001@\u0003@\u033e\b@\u0001A\u0001A\u0001"+
		"B\u0001B\u0001B\u0003B\u0345\bB\u0001B\u0005B\u0348\bB\nB\fB\u034b\tB"+
		"\u0001B\u0001B\u0001C\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0003"+
		"D\u0356\bD\u0001D\u0001D\u0001E\u0001E\u0001E\u0003E\u035d\bE\u0001E\u0005"+
		"E\u0360\bE\nE\fE\u0363\tE\u0001E\u0001E\u0001E\u0001F\u0001F\u0001F\u0001"+
		"G\u0001G\u0001G\u0005G\u036e\bG\nG\fG\u0371\tG\u0001G\u0001G\u0001H\u0001"+
		"H\u0001H\u0005H\u0378\bH\nH\fH\u037b\tH\u0001H\u0001H\u0005H\u037f\bH"+
		"\nH\fH\u0382\tH\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0005"+
		"H\u038b\bH\nH\fH\u038e\tH\u0001H\u0001H\u0003H\u0392\bH\u0001H\u0000\u0000"+
		"I\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0000\r\u0002\u0000wwyy\u0002"+
		"\u0000779<\u0001\u0000\u001b\u001d\u0001\u0000\"$\u0001\u0000ux\u0001"+
		"\u0000BC\u0001\u0000>?\u0001\u0000GH\u0002\u0000OO^_\u0001\u0000KN\u0001"+
		"\u0000BF\u0001\u0001XX\u0001\u0000`h\u03f1\u0000\u0099\u0001\u0000\u0000"+
		"\u0000\u0002\u009e\u0001\u0000\u0000\u0000\u0004\u00a4\u0001\u0000\u0000"+
		"\u0000\u0006\u00b1\u0001\u0000\u0000\u0000\b\u00b5\u0001\u0000\u0000\u0000"+
		"\n\u00bf\u0001\u0000\u0000\u0000\f\u00ce\u0001\u0000\u0000\u0000\u000e"+
		"\u00d4\u0001\u0000\u0000\u0000\u0010\u00f7\u0001\u0000\u0000\u0000\u0012"+
		"\u00f9\u0001\u0000\u0000\u0000\u0014\u0107\u0001\u0000\u0000\u0000\u0016"+
		"\u0109\u0001\u0000\u0000\u0000\u0018\u010b\u0001\u0000\u0000\u0000\u001a"+
		"\u010f\u0001\u0000\u0000\u0000\u001c\u011d\u0001\u0000\u0000\u0000\u001e"+
		"\u0122\u0001\u0000\u0000\u0000 \u0131\u0001\u0000\u0000\u0000\"\u014e"+
		"\u0001\u0000\u0000\u0000$\u0151\u0001\u0000\u0000\u0000&\u015f\u0001\u0000"+
		"\u0000\u0000(\u016d\u0001\u0000\u0000\u0000*\u0170\u0001\u0000\u0000\u0000"+
		",\u017e\u0001\u0000\u0000\u0000.\u0189\u0001\u0000\u0000\u00000\u0191"+
		"\u0001\u0000\u0000\u00002\u0197\u0001\u0000\u0000\u00004\u019a\u0001\u0000"+
		"\u0000\u00006\u01c5\u0001\u0000\u0000\u00008\u01c7\u0001\u0000\u0000\u0000"+
		":\u01d2\u0001\u0000\u0000\u0000<\u01f9\u0001\u0000\u0000\u0000>\u0206"+
		"\u0001\u0000\u0000\u0000@\u021a\u0001\u0000\u0000\u0000B\u021c\u0001\u0000"+
		"\u0000\u0000D\u0227\u0001\u0000\u0000\u0000F\u0229\u0001\u0000\u0000\u0000"+
		"H\u0231\u0001\u0000\u0000\u0000J\u0239\u0001\u0000\u0000\u0000L\u0241"+
		"\u0001\u0000\u0000\u0000N\u0249\u0001\u0000\u0000\u0000P\u0258\u0001\u0000"+
		"\u0000\u0000R\u025a\u0001\u0000\u0000\u0000T\u0267\u0001\u0000\u0000\u0000"+
		"V\u026b\u0001\u0000\u0000\u0000X\u0278\u0001\u0000\u0000\u0000Z\u0288"+
		"\u0001\u0000\u0000\u0000\\\u02a3\u0001\u0000\u0000\u0000^\u02ad\u0001"+
		"\u0000\u0000\u0000`\u02af\u0001\u0000\u0000\u0000b\u02b8\u0001\u0000\u0000"+
		"\u0000d\u02c3\u0001\u0000\u0000\u0000f\u02d4\u0001\u0000\u0000\u0000h"+
		"\u02e0\u0001\u0000\u0000\u0000j\u02e3\u0001\u0000\u0000\u0000l\u02ec\u0001"+
		"\u0000\u0000\u0000n\u02f4\u0001\u0000\u0000\u0000p\u02fa\u0001\u0000\u0000"+
		"\u0000r\u0302\u0001\u0000\u0000\u0000t\u0308\u0001\u0000\u0000\u0000v"+
		"\u030f\u0001\u0000\u0000\u0000x\u031b\u0001\u0000\u0000\u0000z\u031d\u0001"+
		"\u0000\u0000\u0000|\u0321\u0001\u0000\u0000\u0000~\u032d\u0001\u0000\u0000"+
		"\u0000\u0080\u033d\u0001\u0000\u0000\u0000\u0082\u033f\u0001\u0000\u0000"+
		"\u0000\u0084\u0341\u0001\u0000\u0000\u0000\u0086\u034e\u0001\u0000\u0000"+
		"\u0000\u0088\u0351\u0001\u0000\u0000\u0000\u008a\u0359\u0001\u0000\u0000"+
		"\u0000\u008c\u0367\u0001\u0000\u0000\u0000\u008e\u036a\u0001\u0000\u0000"+
		"\u0000\u0090\u0391\u0001\u0000\u0000\u0000\u0092\u0098\u0003\n\u0005\u0000"+
		"\u0093\u0098\u0003\f\u0006\u0000\u0094\u0098\u0003\u0002\u0001\u0000\u0095"+
		"\u0098\u0003\b\u0004\u0000\u0096\u0098\u0003\u001e\u000f\u0000\u0097\u0092"+
		"\u0001\u0000\u0000\u0000\u0097\u0093\u0001\u0000\u0000\u0000\u0097\u0094"+
		"\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0096"+
		"\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009c"+
		"\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0005\u0000\u0000\u0001\u009d\u0001\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0005\u0005\u0000\u0000\u009f\u00a0\u0005S\u0000\u0000\u00a0\u00a1\u0003"+
		"\u0004\u0002\u0000\u00a1\u00a2\u0005T\u0000\u0000\u00a2\u00a3\u0003\u001e"+
		"\u000f\u0000\u00a3\u0003\u0001\u0000\u0000\u0000\u00a4\u00ad\u0005Q\u0000"+
		"\u0000\u00a5\u00aa\u0003\u0006\u0003\u0000\u00a6\u00a7\u0005W\u0000\u0000"+
		"\u00a7\u00a9\u0003\u0006\u0003\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00a5\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0005R\u0000\u0000\u00b0\u0005\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0005\u0012\u0000\u0000\u00b2\u00b3\u0005Z\u0000\u0000\u00b3\u00b4"+
		"\u0007\u0000\u0000\u0000\u00b4\u0007\u0001\u0000\u0000\u0000\u00b5\u00ba"+
		"\u0005!\u0000\u0000\u00b6\u00bb\u00034\u001a\u0000\u00b7\u00bb\u0003$"+
		"\u0012\u0000\u00b8\u00bb\u0003(\u0014\u0000\u00b9\u00bb\u0003z=\u0000"+
		"\u00ba\u00b6\u0001\u0000\u0000\u0000\u00ba\u00b7\u0001\u0000\u0000\u0000"+
		"\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00be\u0005X\u0000\u0000\u00bd"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be"+
		"\t\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u001f\u0000\u0000\u00c0\u00c1"+
		"\u0005Q\u0000\u0000\u00c1\u00c6\u0005y\u0000\u0000\u00c2\u00c3\u0005W"+
		"\u0000\u0000\u00c3\u00c5\u0005y\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005R\u0000\u0000"+
		"\u00ca\u00cb\u0005 \u0000\u0000\u00cb\u00cc\u0005w\u0000\u0000\u00cc\u00cd"+
		"\u0005X\u0000\u0000\u00cd\u000b\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005"+
		"\u0004\u0000\u0000\u00cf\u00d0\u0005S\u0000\u0000\u00d0\u00d1\u0003\u000e"+
		"\u0007\u0000\u00d1\u00d2\u0005T\u0000\u0000\u00d2\u00d3\u0003\u001e\u000f"+
		"\u0000\u00d3\r\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005Q\u0000\u0000"+
		"\u00d5\u00da\u0003\u0010\b\u0000\u00d6\u00d7\u0005W\u0000\u0000\u00d7"+
		"\u00d9\u0003\u0010\b\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00dc"+
		"\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db"+
		"\u0001\u0000\u0000\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00da"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0005R\u0000\u0000\u00de\u000f\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\u0005\n\u0000\u0000\u00e0\u00e1\u0005Z"+
		"\u0000\u0000\u00e1\u00f8\u0005w\u0000\u0000\u00e2\u00e3\u0005\u000b\u0000"+
		"\u0000\u00e3\u00e4\u0005Z\u0000\u0000\u00e4\u00f8\u0005t\u0000\u0000\u00e5"+
		"\u00e6\u0005\f\u0000\u0000\u00e6\u00e7\u0005Z\u0000\u0000\u00e7\u00f8"+
		"\u0003V+\u0000\u00e8\u00e9\u0005\r\u0000\u0000\u00e9\u00ea\u0005Z\u0000"+
		"\u0000\u00ea\u00f8\u0005x\u0000\u0000\u00eb\u00ec\u0005\u000e\u0000\u0000"+
		"\u00ec\u00ed\u0005Z\u0000\u0000\u00ed\u00f8\u0005w\u0000\u0000\u00ee\u00ef"+
		"\u0005\u000f\u0000\u0000\u00ef\u00f2\u0005Z\u0000\u0000\u00f0\u00f3\u0005"+
		"w\u0000\u0000\u00f1\u00f3\u0003X,\u0000\u00f2\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0005\u0010\u0000\u0000\u00f5\u00f6\u0005Z\u0000\u0000"+
		"\u00f6\u00f8\u0003V+\u0000\u00f7\u00df\u0001\u0000\u0000\u0000\u00f7\u00e2"+
		"\u0001\u0000\u0000\u0000\u00f7\u00e5\u0001\u0000\u0000\u0000\u00f7\u00e8"+
		"\u0001\u0000\u0000\u0000\u00f7\u00eb\u0001\u0000\u0000\u0000\u00f7\u00ee"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f4\u0001\u0000\u0000\u0000\u00f8\u0011"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fe\u0003\u0014\n\u0000\u00fa\u00fb\u0005"+
		"I\u0000\u0000\u00fb\u00fd\u0003\u0014\n\u0000\u00fc\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0013\u0001\u0000"+
		"\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u0108\u0005y\u0000"+
		"\u0000\u0102\u0108\u0003\u0016\u000b\u0000\u0103\u0108\u00056\u0000\u0000"+
		"\u0104\u0108\u00055\u0000\u0000\u0105\u0108\u0003\u001a\r\u0000\u0106"+
		"\u0108\u0003\u0018\f\u0000\u0107\u0101\u0001\u0000\u0000\u0000\u0107\u0102"+
		"\u0001\u0000\u0000\u0000\u0107\u0103\u0001\u0000\u0000\u0000\u0107\u0104"+
		"\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0106"+
		"\u0001\u0000\u0000\u0000\u0108\u0015\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0007\u0001\u0000\u0000\u010a\u0017\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0005y\u0000\u0000\u010c\u010d\u0005U\u0000\u0000\u010d\u010e\u0005V"+
		"\u0000\u0000\u010e\u0019\u0001\u0000\u0000\u0000\u010f\u0110\u0005Q\u0000"+
		"\u0000\u0110\u0115\u0003\u001c\u000e\u0000\u0111\u0112\u0005X\u0000\u0000"+
		"\u0112\u0114\u0003\u001c\u000e\u0000\u0113\u0111\u0001\u0000\u0000\u0000"+
		"\u0114\u0117\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0119\u0001\u0000\u0000\u0000"+
		"\u0117\u0115\u0001\u0000\u0000\u0000\u0118\u011a\u0005X\u0000\u0000\u0119"+
		"\u0118\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0001\u0000\u0000\u0000\u011b\u011c\u0005R\u0000\u0000\u011c\u001b"+
		"\u0001\u0000\u0000\u0000\u011d\u011e\u0005y\u0000\u0000\u011e\u011f\u0005"+
		"Z\u0000\u0000\u011f\u0120\u0003\u0014\n\u0000\u0120\u001d\u0001\u0000"+
		"\u0000\u0000\u0121\u0123\u0005!\u0000\u0000\u0122\u0121\u0001\u0000\u0000"+
		"\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000"+
		"\u0000\u0124\u0125\u0005\u001e\u0000\u0000\u0125\u0126\u0005y\u0000\u0000"+
		"\u0126\u0127\u0005Q\u0000\u0000\u0127\u0128\u0003 \u0010\u0000\u0128\u0129"+
		"\u0005R\u0000\u0000\u0129\u001f\u0001\u0000\u0000\u0000\u012a\u0130\u0003"+
		"\"\u0011\u0000\u012b\u0130\u0003$\u0012\u0000\u012c\u0130\u0003(\u0014"+
		"\u0000\u012d\u0130\u0003\u001e\u000f\u0000\u012e\u0130\u0003\\.\u0000"+
		"\u012f\u012a\u0001\u0000\u0000\u0000\u012f\u012b\u0001\u0000\u0000\u0000"+
		"\u012f\u012c\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000"+
		"\u012f\u012e\u0001\u0000\u0000\u0000\u0130\u0133\u0001\u0000\u0000\u0000"+
		"\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000"+
		"\u0132!\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0134"+
		"\u0136\u0007\u0002\u0000\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0135"+
		"\u0136\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137"+
		"\u013a\u0005y\u0000\u0000\u0138\u0139\u0005Z\u0000\u0000\u0139\u013b\u0003"+
		"\u0012\t\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000"+
		"\u0000\u0000\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013d\u0005[\u0000"+
		"\u0000\u013d\u013f\u0003P(\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e"+
		"\u013f\u0001\u0000\u0000\u0000\u013f\u0141\u0001\u0000\u0000\u0000\u0140"+
		"\u0142\u0005X\u0000\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0141\u0142"+
		"\u0001\u0000\u0000\u0000\u0142\u014f\u0001\u0000\u0000\u0000\u0143\u0144"+
		"\u0005\u0007\u0000\u0000\u0144\u0145\u0005S\u0000\u0000\u0145\u0146\u0005"+
		"T\u0000\u0000\u0146\u0149\u0005y\u0000\u0000\u0147\u0148\u0005[\u0000"+
		"\u0000\u0148\u014a\u0003P(\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149"+
		"\u014a\u0001\u0000\u0000\u0000\u014a\u014c\u0001\u0000\u0000\u0000\u014b"+
		"\u014d\u0005X\u0000\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014c\u014d"+
		"\u0001\u0000\u0000\u0000\u014d\u014f\u0001\u0000\u0000\u0000\u014e\u0135"+
		"\u0001\u0000\u0000\u0000\u014e\u0143\u0001\u0000\u0000\u0000\u014f#\u0001"+
		"\u0000\u0000\u0000\u0150\u0152\u0007\u0002\u0000\u0000\u0151\u0150\u0001"+
		"\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0153\u0001"+
		"\u0000\u0000\u0000\u0153\u0154\u0005y\u0000\u0000\u0154\u0156\u0005S\u0000"+
		"\u0000\u0155\u0157\u0003.\u0017\u0000\u0156\u0155\u0001\u0000\u0000\u0000"+
		"\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000"+
		"\u0158\u015b\u0005T\u0000\u0000\u0159\u015a\u0005Z\u0000\u0000\u015a\u015c"+
		"\u0003\u0012\t\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015c\u0001"+
		"\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015e\u0003"+
		"&\u0013\u0000\u015e%\u0001\u0000\u0000\u0000\u015f\u0168\u0005Q\u0000"+
		"\u0000\u0160\u0167\u00034\u001a\u0000\u0161\u0167\u0003t:\u0000\u0162"+
		"\u0164\u0003P(\u0000\u0163\u0165\u0005X\u0000\u0000\u0164\u0163\u0001"+
		"\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0167\u0001"+
		"\u0000\u0000\u0000\u0166\u0160\u0001\u0000\u0000\u0000\u0166\u0161\u0001"+
		"\u0000\u0000\u0000\u0166\u0162\u0001\u0000\u0000\u0000\u0167\u016a\u0001"+
		"\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0169\u0001"+
		"\u0000\u0000\u0000\u0169\u016b\u0001\u0000\u0000\u0000\u016a\u0168\u0001"+
		"\u0000\u0000\u0000\u016b\u016c\u0005R\u0000\u0000\u016c\'\u0001\u0000"+
		"\u0000\u0000\u016d\u016e\u0005y\u0000\u0000\u016e\u016f\u0003*\u0015\u0000"+
		"\u016f)\u0001\u0000\u0000\u0000\u0170\u0172\u0005S\u0000\u0000\u0171\u0173"+
		"\u0003.\u0017\u0000\u0172\u0171\u0001\u0000\u0000\u0000\u0172\u0173\u0001"+
		"\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0175\u0005"+
		"T\u0000\u0000\u0175\u0179\u0005Q\u0000\u0000\u0176\u0178\u0003\\.\u0000"+
		"\u0177\u0176\u0001\u0000\u0000\u0000\u0178\u017b\u0001\u0000\u0000\u0000"+
		"\u0179\u0177\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000"+
		"\u017a\u017c\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000"+
		"\u017c\u017d\u0005R\u0000\u0000\u017d+\u0001\u0000\u0000\u0000\u017e\u017f"+
		"\u00051\u0000\u0000\u017f\u0180\u0005Y\u0000\u0000\u0180\u0181\u0005y"+
		"\u0000\u0000\u0181\u0182\u0005Y\u0000\u0000\u0182\u0183\u00058\u0000\u0000"+
		"\u0183\u0184\u0005S\u0000\u0000\u0184\u0185\u0003R)\u0000\u0185\u0187"+
		"\u0005T\u0000\u0000\u0186\u0188\u0005X\u0000\u0000\u0187\u0186\u0001\u0000"+
		"\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188-\u0001\u0000\u0000"+
		"\u0000\u0189\u018e\u00030\u0018\u0000\u018a\u018b\u0005W\u0000\u0000\u018b"+
		"\u018d\u00030\u0018\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018d\u0190"+
		"\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018e\u018f"+
		"\u0001\u0000\u0000\u0000\u018f/\u0001\u0000\u0000\u0000\u0190\u018e\u0001"+
		"\u0000\u0000\u0000\u0191\u0192\u0005y\u0000\u0000\u0192\u0195\u0005Z\u0000"+
		"\u0000\u0193\u0196\u0003\u0014\n\u0000\u0194\u0196\u0003\u001a\r\u0000"+
		"\u0195\u0193\u0001\u0000\u0000\u0000\u0195\u0194\u0001\u0000\u0000\u0000"+
		"\u01961\u0001\u0000\u0000\u0000\u0197\u0198\u0007\u0003\u0000\u0000\u0198"+
		"3\u0001\u0000\u0000\u0000\u0199\u019b\u00032\u0019\u0000\u019a\u0199\u0001"+
		"\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u019c\u0001"+
		"\u0000\u0000\u0000\u019c\u019f\u0005y\u0000\u0000\u019d\u019e\u0005Z\u0000"+
		"\u0000\u019e\u01a0\u0003\u0012\t\u0000\u019f\u019d\u0001\u0000\u0000\u0000"+
		"\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a1\u01a2\u0005[\u0000\u0000\u01a2\u01a4\u0003P(\u0000\u01a3\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a7\u0005X\u0000\u0000\u01a6\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a75\u0001\u0000"+
		"\u0000\u0000\u01a8\u01c6\u0003B!\u0000\u01a9\u01c6\u0005y\u0000\u0000"+
		"\u01aa\u01ab\u0005S\u0000\u0000\u01ab\u01c6\u0005T\u0000\u0000\u01ac\u01c6"+
		"\u00056\u0000\u0000\u01ad\u01c6\u0003R)\u0000\u01ae\u01c6\u0003X,\u0000"+
		"\u01af\u01c6\u0005;\u0000\u0000\u01b0\u01c6\u00051\u0000\u0000\u01b1\u01c6"+
		"\u00052\u0000\u0000\u01b2\u01b3\u00050\u0000\u0000\u01b3\u01b5\u0005y"+
		"\u0000\u0000\u01b4\u01b6\u00038\u001c\u0000\u01b5\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b7\u01c0\u0005S\u0000\u0000\u01b8\u01bd\u0003P(\u0000\u01b9"+
		"\u01ba\u0005W\u0000\u0000\u01ba\u01bc\u0003P(\u0000\u01bb\u01b9\u0001"+
		"\u0000\u0000\u0000\u01bc\u01bf\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001"+
		"\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01c1\u0001"+
		"\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01c0\u01b8\u0001"+
		"\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c6\u0005T\u0000\u0000\u01c3\u01c4\u0005=\u0000"+
		"\u0000\u01c4\u01c6\u0003P(\u0000\u01c5\u01a8\u0001\u0000\u0000\u0000\u01c5"+
		"\u01a9\u0001\u0000\u0000\u0000\u01c5\u01aa\u0001\u0000\u0000\u0000\u01c5"+
		"\u01ac\u0001\u0000\u0000\u0000\u01c5\u01ad\u0001\u0000\u0000\u0000\u01c5"+
		"\u01ae\u0001\u0000\u0000\u0000\u01c5\u01af\u0001\u0000\u0000\u0000\u01c5"+
		"\u01b0\u0001\u0000\u0000\u0000\u01c5\u01b1\u0001\u0000\u0000\u0000\u01c5"+
		"\u01b2\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c6"+
		"7\u0001\u0000\u0000\u0000\u01c7\u01c8\u0005^\u0000\u0000\u01c8\u01cd\u0003"+
		"\u0012\t\u0000\u01c9\u01ca\u0005W\u0000\u0000\u01ca\u01cc\u0003\u0012"+
		"\t\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cc\u01cf\u0001\u0000\u0000"+
		"\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000"+
		"\u0000\u01ce\u01d0\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000"+
		"\u0000\u01d0\u01d1\u0005_\u0000\u0000\u01d19\u0001\u0000\u0000\u0000\u01d2"+
		"\u01d6\u00036\u001b\u0000\u01d3\u01d5\u0003<\u001e\u0000\u01d4\u01d3\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d8\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7;\u0001\u0000"+
		"\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d9\u01da\u0005Y\u0000"+
		"\u0000\u01da\u01e7\u0005y\u0000\u0000\u01db\u01e4\u0005S\u0000\u0000\u01dc"+
		"\u01e1\u0003P(\u0000\u01dd\u01de\u0005W\u0000\u0000\u01de\u01e0\u0003"+
		"P(\u0000\u01df\u01dd\u0001\u0000\u0000\u0000\u01e0\u01e3\u0001\u0000\u0000"+
		"\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e2\u01e5\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000"+
		"\u0000\u01e4\u01dc\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000"+
		"\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\u01e8\u0005T\u0000\u0000"+
		"\u01e7\u01db\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000"+
		"\u01e8\u01fa\u0001\u0000\u0000\u0000\u01e9\u01ea\u0005U\u0000\u0000\u01ea"+
		"\u01eb\u0003P(\u0000\u01eb\u01ec\u0005V\u0000\u0000\u01ec\u01fa\u0001"+
		"\u0000\u0000\u0000\u01ed\u01f6\u0005S\u0000\u0000\u01ee\u01f3\u0003P("+
		"\u0000\u01ef\u01f0\u0005W\u0000\u0000\u01f0\u01f2\u0003P(\u0000\u01f1"+
		"\u01ef\u0001\u0000\u0000\u0000\u01f2\u01f5\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f7\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f6"+
		"\u01ee\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000\u01f7"+
		"\u01f8\u0001\u0000\u0000\u0000\u01f8\u01fa\u0005T\u0000\u0000\u01f9\u01d9"+
		"\u0001\u0000\u0000\u0000\u01f9\u01e9\u0001\u0000\u0000\u0000\u01f9\u01ed"+
		"\u0001\u0000\u0000\u0000\u01fa=\u0001\u0000\u0000\u0000\u01fb\u0207\u0003"+
		"B!\u0000\u01fc\u0207\u0005y\u0000\u0000\u01fd\u0207\u00056\u0000\u0000"+
		"\u01fe\u0207\u0003R)\u0000\u01ff\u0207\u0003X,\u0000\u0200\u0201\u0005"+
		"S\u0000\u0000\u0201\u0202\u0003P(\u0000\u0202\u0203\u0005T\u0000\u0000"+
		"\u0203\u0207\u0001\u0000\u0000\u0000\u0204\u0205\u0005=\u0000\u0000\u0205"+
		"\u0207\u0003P(\u0000\u0206\u01fb\u0001\u0000\u0000\u0000\u0206\u01fc\u0001"+
		"\u0000\u0000\u0000\u0206\u01fd\u0001\u0000\u0000\u0000\u0206\u01fe\u0001"+
		"\u0000\u0000\u0000\u0206\u01ff\u0001\u0000\u0000\u0000\u0206\u0200\u0001"+
		"\u0000\u0000\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0207?\u0001\u0000"+
		"\u0000\u0000\u0208\u0209\u0003:\u001d\u0000\u0209\u020a\u0005[\u0000\u0000"+
		"\u020a\u020c\u0003P(\u0000\u020b\u020d\u0005X\u0000\u0000\u020c\u020b"+
		"\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d\u021b"+
		"\u0001\u0000\u0000\u0000\u020e\u0210\u0005y\u0000\u0000\u020f\u0211\u0005"+
		"\\\u0000\u0000\u0210\u020f\u0001\u0000\u0000\u0000\u0210\u0211\u0001\u0000"+
		"\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u0213\u0005[\u0000"+
		"\u0000\u0213\u0215\u0003P(\u0000\u0214\u0216\u0005\\\u0000\u0000\u0215"+
		"\u0214\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216"+
		"\u0218\u0001\u0000\u0000\u0000\u0217\u0219\u0005X\u0000\u0000\u0218\u0217"+
		"\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219\u021b"+
		"\u0001\u0000\u0000\u0000\u021a\u0208\u0001\u0000\u0000\u0000\u021a\u020e"+
		"\u0001\u0000\u0000\u0000\u021bA\u0001\u0000\u0000\u0000\u021c\u021d\u0007"+
		"\u0004\u0000\u0000\u021dC\u0001\u0000\u0000\u0000\u021e\u021f\u0007\u0005"+
		"\u0000\u0000\u021f\u0228\u0003>\u001f\u0000\u0220\u0221\u0007\u0006\u0000"+
		"\u0000\u0221\u0228\u0003>\u001f\u0000\u0222\u0223\u0003>\u001f\u0000\u0223"+
		"\u0224\u0007\u0006\u0000\u0000\u0224\u0228\u0001\u0000\u0000\u0000\u0225"+
		"\u0226\u0005@\u0000\u0000\u0226\u0228\u0003>\u001f\u0000\u0227\u021e\u0001"+
		"\u0000\u0000\u0000\u0227\u0220\u0001\u0000\u0000\u0000\u0227\u0222\u0001"+
		"\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0228E\u0001\u0000"+
		"\u0000\u0000\u0229\u022e\u0003:\u001d\u0000\u022a\u022b\u0007\u0007\u0000"+
		"\u0000\u022b\u022d\u0003:\u001d\u0000\u022c\u022a\u0001\u0000\u0000\u0000"+
		"\u022d\u0230\u0001\u0000\u0000\u0000\u022e\u022c\u0001\u0000\u0000\u0000"+
		"\u022e\u022f\u0001\u0000\u0000\u0000\u022fG\u0001\u0000\u0000\u0000\u0230"+
		"\u022e\u0001\u0000\u0000\u0000\u0231\u0236\u0003:\u001d\u0000\u0232\u0233"+
		"\u0007\b\u0000\u0000\u0233\u0235\u0003:\u001d\u0000\u0234\u0232\u0001"+
		"\u0000\u0000\u0000\u0235\u0238\u0001\u0000\u0000\u0000\u0236\u0234\u0001"+
		"\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237I\u0001\u0000"+
		"\u0000\u0000\u0238\u0236\u0001\u0000\u0000\u0000\u0239\u023e\u0003:\u001d"+
		"\u0000\u023a\u023b\u0007\t\u0000\u0000\u023b\u023d\u0003:\u001d\u0000"+
		"\u023c\u023a\u0001\u0000\u0000\u0000\u023d\u0240\u0001\u0000\u0000\u0000"+
		"\u023e\u023c\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000"+
		"\u023fK\u0001\u0000\u0000\u0000\u0240\u023e\u0001\u0000\u0000\u0000\u0241"+
		"\u0246\u0003:\u001d\u0000\u0242\u0243\u0007\n\u0000\u0000\u0243\u0245"+
		"\u0003:\u001d\u0000\u0244\u0242\u0001\u0000\u0000\u0000\u0245\u0248\u0001"+
		"\u0000\u0000\u0000\u0246\u0244\u0001\u0000\u0000\u0000\u0246\u0247\u0001"+
		"\u0000\u0000\u0000\u0247M\u0001\u0000\u0000\u0000\u0248\u0246\u0001\u0000"+
		"\u0000\u0000\u0249\u024a\u0003:\u001d\u0000\u024a\u024b\u0005A\u0000\u0000"+
		"\u024b\u024c\u0003P(\u0000\u024c\u024d\u0005Z\u0000\u0000\u024d\u024e"+
		"\u0003P(\u0000\u024eO\u0001\u0000\u0000\u0000\u024f\u0259\u0003:\u001d"+
		"\u0000\u0250\u0259\u0003D\"\u0000\u0251\u0259\u0003L&\u0000\u0252\u0259"+
		"\u0003J%\u0000\u0253\u0259\u0003H$\u0000\u0254\u0259\u0003F#\u0000\u0255"+
		"\u0259\u0003N\'\u0000\u0256\u0259\u0003@ \u0000\u0257\u0259\u0005t\u0000"+
		"\u0000\u0258\u024f\u0001\u0000\u0000\u0000\u0258\u0250\u0001\u0000\u0000"+
		"\u0000\u0258\u0251\u0001\u0000\u0000\u0000\u0258\u0252\u0001\u0000\u0000"+
		"\u0000\u0258\u0253\u0001\u0000\u0000\u0000\u0258\u0254\u0001\u0000\u0000"+
		"\u0000\u0258\u0255\u0001\u0000\u0000\u0000\u0258\u0256\u0001\u0000\u0000"+
		"\u0000\u0258\u0257\u0001\u0000\u0000\u0000\u0259Q\u0001\u0000\u0000\u0000"+
		"\u025a\u0263\u0005Q\u0000\u0000\u025b\u0260\u0003T*\u0000\u025c\u025d"+
		"\u0005W\u0000\u0000\u025d\u025f\u0003T*\u0000\u025e\u025c\u0001\u0000"+
		"\u0000\u0000\u025f\u0262\u0001\u0000\u0000\u0000\u0260\u025e\u0001\u0000"+
		"\u0000\u0000\u0260\u0261\u0001\u0000\u0000\u0000\u0261\u0264\u0001\u0000"+
		"\u0000\u0000\u0262\u0260\u0001\u0000\u0000\u0000\u0263\u025b\u0001\u0000"+
		"\u0000\u0000\u0263\u0264\u0001\u0000\u0000\u0000\u0264\u0265\u0001\u0000"+
		"\u0000\u0000\u0265\u0266\u0005R\u0000\u0000\u0266S\u0001\u0000\u0000\u0000"+
		"\u0267\u0268\u0007\u0000\u0000\u0000\u0268\u0269\u0005Z\u0000\u0000\u0269"+
		"\u026a\u0003P(\u0000\u026aU\u0001\u0000\u0000\u0000\u026b\u0274\u0005"+
		"U\u0000\u0000\u026c\u0271\u0003>\u001f\u0000\u026d\u026e\u0005W\u0000"+
		"\u0000\u026e\u0270\u0003>\u001f\u0000\u026f\u026d\u0001\u0000\u0000\u0000"+
		"\u0270\u0273\u0001\u0000\u0000\u0000\u0271\u026f\u0001\u0000\u0000\u0000"+
		"\u0271\u0272\u0001\u0000\u0000\u0000\u0272\u0275\u0001\u0000\u0000\u0000"+
		"\u0273\u0271\u0001\u0000\u0000\u0000\u0274\u026c\u0001\u0000\u0000\u0000"+
		"\u0274\u0275\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000"+
		"\u0276\u0277\u0005V\u0000\u0000\u0277W\u0001\u0000\u0000\u0000\u0278\u0281"+
		"\u0005U\u0000\u0000\u0279\u027e\u0003Z-\u0000\u027a\u027b\u0005W\u0000"+
		"\u0000\u027b\u027d\u0003Z-\u0000\u027c\u027a\u0001\u0000\u0000\u0000\u027d"+
		"\u0280\u0001\u0000\u0000\u0000\u027e\u027c\u0001\u0000\u0000\u0000\u027e"+
		"\u027f\u0001\u0000\u0000\u0000\u027f\u0282\u0001\u0000\u0000\u0000\u0280"+
		"\u027e\u0001\u0000\u0000\u0000\u0281\u0279\u0001\u0000\u0000\u0000\u0281"+
		"\u0282\u0001\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000\u0000\u0283"+
		"\u0284\u0005V\u0000\u0000\u0284Y\u0001\u0000\u0000\u0000\u0285\u0289\u0003"+
		"P(\u0000\u0286\u0287\u0005=\u0000\u0000\u0287\u0289\u0003P(\u0000\u0288"+
		"\u0285\u0001\u0000\u0000\u0000\u0288\u0286\u0001\u0000\u0000\u0000\u0289"+
		"[\u0001\u0000\u0000\u0000\u028a\u028c\u00034\u001a\u0000\u028b\u028d\u0005"+
		"X\u0000\u0000\u028c\u028b\u0001\u0000\u0000\u0000\u028c\u028d\u0001\u0000"+
		"\u0000\u0000\u028d\u02a4\u0001\u0000\u0000\u0000\u028e\u0290\u0003P(\u0000"+
		"\u028f\u0291\u0005X\u0000\u0000\u0290\u028f\u0001\u0000\u0000\u0000\u0290"+
		"\u0291\u0001\u0000\u0000\u0000\u0291\u02a4\u0001\u0000\u0000\u0000\u0292"+
		"\u0294\u0003:\u001d\u0000\u0293\u0295\u0005X\u0000\u0000\u0294\u0293\u0001"+
		"\u0000\u0000\u0000\u0294\u0295\u0001\u0000\u0000\u0000\u0295\u02a4\u0001"+
		"\u0000\u0000\u0000\u0296\u02a4\u0003,\u0016\u0000\u0297\u02a4\u0003\u001e"+
		"\u000f\u0000\u0298\u02a4\u0003$\u0012\u0000\u0299\u02a4\u0003(\u0014\u0000"+
		"\u029a\u02a4\u0003^/\u0000\u029b\u02a4\u0003z=\u0000\u029c\u02a4\u0003"+
		"|>\u0000\u029d\u029e\u0005!\u0000\u0000\u029e\u02a0\u00034\u001a\u0000"+
		"\u029f\u02a1\u0005X\u0000\u0000\u02a0\u029f\u0001\u0000\u0000\u0000\u02a0"+
		"\u02a1\u0001\u0000\u0000\u0000\u02a1\u02a4\u0001\u0000\u0000\u0000\u02a2"+
		"\u02a4\u0005{\u0000\u0000\u02a3\u028a\u0001\u0000\u0000\u0000\u02a3\u028e"+
		"\u0001\u0000\u0000\u0000\u02a3\u0292\u0001\u0000\u0000\u0000\u02a3\u0296"+
		"\u0001\u0000\u0000\u0000\u02a3\u0297\u0001\u0000\u0000\u0000\u02a3\u0298"+
		"\u0001\u0000\u0000\u0000\u02a3\u0299\u0001\u0000\u0000\u0000\u02a3\u029a"+
		"\u0001\u0000\u0000\u0000\u02a3\u029b\u0001\u0000\u0000\u0000\u02a3\u029c"+
		"\u0001\u0000\u0000\u0000\u02a3\u029d\u0001\u0000\u0000\u0000\u02a3\u02a2"+
		"\u0001\u0000\u0000\u0000\u02a4]\u0001\u0000\u0000\u0000\u02a5\u02ae\u0003"+
		"b1\u0000\u02a6\u02ae\u0003f3\u0000\u02a7\u02ae\u0003n7\u0000\u02a8\u02ae"+
		"\u0003p8\u0000\u02a9\u02ae\u0003d2\u0000\u02aa\u02ae\u0003r9\u0000\u02ab"+
		"\u02ae\u0003t:\u0000\u02ac\u02ae\u0003v;\u0000\u02ad\u02a5\u0001\u0000"+
		"\u0000\u0000\u02ad\u02a6\u0001\u0000\u0000\u0000\u02ad\u02a7\u0001\u0000"+
		"\u0000\u0000\u02ad\u02a8\u0001\u0000\u0000\u0000\u02ad\u02a9\u0001\u0000"+
		"\u0000\u0000\u02ad\u02aa\u0001\u0000\u0000\u0000\u02ad\u02ab\u0001\u0000"+
		"\u0000\u0000\u02ad\u02ac\u0001\u0000\u0000\u0000\u02ae_\u0001\u0000\u0000"+
		"\u0000\u02af\u02b3\u0005Q\u0000\u0000\u02b0\u02b2\u0003\\.\u0000\u02b1"+
		"\u02b0\u0001\u0000\u0000\u0000\u02b2\u02b5\u0001\u0000\u0000\u0000\u02b3"+
		"\u02b1\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4"+
		"\u02b6\u0001\u0000\u0000\u0000\u02b5\u02b3\u0001\u0000\u0000\u0000\u02b6"+
		"\u02b7\u0005R\u0000\u0000\u02b7a\u0001\u0000\u0000\u0000\u02b8\u02b9\u0005"+
		"%\u0000\u0000\u02b9\u02ba\u0005S\u0000\u0000\u02ba\u02bb\u0003P(\u0000"+
		"\u02bb\u02bc\u0005T\u0000\u0000\u02bc\u02c1\u0003`0\u0000\u02bd\u02be"+
		"\u0005&\u0000\u0000\u02be\u02c2\u0003b1\u0000\u02bf\u02c0\u0005&\u0000"+
		"\u0000\u02c0\u02c2\u0003`0\u0000\u02c1\u02bd\u0001\u0000\u0000\u0000\u02c1"+
		"\u02bf\u0001\u0000\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2"+
		"c\u0001\u0000\u0000\u0000\u02c3\u02c4\u0005\'\u0000\u0000\u02c4\u02c8"+
		"\u0005S\u0000\u0000\u02c5\u02c9\u00034\u001a\u0000\u02c6\u02c9\u0003x"+
		"<\u0000\u02c7\u02c9\u0005X\u0000\u0000\u02c8\u02c5\u0001\u0000\u0000\u0000"+
		"\u02c8\u02c6\u0001\u0000\u0000\u0000\u02c8\u02c7\u0001\u0000\u0000\u0000"+
		"\u02c9\u02cb\u0001\u0000\u0000\u0000\u02ca\u02cc\u0003x<\u0000\u02cb\u02ca"+
		"\u0001\u0000\u0000\u0000\u02cb\u02cc\u0001\u0000\u0000\u0000\u02cc\u02cd"+
		"\u0001\u0000\u0000\u0000\u02cd\u02cf\u0005X\u0000\u0000\u02ce\u02d0\u0003"+
		"x<\u0000\u02cf\u02ce\u0001\u0000\u0000\u0000\u02cf\u02d0\u0001\u0000\u0000"+
		"\u0000\u02d0\u02d1\u0001\u0000\u0000\u0000\u02d1\u02d2\u0005T\u0000\u0000"+
		"\u02d2\u02d3\u0003`0\u0000\u02d3e\u0001\u0000\u0000\u0000\u02d4\u02d5"+
		"\u0005*\u0000\u0000\u02d5\u02d6\u0005S\u0000\u0000\u02d6\u02d7\u0003>"+
		"\u001f\u0000\u02d7\u02d8\u0005T\u0000\u0000\u02d8\u02d9\u0005Q\u0000\u0000"+
		"\u02d9\u02da\u0003h4\u0000\u02da\u02db\u0005R\u0000\u0000\u02dbg\u0001"+
		"\u0000\u0000\u0000\u02dc\u02df\u0003j5\u0000\u02dd\u02df\u0003l6\u0000"+
		"\u02de\u02dc\u0001\u0000\u0000\u0000\u02de\u02dd\u0001\u0000\u0000\u0000"+
		"\u02df\u02e2\u0001\u0000\u0000\u0000\u02e0\u02de\u0001\u0000\u0000\u0000"+
		"\u02e0\u02e1\u0001\u0000\u0000\u0000\u02e1i\u0001\u0000\u0000\u0000\u02e2"+
		"\u02e0\u0001\u0000\u0000\u0000\u02e3\u02e4\u0005+\u0000\u0000\u02e4\u02e5"+
		"\u0003>\u001f\u0000\u02e5\u02e9\u0005Z\u0000\u0000\u02e6\u02e8\u0003\\"+
		".\u0000\u02e7\u02e6\u0001\u0000\u0000\u0000\u02e8\u02eb\u0001\u0000\u0000"+
		"\u0000\u02e9\u02e7\u0001\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000"+
		"\u0000\u02eak\u0001\u0000\u0000\u0000\u02eb\u02e9\u0001\u0000\u0000\u0000"+
		"\u02ec\u02ed\u0005,\u0000\u0000\u02ed\u02f1\u0005Z\u0000\u0000\u02ee\u02f0"+
		"\u0003\\.\u0000\u02ef\u02ee\u0001\u0000\u0000\u0000\u02f0\u02f3\u0001"+
		"\u0000\u0000\u0000\u02f1\u02ef\u0001\u0000\u0000\u0000\u02f1\u02f2\u0001"+
		"\u0000\u0000\u0000\u02f2m\u0001\u0000\u0000\u0000\u02f3\u02f1\u0001\u0000"+
		"\u0000\u0000\u02f4\u02f5\u0005(\u0000\u0000\u02f5\u02f6\u0005S\u0000\u0000"+
		"\u02f6\u02f7\u0003>\u001f\u0000\u02f7\u02f8\u0005T\u0000\u0000\u02f8\u02f9"+
		"\u0003`0\u0000\u02f9o\u0001\u0000\u0000\u0000\u02fa\u02fb\u0005)\u0000"+
		"\u0000\u02fb\u02fc\u0003`0\u0000\u02fc\u02fd\u0005(\u0000\u0000\u02fd"+
		"\u02fe\u0005S\u0000\u0000\u02fe\u02ff\u0003>\u001f\u0000\u02ff\u0300\u0005"+
		"T\u0000\u0000\u0300\u0301\u0005X\u0000\u0000\u0301q\u0001\u0000\u0000"+
		"\u0000\u0302\u0304\u0005/\u0000\u0000\u0303\u0305\u0005y\u0000\u0000\u0304"+
		"\u0303\u0001\u0000\u0000\u0000\u0304\u0305\u0001\u0000\u0000\u0000\u0305"+
		"\u0306\u0001\u0000\u0000\u0000\u0306\u0307\u0003~?\u0000\u0307s\u0001"+
		"\u0000\u0000\u0000\u0308\u030a\u0005-\u0000\u0000\u0309\u030b\u0003P("+
		"\u0000\u030a\u0309\u0001\u0000\u0000\u0000\u030a\u030b\u0001\u0000\u0000"+
		"\u0000\u030b\u030d\u0001\u0000\u0000\u0000\u030c\u030e\u0003~?\u0000\u030d"+
		"\u030c\u0001\u0000\u0000\u0000\u030d\u030e\u0001\u0000\u0000\u0000\u030e"+
		"u\u0001\u0000\u0000\u0000\u030f\u0310\u0005.\u0000\u0000\u0310\u0311\u0005"+
		"X\u0000\u0000\u0311w\u0001\u0000\u0000\u0000\u0312\u0317\u0003>\u001f"+
		"\u0000\u0313\u0314\u0005W\u0000\u0000\u0314\u0316\u0003>\u001f\u0000\u0315"+
		"\u0313\u0001\u0000\u0000\u0000\u0316\u0319\u0001\u0000\u0000\u0000\u0317"+
		"\u0315\u0001\u0000\u0000\u0000\u0317\u0318\u0001\u0000\u0000\u0000\u0318"+
		"\u031c\u0001\u0000\u0000\u0000\u0319\u0317\u0001\u0000\u0000\u0000\u031a"+
		"\u031c\u0005y\u0000\u0000\u031b\u0312\u0001\u0000\u0000\u0000\u031b\u031a"+
		"\u0001\u0000\u0000\u0000\u031cy\u0001\u0000\u0000\u0000\u031d\u031e\u0005"+
		"4\u0000\u0000\u031e\u031f\u0005y\u0000\u0000\u031f\u0320\u0003\u001a\r"+
		"\u0000\u0320{\u0001\u0000\u0000\u0000\u0321\u0322\u0005y\u0000\u0000\u0322"+
		"\u0323\u0005^\u0000\u0000\u0323\u0328\u0003\u0012\t\u0000\u0324\u0325"+
		"\u0005W\u0000\u0000\u0325\u0327\u0003\u0012\t\u0000\u0326\u0324\u0001"+
		"\u0000\u0000\u0000\u0327\u032a\u0001\u0000\u0000\u0000\u0328\u0326\u0001"+
		"\u0000\u0000\u0000\u0328\u0329\u0001\u0000\u0000\u0000\u0329\u032b\u0001"+
		"\u0000\u0000\u0000\u032a\u0328\u0001\u0000\u0000\u0000\u032b\u032c\u0005"+
		"_\u0000\u0000\u032c}\u0001\u0000\u0000\u0000\u032d\u032e\u0007\u000b\u0000"+
		"\u0000\u032e\u007f\u0001\u0000\u0000\u0000\u032f\u0333\u0003\u0084B\u0000"+
		"\u0330\u0332\u0003\u0080@\u0000\u0331\u0330\u0001\u0000\u0000\u0000\u0332"+
		"\u0335\u0001\u0000\u0000\u0000\u0333\u0331\u0001\u0000\u0000\u0000\u0333"+
		"\u0334\u0001\u0000\u0000\u0000\u0334\u0337\u0001\u0000\u0000\u0000\u0335"+
		"\u0333\u0001\u0000\u0000\u0000\u0336\u0338\u0003\u0088D\u0000\u0337\u0336"+
		"\u0001\u0000\u0000\u0000\u0337\u0338\u0001\u0000\u0000\u0000\u0338\u033e"+
		"\u0001\u0000\u0000\u0000\u0339\u033e\u0003\u008aE\u0000\u033a\u033e\u0003"+
		"\u008cF\u0000\u033b\u033e\u0003\u008eG\u0000\u033c\u033e\u0003\u0090H"+
		"\u0000\u033d\u032f\u0001\u0000\u0000\u0000\u033d\u0339\u0001\u0000\u0000"+
		"\u0000\u033d\u033a\u0001\u0000\u0000\u0000\u033d\u033b\u0001\u0000\u0000"+
		"\u0000\u033d\u033c\u0001\u0000\u0000\u0000\u033e\u0081\u0001\u0000\u0000"+
		"\u0000\u033f\u0340\u0007\f\u0000\u0000\u0340\u0083\u0001\u0000\u0000\u0000"+
		"\u0341\u0344\u0005^\u0000\u0000\u0342\u0345\u0003\u0082A\u0000\u0343\u0345"+
		"\u0005y\u0000\u0000\u0344\u0342\u0001\u0000\u0000\u0000\u0344\u0343\u0001"+
		"\u0000\u0000\u0000\u0345\u0349\u0001\u0000\u0000\u0000\u0346\u0348\u0003"+
		"\u0086C\u0000\u0347\u0346\u0001\u0000\u0000\u0000\u0348\u034b\u0001\u0000"+
		"\u0000\u0000\u0349\u0347\u0001\u0000\u0000\u0000\u0349\u034a\u0001\u0000"+
		"\u0000\u0000\u034a\u034c\u0001\u0000\u0000\u0000\u034b\u0349\u0001\u0000"+
		"\u0000\u0000\u034c\u034d\u0005_\u0000\u0000\u034d\u0085\u0001\u0000\u0000"+
		"\u0000\u034e\u034f\u0005[\u0000\u0000\u034f\u0350\u0003P(\u0000\u0350"+
		"\u0087\u0001\u0000\u0000\u0000\u0351\u0352\u0005^\u0000\u0000\u0352\u0355"+
		"\u0005E\u0000\u0000\u0353\u0356\u0003\u0082A\u0000\u0354\u0356\u0005y"+
		"\u0000\u0000\u0355\u0353\u0001\u0000\u0000\u0000\u0355\u0354\u0001\u0000"+
		"\u0000\u0000\u0356\u0357\u0001\u0000\u0000\u0000\u0357\u0358\u0005_\u0000"+
		"\u0000\u0358\u0089\u0001\u0000\u0000\u0000\u0359\u035c\u0005^\u0000\u0000"+
		"\u035a\u035d\u0003\u0082A\u0000\u035b\u035d\u0005y\u0000\u0000\u035c\u035a"+
		"\u0001\u0000\u0000\u0000\u035c\u035b\u0001\u0000\u0000\u0000\u035d\u0361"+
		"\u0001\u0000\u0000\u0000\u035e\u0360\u0003\u0086C\u0000\u035f\u035e\u0001"+
		"\u0000\u0000\u0000\u0360\u0363\u0001\u0000\u0000\u0000\u0361\u035f\u0001"+
		"\u0000\u0000\u0000\u0361\u0362\u0001\u0000\u0000\u0000\u0362\u0364\u0001"+
		"\u0000\u0000\u0000\u0363\u0361\u0001\u0000\u0000\u0000\u0364\u0365\u0005"+
		"E\u0000\u0000\u0365\u0366\u0005_\u0000\u0000\u0366\u008b\u0001\u0000\u0000"+
		"\u0000\u0367\u0368\u0005]\u0000\u0000\u0368\u0369\u0005y\u0000\u0000\u0369"+
		"\u008d\u0001\u0000\u0000\u0000\u036a\u036b\u0005^\u0000\u0000\u036b\u036f"+
		"\u0005i\u0000\u0000\u036c\u036e\u0003\u0086C\u0000\u036d\u036c\u0001\u0000"+
		"\u0000\u0000\u036e\u0371\u0001\u0000\u0000\u0000\u036f\u036d\u0001\u0000"+
		"\u0000\u0000\u036f\u0370\u0001\u0000\u0000\u0000\u0370\u0372\u0001\u0000"+
		"\u0000\u0000\u0371\u036f\u0001\u0000\u0000\u0000\u0372\u0373\u0005_\u0000"+
		"\u0000\u0373\u008f\u0001\u0000\u0000\u0000\u0374\u0375\u0005^\u0000\u0000"+
		"\u0375\u0379\u0005j\u0000\u0000\u0376\u0378\u0003\u0086C\u0000\u0377\u0376"+
		"\u0001\u0000\u0000\u0000\u0378\u037b\u0001\u0000\u0000\u0000\u0379\u0377"+
		"\u0001\u0000\u0000\u0000\u0379\u037a\u0001\u0000\u0000\u0000\u037a\u037c"+
		"\u0001\u0000\u0000\u0000\u037b\u0379\u0001\u0000\u0000\u0000\u037c\u0380"+
		"\u0005_\u0000\u0000\u037d\u037f\u0003\u0080@\u0000\u037e\u037d\u0001\u0000"+
		"\u0000\u0000\u037f\u0382\u0001\u0000\u0000\u0000\u0380\u037e\u0001\u0000"+
		"\u0000\u0000\u0380\u0381\u0001\u0000\u0000\u0000\u0381\u0383\u0001\u0000"+
		"\u0000\u0000\u0382\u0380\u0001\u0000\u0000\u0000\u0383\u0384\u0005^\u0000"+
		"\u0000\u0384\u0385\u0005E\u0000\u0000\u0385\u0386\u0005j\u0000\u0000\u0386"+
		"\u0392\u0005_\u0000\u0000\u0387\u0388\u0005^\u0000\u0000\u0388\u038c\u0005"+
		"j\u0000\u0000\u0389\u038b\u0003\u0086C\u0000\u038a\u0389\u0001\u0000\u0000"+
		"\u0000\u038b\u038e\u0001\u0000\u0000\u0000\u038c\u038a\u0001\u0000\u0000"+
		"\u0000\u038c\u038d\u0001\u0000\u0000\u0000\u038d\u038f\u0001\u0000\u0000"+
		"\u0000\u038e\u038c\u0001\u0000\u0000\u0000\u038f\u0390\u0005E\u0000\u0000"+
		"\u0390\u0392\u0005_\u0000\u0000\u0391\u0374\u0001\u0000\u0000\u0000\u0391"+
		"\u0387\u0001\u0000\u0000\u0000\u0392\u0091\u0001\u0000\u0000\u0000h\u0097"+
		"\u0099\u00aa\u00ad\u00ba\u00bd\u00c6\u00da\u00f2\u00f7\u00fe\u0107\u0115"+
		"\u0119\u0122\u012f\u0131\u0135\u013a\u013e\u0141\u0149\u014c\u014e\u0151"+
		"\u0156\u015b\u0164\u0166\u0168\u0172\u0179\u0187\u018e\u0195\u019a\u019f"+
		"\u01a3\u01a6\u01b5\u01bd\u01c0\u01c5\u01cd\u01d6\u01e1\u01e4\u01e7\u01f3"+
		"\u01f6\u01f9\u0206\u020c\u0210\u0215\u0218\u021a\u0227\u022e\u0236\u023e"+
		"\u0246\u0258\u0260\u0263\u0271\u0274\u027e\u0281\u0288\u028c\u0290\u0294"+
		"\u02a0\u02a3\u02ad\u02b3\u02c1\u02c8\u02cb\u02cf\u02de\u02e0\u02e9\u02f1"+
		"\u0304\u030a\u030d\u0317\u031b\u0328\u0333\u0337\u033d\u0344\u0349\u0355"+
		"\u035c\u0361\u036f\u0379\u0380\u038c\u0391";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}