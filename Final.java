class Final {
    final int x = 100; // Declare x as final

    public static void main(String[] args) {
        Final obj = new Final();
        obj.x = 500;
         // This line would cause a compile error since x is final

        System.out.println(obj.x);
    }
}
