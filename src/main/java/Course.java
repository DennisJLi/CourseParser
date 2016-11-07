import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dennis Li on 11/6/2016.
 */
public class Course {
   private String courseTitle;
   private String courseShortDesc;
   private int courseUnits;

   private boolean crncOption; // Credit/No-Credit
   private final List<Prerequisite> prerequisites; // Possibility of OR with prereqs, which is why there is a list.
   private final List<Course> concurrent; // Concurrent courses take higher priority.

   private String courseLongDesc;
   // TODO: how to deal with prereq OR concur classes. Also, add recommended classes?

   public Course(Element htmlCourseBlock) {
      parseCourseTitle(htmlCourseBlock);
      crncOption = false;
      prerequisites = new ArrayList<>();
      concurrent = new ArrayList<>();
   }

   private void parseCourseTitle(Element htmlCourseBlock) {
      Elements courseTitle = htmlCourseBlock.getElementsByClass("courseblocktitle");
      String[] titleBlocks = courseTitle.text().split("."); // As of 11-7-2016, ex course block = "CPE 101. Fundamentals of CS I. 4 Units"
      for (int i = 0; i < titleBlocks.length; i++) {
         titleBlocks[i] = titleBlocks[i].trim();
      }

      this.courseTitle = titleBlocks[0];
      this.courseShortDesc = titleBlocks[1];
      this.courseUnits = Integer.parseInt(titleBlocks[2].split(" ")[0]); // yeah this is hideous. Should split later I guess.
   }
}
