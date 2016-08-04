package sample

class AdvancedController {
    def index() {
      render "Hello world"
    }

    def sample(){
      println "Called sample"

      [msg: "Hello world"]
    }
}

/*
servletContext - Also known as application scope, this scope lets you share state across the entire web application. The servletContext is an instance of ServletContext
session - The session allows associating state with a given user and typically uses cookies to associate a session with a client. The session object is an instance of HttpSession
request - The request object allows the storage of objects for the current request only. The request object is an instance of HttpServletRequest
params - Mutable map of incoming request query string or POST parameters
*/
