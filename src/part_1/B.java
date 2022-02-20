package part_1;


// answer to question D :
// B cannot be an interface because we create an instance of B in main()
// what interface is forbidden to do so
public class B implements C {

    private int x;
    public B(){}
    public B(int val){
        this.x = val;
    }

    public void f1(){

    }

    public void f2(){

    }

    public void f3(){

    }
}
