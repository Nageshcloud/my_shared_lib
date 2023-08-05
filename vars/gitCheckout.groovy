def call ( map stageargs ) {
    checkout scmGit(
        branches: [[name: stageargs.branch ]],  
        userRemoteConfigs: [[url: stageargs.url]])
}