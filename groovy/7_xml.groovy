String text = """
  <persons>
    <person id="1">Marcelo</person>
    <person id="2">Adamatti</person>
  </persons>
"""

def xml = new XmlSlurper().parseText(text)

xml.person.each { p ->
  println "${p.@id} - ${p.text()}"
}
