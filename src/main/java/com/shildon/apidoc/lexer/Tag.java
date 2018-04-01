package com.shildon.apidoc.lexer;

import com.google.common.collect.Sets;

import java.util.Set;

/**
 * 词素类型
 * Created by Shildon on 2018/3/31.
 */
public enum Tag {
	KEY_WORD(null),
	PACKAGE(Sets.newHashSet("package")),
	CLASS_URL(Sets.newHashSet("@RequestMapping")),
	INTERFACE_DESCRIPTION(Sets.newHashSet("/*", "//")),
	METHOD_URL(Sets.newHashSet("@RequestMapping")),
	REQUEST_PARAM(null),
	REQUEST_PARAM_DESCRIPTION(Sets.newHashSet("@Param")),
	RESPONSE_PARAM(null),
	RESPONSE_PARAM_DESCRIPTION(null);

	private Set<String> keywords;

	Tag(Set<String> keywords) {
		this.keywords = keywords;
	}

	public Set<String> getKeywords() {
		return keywords;
	}
}
