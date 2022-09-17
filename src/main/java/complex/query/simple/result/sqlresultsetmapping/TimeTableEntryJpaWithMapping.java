package complex.query.simple.result.sqlresultsetmapping;

import lombok.Data;

import javax.persistence.*;

@SqlResultSetMapping(
        name = "TTMapping",
        entities = @EntityResult(
                entityClass = TimeTableEntryJpaWithMapping.class,
                fields = {
                        @FieldResult(name = "timeStart", column = "time_start"),
                        @FieldResult(name = "timeEnd", column = "time_end"),
                        @FieldResult(name = "lesson", column = "lesson"),
                        @FieldResult(name = "room", column = "room"),
                        @FieldResult(name = "teacherName", column = "teacher_name"),
                        @FieldResult(name = "teacherSurname", column = "teacher_surname")}))

@Entity
@Data
public class TimeTableEntryJpaWithMapping {

    @Id
    private Integer timeStart;
    private Integer timeEnd;
    private String lesson;
    private Integer room;
    private String teacherName;
    private String teacherSurname;
}