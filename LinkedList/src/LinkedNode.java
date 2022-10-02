public class LinkedNode {
    private String data;
    public LinkedNode link;

    LinkedNode(){};
    LinkedNode(String data){
        //have only one item in linkedlist or last item of linkedlist
        this.data = data;
        this.link = null;
    }
    LinkedNode(String data, LinkedNode link){
        this.data = data;
        this.link = link;
    }

    public String getData(){
        return this.data;
    }
}
