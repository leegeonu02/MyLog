package com.leegeonu.mylog.repository;

import com.leegeonu.mylog.domain.Diary;
import com.leegeonu.mylog.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiaryRepository extends JpaRepository<Diary, Long> {
    List<Diary> findAllByUser(User user);
}