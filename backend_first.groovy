pipelineJob('back_service_1') {
  properties{
    githubProjectUrl('https://github.com/marwennee/back-service-1')
    pipelineTriggers{
      triggers {
        githubPush()
      }
    }
    buildDiscarder {
      strategy {
          logRotator {
              daysToKeepStr("5")
              numToKeepStr("3")
              artifactDaysToKeepStr("0")
              artifactNumToKeepStr("0")
          }
      }
    }
  }
  definition {
    cps {
      script(readFileFromWorkspace('./Jenkinsfile_back_one_pod'))
      sandbox()    
    }
  }
}
