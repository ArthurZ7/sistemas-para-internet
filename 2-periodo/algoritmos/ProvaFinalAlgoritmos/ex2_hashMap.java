import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, Animal> animais = new HashMap<>();

        String opcao;
        do {

            System.out.println("\n- - - MENU - - -");
            System.out.println("a) Adicionar um animal.");
            System.out.println("b) Remover um animal pelo registro.");
            System.out.println("c) Imprimir os dados dos animais");

            System.out.print("\nDIGITE A OPÇÃO: ");
            opcao = s.next();

            if (opcao.equals("a")) {
                adicionarAnimal(animais);
            } else if (opcao.equals("b")) {
                removerAnimalPorRegistro(animais);
            } else if (opcao.equals("c")) {
                listarAnimais(animais);
            }

        } while (opcao.equals("a") || opcao.equals("b") || opcao.equals("c"));
    }

    public static void adicionarAnimal(HashMap<String, Animal> animais) {
        Scanner s = new Scanner(System.in);

        System.out.print("Insira o nome do animal: ");
        String nome = s.nextLine();
        System.out.print("Insira a idade do animal: ");
        int idade = s.nextInt();
        System.out.print("Insira o nome do tutor: ");
        s.nextLine();
        String tutor = s.nextLine();
        System.out.print("Insira o registro: ");
        String registro = s.nextLine();
        
        Animal animal = new Animal(nome, idade, tutor, registro);
        animais.put(registro, animal);
    }

    public static void removerAnimalPorRegistro(HashMap<String, Animal> animais) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o registro do animal que será excluído: ");
        String registro = s.nextLine();

        for (Animal a : animais.values()) {
            if (a.getRegistro().equals(registro)) {
                animais.remove(registro, a);
            }
        }
    }

    public static void listarAnimais(HashMap<String, Animal> animais) {
        System.out.println("\n-- LISTA ANIMAIS --");
        for (Animal a : animais.values()) {
            System.out.println(a.toString());
        }
    }
}
