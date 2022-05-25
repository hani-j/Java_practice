package com.fastcampus.jpa.bookmanager.domain;

import lombok.*;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
//Equals Hashcode?
@EqualsAndHashCode
@Data
@Builder
public class User {
    @NonNull
    private String name;
    @NonNull
    private String email;
    private LocalDateTime createAt; // 언제 생성되는지
    private LocalDateTime updateAt; // 언제 업뎃되는지
}
