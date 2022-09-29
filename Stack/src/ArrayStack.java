public class ArrayStack implements Stack{

    private int top;
    private int stackSize;
    private char stackArr[];

    ArrayStack (int stackSize){
        top = -1;
        this.stackSize = stackSize;
        stackArr = new char[stackSize];
    }
    @Override
    public boolean isEmpty() {
        if(top == -1){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean isFull() {
        if(top == stackArr.length -1){
            return true;
        }
        return false;
    }

    @Override
    public void push(char item) {
        if(!isFull()){
            ++top;
            stackArr[top] = item;
            System.out.println("추가가 완료되었습니다.");
        }
        else {
            System.out.println("스택이 꽉 찼습니다. 더이상 넣을 수 없습니다.");
        }

    }

    @Override
    public char pop() {
        if(isEmpty()){
            System.out.println("스택이 텅 비었습니다.");
        }
        else {
            System.out.println(stackArr[top] + " 가 제거되었습니다.");
            top--;
            stackArr[top] = 0;
        }
        return stackArr[top];
    }

    @Override
    public char peek() {
        if(isEmpty()){
            System.out.println("스택이 텅 비었습니다. 출력할 수 없습니다.");
        }
        else {
            System.out.println("최상위 값은 " + stackArr[top] + "입니다.");
        }
        return 0;
    }

    @Override
    public void clear() {
        if(isEmpty()){
            System.out.println("스택은 이미 비워져있습니다.");
        }
        else {
            top = -1;
            }


    }
    String stack;
    @Override
    public void printStack() {
        if(isEmpty()){
            System.out.println("출력할 스택이 없습니다.");
        }
        else {
            System.out.print("지정된 스택의 값 : ");
            for(int i = 0; i<=top; i++){
                System.out.print(stackArr[i] + " ");
            }
            System.out.println();
        }

    }
}
