public class Main {

    public static void main(String[] args){

        //1. Надає значення 4 полям типу int.

        int a = 5;
        int b = 4;
        int c = 3;
        int d = 2;


        //2. Сумує їх попарно.

        int ab = a+b;
        int cd = c+d;

        //3. Виводить результат порівняння сум (true, якщо перша сума більша).

        System.out.println(ab>cd);

        //4. Збільшує першу суму на 1.

        int increaseAB = ++ab;
        System.out.println(increaseAB);
        
        // 5. Другу суму зменшує на 2.

        int decreaseCD = cd -2;
        System.out.println(decreaseCD);

        // 6. Виводить результат порівняння (true якщо перша сума більша).

        System.out.println(increaseAB>decreaseCD);
        
        // 7. Виводить true якщо хоча б одна сума кратна 2, інакше - false.

        System.out.println((increaseAB%2 == 0) || (decreaseCD%2 == 0));   

        
    }
}