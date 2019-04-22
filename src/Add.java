public static void Add (int... numbers) {
        int sum=0;
        for (int numbers : numbers) {
        sum=sum+numbers;}
        System.out.println(sum);
        System.out.println("Suma elementelor este:" + sum);
}
