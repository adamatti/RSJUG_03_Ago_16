package sample

class Address {
    String city

    static constraints = {
    }

    static belongsTo = [person: Person]

    String toString (){
      city
    }
}
