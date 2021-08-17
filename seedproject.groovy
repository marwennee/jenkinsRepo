multibranchPipelineJob('back_service_1') {
    factory {
        workflowBranchProjectFactory {
            scriptPath('./jenkinsfile-back-1')
        }
    }

    branchSources {
        branchSource {
            source {
              gitSCMSource {
                remote('https://github.com/marwennee/back-service-1')
                credentialsId('github')
              }
            }
        }
    }
}