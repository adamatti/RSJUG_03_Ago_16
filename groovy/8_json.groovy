import groovy.json.JsonSlurper

String text = """
  [
    {"id":1, "name": "Marcelo"},
    {"id":2, "name": "Adamatti"}
  ]
"""

def json = new JsonSlurper().parseText(text)

json.each { p ->
  println p.name
}

//JsonOutput.toJson
