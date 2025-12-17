package com.example.backend.domain.user.entity;

public enum UserRoleType {
    USER, ADMIN
}

/*
    시스템 내에서 사용자의 등급을 정의합니다.

    USER: 일반 사용자

    ADMIN: 관리자

    Spring Security와 연동할 때 이 값을 바탕으로 특정 페이지에 대한 접근 권한을 제어하게 됩니다. 
*/
