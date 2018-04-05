package com.shildon.apidoc.lexer;

import com.google.common.collect.Sets;

import java.util.Set;

/**
 * 词素类型
 * Created by Shildon on 2018/3/31.
 */
public enum Tag {
	KEY_WORD(TagType.IS, null),
	PACKAGE(TagType.NEXT, Sets.newHashSet("package")),
	CLASS_URL(TagType.IN, Sets.newHashSet("@RequestMapping")),
	INTERFACE_DESCRIPTION(TagType.NEXT, Sets.newHashSet("/*", "//")),
	METHOD_URL(TagType.IN, Sets.newHashSet("@RequestMapping")),
	REQUEST_PARAM(TagType.IS, null),
	REQUEST_PARAM_DESCRIPTION(TagType.NEXT, Sets.newHashSet("@Param")),
	RESPONSE_PARAM(TagType.IS, null),
	RESPONSE_PARAM_DESCRIPTION(TagType.IS, null),
	UNKNOWN(TagType.IS, null);

	private TagType type;
	private Set<String> keywords;

	Tag(TagType type, Set<String> keywords) {
		this.type = type;
		this.keywords = keywords;
	}

	public Set<String> getKeywords() {
		return keywords;
	}

	public TagType getType() {
		return type;
	}
}
