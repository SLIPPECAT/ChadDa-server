package com.search.instagramsearching.repository;

import com.search.instagramsearching.dto.response.UserSearchResultDto;
import com.search.instagramsearching.entity.Users;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.web.PageableDefault;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users,Long> {

    // Fulltext - 단어 단위로 유저 검색
    @Query(value = "SELECT id, sid, profile_name, business_account_tf, firstname_lastname, profile_id, n_posts, following, followers, description, url FROM users\n" +
            "WHERE MATCH (profile_name, firstname_lastname) AGAINST (:keyword IN BOOLEAN MODE)",
            countQuery = "SELECT count(*) FROM users WHERE MATCH (profile_name, firstname_lastname) AGAINST (:keyword IN BOOLEAN MODE)",
            nativeQuery = true)
    List<UserSearchResultDto> searchUsers(@Param("keyword") String keyword, @PageableDefault Pageable pageable);

    //sid로 유저 검색
    Optional<Users> findUsersBySid(Long sid);


}