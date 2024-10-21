package com.tenco.blog_v2.board;

import com.tenco.blog_v2.user.User;
import lombok.Data;

public class BoardDTO {

    @Data
    public static class SaveDTO {
        private String title;
        private String content;

        public Board toEntity(User user) {
            return Board.builder()
                    .title(title)
                    .content(content)
                    .user(user)
                    .build();
        }

    }

    @Data
    public static class UpdateDTO {
        private String username;
        private String title;
        private String content;
    }

}
