//Вариант 8, практическая работа 8
 fun main() {
try {
    var sam:samolet=samolet("Ту", "Россия","Екатеринбург","20.01.2018","16:00")

    sam.scan()
    if (sam.t==true) {
        sam.info()
    }
    sam.vvod()
    sam.scan()
    if (sam.t==true) {
        sam.info()
    }
}
catch (e:Exception)
{
    println("Найдена ошибка при вводе данных")
}
}




