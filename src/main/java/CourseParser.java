import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import software.amazon.ion.IonSystem;
import software.amazon.ion.system.IonSystemBuilder;

import java.io.File;

/**
 * Created by Dennis Li on 11/6/2016.
 */
public class CourseParser {
   private static boolean web = false;
   public static final IonSystem ionSystem = IonSystemBuilder.standard().build();
   public static void main(String[] args) {
      if (args.length > 0) {
         if ("web".equals(args[0])) {
            web = true;
         }
      }

      if (web) {

      }
      else {
         File f = new File("src/main/resources/webpages/cpe.htm");
         try {
            Document doc = Jsoup.parse(f, "UTF-8");
            DepartmentCatalogParser.parseDocument(doc);
         }
         catch (Exception e) {
            throw new RuntimeException(e);
         }
      }
   }
}
