def call ()
{
    sh '''
    pwd
    whoami
    mvn clean install
    '''
}