package myapp

class UserController {

    def userDataService

    def profileInformation() {
        def user = userDataService.get(1)
        println "user: ${user?.id} : '${user.username}'"
        render view: '/user/profileInformation', model: [user: user]
    }

}