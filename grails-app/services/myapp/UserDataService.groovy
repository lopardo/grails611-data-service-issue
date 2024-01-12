package myapp

import grails.gorm.services.Service

import javax.validation.constraints.NotNull

@Service(User)
abstract class UserDataService {

    abstract User get(@NotNull Serializable id)

}