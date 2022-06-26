package com.fastcampus.jpa.bookmanager2.repository;

import com.fastcampus.jpa.bookmanager2.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

// jpa 지원
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//    Set<User> findByName(String name);
    Optional<User> findByName(String name);

    Set<User> findUserByNameIs(String name);
    Set<User> findUserByName(String name);
    Set<User> findUserByNameEquals(String name);

    User findByEmail(String email);

    User getByEmail(String email);

    User readByEmail(String email);

    User queryByEmail(String email);

    User searchByEmail(String email);

    User streamByEmail(String email);

    User findUserByEmail(String email);

    User findSomethingByEmail(String email);

    List<User> findFirst1ByName(String name);

    //List<User> findTop1ByName(String name);

    // last1 무시. orderby 로 역순 정렬 후 last 가져오기
//    List<User> findLast1ByName(String name);

    // and or
    List<User> findByEmailAndName(String email, String name);

    List<User> findByEmailOrName(String email, String name);

    // 숫자, 날짜
    List<User> findByCreatedAtAfter(LocalDateTime yesterday);

    List<User> findByIdAfter(Long id);

    List<User> findByCreatedAtGreaterThan(LocalDateTime yesterday);

    // Equal = 다른거는 초과, 미만
    List<User> findByCreatedAtGreaterThanEqual(LocalDateTime yesterday);

    List<User> findByCreatedAtBetween(LocalDateTime yesterday, LocalDateTime tomorrow);

    // 양 극단 포함
    List<User> findByIdBetween(Long id1, Long id2);
    // ==
    List<User> findByIdGreaterThanEqualAndIdLessThanEqual(Long id1, Long id2);


    // 빈값 조회
    List<User> findByIdIsNotNull();

    // IsEmpty / IsNotEmpty can only be used on collection properties ""
//    List<User> findByAddressIsNotEmpty();

    // in 절 안에 얼마나 데이터가 넘어오는지 모르기때문에 너무 길면 성능적인 이슈가 있음
    List<User> findByNameIn(List<String> names);

    List<User> findByNameStartingWith(String name);

    List<User> findByNameEndingWith(String name);

    List<User> findByNameContains(String name);

    // %a%
    List<User> findByNameLike(String name);


    // 정렬
    List<User> findTop1ByName(String name);

    List<User> findLast1ByName(String name);

    // Asc or Desc
    List<User> findTop1ByNameOrderByIdDesc(String name);

    List<User> findFirstByNameOrderByIdDescEmailAsc(String name);

    List<User> findFirstByName(String name, Sort sort);


    // paging
    // Page : 응답값 Pageable : 요청값
    Page<User> findByName(String name, Pageable pageable);


    @Query(value = "select * from user limit 1;", nativeQuery = true)
    Map<String, Object> findRawRecord();
}
