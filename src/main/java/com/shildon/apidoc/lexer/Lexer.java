package com.shildon.apidoc.lexer;

import com.shildon.apidoc.core.TokenQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 词法分析器
 * Created by Shildon on 2018/3/31.
 */
public class Lexer {

	private static final Logger LOGGER = LoggerFactory.getLogger(Lexer.class);

	private TokenQueue tokenQueue = TokenQueue.INSTANCE;

	public void scan(File file) {
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				String word = scanner.next();
				Token token = new Token();
				token.setLexeme(word);
				tokenQueue.enqueue(token);
			}
		} catch (FileNotFoundException e) {
			LOGGER.error("[scan] file not found!", e);
		}
	}

}
