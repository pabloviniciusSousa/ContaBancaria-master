public class ClienteConta {

    String nome;

    int numero;
    String agencia;
    Double saldo;

    public ClienteConta(String nome, int numero, String agencia, Double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public ClienteConta() {

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + " , conta " + numero +
        " e seu saldo " + saldo + " já está disponível para saque";
    }
}
