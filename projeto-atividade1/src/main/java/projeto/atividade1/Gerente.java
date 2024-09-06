package projeto.atividade1;

public class Gerente extends Funcionario {
    private static double bonusGerencial = 1.40; // Bônus gerencial fixo para todos gerentes de 40%
    public Gerente(String nome, double salario, boolean assiduo) 
    {
        // Calcula o salário com o bônus gerencial de 40% e o gerente sempre é considerado assíduo.
        super(nome, salario * bonusGerencial, true);
    }

    public static double getBonusGerencial()
    {
        return bonusGerencial;
    }

}
