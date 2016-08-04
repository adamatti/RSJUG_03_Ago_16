import groovy.transform.ToString

@ToString(includeNames=true,excludes='id',ignoreNulls = true)
class Person {
  Integer id
  String name
  Date createdAt
  Address address
}

@ToString(includeNames=true, ignoreNulls = true)
class Address {
  String city
}

def p = new Person(name: "Adamatti", address: new Address(city: "cachota"))
println p
