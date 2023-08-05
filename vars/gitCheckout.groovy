def call (Map stageArgs) {
    checkout scmGit(
        branches: [[name: stageArgs.branch ]],  
        userRemoteConfigs: [[url: stageArgs.url]])
}