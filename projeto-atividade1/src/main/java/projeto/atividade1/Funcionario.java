package projeto.atividade1;

public class Funcionario {
    private String nome;
    public static int contadorMatricula = 1; // Inicia a matrícula em 1.
    private int matricula;
    private double salario;
    private boolean assiduo; // Adiciona um adicional de 7% ao salário caso o colaborador seja assíduo.

    public Funcionario(String nome, double salario, boolean assiduo)
    {
        this.nome = nome;
        this.matricula = contadorMatricula++; // A matrícula é autoincrementada em 1 a cada funcionário criado.
        this.assiduo = assiduo;
        if(assiduo) 
        {
            this.salario = salario * 1.07; // Realiza o aumento de 7% 
        }
        else
        {
            this.salario = salario;
        }
    }

    // Getters 
    public String getNome()
    {
        return nome;
    }

    public int getMatricula()
    {
        return matricula;
    }

    public double getSalario()
    {
        return salario;
    }

    public boolean isAssiduo()
    {
        return assiduo;
    }

    // Setters
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setSalario(double salario)
    {
        if(assiduo) 
        {
            this.salario = salario * 1.07; // Realiza o aumento de 7% 
        }
        else
        {
            this.salario = salario;
        }
    }

    public void setAssiduo(boolean assiduo)
    {
        this.assiduo = assiduo;
        // Se passar a ser assíduo, aplica o aumento, e se deixar de ser assíduo, remove o aumento. 
        if (assiduo) {
            this.salario = this.salario * 1.07; // Aplica o aumento
        } else {
            this.salario = this.salario / 1.07; // Remove o aumento
        }
    }
}


