package id.ac.polbeng.genesis.test_kelas

class EmployeeB(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        get() = field

    var name: String = _name
        get() {
            return field.uppercase()   // otomatis jadi huruf besar
        }
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
    val emp = EmployeeB(1102, "Budi", 30)
    println("Id : ${emp.id}, Nama : ${emp.name}, Umur : ${emp.age}")
    emp.age = -1   // ini akan memicu exception
}
