multibranchPipelineJob('back_service_1') {
    branchSources {
        branchSource {
            source {
              gitSCMSource {
                remote('https://github.com/marwennee/back-service-1')
                credentialsId('github')
                traits {
                    gitBranchDiscovery()
                    gitTagDiscovery() 
                }
              }
            }
        }
    }
    factory {
        remoteJenkinsFileWorkflowBranchProjectFactory {
            remoteJenkinsFile('Jenkinsfile-back-1')
            localMarker('') 
            remoteJenkinsFileSCM {
                gitSCM {
                    userRemoteConfigs {
                        userRemoteConfig {
                            name('origin')
                            url('https://github.com/marwennee/jenkinsRepo')
                            refspec("+refs/heads/*:refs/remotes/origin/*")
                            credentialsId('github')
                        }
                    }
                    branches {
                        branchSpec {
                        name('main')
                        }
                    }
                    browser {} 
                    gitTool('/usr/bin/env git')
                }
            }
        }
    }

}

multibranchPipelineJob('back_service_2') {
    branchSources {
        branchSource {
            source {
              gitSCMSource {
                remote('https://github.com/marwennee/back-service-2')
                credentialsId('github')
                traits {
                    gitBranchDiscovery()
                    gitTagDiscovery() 
                }
              }
            }
        }
    }
    factory {
        remoteJenkinsFileWorkflowBranchProjectFactory {
            remoteJenkinsFile('Jenkinsfile-back-2')
            localMarker('') 
            remoteJenkinsFileSCM {
                gitSCM {
                    userRemoteConfigs {
                        userRemoteConfig {
                            name('origin')
                            url('https://github.com/marwennee/jenkinsRepo')
                            refspec("+refs/heads/*:refs/remotes/origin/*")
                            credentialsId('github')
                        }
                    }
                    branches {
                        branchSpec {
                        name('main')
                        }
                    }
                    browser {} 
                    gitTool('/usr/bin/env git')
                }
            }
        }
    }

}