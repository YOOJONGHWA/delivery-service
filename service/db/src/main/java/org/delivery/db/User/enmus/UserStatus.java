package org.delivery.db.User.enmus;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum UserStatus {

    REGISTERED("등록"),

    UNREGISTERED("해지"),

    ;
    private final String description;

}
