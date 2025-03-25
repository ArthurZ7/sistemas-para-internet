import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animais = new ArrayList<>();
        HashMap<String, Animal> mapaDeAnimais = new HashMap<>();

        int opcao = 0;
        do {
            opcao = menu();
            if (opcao == 1) {
                adicionarAnimal(animais, mapaDeAnimais);            
            } else if (opcao == 2) {
                listarAnimais(animais);
            } else if (opcao == 3) {
                listarFilhotes(animais);
            } else if (opcao == 4) {
                buscarAnimalPorTutor(animais);
            } else if (opcao == 5) {
                animais.clear();
            } else if (opcao == 6) {
                listarNomesDeTutores(mapaDeAnimais);
            }
        } while (opcao != 7);
        System.out.println("Tchau!...");
    }

    public static int menu () {
        Scanner s = new Scanner(System.in);
        
        int opcao = 0;
        do {
            System.out.println("\n- - - MENU - - -");
            System.out.println("1- Adicionar Animal");
            System.out.println("2- Listar todos os animais");
            System.out.println("3- Listar Animais Filhotes (<2 anos)");
            System.out.println("4- Buscar Animal pelo nome do Tutor ");
            System.out.println("5- Apagar Lista");
            System.out.println("6- Listar nomes de Tutores");
            System.out.println("7- Sair");

            System.out.print("\nDIGITE A OPÇÃO: ");
            return opcao = s.nextInt();
        } while (opcao > 6 || opcao <= 0);
    }

    public static void adicionarAnimal(ArrayList<Animal> animais, HashMap<String, Animal> mapaDeAnimais) {
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
        animais.add(animal);
        // Adiciona no HashMap, setando pelos tutores
        mapaDeAnimais.put(tutor, animal);
    }

    public static void listarAnimais(ArrayList<Animal> animais) {
        System.out.println("\n-- LISTA ANIMAIS --");
        for (Animal a : animais) {
            System.out.println(a.toString());
        }
    }

    public static void listarFilhotes(ArrayList<Animal> animais) {
        System.out.println("\n-- LISTA FILHOTES --");
        for (Animal a : animais) {
            if (a.getIdade() < 2) {
                System.out.println(a.toString());
            }
        }
    }

    public static void buscarAnimalPorTutor(ArrayList<Animal> animais) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o nome do tutor para ver seus animais: ");
        String tutor = s.nextLine();

        for (Animal a : animais) {
            if (a.getNomeTutor().equals(tutor)) {
                System.out.println(a.toString());
            }
        }
    }

    public static void listarNomesDeTutores(HashMap<String, Animal> mapaDeAnimais) {
        HashSet<String> nomesDeTutores = new HashSet<>(mapaDeAnimais.keySet());
        System.out.println("\n-- NOMES DOS TUTORES --");
        for (String nome : nomesDeTutores) {
            System.out.println(nome);
        }
    }
}