def call ( String dockerHubuserName, String appname )
{
    sh """ trivy image docker image tag ${dockerHubuserName}/${appname} ${dockerHubuserName}/${appname}:latest > scanreport.txt 
    cat scanreport.txt
    """
}