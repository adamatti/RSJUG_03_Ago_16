//new File("/tmp/abc.txt").getText()

new File("/tmp").eachFileRecurse {f->
  println f.name
}
