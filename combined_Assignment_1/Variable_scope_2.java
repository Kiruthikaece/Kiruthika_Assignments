class Variable_scope_2 {
    public static void main(String[] args) {
       
        int a=10;
        if(a>20) {
            int b=20;
            System.out.println("a value:"+a);
            System.out.println("b value:"+b);
        }
        System.out.println("a value:"+a);
        System.out.println("b value:"+b);
    }
}

// error
// Variable_scope_2.java:11: error: cannot find symbol
//         System.out.println("b value:"+b);
//                                       ^
//   symbol:   variable b
//   location: class Variable_scope_2
// 1 error
// error: compilation failed