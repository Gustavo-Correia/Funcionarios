package Program;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

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
        Worker worker = new Worker(funcName, WorkerLevel.valueOf(LevelName), BaseSalary, new Departament(DepName));
        System.out.println("Quantos Contratos este trabalhador tem: ");
        int ContractQuant = sc.nextInt();
        ContractQuant++;
        for (int x=1; x<ContractQuant; x++){
            System.out.println("Coloque as informações do contrato #" + x);

            System.out.println("Data do Contrato (DD/MM/YYYY) : ");
            Date contractDate = sdf.parse(sc.next());
            System.out.println("Valor por hora do contrato: ");
            ValueHoursContract = sc.nextDouble();
            System.out.println("Duração (horas) : ");
            ContractHours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, ValueHoursContract, ContractHours);
            worker.AddContract(contract);
        }
        System.out.println("coloque o mês e o ano para calcular o total dos contratos: ");
        String MonthandYear = sc.next();

        int month = Integer.parseInt(MonthandYear.substring(0, 2));
        int year = Integer.parseInt(MonthandYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartament().getName());
        System.out.println("Income for " + MonthandYear + ":" + String.format("%.2f", worker.income(year, month)));
        sc.close();
    }
}
