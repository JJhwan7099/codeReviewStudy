package jihwan.codeReview.model;


import com.sun.istack.NotNull;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotNull
    private String userName;

    private int countJoinGroup = 0;
    private int countCreateGroup = 0;

    @OneToMany(mappedBy = "user_id")
    private List<StudentGroup> studentGroups;

    public User(String userName) {
        this.userName = userName;
    }

    public void updateUser(String userName) {
        this.userName = userName;
    }
}
