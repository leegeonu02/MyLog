package com.leegeonu.mylog.service;

import com.leegeonu.mylog.domain.Diary;
import com.leegeonu.mylog.domain.User;
import com.leegeonu.mylog.repository.DiaryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DiaryService {

    private final DiaryRepository diaryRepository;

    public Diary createDiary(String title, String content, User user) {
        Diary diary = Diary.builder()
                .title(title)
                .content(content)
                .user(user)
                .build();
        return diaryRepository.save(diary);
    }

    public List<Diary> getMyDiaries(User user) {
        return diaryRepository.findAllByUser(user);
    }
}