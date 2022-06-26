package com.fastcampus.jpa.bookmanager2.domain.listener;

import com.fastcampus.jpa.bookmanager2.domain.User;
import com.fastcampus.jpa.bookmanager2.domain.UserHistory;
import com.fastcampus.jpa.bookmanager2.repository.UserHistoryRepository;
import com.fastcampus.jpa.bookmanager2.support.BeanUtils;

import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

//@Component
public class UserEntityListener {

    @PostPersist
    @PostUpdate
    public void prePersistAndPreUpdate(Object o){
        UserHistoryRepository userHistoryRepository = BeanUtils.getBean(UserHistoryRepository.class);

        User user = (User) o;

        UserHistory userHistory = new UserHistory();
        userHistory.setName(user.getName());
        userHistory.setEmail(user.getEmail());

        userHistoryRepository.save(userHistory);
    }
}
