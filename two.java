import java.util.Stack;   // question no.2
public class two {
    public static void main(String[] args) {
        Stack<String> names = new Stack<String>();
        names.push("Abraham");
        names.push("issac");
        names.push("jacob");
        System.out.println(names);
        names.pop();
        System.out.println(names);
        System.out.println(names.peek());
        System.out.println(names.isEmpty());
        System.out.println(names.size());
    }
}