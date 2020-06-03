public class stack {

    int max_elem = 1000;
    int[] array;
    int pos=0;

    public stack(int [] array){
        array= new int[max_elem];
    }
    boolean isEmpty(){
        if(pos == 0){
            return true;
        }
        return false;
    }



    void push(int v){

        array[pos] = v;
        pos++;


    }

    int pop(){
     pos--;
     return array[pos];


    }
    int size(){
        return pos;
    }

    @Override
    public String toString(){
        return "pop "+ pop();
    }

}
