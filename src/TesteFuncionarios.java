public class TesteFuncionarios {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Elbio", 42, 3000);
        Gerente g1 = new Gerente("Larissa", 42, 7000, "AF1");
        Desenvolvedor dev1 = new Desenvolvedor("Henrique", 19, 8000, "Java");
        Desenvolvedor dev2 = new Desenvolvedor("Davi", 18, 7500, "C#");


         f1.exibirInformacoes();
         g1.exibirInformacoes();
         dev1.exibirInformacoes();
         dev2.exibirInformacoes();

    }
}
