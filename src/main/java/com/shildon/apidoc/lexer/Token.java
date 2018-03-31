package com.shildon.apidoc.lexer;

/**
 * Created by Shildon on 2018/3/31.
 */
public class Token {
	private Tag tag;
	private String lexeme;

	@Override
	public String toString() {
		return "Token{" +
				"tag=" + tag +
				", lexeme='" + lexeme + '\'' +
				'}';
	}

	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}

	public String getLexeme() {
		return lexeme;
	}

	public void setLexeme(String lexeme) {
		this.lexeme = lexeme;
	}
}
