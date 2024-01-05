import java.util.ArrayList;
import java.util.Iterator;

public class Stream implements Iterable<StudentGroup> {
   private ArrayList<StudentGroup> studentGroups;

   public Stream(ArrayList<StudentGroup> studentGroups) {
      this.studentGroups = studentGroups;
   } 

   public ArrayList<StudentGroup> getStudentGroups() {
      return studentGroups;
   }

   @Override
   public Iterator<StudentGroup> iterator() {
      return new StreamIterator(this);
   }
   
}
