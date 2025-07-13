package com.yaspalclesses.yashpalTution.entity;

import lombok.Getter;
import lombok.Setter;



@Getter
public enum Subject {
    ALL("All"),
    MATHS("Maths"),
    SCIENCE("Science"),
    ENGLISH("English"),
    HINDI("Hindi"),
    SOCIAL_SCIENCE("Social Science"),
    COMPUTER("Computer"),
    PHYSICS("Physics"),
    CHEMISTRY("Chemistry"),
    BIOLOGY("Biology"),
    ECONOMICS("Economics"),
    BUSINESS_STUDIES("Business Studies"),
    ACCOUNTANCY("Accountancy"),
    HISTORY("History"),
    GEOGRAPHY("Geography"),
    POLITICAL_SCIENCE("Political Science");

    private final String displayName;

    Subject(String displayName) {
        this.displayName = displayName;
    }

}

