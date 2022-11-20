/*
 * programm
 
public class programm {

    public static void main(String[] args) {
        System.out.println("bye world");
        int a = 5;
    String s = "   dfggh"; // Инициализация и идентификация переменных
    System.out.println(a);
    System.out.println(s);
    float r = 2.7f;     // вещественная переменная c обязательным указанием f
    double pi = 3.1415; // вещественная переменная с не обязательным указанием D  3.1415D будет эквивалентно
    System.out.println(r);
    System.out.println(pi);
    char p = '}';  // символьный тип данных
    System.out.println(p);
    boolean f = true & false;  // различают побитовые операции &  | или логические &&   ||
    System.out.println(f);
    String  msg = "Hello world";
    System.out.println(msg);
    var i = 123;   // переменной будет присвоен тип, который больше всего подходит значению
    System.out.println(getType(i));
    int m = 123;
    m++;
    System.out.println(m); // если бф набрали в скобках m++, то на консоль бы вышло 123, потому что приоритет у консоли выше
    int z = 5;
    System.out.println(z++); //постфиксный инкремент
    System.out.println(z);  // подтверждает приоритет консоли над инкрементом
    System.out.println(++z); //префиксный инкремент 
    boolean x = 123>234;
    System.out.println(x);
    // побитовые операции------------------------
    int c = 5;
    int d = 7;
    System.out.println(c | d); // числа представляются в двоичной записи и каждый разряд побитово применяет логическое или, далле перевод в десятичное представление
    System.out.println(c & d); // тоже самое, только применяется побитовое 'И'
    System.out.println(c ^ d); // тоже самое, только применяется разделительное "И" (истина тогда, когда строго одно истина)
    // операции с двумя амперсандами-------------быстрые операции
    boolean j = true;
    boolean k = true;
    System.out.println(j & k);
    System.out.println(j && k);
    // более сложный случай --------------
    // коньюнкция && истина будет тогда, когда истина оба выражения и если хотя бы одно ложь, то результат ложь
    // дизъюнкция || истина будет тогда, когда истина хотя бы одно выражение
    String message = "34fj700";
    boolean h = message.length() >= 10 && message.charAt(3) == 'j';
    h = message.length() >= 10 || message.charAt(3) == 'j';
    System.out.println(h);
    // Массивы
    int[] arr = new int[10]; // классическое объявление массива
    System.out.println(arr.length); // длина массива
    int[] brr = new int[] {1, 2, 3, 4}; // второй вариант задания массива
    System.out.println(brr.length);
    System.out.println(brr[2]); // обращение, в данном случае вывод в консоль элемента массива по второму индексу
    arr[2] = 5;//присванивание значения в массиве по какому-то индексу
    
    int[] vrr[] = new int[3][5]; // объявление двумерного массива с 3 строками и 5 столбцами
    int[][] mrr; //объявление массива массивов(несколько отличается от двумерного)

    
}

    static String getType(Object o){        // определение данного метода позволяет узнавать тип переменных
        return o.getClass().getSimpleName();
    }
}
*/
//получение данных из терминала
/*import java.util.Scanner; //сначала импортируем java.util.Scanner
public class programm {
   public static void main(String[] args) {
       Scanner iScanner = new Scanner(System.in); //создаём экземпляр класса Scanner и в качестве аргумента указываем System.in, откуда будем забирать данные
       System.out.printf("name: "); //можем выводить на экран (только вместо println используем printf )
       String name = iScanner.nextLine(); // определяем тип вводимых данных и название переменной, в кот с помощью метода nextLine, применяемого к нашему экземпляру класса Scanner ожидаем ввод строки
       System.out.printf("Привет, %s!", name);
       iScanner.close(); // закрываем наш объект
   }
}*/
/*import java.util.Scanner;
public class programm {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: "); // печатаем себе подсказку в консоль, что ожидаем ввода целых чисел
        int x = iScanner.nextInt(); // определяем переменную типа int, в которую методом nextInt будем вводить данные
        System.out.printf("double a: "); // печатаем себе подсказку в консоль, что ожидаем ввода  чисел типа double
        double y = iScanner.nextDouble(); // определяем переменную типа double, в которую методом nextDouble будем вводить данные
        System.out.printf("%d + %f = %f", x, y, x + y);
        iScanner.close();
}}
*/
/* 
// проверка вводимых данных на соответствие вводимого типа
import java.util.Scanner;
public class programm {
   public static void main(String[] args) {
       Scanner iScanner = new Scanner(System.in);
       System.out.printf("int a: ");
       boolean flag = iScanner.hasNextInt(); //позволяет проверить истинно или ложно, что введенные данные типа int
       System.out.println(flag); // выводит в консоль или true или false     
       int i = iScanner.nextInt(); // кладёт в переменную i  данные которые мы вводили для проверки соответствия типу
       System.out.println(i);       
       iScanner.close();
   } }
*/
/* 
// форматированный вывод, пример конкактенации строк - её надо избегать, забирает много памяти 
public class programm {
    public static void main(String[] args) {
    int a = 5;
    String b = "qwer";
    String c = a + b;
    System.out.println(c);

    }
}
*/
/* 
public class programm {
    public static void main(String[] args) {
        int a = 1, b = 2;
        int c = a + b;
        String res = a + " + " + b + " = " + c; // здесь наблюдаем неявное преобразование типов int в String
        System.out.println(res);
    }
}
*/

public class programm {
    public static void main(String[] args) {
        int a = 1, b = 2;
        int c = a + b;
        String res = String.format("%d + %d = %d \n", a, b, c); //если форматированную строку придется дальше сипользовать то применяют метод String.format
        System.out.printf("%d + %d = %d \n", a, b, c); //если форматированную строку только выводят в консоль, то применяют обычный синтаксис
        System.out.println(res);
    }
}


