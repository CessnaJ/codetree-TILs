public class Main {
    public static void main(String[] args) {
        // 변수에 저장 된 값을 복사하는것.
        // primitive는 값 자체가 복사됨.
        // ref type은 객체 메모리 주소(이 또한 값 자체임)가 복사되기에 같은 객체를 참조하게 됨.
        int a = 5, b = 3;
        a = b;
        System.out.println(a);
        System.out.println(b);
    }
}