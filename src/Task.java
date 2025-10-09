public class Task {

    private Long id;
    private String titulo;
    private String descricao;
    private boolean status;

    public Task(Long id, String titulo, String descricao, boolean status) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Tarefa:  " +
                "\n\t"  + "Id = " + id +
                ",\n\t" + "Titulo ='" + titulo + '\'' +
                ",\n\t" + "Descricao = '" + descricao + '\'' +
                ",\n\t" + "Status = " + status +
                "\n";
    }
}
