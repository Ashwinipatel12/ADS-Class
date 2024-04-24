/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singlelinkedlist;

import java.util.LinkedList;

public class SingleLinkedList {
public static void main(String[] args) {
LinkedList l1 = new LinkedList();
l1.addFirst(1);
l1.addFirst(2);
l1.addFirst(33);
l1.addFirst(22);
l1.show();
System.out.println();
l1.removeFirst();
l1.show();
System.out.println();
l1.removeLast();
l1.show();
}
}