
// pipeline {
//   agent any
//   parameter{
//       choice(name:"third",choices:["good morning","afternoon","good evening"])
// 			choice(nam:"one",choices:["dev","test"])
// 			choice(nam:"two",choices:["init","build"])
//       }
//     stages{

      

//             stage("build")
//                 { 
//                   steps
//                      { echo "deplov successfully"
//                       sh "pip install request"
//                      }
//                 }

//             stage("deplov")
//                 { 
//                   steps
//                      { echo "deplov successfully"
//                      }
//                 }

//             stage("test")
//                 { 
//                   steps
//                      { echo "deplov successfully"
//                      }
//                 }
//     }
  
// }
pipeline {
    agent any
    parameters {
        string(name: 'ENVIRONMENT', defaultValue: 'dev', description: 'Environment to deploy to')
        booleanParam(name: 'TESTING', defaultValue: true, description: 'Run tests before deployment')
        choice(name: 'BRANCH', choices: ['master', 'develop', 'feature/*'], description: 'Git branch to deploy from')
    }
    stages {
        stage('Build') {
            steps {
                sh 'echo "Building on ${BRANCH} branch"'
            }
        }
        stage('Test') {
            when {
                expression { params.TESTING == true }
            }
            steps {
                sh 'echo "Running tests..."'
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo "Deploying to ${ENVIRONMENT} environment..."'
            }
        }
    }
}




                       
        
                    
        
