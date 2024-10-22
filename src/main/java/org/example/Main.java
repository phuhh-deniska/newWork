package org.example;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("Проверка Stack:");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        try {
            stack.pop();
        } catch (RuntimeException e) {
            System.out.println("Исключение: " + e.getMessage());
        }

        Queue queue = new Queue();
        System.out.println("\nПроверка Queue:");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());

        try {
            queue.dequeue();
        } catch (RuntimeException e) {
            System.out.println("Исключение: " + e.getMessage());
        }
    }

}