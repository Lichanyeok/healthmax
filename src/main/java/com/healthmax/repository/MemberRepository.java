package com.healthmax.repository;

import com.healthmax.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, String> {

    List<Member> findByEmail(String email);
}
