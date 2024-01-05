import java.util.ArrayList;

public class StreamService {
   public void sortStreams(ArrayList<Stream> streams) {
      streams.sort(new StreamComparator());
   }
}
