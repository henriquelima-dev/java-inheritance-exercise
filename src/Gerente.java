public class Gerente extends Funcionario{

    private String setor;

    public Gerente(String nome, int idade, double salario, String setor){
        super(nome, idade, salario);
        this.setor = setor;
    }

    @Override
    void exibirInformacoes(){
        System.out.println(" ");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Salario: " + getSalario());
        System.out.println("Setor: " + setor);

    }
}
