public class Funcionario {

    private String nome;
    private int idade;
    private double salario;

    public Funcionario(String nome, int idade, double salario){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    void exibirInformacoes(){
        System.out.println(" ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.printf("Salario: " + salario);
        System.out.println(" ");
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public double getSalario(){
        return salario;
    }
}
