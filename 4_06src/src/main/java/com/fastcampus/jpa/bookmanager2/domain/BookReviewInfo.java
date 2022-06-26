package com.fastcampus.jpa.bookmanager2.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@ToString(callSuper = true) // 상속받는 class 의 정보를 toString 에 포함
@EqualsAndHashCode(callSuper = true)
public class BookReviewInfo extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    private Long bookId;

    @OneToOne(optional = false) // book 은 절대로 null x / 반드시 존재
    private Book book;

    // null 을 허용할 것인지 아닌지에 따라
    // Float Integer vs float int
    private float averageReviewScore;

    private int reviewCount;

}
