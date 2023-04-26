pipeline {
  agent any

  stages {
    stage("Build") {
//       when {
//         expression {
//           env.BRANCH_NAME == 'master'
//         }
//       }
      steps {
        sh 'git checkout origin/master'
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
