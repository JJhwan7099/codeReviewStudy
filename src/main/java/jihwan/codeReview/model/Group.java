package jihwan.codeReview.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long groupId;
    private String groupName;
    private String groupCategory;
    private int countMember = 0;

    @OneToMany(mappedBy = "group_id")
    private List<StudentGroup> studentGroups;

    @OneToMany(mappedBy = "group_id")
    private List<Post> posts;

    public Group(String groupName, String groupCategory) {
        this.groupName = groupName;
        this.groupCategory = groupCategory;
    }
}
