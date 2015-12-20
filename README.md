# Subsequense
Subsequence
Заданы две последовательности X1, X2,..., Xn и Y1, Y2,…, Yk произвольных элементов (java.lang.Object). Определить, можно ли получить последовательность X путем вычеркивания некоторых элементов из Y?
В качестве входных параметра в метод передаются два списка: первый – список Xi, второй – список Yi.
Название интерфейса
com.tsystems.javaschool.tasks.Subsequence
Имя класса
com.tsystems.javaschool.tasks.SubsequenceImpl
Имя архива
subsequense.zip
Пример
Subsequence s = new SubsequenceImpl();
boolean b = s.find(Arrays.asList("A", "B", "C", "D"), Arrays.asList("BD", "A", "ABC", "B", "M", "D", "M", "C", "DC", "D"));
System.out.println(b); // Результат: true
3
