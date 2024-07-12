/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package fila;

/**
 *
 * @author fabri
 */
public class FilaEstatica<T> {
    private T[] fila;
    private int inicio;
    private int fim;
    private int tamanho;

    public FilaEstatica(int capacidade) {
        fila = (T[]) new Object[10];
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public boolean isFull() {
        return tamanho == fila.length;
    }

    public void enqueue(T elemento) throws Exception {
        if (isFull()) {
            throw new Exception("Não é possível adicionar mais caminhoneiros, limite alcancado \n");
        }
        fila[fim] = elemento;
        fim = (fim + 1) % fila.length;
        tamanho++;
    }

    public T dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Nao ha caminhoneiros para serem liberados");
        }
        T elemento = fila[inicio];
        fila[inicio] = null;
        inicio = (inicio + 1) % fila.length;
        tamanho--;
        return elemento;
    }

    public void printFila() {
        System.out.println("------------------ Dados da Fila ---------------------");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(fila[(inicio + i) % fila.length]);
        }
    }
}