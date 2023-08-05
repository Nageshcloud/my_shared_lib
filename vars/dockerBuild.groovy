def call (String dockerHubuserName, String appname, String imageTag) {
    sh"""
    docker build -t ${dockerHubuserName}/${appname} .
    docker image tag ${dockerHubuserName}/${appname} ${dockerHubuserName}/${appname}:${imageTag}
    docker image tag ${dockerHubuserName}/${appname} ${dockerHubuserName}/${appname}:latest
    """
}
