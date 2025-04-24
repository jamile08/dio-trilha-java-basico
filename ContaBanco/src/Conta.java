import java.math.BigDecimal;

public class Conta {

    private Integer numero;
    private String agencia;
    private String nomeClinte;
    private BigDecimal saldo;

    public Conta() {
    }

    public Integer getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeClinte() {
        return nomeClinte;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNomeClinte(String nomeClinte) {
        this.nomeClinte = nomeClinte;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
