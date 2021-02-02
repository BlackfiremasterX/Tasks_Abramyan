
import kotlin.math.*

fun main()
{
    print("Добро пожаловать в методическое пособие на языке Kotlin по задачнику Абрамяна!\nТут представлены задачи по всем модулям.\n(Begin1 - b1) - Пример внутреннего синтаксиса для вызова задач из списка.")
    print("На данный момент доступны задачи:\nBegin1\nBegin2\n")
    print("Выберите задачу: "); var user_choise = readLine()
    when(user_choise)
    {
        "b1" -> Begin1()
        "b2" -> Begin2()
        "b20" -> Begin20()
        "i11" -> Integer11()
        "if30" -> If30()
        "999" -> If30_1()
        else -> println("Такой задачи нет!")

    }

//    Integer28()

}



fun Begin1()
{
print("\nДана сторона квадрата a. Найти его периметр P = 4·a.\nВведите сторону квадрата а: ")
var a = readLine()!!.toFloat()
var Perimeter = 4*a
print("Периметр квадрата со стороной а = $a: $Perimeter\nДемонстрация завершена!\n")
}
fun Begin2()
{
    print("\nДана сторона квадрата a. Найти его площадь S = a*a.\nВведите сторону квадрата а: ")
    var a = readLine()!!.toFloat()
    var Sqare = a*a
    print("Площадь квадрата со стороной а = $a: $Sqare\nДемонстрация завершена!\n")
}
fun Begin20()

{
    var x1= readLine()!!.toDouble()
    var x2= readLine()!!.toDouble()
    var y1= readLine()!!.toDouble()
    var y2= readLine()!!.toDouble()
    var S = sqrt((x2-x1).pow(2)+(y2-y1).pow(2))
    var Spow = ((x2-x1).pow(2)+(y2-y1).pow(2)).pow(0.5)
    println("Результат: $S")
    println("Результат SPOW: $Spow")
//(/*выражение*/).pow(0.5) = sqrt(/*выражение*/)
}

fun Integer11() {

    var num = readLine()!!.toInt()
    var num_sot = num/100       /*(num-num%100)/100*/
    var num_dec = num/10%10
    var num_edin = num%100%10
    println(num_sot)
    println(num_dec)
    println(num_edin)

    print("Сумма: ${num_sot+num_dec+num_edin}\n")
    print("Произведение: ${num_sot*num_dec*num_edin}")


}


fun If30()
{
    var a = readLine()!!.toInt()
    //если делиться на 2 значит чётное
    if(a%2==0)
    print("четное ")
    else
    print("нечетное ")
    //однозначное,двухзначное,трёхзначное
    if ((a/100)>0)
        print("трёхзначное ")
    else
    {
        if ((a/10)>0)
            print("двухзначное ")
        else
            print("однозначное ")
    }






}


fun If30_1()
{
    val n = 0
    while(n == 0)
    {
        print("Введите число в диапазоне от 1 до 999: "); val number = readLine()!!.toInt()

        if (number >= 0 && number < 10)
        {
            if (number % 2 == 0)
                println("Число $number является чётным однозначным")
            else
                println("Число $number является нечётным однозначным")
        }
        else if (number >= 10 && number < 100)
        {
            if (number % 2 == 0)
                println("Число $number является чётным двузначным")
            else
                println("Число $number является нечётным двузначным")
        }
        else if (number >= 100 && number < 1000)
        {
            if (number % 2 == 0)
                println("Число $number является чётным трёхзначным")
            else
                println("Число $number является нечётным трёхзначным")
        }
        else if (number < 1 || number > 999)
        {
            println("Внимательнее читайте условие")
            break
        }

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString()

        if (answer == "да" || answer == "Да" || answer == "lf" || answer == "Lf" || answer == "yes" || answer == "Yes")
            continue
        else if (answer == "нет" || answer == "Нет"  || answer == "Ytn" || answer == "ytn"  || answer == "No" || answer == "no")
            break
        else
        {
            println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход")
            break
        }
    }
}
///

/* Найти расстояние между двумя точками с заданными координатами(x1,y1) и (x2,y2) на плоскости. Расстояние вычисляется по формуле√(x2−x1)2+ (y2−y1)2*/

//fun Integer28()
//{
//
//    var K = (1..365).random()
//    println(K)
//
//    var N = (1..7).random() - 1
//    println(N)
//
//    var addDays = K + N
//
//    var day = addDays % K + 1
//
//    print(day)
//
//}