package homework.terms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 4oc3p on 15.06.2017. Java_core
 */
public class TermTest {

    public static void main(String[] args) {

        Term term1 = new Term("First", new Course("qwe1"), new Course("ewq1"));
        Term term2 = new Term("Second", new Course("qwe2"), new Course("ewq2"));
        Term term3 = new Term("Third", new Course("qwe3"), new Course("ewq3"));

        Map<String, List<Course>> termNumberToCoursesListMap = new HashMap<>();

        termNumberToCoursesListMap.put(term1.getTermNumber(), term1.getCourses());
        termNumberToCoursesListMap.put(term2.getTermNumber(), term2.getCourses());
        termNumberToCoursesListMap.put(term3.getTermNumber(), term3.getCourses());

        System.out.println(termNumberToCoursesListMap.get("First"));
        System.out.println(termNumberToCoursesListMap.get("Second"));

    }
}
