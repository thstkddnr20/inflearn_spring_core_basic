package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService(); // static 영역에 instance를 미리 하나 생성하여 올려둠

    public static SingletonService getInstance() { //getInstance를 이용해서만 instance 접근가능
        return instance;
    }

    private SingletonService(){ // private 생성자로 new 키워드로 객체 인스턴스가 생성되는 것을 막음

    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }

    public static void main(String[] args) {
    }
}
