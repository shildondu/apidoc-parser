package com.shildon.apidoc.core;

import com.shildon.apidoc.lexer.Token;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Shildon on 2018/3/31.
 */
public class TokenQueue {

	public static final TokenQueue INSTANCE = new TokenQueue();

	private BlockingQueue<Token> queue = new LinkedBlockingQueue<>();

	private TokenQueue() {

	}

	public boolean enqueue(Token token) {
		return queue.add(token);
	}

	public Token dequeue() throws InterruptedException {
		return queue.take();
	}

}
