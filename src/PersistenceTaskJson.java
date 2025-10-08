import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
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
    if (!Files.exists(Paths.get(ARQUIVO_JSON))){
        return new ArrayList<>();
    }
    String json = new String(Files.readAllBytes(Paths.get(ARQUIVO_JSON)));
    Task[] tasks = gson.fromJson(json, Task[].class);
    return new ArrayList<>(List.of(tasks == null ? new Task[0] : tasks));
    }
}
