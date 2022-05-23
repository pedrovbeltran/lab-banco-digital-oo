import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transacao {
    private int id;
    private LocalDateTime data;
	private static int ID_TRANSACAO = 1;

    public Transacao() {
        this.id = ID_TRANSACAO++;
        this.data = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getData() {
        return data;
    }

    private String getDataFormatada() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return this.data.format(formatter);
    }

    private String getIdFormatado() {
        return String.format("(%04d) ", this.id);
    }

    public String getInfo(String tipo) {
         return this.getIdFormatado() + tipo + 
						" em " + this.getDataFormatada();
    }
}
