package complex.query.simple.result.nojpa;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

@Service
public class JdbcAndMapperService {

    private static final String QUERY = "select time_start, time_end, lesson, room, teacher.name, teacher.surname" +
            " from app.timetable timetable, app.teacher teacher, app.student student " +
            " where" +
            " timetable.teacher_id=teacher.id AND timetable.grade_num=student.grade_num AND timetable.grade_letter=student.grade_letter" +
            " AND timetable.day=? AND student.name=? AND student.surname=?" +
            " ORDER BY time_start";

    private final JdbcTemplate jdbcTemplate;

    public JdbcAndMapperService(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<TimeTableEntryNoJpa> getTimeTableForGivenDayAndStudent(int day, String name, String surname) {
        return jdbcTemplate.query(QUERY, (rs, rowNum) -> {
            TimeTableEntryNoJpa entry = new TimeTableEntryNoJpa();
            entry.setTimeStart(rs.getInt(1));
            entry.setTimeEnd(rs.getInt(2));
            entry.setLesson(rs.getString(3));
            entry.setRoom(rs.getInt(4));
            entry.setTeacherName(rs.getString(5));
            entry.setTeacherSurname(rs.getString(6));
            return entry;
        }, day, name, surname);
    }
}
