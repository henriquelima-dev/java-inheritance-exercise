public class Desenvolvedor extends Funcionario{

    private String linguagemProgramacao;

    public Desenvolvedor(String nome, int idade, double salario, String linguagemProgramacao){
        super(nome, idade, salario);
        this.linguagemProgramacao = linguagemProgramacao;
    }

    @Override
    void exibirInformacoes(){
        System.out.println(" ");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Salario: " + getSalario());
        System.out.println("Linguagem dominante: " + linguagemProgramacao);
    }
}
