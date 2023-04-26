pipeline {
  agent any

  stages {
    stage("Build") {
      when {
        expression {
          return env.BRANCH_NAME == 'master'
        }
      }
      steps {
        sh ' echo "now this branch is at master" '
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
