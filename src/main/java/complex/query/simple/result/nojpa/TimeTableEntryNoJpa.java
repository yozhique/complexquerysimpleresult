package complex.query.simple.result.nojpa;

import lombok.Data;

@Data
public class TimeTableEntryNoJpa {
    private Integer timeStart;
    private Integer timeEnd;
    private String lesson;
    private Integer room;
    private String teacherName;
    private String teacherSurname;
}