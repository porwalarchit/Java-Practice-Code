class test {
    static class test2{
        static void print(){
            System.out.println("Static Nested Class");
        }

        public static void main(String[] args) {
//            test2 t = new test2();
            test2.print();
        }
    }
}
