package com.shildon.apidoc.lexer;

/**
 * 标志词法分析时，是该读下一个词，还是当前词里的
 */
public enum TagType {
    IS,
    NEXT,
    IN;
}
