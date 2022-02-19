class Data1{
    int value;

    Data1(){

    }
}
class Data2{
    int value;
    Data2(){

    }//생성자를 만들면 컴파일러는 기본 생성자를 만들지 않음
    Data2(int x){
        value=x;
    }
}
class Data3{
    int value;
    Data3(int x){ //객체 생성시 제일 먼저 실행
        value=x;
        System.out.println("생성자:"+value);
    }
}

public class ClassEx06_39 {
    public static void main(String[] args) {
        Data1 d1=new Data1();
        //Data2 d2=new Data2();
        Data3 d3=new Data3(100); //생성자 객체 만들어질때 1순위로 호출

        System.out.println(d3.value);

    }
}
