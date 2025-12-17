package com.example.backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
public class JpaAuditingConfig {
    /*
    Spring Data JPA의 Auditing(감사) 기능을 활성화하기 위해 사용됩니다.
    쉽게 설명하자면, 데이터베이스의 레코드가 **'언제 생성되었는지'**와 **'언제 수정되었는지'**를 개발자가 매번 코드로 직접 넣지 않아도 Spring이 자동으로 관리하게 해주는 설정입니다.

    1. 주요 어노테이션의 역할
    @Configuration: 이 클래스가 Spring의 설정 정보를 담고 있는 클래스임을 선언합니다.

    @EnableJpaAuditing: JPA Auditing 기능을 애플리케이션 전체에 활성화합니다.

    2. 왜 사용하나요? (주요 이점)
    보통 게시판이나 회원 관리 시스템을 만들 때 created_at(생성일), updated_at(수정일) 컬럼이 필수적으로 들어갑니다. 이 설정을 해두면 다음과 같은 이점이 있습니다.

    자동화: 데이터를 저장(save)하거나 수정할 때마다 LocalDateTime.now()를 호출할 필요가 없습니다.

    공통화: 모든 엔티티(Entity)에서 공통적으로 사용하는 날짜 및 수정자 필드를 일관성 있게 관리할 수 있습니다.


    컴포넌트 스캔: 스프링 부트가 시작될 때 @Configuration이 붙은 클래스를 찾아 자동으로 설정 클래스로 인식합니다.

    빈 등록 및 활성화: 스프링 컨테이너가 이 클래스를 빈으로 등록하면서 내부의 설정들을 읽어들입니다. 이때 이 클래스에 붙은 @EnableJpaAuditing 어노테이션이 실행됩니다.

    기능 동작: 이 어노테이션이 활성화되면, 스프링 데이터 JPA는 엔티티의 생성/수정 이벤트가 발생할 때마다 감시(Auditing) 기능을 수행하여 createdDate나 updatedDate에 값을 자동으로 채워주게 됩니다.
 */
}
