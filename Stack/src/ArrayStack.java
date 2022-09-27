public class ArrayStack implements Stack{

    private int top;
    private int stackSize;
    private char stackArr[];

    ArrayStack (int num){
        stackSize = num;
        stackArr = new char[stackSize];
    }
    @Override
    public boolean isEmpty() {
        if(stackArr[0] == 0){
            System.out.println("스택이 비어있습니다!");
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if(stackArr[9] != 0){
            System.out.println("스택이 꽉 찼습니다!");
            return true;
        }
        return false;
    }

    @Override
    public void push(char item) {
        for(int i = 0; i<stackArr.length; i++){
            if(stackArr[i] ==0){
                System.out.println("아이템을 넣었습니다.");
                stackArr[i] = item;
            }
        }

    }

    @Override
    public char pop() {
        for(int i = stackArr.length; i==0; i--){
            if(stackArr[i] !=0){
                System.out.println(stackArr[i] + " 가 제거되었습니다.");
                stackArr[i] = 0;
            }
        }
        return 0;
    }

    @Override
    public char peek() {
        for(int i = stackArr.length; i ==0; i--){
            if(stackArr[i] !=0){
                System.out.println(stackArr[i]);
            }
        }
        return 0;
    }

    @Override
    public void clear() {
        for(int i = 0; i<stackArr.length; i++){
            stackArr[i] = 0;
        }

    }
    String stack;
    @Override
    public void printStack() {
        if(stackArr[0] != 0){
            for(int i = 0; stackArr[i] !=0; i++){
                stack += stackArr[i] + " ";
            }
            System.out.println("지정된 스택의 값 : " + stack);
        }else {
            System.out.println("스택이 비었습니다. 출력할 수 없습니다.");
        }

    }
}
