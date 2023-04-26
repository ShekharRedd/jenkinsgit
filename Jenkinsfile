pipeline {
  agent any
  
  stages {
    
    stage(checkout){
      steps{
      sh ' git checkout master '
      }
    
    
    }
    stage('Build') {
      when {
        expression { env.BRANCH_NAME == 'master' }
      }
      steps {
        sh 'echo "Building on master branch"'
      }
    }
    stage('Checkout') {
      when {
        expression { env.BRANCH_NAME != 'master' }
      }
      steps {
        sh 'echo "Checkout to master branch"'
      }
    }
  }
}
