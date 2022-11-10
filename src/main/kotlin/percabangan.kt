fun main() {

    println("Silahkan pilih Operasi ")
    println("1. Penjumlahan ")
    println("2. Perkalian ")
    println("3. Pengurangan ")
    println("4. Pembagian ")
//    val operator = readLine()
    var operasi: Int = 0
    print("pilih operasi : ")
    operasi = readLine()!!.toInt()
    println("Masukan Angka 1 : ")
    val angka1: Int = readLine()!!.toInt()
    println("Masukan Angka 2 : ")
    val angka2: Int =readLine()!!.toInt()

    if (operasi == 1){
        print(angka1+angka2)
    }else if (operasi == 2){
        print(angka1-angka2)
    }else if (operasi == 3) {
        print(angka1 * angka2)
    }else if (operasi == 4){
        print(angka1/angka2)
    }

}
