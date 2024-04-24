/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.PriorityQueue;
public class PriorityQueue2 {
 public static void main(String[] args) {
PriorityQueue<String> queue = new PriorityQueue<>();
// Add 2 strings to PriorityQueue.
queue.add("cat");
queue.add("bird");
// Loop over and display contents of PriorityQueue.
for (String element : queue) {
System.out.println(element);
}
 }
}