package org.koreait.repositories;

import com.querydsl.core.BooleanBuilder;
import org.koreait.entities.QUsers;
import org.koreait.entities.Users;
import static org.springframework.data.domain.Sort.*;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Long>, QuerydslPredicateExecutor<Users> {
    Users findByUserId(String userId);

    List<Users> findByRegDtBetweenOrderByRegDtDesc(LocalDateTime sdate, LocalDateTime edate);

    List<Users> findByUserNmContainingOrderByRegDtDesc(String keyword, Pageable pageable);


    @Query("SELECT u FROM Users u WHERE u.userNm LIKE %:key% ORDER BY u.regDt DESC")
    List<Users> getUsers1(@Param("key") String keyword);

    default List<Users> getUsers2(String keyword) {
        QUsers qUsers = QUsers.users;

        /*
        List<Users> items = (List<Users>) findAll(qUsers.userNm.contains(keyword), Sort.by(Sort.Order.desc("regDt"), Sort.Order.asc("userId")));

        return data;
        */

        Pageable pageable = PageRequest.of(0, 5, by(Order.desc("regDt")));

        Page<Users> data = findAll(qUsers.userNm.contains(keyword), pageable);

        List<Users> items = data.getContent();

        long totalPages = data.getTotalPages();
        long total = data.getTotalElements();
        System.out.printf("totalPages: %d, total: %d%n", totalPages, total);

        return items;
    }

    default List<Users> getUsers3(String keyword){
        //userId user1, user2, userNm 사용자

        QUsers qUsers = QUsers.users;
        BooleanBuilder builder = new BooleanBuilder();
        builder.and(qUsers.userNm.contains(keyword));

        BooleanBuilder orBuilder = new BooleanBuilder();
        orBuilder.or(qUsers.userId.eq("user1"))
                .or(qUsers.userId.eq("user2"));

        builder.and(orBuilder);

        List<Users> items = (List<Users>) findAll(builder, by(Order.desc("regDt")));

        return items;
    }
}