package complex.query.simple.result;

import complex.query.simple.result.namednativequery.NamedNativeQueryService;
import complex.query.simple.result.nojpa.JdbcAndMapperService;
import complex.query.simple.result.annotatedentity.NativeQueryAndAnnotatedEntityService;
import complex.query.simple.result.sqlresultsetmapping.NativeQueryAndresultSetMappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class Main {

    @Autowired
    private JdbcAndMapperService jdbcAndMapperService;

    @Autowired
    private NativeQueryAndAnnotatedEntityService nativeQueryAndAnnotatedEntityService;

    @Autowired
    private NativeQueryAndresultSetMappingService nativeQueryAndresultSetMappingService;

    @Autowired
    private NamedNativeQueryService namedNativeQueryService;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void goAndQuerySomeDb() {
        System.out.println("JDBC and mapper");
        System.out.println(jdbcAndMapperService.getTimeTableForGivenDayAndStudent(1, "Anna", "Smith"));
        System.out.println("JPA - map columns directly");
        System.out.println(nativeQueryAndAnnotatedEntityService.getTimeTableForGivenDayAndStudent(1, "Anna", "Smith"));
        System.out.println("JPA - SqlResultSetMapping");
        System.out.println(nativeQueryAndresultSetMappingService.getTimeTableForGivenDayAndStudent(1, "Anna", "Smith"));
        System.out.println("JPA - NamedNativeQuery");
        System.out.println(namedNativeQueryService.getTimeTableForGivenDayAndStudent(1, "Anna", "Smith"));
    }
}
