fun main()
{
//    print("Добро пожаловать в методическое пособие на языке Kotlin по задачнику Абрамяна!\nТут представлены задачи по всем модулям(Begin1 - b1) - синтаксис вызова задач из списка.")
//    Begin1()
//    Begin2()
    Integer28()

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
///



fun Integer28()
{

    var K = (1..365).random()
    println(K)

    var N = (1..7).random() - 1
    println(N)

    var addDays = K + N

    var day = addDays % K + 1

    print(day)

}