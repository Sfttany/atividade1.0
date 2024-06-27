public class Funcionario {
    String nome;
    String id ;
    public void receberNomeFuncionario(){
        System.out.println("Digite o nome do funcionario: ");
        this.nome = Main.scanner.nextLine();
        System.out.println("Funcionario "+ nome +" registrado com sucesso!" );
    }

    public void receberIdFuncionario(){
        System.out.println("Digite o id do funcionario: ");
        this.id = Main.scanner.nextLine();
        System.out.println("Funcionario "+ id +" registrado com sucesso!" );
    }
}
