/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author STAR
 */
public class queue2 {
    public static void main(String[] args) {
        queue1 queue = new queue1(3);
        queue.Enqueue(1);
        queue.Enqueue(2);
        queue.Enqueue(3);
        queue.tampilkan();
        queue.Dequeue();
        queue.tampilkan();
        queue.Dequeue();
        queue.tampilkan();
        queue.Dequeue();
        queue.tampilkan();
    }
}