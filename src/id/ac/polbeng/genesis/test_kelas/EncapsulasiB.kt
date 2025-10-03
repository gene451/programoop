package id.ac.polbeng.genesis.test_kelas

class EmployeeC(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        get() = field  // Getter default

    var name: String = _name
        get() = field.uppercase()  // Otomatis huruf besar
        set(value) {
            field = value
        }

    var age: Int = _age
        get() = field
        set(value) {
            field = if (value > 0) value
            else throw IllegalArgumentException("Age must be greater than zero")
        }
}

fun main() {
    val emp = EmployeeC(1102, "Budi", 30)
    println("Id : ${emp.id}, Nama : ${emp.name}, Umur : ${emp.age}")

    // Contoh valid setter
    emp.age = 35
    println("Umur baru : ${emp.age}")

    // Contoh invalid setter → memicu exception
    try {
        emp.age = -1
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}
