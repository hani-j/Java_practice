package ClassEx23_58;

class Father {
    public void play() {
        System.out.println("father : swimming");
    }
    public void study() {
        System.out.println("father : java programming");
    }
}

class Johnharu extends Father { // 자식1
    public void study() {
        System.out.println("johnharu : C# Programming");
    }
}

class Gracedew extends Father { // 자식2
    public void play() {
        System.out.println("gracedew : BaseBall");
    }
}

class Moon extends Father { // 자식3
    public void play() {
        System.out.println("moon : BasketBall");
    }
    public void study() {
        System.out.println("moon : Visual Basic, Visual C++");
    }
}

public class Family_01 {
    public static void main(String[] args) {
        Father daddy = new Father();
        daddy.play();
        daddy.study();

        daddy = new Johnharu();
        daddy.play();
        daddy.study();

        daddy = new Gracedew();
        daddy.play();
        daddy.study();

        daddy = new Moon();
        daddy.play();
        daddy.study();
    }
}
