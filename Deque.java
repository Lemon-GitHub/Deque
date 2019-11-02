package Deque;

public class Deque {
    private int[] data = new int[100];
    private int head = 0;//队首元素下标
    private int tail = 0;//队尾元素下标
    private int size = 0;

    //入队列 插入成功返回true 否则返回false
    public boolean offer(int x) {
        if(size == data.length){
            return false;
        }

        data[tail] = x;
        tail++;
        if(tail == data.length){
            tail = 0;
        }
        size++;
        return true;
    }

    //出队列
    public Integer poll(){
        if(size == 0){
            return null;
        }
        Integer ret = data[head];
        head++;
        if(head == data.length){
            head = 0;
        }
        size--;
        return ret;
    }

    //取队首元素
    public Integer peek(){
        if(size == 0){
            return null;
        }
        return data[head];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public static void main(String[] args) {
        Deque deque = new Deque();
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        deque.offer(4);

        System.out.println(deque.size());

        while(!deque.isEmpty()){
            System.out.print(deque.peek() + " ");
            deque.poll();
        }
    }
}
