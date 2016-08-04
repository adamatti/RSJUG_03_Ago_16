String.metaClass.dup = {
  delegate + " " + delegate
}

println "Adamatti ".dup()
