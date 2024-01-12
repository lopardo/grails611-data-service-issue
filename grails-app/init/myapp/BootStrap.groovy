package myapp

class BootStrap {

    def init = { servletContext ->

        User.withTransaction {
            new User(id: 1, username: 'root', password: 'root').save()
            new User(id: 2, username: 'user', password: 'user').save()
        }

    }
    def destroy = {
    }
}