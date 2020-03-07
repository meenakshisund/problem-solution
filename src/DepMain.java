class MyClass3 {
    void doSomething(){ System.out.println("MyClass3"); }
}

class MyClass4 {
    void doSomething(){System.out.println("MyClass4");}
}

class MyClass2 {
    private MyClass3 myClass3;
    private MyClass4 myClass4;
    MyClass2(MyClass3 myClass3, MyClass4 myClass4){
        this.myClass3 = myClass3;
        this.myClass4 = myClass4;
    }
    void doSomething(){
        myClass3.doSomething();
        myClass4.doSomething();
    }
}

class MyClass1 {
    private MyClass2 myClass2;
    MyClass1(MyClass2 myClass2){
        this.myClass2 = myClass2;
    }
    void doSomething(){
        myClass2.doSomething();
    }
}


public class DepMain {
    public static void main(String[] args) {
        MyClass4 myClass4 = new MyClass4();
        MyClass3 myClass3 = new MyClass3();
        MyClass2 myClass2 = new MyClass2(myClass3, myClass4);
        MyClass1 myClass1 = new MyClass1(myClass2);
        myClass1.doSomething();
    }
}