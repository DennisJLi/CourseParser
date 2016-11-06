import java.util.Arrays;
import java.util.List;

/**
 * Created by Dennis Li on 11/6/2016.
 */
public class Prerequisite {
   // Possible to have multiple courses required.
   private final List<Course> courses;

   public Prerequisite(Course... courses) {
      this.courses = Arrays.asList(courses);
   }

   public boolean fulfillsPrereq(Student s) {
      for (Course course : courses) {
         if (!s.hasTaken(course)){
            return false;
         }
      }
      return true;
   }
}
