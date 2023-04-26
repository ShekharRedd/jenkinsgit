pipeline {
  agent any

  stages {
    
    stage("Chec") {
      steps {
        sh '''
        git branch -r
        
        git checkout origin/ram
        
        ls
        
        '''
      }
    }
    
    
    
    stage("Build") {
//       when {
//         expression {
//           env.BRANCH_NAME == 'origin/master'
//         }
//       }
      steps {
        sh 'git branch -r '
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
