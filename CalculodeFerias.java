package calculodeferias;
import java.util.Scanner;
/*@author Dyonatan Diogo Dias Souza*/
public class CalculodeFerias {
    public static void main(String[] args) {
        Scanner sal = new Scanner(System.in);
        System.out.println("Digite o valor do seu salário: ");
        double salario = sal.nextDouble();
        double horasdia = salario/30;
        System.out.println("Quantos dias de férias irá tirar?");
        double dferias = sal.nextDouble();
        double valorf = horasdia*dferias;
        double t = valorf/3;
        double ferias = valorf+t;
        System.out.println("Vendeu férias? (S-sim ou N-não)");
        char resp;
        resp = sal.next().charAt(0);
        double feriasv = 0;
        if(resp=='S'||resp=='s'){
            System.out.println("Quantos dias vendeu?");
            double diasv = sal.nextInt();
            feriasv = horasdia*diasv;
            System.out.println("Valor de férias a receber: "+ ferias);
            System.out.println("Valor de férias vendidas: "+ feriasv);
            System.out.println("Valor de total de férias: "+ (ferias+feriasv));
            System.out.println("Valor do seu salário: "+ salario);
            System.out.println("Valor total a receber: "+ (salario+ferias+feriasv));
        }else{
            System.out.println("Valor de férias a receber: "+ ferias);
            System.out.println("Valor de férias vendidas: "+ feriasv);
            System.out.println("Valor de total de férias: "+ (ferias+feriasv));
            System.out.println("Valor do seu salário: "+ salario);
            System.out.println("Valor total a receber: "+ (salario+ferias+feriasv));
        }
    }
}
