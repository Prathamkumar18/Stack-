
package stack;
public class main {
    public static void main(String[] args) {
        Stack st=new Stack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.display();
       
    }
}
