public class Main {

    public static void main(String[] args){

        //1. Надає значення 4 полям типу int.

        int a = 5;
        int b = 5;
        int c = 3;
        int d = 2;


        //2. Сумує їх попарно.

        //3. Виводить результат порівняння сум (true, якщо перша сума більша).

        String sumAndCompare = a+b > c+d ? "Yes3" : "No3";
        System.out.println(sumAndCompare);   

        // Or

        System.out.println((a+b)>(c+d));

        //4. Збільшує першу суму на 1.

        Integer firstSumPlusOne = (a+b);
        System.out.println(++firstSumPlusOne);
        
        // 5. Другу суму зменшує на 2.

        Integer secondSumPlusOne = (c+d);
        System.out.println(secondSumPlusOne -2);

        // 6. Виводить результат порівняння (true якщо перша сума більша).

        String sumAndComparing = firstSumPlusOne > secondSumPlusOne ? "Yes6" : "No6";
        System.out.println(sumAndComparing);   

        // Or

        System.out.println(firstSumPlusOne>secondSumPlusOne);
        
        // 7. Виводить true якщо хоча б одна сума кратна 2, інакше - false.

        String sumAndComparing2 = (((a+b)/2) == 0) || (((c+d)/2) == 0) ? "Yes7" : "No7";
        System.out.println(sumAndComparing2);   

        
        
    }
}