package demo.demo_queue;

public class CaiDatQueue_Mang <T>{
    private T[] list;
    int front,rear  = 0;
    int total = 0;
    public CaiDatQueue_Mang(int size){
        list = (T[]) new Object[size];
        front = 0;
        rear = 0;
    }
    public void offer(T item){
        if(rear == list.length-1){
            System.out.println("Queue is full");
            return;
        }
        list[++rear] = item;
    }
    public T peek(){
        if(rear == -1){
            System.out.println("Queue is full");
            return null;
        }
        return list[front];
    }
    public T poll(){
        if(rear == -1){
            System.out.println("Queue is full");
            return null;
        }
        return list[front++];
    }
    public int size(){
        if(rear == -1){
            return 0;
        }
        return rear - front + 1;
    }
}
