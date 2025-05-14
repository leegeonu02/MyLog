package com.leegeonu.mylog.controller;

import com.leegeonu.mylog.domain.Diary;
import com.leegeonu.mylog.domain.User;
import com.leegeonu.mylog.service.DiaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/diaries")
public class DiaryController {

    private final DiaryService diaryService;

    @PostMapping
    public ResponseEntity<Diary> create(@RequestBody Diary diary,
                                        @AuthenticationPrincipal UserDetails userDetails) {
        User user = new User(); // 💡 정석은 Repository로 가져오는 것
        user.setUsername(userDetails.getUsername());
        diary.setUser(user);
        return ResponseEntity.ok(diaryService.createDiary(diary.getTitle(), diary.getContent(), user));
    }

    @GetMapping
    public ResponseEntity<List<Diary>> getMyDiaries(@AuthenticationPrincipal UserDetails userDetails) {
        User user = new User();
        user.setUsername(userDetails.getUsername());
        return ResponseEntity.ok(diaryService.getMyDiaries(user));
    }
}