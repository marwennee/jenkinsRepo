def releaseScript = readFileFromWorkspace('./back_1.groovy')
job('back-1') {
    steps {
        def scriptApproval = Jenkins.instance.getExtensionList('org.jenkinsci.plugins.scriptsecurity.scripts.ScriptApproval')[0]
        scriptApproval.approveScript(scriptApproval.hash(pipelineScript, 'groovy'))
        script releaseScript
    }
}