import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CohortTest {
    Cohort empty;
    Cohort one;
    Cohort bunches;

    @Before
    public void getReady() {
        empty = new Cohort();
        one = new Cohort();
        bunches = new Cohort();

        Student bob = new Student(1, "Robert Barker");
        bob.addGrade(100);
        Student drew = new Student(2, "Drew Carry");
        drew.addGrade(100);
        drew.addGrade(90);
        drew.addGrade(95);
        one.addStudent(bob);
        bunches.addStudent(bob);
        bunches.addStudent(drew);
    }

    @Test
    public void testAddStudent() {
        bunches.addStudent(new Student(3, "Steve Harvey"));
        assertEquals("Steve Harvey", bunches.getStudents().get(2).getName());
        bunches.addStudent(new Student(4, "Pat Sayjack"));
        assertEquals(4, bunches.getStudents().size());
    }
    @Test
    public void testGetStudents(){
        assertEquals(0, empty.getStudents().size());
        assertEquals(1, one.getStudents().size());
        assertEquals(1, bunches.getStudents().get(0).getId());
        assertEquals(2, bunches.getStudents().get(1).getId());
    }
    @Test
    public void testIfAvgIsCorrect(){
        assertEquals(Double.NaN, empty.getCohortAverage(), 0);
        assertEquals(100, one.getCohortAverage(), 0);
        assertEquals(97.5, bunches.getCohortAverage(), 0);
    }

}
