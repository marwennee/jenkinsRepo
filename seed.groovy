def releaseScript = readFileFromWorkspace('./back_1.groovy')
job('back-1') {
    steps {
        groovyCommand(releaseScript)
    }
}