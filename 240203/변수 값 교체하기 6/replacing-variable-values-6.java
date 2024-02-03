public class Main {
    public static void main(String[] args) {
        int a = 2, b = 5;
        int temp = a; // a는 temp에 옮겨서 보존되었으니
        a = b; // a를 덮어쓰고
        b = temp; // 보존된걸 나머지 b에 넣어준다.
        System.out.println(a);
        System.out.println(b);
    }
}