class Person {
  Integer id
  String name
}

def map = [
  1 : new Person(id: 1, name:"Marcelo"),
  2 : new Person(id: 2, name:"Adamatti")
]

map.each { key, value ->
  println map.get(key).name
}
