import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
public class StudentTest {
@Test
    public void testCreate(){
    Student one = new Student(1,"one");
    Student bob = null;
    assertNull(bob);
    assertNotNull(one);
}
@Test
    public void testFields(){
    Student one = new Student(1,"one");
    assertSame(1,one.getId());
    assertSame("one",one.getName());
    assertSame(0, one.getGrades().size());
}
@Test
    public void testAdd(){
    Student one = new Student(1,"one");
    one.addGrade(90);
    assertSame(90,one.getGrades().get(0));
    one.addGrade(75);
    assertSame(75,one.getGrades().get(1));
}
@Test
    public void testAverage(){
    Student one = new Student(1,"one");
    one.addGrade(90);
    one.addGrade(75);
    assertEquals(82.5,one.getGradeAverage(),0);
}
}
