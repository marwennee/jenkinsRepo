pipelineJob('helm') {
  properties{
    githubProjectUrl('https://github.com/marwennee/helm.git')
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
      script(readFileFromWorkspace('./Jenkinsfile_helm_pod'))
      sandbox()    
    }
  }
}
