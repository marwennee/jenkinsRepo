multibranchPipelineJob('back_service_1') {
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
    factory {
        remoteJenkinsFileWorkflowBranchProjectFactory {
            remoteJenkinsFile('jenkinsfile-back-1')
            localMarker('') 
            remoteJenkinsFileSCM {
                gitSCM {
                    userRemoteConfigs	{
                        userRemoteConfig {
                            name('origin')
                            url('https://github.com/marwennee/jenkinsRepo')
                            refspec("+refs/heads/main:refs/remotes/origin/main")
                            credentialsId('github')
                        }
                    }
                    branches {
                        branchSpec {
                        name('main')
                        }
                    }
                    browser {} // required, but doesn't require configuration
                    gitTool('/usr/bin/env git')
                }
            }
        }
    }

}