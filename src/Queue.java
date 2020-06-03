public class Queue {

    int rear=-1;
    int front=-1;
    int max_val;
    int[] array= new int[max_val];
    int size;

    public Queue(int[] array, int size){
        array= new int[max_val];
        this.size=size;
    }

    public boolean isEmpty(){
        return (size==0);
    }
    public  void push(int v){
        front =(front+1)% array.length;
        array[front] = v;
        rear++;
        size++;

    }

    public int pop(){
        if(size >0){
            int result = array[rear];
            rear = (rear+1) % array.length;
            size--;

        }
        return result;
    }

    @Override
    public  String toString(){
        return "";
    }
}
