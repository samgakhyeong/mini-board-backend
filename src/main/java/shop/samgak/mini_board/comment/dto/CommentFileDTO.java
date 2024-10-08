package shop.samgak.mini_board.comment.dto;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentFileDTO {
    private Long id;
    private CommentDTO comment;
    private String originalName;
    private String filePath;
    private Long fileSize;
    private Instant createdAt;
}
