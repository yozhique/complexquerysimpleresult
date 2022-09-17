package complex.query.simple.result.annotatedentity;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class NativeQueryAndAnnotatedEntityService {

    private static final String QUERY = "select time_start, time_end, lesson, room, teacher.name teacher_name, teacher.surname teacher_surname" +
            " from app.timetable timetable, app.teacher teacher, app.student student " +
            " where" +
            " timetable.teacher_id=teacher.id AND timetable.grade_num=student.grade_num AND timetable.grade_letter=student.grade_letter" +
            " AND timetable.day=? AND student.name=? AND student.surname=?" +
            " ORDER BY time_start";

    private final EntityManager entityManager;

    public NativeQueryAndAnnotatedEntityService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @SuppressWarnings("unchecked")
    public List<TimeTableEntryJpa> getTimeTableForGivenDayAndStudent(int day, String name, String surname) {
        return entityManager
                .createNativeQuery(QUERY, TimeTableEntryJpa.class)
                .setParameter(1, day)
                .setParameter(2, name)
                .setParameter(3, surname)
                .getResultList();
    }
}
