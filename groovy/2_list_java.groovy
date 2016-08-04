class Person {
  Integer id
  String name
}

List list = new ArrayList();
list.add(new Person(id: 1, name: "Marcelo"));
list.add(new Person(id: 2, name: "adamatti"));

for (Person p: list){
  println p.name
}
