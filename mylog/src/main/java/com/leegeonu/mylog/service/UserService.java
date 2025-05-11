package com.leegeonu.mylog.service;

import com.leegeonu.mylog.domain.User;
import com.leegeonu.mylog.dto.UserRequestDto;
import com.leegeonu.mylog.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public void signup(UserRequestDto requestDto) {
        String encodedPassword = passwordEncoder.encode(requestDto.getPassword());

        User user = User.builder()
                .username(requestDto.getUsername())
                .password(encodedPassword)
                .role("ROLE_USER")
                .build();

        userRepository.save(user);
    }
}