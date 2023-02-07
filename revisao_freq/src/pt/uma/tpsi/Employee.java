package pt.uma.tpsi;

public abstract class Employee implements Comparable<Employee>{
    protected String nome;
    protected int numero;
    protected String funcao;

    public void trabalhar(){
        System.out.println("O funcionario esta a trabalhar.");
    }

    abstract class Movimentar {
        public abstract void movimentar();
    }

    @Override
    public int compareTo(Employee o) {
        if (this.numero == o.getNumero()) {
            return nome.compareTo(o.getNome());
        }
        return numero - o.getNumero();
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
}
