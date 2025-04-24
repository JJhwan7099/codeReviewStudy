package jihwan.codeReview.model;

import jakarta.persistence.*;

@Entity
public class StudentGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    private User user;

    @ManyToMany
    private Group group;

    private String role;
}
