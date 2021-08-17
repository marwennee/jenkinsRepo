def script_back_1 = readFileFromWorkspace('./back_1.groovy')
def script_back_2 = readFileFromWorkspace('./back_2.groovy')

job('back-1') {
    steps {
        groovyCommand(script_back_1)
        groovyCommand(script_back_2)
    }
}