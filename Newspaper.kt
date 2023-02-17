//Вариант 8, практическая работа 8
 class samolet(var mark: String, var punkt: String, var punktnaz: String, var dataotp: String,var vrema:String) {
    var t: Boolean = true
    fun info() {
        println(
            "марка самолета: $mark\nпункт отправления: $punkt\nпункт назначения: $punktnaz\nдата отправления: $dataotp\n" +
                    "время отправления: $vrema"
        )
    }

    fun vvod() {
        print("Введите марку самолета: ")
        mark = readLine()!!.toString()
        print("Введите пункт отправления: ")
        punkt = readLine()!!.toString()
        print("Введите пункт назначения: ")
        punktnaz = readLine()!!.toString()
        print("Введите дату отправления: ")
        dataotp = readLine()!!.toString()
        print("Введите время отправления: ")
        vrema = readLine()!!.toString()

    }

    fun scan() {
        t = true
        if (mark >= "a" && mark <= "z" || mark >= "а" && mark <= "я" || mark >= "A" && mark <= "Z" || mark >= "А" && mark <= "Я")
            if (punkt >= "a" && punkt <= "z" || punkt >= "а" && punkt <= "я" || punkt >= "A" && punkt <= "Z" || punkt >= "А" && punkt <= "Я")
                if (punktnaz >= "a" && punktnaz <= "z" || punktnaz >= "а" && punktnaz <= "я" || punktnaz >= "A" && punktnaz <= "Z" || punktnaz >= "А" && punktnaz <= "Я")
                    if (dataotp >= "a" && dataotp <= "z" || dataotp >= "а" && dataotp <= "я" || dataotp >= "A" && dataotp <= "Z" || dataotp >= "А" && dataotp <= "Я")
                        if (vrema >= "a" && vrema <= "z" || vrema >= "а" && vrema <= "я" || vrema >= "A" && vrema <= "Z" || vrema >= "А" && vrema <= "Я"){

                }
    }
}



