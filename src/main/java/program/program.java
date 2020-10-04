package program;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * Даны два целых числа A и B (при этом A≤B). Выведите все числа от A до B включительно, разделяя их пробелом.
         * После последнего числа тоже можно вывести пробел.
         */

        /*System.out.print("Введите A: ");
        int A = scanner.nextInt();
        System.out.print("Введите B: ");
        int B = scanner.nextInt();

        if (A > B) {
            System.out.println("Число А должно быть меньше числа Б или равно ему");
            return;
        }
        for (int i = A; i <= B; i++) {
            System.out.print(i + " ");
        }*/


        /**
         * Даны два целых числа A и В. Выведите все числа от A до B включительно, в порядке возрастания, если A < B,
         * или в порядке убывания в противном случае.
         */
        /*System.out.print("Введите A: ");
        int A = scanner.nextInt();
        System.out.print("Введите B: ");
        int B = scanner.nextInt();

        if (A < B) {
            for (int i = A; i <= B; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = A; i >= B; i--) {
                System.out.print(i + " ");
            }

        }*/

        /**
         * C: Сумма кубов
         * По данному натуральном n вычислите сумму 1^3+2^3+3^3+...+n^3.
         */

        /*System.out.print("Введите n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("n должно быть натуральным");
            return;
        }
        int m = 0;
        for (int i = 1; i <= n; i++) {
            m += i * i * i;
        }
        System.out.println(m);*/


        /**
         * D: Сумма произведений соседних чисел
         * По данному натуральному n вычислите сумму 1×2+2×3+...+(n-1)×n.
         */
        /*System.out.print("Введите n: ");
        int n = scanner.nextInt();
        int m = 0;
        if (n <= 0) {
            System.out.println("n должно быть натуральным");
            return;
        }
        for (int i = 2; i <= n; i++) {
            m += (i - 1) * i;
        }
        System.out.println(m);*/

        /**
         * E: Степень двойки
         * По данному целому неотрицательному n вычислите значение 2n.
         */

        /*System.out.print("Введите n: ");
        int n = scanner.nextInt();
        int m = 1;
        if (n < 0) {
            System.out.println("n должно быть целым неотрицательным");
            return;
        }
        for (int i = n; i > 0; i--) {
            m *= 2;
        }
        System.out.println(m);*/

        /**
         * G: Четные числа
         * По данным двум натуральным числам A и B (A≤B) выведите все чётные числа на отрезке от A до B. В этой задаче
         * нельзя использовать инструкцию if.
         */
        /*System.out.print("Введите A: ");
        int a = scanner.nextInt();
        System.out.print("Введите B: ");
        int b = scanner.nextInt();
        for (int i = a % 2 + a; i <= b; i += 2) {
            System.out.println(i + " ");
        }*/


        /**
         * Дано 9-значное число. Выведите все цифры этого числа в обратном порядке по одной, разделяя пробелами.
         */
        /*System.out.print("Введите A: ");
        long a = scanner.nextLong();
        System.out.println(a);
        for (int i = 0; i < 9; i++, a /= 10) {
            System.out.print(a % 10 + " ");
        }*/


        /**
         * R: Замечательные числа - 3
         * Дано натуральное число n. Выведите в порядке возрастания все трехзначные числа, сумма цифр которых равна n.
         */

        /*System.out.print("Введите n: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("n должно быть целым неотрицательным");
        }
        for (int i = 100; i <= 999; i++) {
            int a1 = i / 100;
            int a2 = i % 100 / 10;
            int a3 = i % 10;
            if (a1 + a2 + a3 == n)
                System.out.print(i + " ");
        }*/

        /**
         * Y: Треугольная последовательность
         * Дана монотонная последовательность, в которой каждое натуральное число k встречается ровно k раз: 1, 2, 2, 3,
         * 3, 3, 4, 4, 4, 4, ...
         * По данному натуральному n выведите первые n членов этой последовательности. Решите задачу при помощи одного цикла for.
         */
       /* System.out.print("Введите n: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("n должно быть целым неотрицательным");
        }
        for (int i = ; i <=; i) {
            System.out.println();
        }*/

        /*for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }*/

        /*int i = 0;
        for (; ;) {
            if(i == 5)
                break;
            i++;
        }
        System.out.println(i);*/

        /*l1:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                if(i == 5)
                    break l1;
            }
        }*/

        /*for (int i = 0; i < 5; i++) {
            if(i == 2)
                continue;
            System.out.println(i);
        }

        l1:
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(i == 2)
                    continue l1;
                System.out.println(i + " " + j);
            }
        }*/


        /**
         * J: Сумма произведений соседних чисел - 2
         *
         * По данному натуральному n≥2 вычислите сумму 1×2+2×3+...+(n-1)×n. Ответ выведите в виде вычисленного выражение
         * и его значения в точности, как показано в примере.
         * ПРОВЕРКА:  4  1*2+2*3+3*4=20
         */

        /*int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("число должо быть больше или равно 2");
            return;
        }
        String a = "";
        int m = 0;
        for (int i = 2; i <= n; i++) {
            m += i * (i - 1);
            a += (i - 1) + "*" + i;
            if (i != n)
                a += "+";
        }
        System.out.println(a + "=" + m);

        String a = "1*2";
        int m = 2;
        for (int i = 3; i <= n; i++) {
            m += i * (i - 1);
            a += "+" + (i - 1) + "*" + i;
        }

        System.out.println(a + "=" + m);*/

        /**
         *F: Факториал
         * По данному целому неотрицательному n вычислите значение n!
         */

        /*int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("число должо быть больше 0");
            return;
        }

        int m = 1;
        for (int i = 1; i<=n; i++) {
        m*=i;
        }
        System.out.println(m);*/

        /**
         * H: Ряд - 3
         * Дано натуральное число n. Напечатайте все n-значные нечетные натуральные числа в порядке убывания.
         */

        /*System.out.print("Введите n: ");
        int n = scanner.nextInt();
        if (n <= 0)
            System.out.println("n должно быть целым неотрицательным");

        int ch = 1;
        for (int i1 = 1; i1 <= n; i1++) {
            ch *= 10;

        }
        for (int i2 = ch-1; i2 >= ch/10 ; i2--) {

            if (i2 % 2 != 0)
                System.out.print(i2 + " ");
        }*/

        /**
         *Дано 9-значное число. Выведите все цифры этого числа в обратном порядке по одной, разделяя пробелами.
         */

        /*System.out.print("Введите n: ");
        int n = scanner.nextInt();
        if (n < 100000000 || n > 999999999)
            System.out.println("n должно быть девятизначным");
        String a = "";
        int m = 0;
        for (int i = 9; i > 0; i--) {
            m = n % 10;
            a += " " + m;
            n /= 10;

        }
        System.out.println(a);*/

        /**
         * L: Делители
         * По данному натуральному числу n≤1000 выведите все натуральные делители числа n в порядке возрастания.
         */

        /*System.out.print("Введите n: ");
        int n = scanner.nextInt();
        if (n <= 0 || n > 1000)
            System.out.println("n должно быть натуральным и меньше 1000");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }*/

        /**
         * M: Сумма десяти чисел
         * Дано 10 целых чисел. Вычислите их сумму. В решении можно использовать только три переменные.
         */
        /*int a = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Введите число № "+i );
            int n = scanner.nextInt();
            a += n;
        }
        System.out.println(a);*/


        /**
         * N: Сумма N чисел
         * Дано несколько чисел. Вычислите их сумму. Сначала вводите количество чисел N, затем вводится ровно N целых
         * чисел. Какое наименьшее число переменных нужно для решения этой задачи?
         */
        /*System.out.println("Введите количество чисел ");
        int a = scanner.nextInt();
        int a2 =0;
        for (int i = 1; i <= a; i++) {
            System.out.println("Введите число № "+i );
            int n = scanner.nextInt();
             a2+= n;
        }
        System.out.println(a2);*/


        /**
         * Дано N чисел: сначала вводится число N, затем вводится ровно N целых чисел. Подсчитайте количество нулей
         * среди введенных чисел и выведите это количество.
         */
        /*System.out.println("Введите количество чисел ");
        int a = scanner.nextInt();
        int a2 = 0;
        for (int i = 1; i < a + 1; i++) {
            System.out.println("Введите число № " + i);
            int n = scanner.nextInt();
            if (n == 0)
                a2++;
        }
        System.out.println("Число нулей = " + a2);*/

        /**
         * Y: Треугольная последовательность
         * Дана монотонная последовательность, в которой каждое натуральное число k встречается ровно k раз: 1, 2, 2, 3,
         * 3, 3, 4, 4, 4, 4, ...
         * По данному натуральному n выведите первые n членов этой последовательности. Решите задачу при помощи одного цикла for.
         */

        /*int n = scanner.nextInt();
        int i = 1;
        int b = 1;
        for (int ch = 0; ch < n; ch++) {
            if (i >= b) {
                System.out.print(i + " ");
                b++;
            } else {
                b = 1;
                i++;
                ch--;
            }

        }*/
        /**
         * Z: Остатки
         * Даны целые неотрицательные числа a, b, c, d, при этом 0≤c<d. Выведите в порядке возрастания все числа от a
         * до b, которые дают остаток c при делении на d.
         */
        /*System.out.println("Введите a ");
        int a = scanner.nextInt();
        System.out.println("Введите b ");
        int b = scanner.nextInt();
        System.out.println("Введите c ");
        int c = scanner.nextInt();
        System.out.println("Введите d ");
        int d = scanner.nextInt();
        if (a < 0 || b < 0 || c < 0 || d < 0 || c >= d) {
            System.out.println("Числа должны быть положительными и должно быть соблюдено условие 0≤c<d");
            return;
        } else
            for (int i = a; i <= b; i++) {
                if (i % d == c)
                    System.out.println(i);
            }*/

        /**
         * W: Сумма факториалов
         * По данному натуральном n вычислите сумму 1!+2!+3!+...+n!. В решении этой задачи можно использовать только один цикл.
         */
        /*int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("число должо быть больше 0");
            return;
        }

        int res = 0;
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
            res += fac;
        }

        System.out.println(res);*/


        /**
         * P: Замечательные числа - 1
         * Найдите и выведите все двузначные числа, которые равны удвоенному произведению своих цифр.
         * Программа не требует ввода данных с клавиатуры, просто выводит список искомых чисел.
         */

        /*for (int i = 10; i < 100; i++) {
            if (i == 2 * (i % 10 * (i / 10)))
                System.out.println(i + " " + -i + " ");

        }*/

        /**
         * Q: Замечательные числа - 2
         * Квадрат трехзначного числа оканчивается тремя цифрами, равными этому числу. Найдите и выведите все такие числа.
         * Программа не требует ввода данных с клавиатуры, просто выводит список искомых чисел.
         */

        /*for (int i = 100; i < 1000; i++) {


            if (i == (i * i % 1000))
                System.out.println(i + " " + -i + " ");

        }*/

        /**
         * T: Замечательные числа - 4
         * Даны два четырёхзначных числа A и B. Выведите все четырёхзначные числа на отрезке от A до B, запись которых является палиндромом.
         */
        /*int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (A < 1000 || A > 10000 || B < 1000 || B > 10000) {
            System.out.println("Введите именно четырехзначные числа, пожалуйста. Это не сложно!");
            return;
        }
        for (; A < B; A++) {
            int q = A % 10;//4
            int w = (A / 100) % 10;//3
            int e = (A % 100) / 10;//2
            int r = A / 1000; //1

            if (q == r && w == e)
                System.out.println(A + " ");
                } */


        /**
         * U: Замечательные числа - 5
         * Даны два четырёхзначных числа A и B. Выведите в порядке возрастания все четырёхзначные числа на отрезке от A
         * до B, запись которых содержит ровно три одинаковые цифры.
         */
        /*int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (A < 1000 || A > 10000 || B < 1000 || B > 10000) {
            System.out.println("Введите именно четырехзначные числа, пожалуйста. Это не сложно!");
            return;
        }
        for (; A < B; A++) {
            int q = A % 10;//4
            int w = (A / 100) % 10;//3
            int e = (A % 100) / 10;//2
            int r = A / 1000; //1
            if (q != r && w != e || q!=e && q!=w)
                continue;
            else
                System.out.println(A + " ");

        }*/


/**
 * K: Флаги
 * Напишите программу, которая по данному числу n от 1 до 9 выводит на экран n флагов. Изображение одного флага имеет
 * размер 4×4 символов, между двумя соседними флагами также имеется пустой (из пробелов) столбец. Разрешается вывести
 * пустой столбец после последнего флага и вообще допускается вывод пробелов в конце строк. Внутри каждого флага должен
 * быть записан его номер — число от 1 до n.
 *
 * Символ обратного слэша “\” в текстовых строках имеет специальное значение. Чтобы включить в состав текстовой строки
 * такой символ, его нужно повторить дважды. Например, для вывода на экран одного такого символа можно использовать такой
 * код: cout  <<"\\";.
 */
        /*int n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.print("+___ ");
            }
            System.out.println("");
            for (int i2 = 1; i2 <= n; i2++) {
                System.out.print("|" + i2 + " / ");
            }
            System.out.println("");
            for (int i3 = 1; i3 <= n; i3++) {
                System.out.print("|__\\ ");
            }
            System.out.println("");
            for (int i4 = 1; i4 <= n; i4++) {
                System.out.print("|    ");

    }*/


        /**
         * 1) Заведи два итератора (переменные цикла), один отвечает за количество шагов их должно быть n
         * А вот второй итератор отвечает за количество раз вывода числа t
         *
         * 2) в теле цикла ты выводишь число t
         * 3) увеличиваешь количество выводов числа t
         * 4) Если же это количество окажется равным числу t тогда ты переключаешься к следующему числу t, а количество
         * его выводов обнуляешь
         */


        /*int n = scanner.nextInt();
        int t = 1;
        for (int i = 0, m = 0; i < n; i++) {
            System.out.print(t+" ");
            m++;
            if (m == t) {
                t++;
                m = 0;

            }
        }*/

        /**
         * Для чисел m, n, e
         * Вывести таблицу состоящую из m строк и n столбцов , заполненную числами e . Проверки выполнить самостоятельно
         */

        /*int m = scanner.nextInt();
        int n = scanner.nextInt();
        int e = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            for (int i2 = 0; i2 < n; i2++) {
                System.out.print(e + " ");
            }
            System.out.println();
        }*/


        /**
         * Для чисел m, n вывести таблицу состоящую из строк по след алгоритму , в четных строках только четные числа в
         * порядке возрастания
         */

        /*int m = scanner.nextInt();
        int n = scanner.nextInt();
        if (m > 10 || n > 10) {
            System.out.println("Не стоит так делать");
            return;
        }
        for (int i = 0, e = 1; i < m; i++) {
            for (int i2 = 0; i2 < n; i2++, e++) {
                System.out.printf("%3d ",e);
            }
            System.out.println();
        }*/

        /*int m = scanner.nextInt();
        int n = scanner.nextInt();
        if (m > 10 || n > 10) {
            System.out.println("Не стоит так делать");
            return;
        }
        int d=2;
        int e = 1;

        for (int i = 0 ; i < m; i++) {
            for (int i2 = 0; i2 < n; i2++) {
                if (i % 2 == 0) {
                    System.out.printf("%3d ", e);
                    e+=2;
                } else {
                    System.out.printf("%3d ", d);
                    d+= 2;
                }
            }
            System.out.println();

        }*/

        /**
         * S: Лесенка
         * По данному натуральному n≤9 выведите лесенку из n ступенек, i-я ступенька состоит из чисел от 1 до i без
         * пробелов.
         */

        /*int n = scanner.nextInt();
        String a = "";
        for (int i = n; i > 0; i--) {
            System.out.print(a);
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
            a += " ";
        }*/

        /**
         * V: Волейбольная сетка
         * По данным числам n и m выведите изображение волейбольной сетки, содержащей n ячеек по вертикали и m ячеек по
         * горизонтали.
         * В узлах сетки стоят знаки “+”, по вертикали они соединены одним знаком “|”, а по горизонтали — двумя знаками “-”.
         *
         */

        /*int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int k = 0; k < m; k++) {
            for (int i = 0; i < n; i++) {
                System.out.print("+--");
            }
            System.out.println("+");
            for (int j = 0; j < n; j++) {

                System.out.print("|  ");
            }
            System.out.println("|");

        }
        for (int j = 0; j < n; j++) {
            System.out.print("+--");
        }
        System.out.println("+");*/


        /**
         * Решать все через for
         * 1) дано целое число n проверить , является ли оно простым
         */
        /*int n = scanner.nextInt();
        int m=0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                m += 1;
        }
        if (m == 2)
            System.out.println("Простое");
        else System.out.println("Не простое");*/

        /**
         * 2) даны числа а, b вывести на интервале (а, b] все простые числа
         */

        /*int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max = a > b ? a : b;
        int min = a < b ? a : b;
        for (; min <= max; min++) {
            int m = 0;
            for (int i = 1; i <= min; i++) {
                int ch = min;
                if (ch % i == 0)
                    m += 1;
            }
            if (m == 2)
                System.out.println(min);
        }*/


        /**
         *  3) вводятся числа до тех пор пока не будет введено число 0, найти среднее арифметическое введённых чисел ,
         * полагая что 0 не является элементом последовательности
         */
        /*int sr = 0;
        int q = 0;
        for (int m=1; m != 0; ) {
            int k = scanner.nextInt();
            if (k != 0) {
                sr += k;
                q += 1;
            }
            else
            m = k;
        }
        if (q!=0)
        System.out.println("Среднее арифметическое: " + sr/q);
        else
            System.out.println("Вы не ввели числа!");*/


        /**
         * 4) вводятся числа до тех пор пока не будет введено число 0, найти количество простых чисел , полагая что 0 не
         * является элементом последовательности
         */
       /*int ch=0;
        for (int m = 1; m != 0; ) {
            int k = scanner.nextInt();
            int d = 0;
            m=k;
            for (int i = 1; i <= k; i++) {
                if (k % i == 0)
                    d += 1;
            }
            if (d == 2)
                ch+=1;
        }
        System.out.println("Количество простых числел= " + ch);*/


        /**
         *  ----------------------КОНТРОЛЬНАЯ-------------------------------
         */



    }

}






