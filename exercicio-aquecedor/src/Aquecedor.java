import com.javacorrige.Especificacao;
import com.javacorrige.Nota;
import com.javacorrige.Testar;

@Especificacao(todosAtributosPrivados = true, atributosExatos = true, metodosExatos = true, construtoresExatos = true, similaridade = 0.8, penalidade = 0.0)
public class Aquecedor {

    // --- Atributos (Total: 20 pontos) ---

    @Nota(5)
    private double temperatura;

    @Nota(5)
    private double min;

    @Nota(5)
    private double max;

    @Nota(5)
    private double incremento;

    // --- Construtor (Total: 20 pontos) ---

    @Nota(20)
    public Aquecedor(double min, double max) {
        this.temperatura = 20;
        this.max = max;
        this.min = min;
        this.incremento = 3;
    }

    // --- Métodos de Controle e Leitura (Total: 60 pontos) ---

    @Nota(15)
    @Testar(construtor = { "10.0", "30.0" }, parametros = {})
    public void esfriar() {
        if (temperatura + incremento >= min) {
            this.temperatura -= incremento;
        }
    }

    @Nota(15)
    @Testar(construtor = { "10.0", "30.0" }, parametros = {})
    public void esquentar() {
        if (temperatura + incremento <= max) {
            this.temperatura += incremento;
        }
    }

    @Nota(15)
    @Testar(construtor = { "10.0", "30.0" }, parametros = {})
    public double getTemperatura() {
        return this.temperatura;
    }

    @Nota(15)
    @Testar(construtor = { "10.0", "30.0" }, parametros = { "5.0" })
    public void mudarIncremento(double incremento) {
        if (incremento > 0) {
            this.incremento = incremento;
        }
    }
}