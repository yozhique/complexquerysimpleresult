package complex.query.simple.result.annotatedentity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class TimeTableEntryJpa {

    @Id
    @Column(name = "time_start")
    private Integer timeStart;

    @Column(name = "time_end")
    private Integer timeEnd;

    @Column(name = "lesson")
    private String lesson;

    @Column(name = "room")
    private Integer room;

    @Column(name = "teacher_name")
    private String teacherName;

    @Column(name = "teacher_surname")
    private String teacherSurname;
}
