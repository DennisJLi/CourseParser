import org.jsoup.nodes.Element;

import java.util.List;

/**
 * Created by Dennis Li on 11/6/2016.
 */
public class Course {
   private final String courseTitle;
   private final int courseUnits;
   private final String crncOption; // Credit/No-Credit
   private final List<Prerequisite> prerequisites; // Possibility of OR with prereqs, which is why there is a list.
   private final List<Course> concurrent; // Concurrent courses take higher priority.
   // TODO: how to deal with prereq OR concur classes. Add recommended?

   public Course(Element htmlCourseBlock) {

   }
}
