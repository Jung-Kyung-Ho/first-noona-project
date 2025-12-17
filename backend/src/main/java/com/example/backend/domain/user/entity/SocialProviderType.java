package com.example.backend.domain.user.entity;

import lombok.Getter;

@Getter
public enum SocialProviderType {
    NAVER("네이버"),
    GOOGLE("구글");

    private final String description;

    SocialProviderType(String description) {
        this.description = description;
    }
}

/* 
    사용자가 어떤 소셜 매체를 통해 가입했는지 정의합니다.

    NAVER("네이버"), GOOGLE("구글")로 구성되어 있습니다. 

    특이사항: UserEntity에서 @Enumerated(EnumType.STRING) 설정을 사용했기 때문에, DB에는 숫자가 아닌 "NAVER", "GOOGLE"이라는 문자열 그대로 저장됩니다. 이는 나중에 항목이 추가되어도 순서가 뒤섞이지 않아 안전한 방식입니다.

*/