package com.fastcampus.jpa.bookmanager.domain;

import com.fastcampus.jpa.bookmanager.domain.listener.Auditable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor // Entity는 무조건
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
//@EntityListeners(value = MyEntityListener.class)
//@EntityListeners(value = AuditingEntityListener.class)
public class Book extends BaseEntity implements Auditable {
    @Id
    @GeneratedValue
    private  Long id;

    private String name;

    private String author;

//    @CreatedDate
//    private LocalDateTime createdAt;
//
//    @LastModifiedDate
//    private LocalDateTime updatedAt;

    // 대부분 존재
    // 이럴 때 사용하는 것이 Entity Listener
//    @PrePersist
//    public void prePersist(){
//        this.createdAt = LocalDateTime.now();
//        this.updatedAt = LocalDateTime.now();
//    }
//
//    @PreUpdate
//    public void preUpdate(){
//        this.updatedAt = LocalDateTime.now();
//    }
}
