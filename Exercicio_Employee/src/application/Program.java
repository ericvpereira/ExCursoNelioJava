import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> lista = new ArrayList<>();

        System.out.print("Quantos funcionários serão registrados? ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("\nFuncionário #" + i + ":");

            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(lista, id)) {
                System.out.print("Id já existe! Digite outro: ");
                id = sc.nextInt();
            }

            sc.nextLine(); // limpar buffer
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Salário: ");
            double salario = sc.nextDouble();

            lista.add(new Employee(id, nome, salario));
        }

        System.out.print("\nInforme o id do funcionário que terá aumento: ");
        int idAumento = sc.nextInt();

        Employee func = lista.stream()
                .filter(x -> x.getId() == idAumento)
                .findFirst()
                .orElse(null);

        if (func == null) {
            System.out.println("Este id não existe!");
        } else {
            System.out.print("Informe a porcentagem: ");
            double porcentagem = sc.nextDouble();
            func.increaseSalarey(porcentagem);
        }

        System.out.println("\nLista de funcionários atualizada:");
        for (Employee f : lista) {
            System.out.println(f);
        }

        sc.close();
    }

    // método auxiliar para verificar id repetido
    public static boolean hasId(List<Employee> list, int id) {
        return list.stream().anyMatch(x -> x.getId() == id);
    }
}
