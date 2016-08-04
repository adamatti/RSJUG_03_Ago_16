class Person {
  Integer id
  String name
}

Map map = new HashMap()
map.put(1, new Person(id: 1, name:"Marcelo"))
map.put(2, new Person(id: 2, name:"Adamatti"))

for (Integer key : map.keySet()){
  println map.get(key).name
}
