Kоды в **Exceptions** обрабатывает исключения и проверяет размеры и типы массивов, а также проверяет на деление на ноль. Если входные данные не соответствуют требованиям, генерируются соответствующие исключения.

---
Второе задание представляет собой набор статических методов, которые выполняют различные операции над числами. Если метод multiply() пытается разделить число на ноль, генерируется исключение MyDivideByZeroException.

---
Третье задание представляет собой класс ArraysComporator, который содержит статический метод compareArrays. Этот метод принимает два массива в качестве аргументов и сравнивает их размеры и типы. Если размеры массивов не совпадают или их типы отличаются, генерируются исключения MyArraysSizeException и MyArraysTypeException соответственно.

---
Четвертое задание представляет собой классы Pair и Task4. Класс Pair является параметризованным классом, который представляет пару ключ-значение. Он имеет два поля: поле first для ключа и поле second для значения.
В классе Task4 метод task4() создает объект класса Pair, используя строки “Key 1” и “1” в качестве ключа и значения соответственно. Затем метод выводит содержимое объекта на экран, используя метод toString() класса Pair.
