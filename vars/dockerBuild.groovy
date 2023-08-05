def call (String dockerHubuserName, String appname, String imageTag) {
    docker build -t "${dockerHubuserName}"/"${appname}" .
    docker image tag "${dockerHubuserName}"/"${appname}":"${imageTag}"
    docker image tag "${dockerHubuserName}"/"${appname}":latest
}