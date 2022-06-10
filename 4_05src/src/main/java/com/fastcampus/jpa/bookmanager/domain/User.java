package com.fastcampus.jpa.bookmanager.domain;

import com.fastcampus.jpa.bookmanager.domain.listener.Auditable;
import com.fastcampus.jpa.bookmanager.domain.listener.UserEntityListener;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Builder
@Entity
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
//@EntityListeners(value = {MyEntityListener.class, UserEntityListener.class})
//@EntityListeners(value = {AuditingEntityListener.class, UserEntityListener.class})
@EntityListeners(value =  UserEntityListener.class)
@Table(name = "user", indexes = { @Index(columnList = "name")}, uniqueConstraints = {@UniqueConstraint(columnNames = {"email"})})
public class User extends BaseEntity implements Auditable {

    @Id // primary key 값
    @GeneratedValue // 자동으로 증가
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String email;

    // 중요!!
    @Enumerated(value = EnumType.STRING)
    private Gender gender;

//    @Column(updatable = false)
//    @CreatedDate
//    private LocalDateTime createdAt;
//
////    @Column(insertable = false)
//    @LastModifiedDate
//    private LocalDateTime updatedAt;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Address> address;

    @Transient
    private String testData;


    // Chapter05

//    @PrePersist // : insert method 가 호출되기 전에 실행되는 메서드
//    @PreUpdate // : merge 전에
//    @PreRemove // : delete 전
//    @PostPersist // :
//    @PostUpdate // : merge 이후에
//    @PostRemove // : delete 후
//    @PostLoad // : select 직후

//    @PrePersist
//    public void prePersist(){
////        System.out.println(">>> prePersist");
//        this.createdAt = LocalDateTime.now();
//        this.updatedAt = LocalDateTime.now();
//    }

    @PostPersist
    public void postPersist(){
        System.out.println(">>> postPersist");
    }

//    @PreUpdate
//    public void preUpdate(){
////        System.out.println(">>> preUpdate");
//        this.updatedAt = LocalDateTime.now();
//    }

    @PostUpdate
    public void postUpdate(){
        System.out.println(">>> postUpdate");
    }

    @PreRemove
    public void preRemove() {
        System.out.println(">>> preRemove");
    }

    @PostRemove
    public void postRemove(){
        System.out.println(">>> postRemove");
    }

    @PostLoad
    public void postLoad(){
        System.out.println(">>> postLoad");
    }
}
