import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("스택 사이즈를 입력하세요. ");
        int stackSize = sc.nextInt();
        ArrayStack arrayStack = new ArrayStack(stackSize);

        arrayStack.printStack();

        arrayStack.push('A');
        arrayStack.printStack();
    }
}