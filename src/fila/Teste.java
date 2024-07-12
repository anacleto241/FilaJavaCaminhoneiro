/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fila;
/**
 *
 * @author fabri
 */
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FilaEstatica<Caminhoneiro> fila = new FilaEstatica<>(3);

        while (true) {
            System.out.println("1. Adicionar caminhoneiro");
            System.out.println("2. Atender caminhoneiro");
            System.out.println("3. Imprimir fila");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opcao: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                      if (fila.isFull()) {
                          System.out.println("Não é possível adicionar mais caminhoneiros, limite alcancado \n");
        }else{
                    System.out.println("------------------ MENU -----------------------");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Placa: ");
                    String placa = scanner.nextLine();
                    System.out.print("Horário de chegada: ");
                    String horarioChegada = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Empresa: ");
                    String empresa = scanner.nextLine();
         
                    Caminhoneiro caminhoneiro = new Caminhoneiro(nome, placa, horarioChegada, telefone, empresa);
                    try {
                        fila.enqueue(caminhoneiro);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                     }
                    break;
                     
                case 2:
                    try {
                        Caminhoneiro atendido = fila.dequeue();
                        System.out.println("Caminhoneiro liberado " + atendido);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    fila.printFila();
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
