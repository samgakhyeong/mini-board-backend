package shop.samgak.mini_board.post.dto;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import shop.samgak.mini_board.user.dto.UserDTO;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {
    private Long id;
    private UserDTO user;
    private String title;
    private String content;
    private Instant createdAt;
    private Instant updatedAt;
}
