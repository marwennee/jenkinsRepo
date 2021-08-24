pipelineJob('back_service_2') {
  properties{
    githubProjectUrl('https://github.com/marwennee/back-service-2')
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
      script(readFileFromWorkspace('./Jenkinsfile_back_two_vm'))
      sandbox()    
    }
  }
}
