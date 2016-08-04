package sample

class Person {
    String name
    Address address

    static constraints = {
        name nullable: false
        address nullable: true, lazy: true
    }

     static fetchMode = [address: 'eager']
}
