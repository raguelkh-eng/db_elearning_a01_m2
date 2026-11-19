
package kh.edu.istad.db_elearning_a01_m2.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "student_profiles")
@Getter
@Setter
public class Student {

    @Id
    @Column(name = "user_id")
    private String userId;

    private String biography;

    @Column(name = "facebook_link")
    private String facebookLink;

    @Column(name = "github_link")
    private String githubLink;

    private String major;

    @Column(name = "phone_number")
    private String phoneNumber;

    private String university;
}
