    def call ( String dockerHubuserName, String appname, String imageTag ) {
    withCredentials([usernamePassword(
        credentialsId: 'DOCKER_HUB', 
        passwordVariable: 'PASS', 
        usernameVariable: 'USER')]) {
     sh " docker login -u '$USER' -p '$PASS' "
}
     sh """ docker image push ${dockerHubuserName}/${appname}:${imageTag}
            docker image push ${dockerHubuserName}/${appname}:latest
        """
    }