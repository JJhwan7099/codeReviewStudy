package jihwan.codeReview.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private String code;
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

    @OneToOne
    private User user;

    @OneToMany(mappedBy = "comment_id")
    private List<Comment> comments;
}
