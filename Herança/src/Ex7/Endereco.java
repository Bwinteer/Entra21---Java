package Ex7;

public class Endereco {

    private String pais;
    private String estado;
    private String cidade;
    private String logradouro;
    private String numero;
    public Endereco(String pais, String estado, String cidade, String logradouro, String numero) {
        setPais(pais);
        setEstadoa(estado);
        setCidade(cidade);
        setLogradouro(logradouro);
        setNumero(numero);
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstadoa(String estadoa) {
        this.estado = estadoa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}