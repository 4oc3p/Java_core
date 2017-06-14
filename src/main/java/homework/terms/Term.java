package homework.terms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 4oc3p on 15.06.2017. Java_core
 */
public class Term {

    private static int ID_COUNTER;

    private int id;
    private String termNumber;
    private List<Course> courses = new ArrayList<>();

    public Term(String termNumber, Course... course) {
        this.termNumber = termNumber;
        this.courses.addAll(Arrays.asList(course));
        this.id = ++ID_COUNTER;
    }

    public String getTermNumber() {
        return termNumber;
    }

    public void setTermNumber(String termNumber) {
        this.termNumber = termNumber;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Term " + termNumber + " {" +
                "ID=" + id +
                ", courses=" + courses +
                '}';
    }
}
