package com.leegeonu.mylog.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users") // 테이블 이름 설정
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    private String role; // ex: ROLE_USER, ROLE_ADMIN
}