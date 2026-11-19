
package kh.edu.istad.db_elearning_a01_m2.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "instructor_profiles")
@Getter
@Setter
@NoArgsConstructor
public class Instructor {

    @Id
    @Column(name = "user_id")
    private String userId;

    private String biography;

    @Column(name = "facebook_link")
    private String facebookLink;

    @Column(name = "github_link")
    private String githubLink;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany(mappedBy = "instructor")
    private List<Course> courses;
}
