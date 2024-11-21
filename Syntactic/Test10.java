class Test2 {
    public static void a(String[] args) {
        if (true {
            System.out.println("Missing right parenthesis");
        }
    }
}

class Test6 {
    public static void a(String[] args) {
        String message = "Missing closing double quote";
        System.out.println(message)
    }
}

class Test12 {
    public static void a(String[] args) {
        int[] numbers = new int[3; // 错误：缺少方括号
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

class Test5 {
    public static void a(String[] args) {
        if (true) {
            System.out.println("Missing closing brace");
    }
}