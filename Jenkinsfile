// pipeline {
//   agent any

//   stages {
//     stage("Build") {
// //       when {
// //         expression {
// //           return env.BRANCH_NAME == 'master'
// //         }
// //       }
//       steps {
//         echo "now this branch is at ${BRANCH_NAME} " 
//       }
//     }
//     stage("Deploy") {
//       steps {
//         sh 'echo "Deploying..."'
//       }
//     }
//   }
  
//   post {
//     always {
//       echo 'Always executed'
//     }
//     success {
//       echo 'Pipeline succeeded'
//     }
//     failure {
//       echo 'Pipeline failed'
//     }
//   }
// }



pipeline {
    agent any

    stages {
        stage('Example') {
            steps {
                echo "Running on branch ${env.BRANCH_NAME}"
            }
        }
    }
}

