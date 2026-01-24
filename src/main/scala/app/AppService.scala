package app

import org.springframework.stereotype.Service

@Service
class AppService(appRepository: AppRepository):
  def getData: Array[User] = appRepository.getAllUsers
