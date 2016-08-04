class Person {
  Integer id
  String name
}

def l = [
    new Person(id: 1, name: "Marcelo"),
    new Person(id: 2, name: "adamatti")
]

l.each {p ->
  println p.name
}

//find / findAll / any / every / collect
