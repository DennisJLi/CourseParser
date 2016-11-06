import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeVisitor;
import software.amazon.ion.IonStruct;
import software.amazon.ion.IonSystem;

/**
 * Created by Dennis Li on 11/6/2016.
 * Should just have a lot of static methods I think.
 */
public class DepartmentCatalogParser {
   private static final IonSystem ionSystem = CourseParser.ionSystem;

   public static void parseDocument(Document doc) {
      Elements htmlCourseBlocks = doc.getElementsByClass("courseblock");
      IonStruct courses = ionSystem.newEmptyStruct();

      for (Element course : htmlCourseBlocks) {
         course.className()
      }
   }

   private static void addCourseBlockToCourses(IonStruct courses, Node courseBlock) {
      IonStruct course = ionSystem.newEmptyStruct();

   }
}
