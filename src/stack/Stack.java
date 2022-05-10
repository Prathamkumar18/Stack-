package stack;
public class Stack {
    int top;
    int stk[];
    int size;
    //stack constructor
    Stack(int size){
        top=-1; //it is just a counter
        this.size=size;
        stk=new int[size];
    }
    
    void push(int value){
        if(top==size-1){
            //if the size is full then make a temp array of size twice the prev one. and 
            //copy all of its element in temp
           //refer to that temp array.
            int temp[]=new int[size*2];
            for(int i=0;i<stk.length;i++){
                temp[i]=stk[i];
            }
            stk=temp;
            stk[++top]=value;
        }
        else{
            stk[++top]=value;
        }
    }
    
   void display(){
       if(top==-1){
           System.out.println("stack empty");
       }
       else{
           for(int i=top;i>=0;i--){
               System.out.print(stk[i]+"->");
           }
       }
   }
   
    void pop(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        else{
            top--;
        }
    }
    
    void peek(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        else{
            System.out.println(stk[top]);
        }
    }
    
}
