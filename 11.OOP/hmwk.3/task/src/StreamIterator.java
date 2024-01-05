import java.util.ArrayList;
import java.util.Iterator;

public class StreamIterator implements Iterator<StudentGroup> {
   private ArrayList<StudentGroup> studentGroups;
   private int index;

   public StreamIterator(Stream stream) {
      this.studentGroups = stream.getStudentGroups();
      index = 0;
   }

   @Override
   public boolean hasNext() {
      return index < studentGroups.size();
   }

   @Override
   public StudentGroup next() {
      if (hasNext()) {
         return studentGroups.get(index++);
      }
      return null;
   }

}
