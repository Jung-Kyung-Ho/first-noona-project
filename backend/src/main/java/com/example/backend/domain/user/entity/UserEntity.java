package com.example.backend.domain.user.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "user_user_entity")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", unique = true, nullable = false, updatable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "is_lock", nullable = false)
    private Boolean isLock;

    @Column(name = "is_social", nullable = false)
    private Boolean isSocial;

    @Enumerated(EnumType.STRING)
    @Column(name = "social_provider_type")
    private SocialProviderType socialProviderType;

    @Enumerated(EnumType.STRING)
    @Column(name = "role_type", nullable = false)
    private UserRoleType roleType;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "email")
    private String email;

    @CreatedDate
    @Column(name = "created_date", updatable = false)
    private LocalDateTime createdDate;

    @LastModifiedDate
    @Column(name = "updated_date")
    private LocalDateTime updatedDate;
}

/*

    데이터베이스의 user_user_entity 테이블과 매핑되는 핵심 클래스입니다.

    Auditing 기능 적용: @EntityListeners(AuditingEntityListener.class)를 통해 아까 질문하셨던 JpaAuditingConfig와 연결됩니다. 이를 통해 createdDate와 updatedDate가 자동으로 기록됩니다.

    Lombok 활용: @Builder, @Getter, @NoArgsConstructor 등을 사용하여 불필요한 Getter/Setter 및 생성자 코드를 줄이고 객체 생성을 편리하게 만들었습니다.

    보안 및 상태값:

    username: 고유값(unique = true)이며 수정이 불가능(updatable = false)하도록 설정되어 로그인 ID 역할을 합니다.

    isLock: 계정 잠금 여부를 관리합니다.

    isSocial: 일반 로그인인지 소셜 로그인인지 구분합니다.


    @NoArgsConstructor (기본 생성자):

    파라미터가 없는 생성자(예: public UserEntity() {})를 자동으로 만듭니다. 

    JPA 엔티티에서 필수: JPA는 데이터베이스에서 조회한 데이터를 객체로 만들 때 이 기본 생성자를 사용합니다. 따라서 엔티티 클래스에는 반드시 이 어노테이션이 있어야 합니다.

    @AllArgsConstructor (전체 인자 생성자):

    클래스 내부에 선언된 모든 필드를 인자로 받는 생성자를 자동으로 만듭니다.

    @Builder와의 관계: 보통 @Builder 어노테이션을 사용할 때, 모든 필드를 인자로 받는 생성자가 내부적으로 필요하기 때문에 관례적으로 함께 붙여줍니다.

*/