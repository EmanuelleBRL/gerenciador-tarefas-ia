import java.io.IOException;
import java.util.List;

public interface ITaskRepository {

    void save (List<Task> tasks) throws IOException;

    List<Task> load() throws IOException;


}
