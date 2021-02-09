package um;

public class Carro {

    public static final String VERMELHO = "Vermelho";
    public static final String PRETA = "Preta";

    private Integer quantidadePneus;
    private Integer quantidadeCalota;
    private Integer quantidadeParafusosPneu;
    private String cor;
    private Integer anoFabricacao;
    private String combustivel;
    private String numeroChassi;
    private Integer numeroPorta;

    public Carro(Integer quantidadedePneus){
        setQuantidadePneus(quantidadedePneus);
    }

    public Integer getQuantidadePneus(){
        return quantidadePneus + 1;
    }
    public void setQuantidadePneus(Integer quantidadePneus){
        setQuantidadeCalota(quantidadePneus);
        setQuantidadeParafusosPneu(quantidadePneus * 4);
        this.quantidadePneus = quantidadePneus;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCombustivel() {
        return combustivel = "Etanol";
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }


    public Integer getAnoFabricacao() {
        return anoFabricacao = 2012;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Integer getQuantidadeCalota() {
        return quantidadeCalota;
    }

    public void setQuantidadeCalota(Integer quantidadeCalota) {
        this.quantidadeCalota = quantidadeCalota;
    }

    public Integer getQuantidadeParafusosPneu() {
        return quantidadeParafusosPneu;
    }

    public void setQuantidadeParafusosPneu(Integer quantidadeParafusosPneu) {
        this.quantidadeParafusosPneu = quantidadeParafusosPneu;
    }

    public String getNumeroChassi() {
        return numeroChassi = "5874FD598745A62145BVF8742";
    }

    public void setNumeroChassi(String numeroChassi) {
        this.numeroChassi = numeroChassi;
    }

    public Integer getNumeroPorta() {
        return numeroPorta = 4;
    }

    public void setNumeroPorta(Integer numeroPorta) {
        this.numeroPorta = numeroPorta;
    }

    public void imprimeValores(){
        System.out.println("Quantidade de Pneus = " + getQuantidadePneus());
        System.out.println("Qantidade de calotas = " + getQuantidadeCalota());
        System.out.println("Quantidade de Parafusos = " + getQuantidadeParafusosPneu());
        System.out.println("Cor = " + getCor());
        System.out.println("Combustível = " + getCombustivel());
        System.out.println("Número de Portas = " + getNumeroPorta());
        System.out.println("Número do Chassi = " + getNumeroChassi());
        System.out.println("Ano de Fabricação = " + getAnoFabricacao());

    }
}
