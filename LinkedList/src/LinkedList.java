public class LinkedList implements LinkedListMethod{

    private LinkedNode head = null;
    public LinkedList (){};

    @Override
    public void insertNode(String data, LinkedNode preNode) {
        //insert data in between
        LinkedNode newNode = new LinkedNode(data, preNode);
        newNode.link = preNode.link;
        preNode.link = newNode;
    }

    @Override
    public void insertNode(String data) {
        //insert data at the end
        LinkedNode newNode = new LinkedNode(data);
        if(this.head == null){
            this.head = newNode;
        } else {
            LinkedNode temp;
            for(temp = this.head; temp.link !=null; temp=temp.link){

            }
            temp.link = newNode;
        }
    }

    @Override
    public void deleteNode(String data) {
        //delete data in between
        LinkedNode preNode = this.head;
        LinkedNode tempNode = this.head.link;
        if(data.equals(preNode.getData())){
            this.head = tempNode;
            this.head.link = null;
        }else {
            while (tempNode != null){
                if(data.equals(tempNode.getData())){
                    if(tempNode.link == null){
                        preNode.link = null;
                    } else {
                        preNode.link = tempNode.link;
                        tempNode.link = null;
                    }
                    break;
                }
                preNode = tempNode;
                tempNode = tempNode.link;
            }
        }

    }

    @Override
    public void deleteNode() {
        //delete at the end of data
        if(this.head != null){
            if(this.head.link == null){
                this.head = null;
            }else {
                //LinkedNode preNode = this.head;
                LinkedNode tempNode = this.head.link;
                while (tempNode !=null){
                    tempNode = tempNode.link;
                }
                tempNode = null;
            }
        }
    }

    @Override
    public LinkedNode searchNode(String data) {
        LinkedNode tempNode = head;
        while (tempNode.link != null){
            if(data.equals(tempNode.getData())){
                return tempNode;
            }
        }
        return tempNode;
    }

    @Override
    public void reverseList() {
        LinkedNode nextNod = this.head;
        LinkedNode currentNod = null;

        while (nextNod != null){
            currentNod = nextNod;
            nextNod = nextNod.link;
            nextNod = currentNod;

            nextNod = nextNod.link;
        }
    }

    @Override
    public void printList() {

        LinkedNode tempNode = this.head;
        System.out.println("=================================");

        while (tempNode != null){
            System.out.print(tempNode.getData() + " ");
            tempNode = tempNode.link;
        }

        System.out.println();
        System.out.println("===================================");

    }
}
