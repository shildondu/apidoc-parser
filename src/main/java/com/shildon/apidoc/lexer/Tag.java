package com.shildon.apidoc.lexer;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.apache.commons.collections.CollectionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 词法单元类型
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

    private static final Map<String, Tag> KEYWORD_MAP = new HashMap<>();

    static {
        List<Tag> tags = Lists.newArrayList(Tag.values());
        for (Tag tag : tags) {
            Set<String> keywords = tag.getKeywords();
            if (CollectionUtils.isEmpty(keywords)) {
                break;
            }
            for (String keyword : keywords) {
                KEYWORD_MAP.put(keyword, tag);
            }
        }
    }

    private TagType type;
    private Set<String> keywords;

    Tag(TagType type, Set<String> keywords) {
        this.type = type;
        this.keywords = keywords;
    }

    public static Tag selectTag(String keyword) {
        Tag tag = KEYWORD_MAP.get(keyword);
        return tag == null ? UNKNOWN : tag;
    }

    public Set<String> getKeywords() {
        return keywords;
    }

    public TagType getType() {
        return type;
    }
}
