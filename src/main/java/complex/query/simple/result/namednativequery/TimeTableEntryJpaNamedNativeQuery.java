package complex.query.simple.result.namednativequery;

import lombok.Data;

import javax.persistence.*;

@NamedNativeQueries({
        @NamedNativeQuery(
                name = "getTimetableForDayForClassStudent",
                query = "select time_start, time_end, lesson, room, teacher.name teacher_name, teacher.surname teacher_surname" +
                        " from app.timetable timetable, app.teacher teacher, app.student student " +
                        " where" +
                        " timetable.teacher_id=teacher.id AND timetable.grade_num=student.grade_num AND timetable.grade_letter=student.grade_letter" +
                        " AND timetable.day=? AND student.name=? AND student.surname=?" +
                        " ORDER BY time_start",
                resultClass=TimeTableEntryJpaNamedNativeQuery.class
        )
})

@Entity
@Data
public class TimeTableEntryJpaNamedNativeQuery {

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