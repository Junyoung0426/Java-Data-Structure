public class App {
    public static void main(String[] args) {
        System.out.print("Enter an expression: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String expr = sc.nextLine();
        sc.close();

        System.out.println("result : " + Expression.evalExpr(expr));
        String post = Expression.infixToPostfix(expr);
        System.out.println("postfix: " + post);
        System.out.println("result : " + Expression.evalPostfixExpr(post));
     
    }
}
