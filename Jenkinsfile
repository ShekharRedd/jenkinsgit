pipeline {
  agent any

  stages {
    
    stage("Chec") {
      steps {
        sh '''
        git branch -r
        
        git checkout ram
        
        ls
        
        '''
      }
    }
    
    
    
    stage("Build") {
      when {
        expression {
          return env.BRANCH_NAME == 'ram'
        }
      }
      steps {
        sh ' echo "now this branch is at ram" '
      }
    }
    stage("Deploy") {
      steps {
        sh 'echo "Deploying..."'
      }
    }
  }
  
  post {
    always {
      echo 'Always executed'
    }
    success {
      echo 'Pipeline succeeded'
    }
    failure {
      echo 'Pipeline failed'
    }
  }
}
