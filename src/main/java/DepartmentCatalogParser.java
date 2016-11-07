import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Dennis Li on 11/6/2016.
 * Should just have a lot of static methods I think.
 */
public class DepartmentCatalogParser {

   public static Set<Course> parseDocument(Document doc) {
      Elements htmlCourseBlocks = doc.getElementsByClass("courseblock");
      Set<Course> courses = new LinkedHashSet<>();

      for (Element htmlCourse : htmlCourseBlocks) {
         courses.add(new Course(htmlCourse));
      }

      return courses;
   }

}
