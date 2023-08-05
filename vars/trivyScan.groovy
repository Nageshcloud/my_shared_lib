def call ( String dockerHubuserName, String appname )
{
    sh """ 
    trivy image ${dockerHubuserName}/${appname}:latest > scanreport.txt 
    cat scanreport.txt
    """
}