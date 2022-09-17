package complex.query.simple.result.namednativequery;

import complex.query.simple.result.sqlresultsetmapping.TimeTableEntryJpaWithMapping;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class NamedNativeQueryService {

    private final EntityManager entityManager;

    public NamedNativeQueryService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<TimeTableEntryJpaNamedNativeQuery> getTimeTableForGivenDayAndStudent(int day, String name, String surname) {
        return entityManager
                .createNamedQuery("getTimetableForDayForClassStudent", TimeTableEntryJpaNamedNativeQuery.class)
                .setParameter(1, day)
                .setParameter(2, name)
                .setParameter(3, surname)
                .getResultList();
    }

}
