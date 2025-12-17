package com.example.backend.domain.user.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.domain.user.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{
    /* 
    1. 코드의 구성 요소 설명
        public interface UserRepository: 이 클래스는 실제 구현체가 아닌 인터페이스로 선언됩니다. Spring Data JPA가 실행 시점에 이 인터페이스의 구현체를 자동으로 생성해줍니다. 

        extends JpaRepository<UserEntity, Long>:

        JpaRepository: 가장 핵심입니다. 이 인터페이스를 상속받으면 기본적인 CRUD(Create, Read, Update, Delete) 메서드들이 자동으로 제공됩니다.

        <UserEntity, Long>:

        UserEntity: 이 리포지토리가 관리할 엔티티(테이블) 클래스입니다.

        Long: UserEntity 클래스 내에서 **기본키(Primary Key, @Id)**로 지정된 필드의 데이터 타입입니다.

    2. 이 인터페이스를 만들면 얻게 되는 기능들
        별도의 코드를 작성하지 않아도 아래와 같은 메서드들을 즉시 사용할 수 있습니다:

        save(user): 새로운 사용자 정보를 저장하거나 기존 정보를 업데이트합니다.

        findById(id): 특정 ID 값으로 사용자 정보를 조회합니다.

        findAll(): 테이블의 모든 데이터를 리스트 형태로 가져옵니다.

        deleteById(id): 특정 ID의 데이터를 삭제합니다.

        count(): 전체 데이터의 개수를 반환합니다.
    */
}
