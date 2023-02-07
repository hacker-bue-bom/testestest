package pt.uma.tpsi;

import java.util.Objects;

public class Junior extends Employee {
    private int experiencia;
    private int idade;

    public Junior(String nome, int numero, int experiencia, int idade, String funcao) {
        this.nome = nome;
        this.numero = numero;
        this.experiencia = experiencia;
        this.idade = idade;
        if (funcao == "Tecnico" || funcao == "Administração" || funcao == "Gerente") {
            this.funcao = funcao;
        } else
            this.funcao = "Erro";
    }
    @Override
    public String toString() {
            return "Junior{" +
                    "nome=" + nome +
                    ", numero=" + numero +
                    ", experiencia=" + experiencia +
                    ", idade=" + idade +
                    ", função=" + funcao +
                    '}';
    }

    //nao na frequencia, comparar se os juniors sao iguais
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Junior junior = (Junior) obj;
        return getNome() == junior.nome && getNumero() == junior.numero;
    }

    //nao na frequencia, fazer um hash code com os dados do Junior
    @Override
    public int hashCode() { return Objects.hash(getNome(), getNumero(), getExperiencia(), getIdade()); }


    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
