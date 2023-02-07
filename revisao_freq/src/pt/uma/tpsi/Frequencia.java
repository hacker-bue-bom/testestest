package pt.uma.tpsi;

import java.util.ArrayList;
import java.util.*;

public class Frequencia {
    public static void main(String[] args) {

        System.out.println("Instanciar  e Ordenar Employees Juniors:");
        List<Junior> juniorList = new ArrayList<Junior>();
        juniorList.add(new Junior("Maria", 2, 1, 21, "Tecnico"));
        juniorList.add(new Junior("João", 3, 1, 19, "Administração"));
        juniorList.add(new Junior("Pele", 1, 1, 22, "Gerente"));

        Collections.sort(juniorList, new EmployeeComparatorByName());
        for (Junior junior : juniorList)
            System.out.println("\t" + junior.toString());

        EmployeeList();

        ArrayExercice exercice = new ArrayExercice();
        exercice.Exercice();
    }
    public static void EmployeeList() {
        System.out.println("\nAdicionar e Ordenar Employees Juniors num Array:");
        ArrayList<Junior> juniorArrayList = new ArrayList<Junior>();
        juniorArrayList.add(new Junior("Maria", 2, 2, 21, "Tecnico"));
        juniorArrayList.add(new Junior("João", 3, 3, 19, "Administração"));
        juniorArrayList.add(new Junior("Pele", 1, 4, 22, "Gerente"));
        Collections.sort(juniorArrayList, new EmployeeComparatorByName());
        for (Junior junior : juniorArrayList)
            System.out.println("\t" + junior.toString());
    }
}