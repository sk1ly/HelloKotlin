package ru.sk1ly

class Dog {

    var name: String? = null
    get() = field?.replaceFirstChar { it.uppercase() }
    var age: Int = 0
    set(value) {
        if (value >= 0) {
            field = value
        }
    }
    var weight: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
}