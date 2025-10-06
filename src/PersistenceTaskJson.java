import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PersistenceTaskJson implements ITaskRepository   {
    private static final String ARQUIVO_JSON= "tarefas.json";
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();


    @Override
    public void save(List<Task> tasks) throws IOException {
        String json = gson.toJson(tasks);
      try  (FileWriter writer = new FileWriter(ARQUIVO_JSON)){
            writer.write(json);
        }
    }
//deserialization
    @Override
    public List<Task> load() throws IOException {

        return List.of();
    }
}
