package jihwan.codeReview.model;

import jakarta.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String comment;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @OneToOne
    private User user;
}
