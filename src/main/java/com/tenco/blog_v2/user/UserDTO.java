package com.tenco.blog_v2.user;

import lombok.Data;

@Data
public class UserDTO {

    // 정적 내부 클래로 모우자
    @Data
    public static class LoginDTO {
        private String username;
        private String password;
    }

    // 정적 내부 클래로 모우자
    @Data
    public static class JoinDTO {
        private String username;
        private String password;
        private String email;

        public User toEntity() {
            return User.builder()
                    .username(username)
                    .password(password)
                    .role("USER")
                    .email(email)
                    .build();
        }
    }

    @Data
    public static class UpdateDTO {
        private String password;
        private String email;
    }

}
