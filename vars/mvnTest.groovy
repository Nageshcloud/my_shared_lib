def call (){
    sh '''
    pwd
    whoami
    mvn test
    '''
}