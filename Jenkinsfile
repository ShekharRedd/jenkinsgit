pipeline {
  agent any

  stages {
    stage("Build") {
      when {
        expression {
          env.BRANCH_NAME == "ram"
        }
      }
      steps {
        sh 'echo "Building on master branch"'
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
