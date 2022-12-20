package Program;
import Enumeracoes.nome;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String DateContract;
        int ContractHours=0;
        Double ValueHoursContract;
        System.out.println("coloque o nome do seu departamento: ");
        String DepName = sc.nextLine();

        System.out.println("Coloque as suas informações de trabalho: ");

        System.out.println("Nome: ");
        String funcName = sc.nextLine();

        System.out.println("Level: ");
        String LevelName = sc.nextLine();

        System.out.println("Salário base: ");
        Double BaseSalary = sc.nextDouble();

        System.out.println("Quantos Contratos este trabalhador tem: ");
        int ContractQuant = sc.nextInt();
        ContractQuant++;
        for (int x=1; x<ContractQuant; x++){
            System.out.println("Coloque as informações do contrato #" + x);

            System.out.println("Data do Contrato (DD/MM/YYYY) : ");
            DateContract = sc.nextLine();
            System.out.println("Valor por hora do contrato: ");
            ValueHoursContract = sc.nextDouble();
            System.out.println("Duração (horas) : ");
            ContractHours = sc.nextInt();
            
        }
        sc.close();
    }
}
