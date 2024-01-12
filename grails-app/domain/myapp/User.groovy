package myapp

class User {

    String username
    String password

    static constraints = {
    }

    static mapping = {
        table(name: '`user`')
    }

}