
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

// def gv
// pipeline {
//     agent any
//     parameters {
//         string(name: 'ENVIRONMENT', defaultValue: 'dev', description: 'Environment to deploy to')
//         booleanParam(name: 'TESTING', defaultValue: true, description: 'Run tests before deployment')
//         choice(name: 'BRANCH', choices: ['master', 'develop', 'feature/*'], description: 'Git branch to deploy from')
//     }
    
//     stages {
//         stage('Build') {
//             steps {
//                 sh 'echo "good morning on ${BRANCH} branch"'
//             }
//         }
//         stage('Test') {
//             when {
//                 expression { params.TESTING == true }
//             }
//             steps {
//                 sh 'echo "Running the good it is working tests..."'
//             }
//         }
//         stage('Deploy') {
//             steps {
//                 sh 'echo " to ${ENVIRONMENT} environment..."'
//             }
//         }
//         stage('environment') {
//             steps {
//                 sh 'echo " ${BUILD_ID} it is working fine thanks to all the meber"'
//             }
//         }  
//         stage('naga pawan ') {
//             steps {
//                 sh 'python ram1.py'
//             }
//         }                 
//     }
// }




def gv
pipeline {
    agent any
    parameters {
        string(name: 'ENVIRONMENT', defaultValue: 'dev', description: 'Environment to deploy to')
        booleanParam(name: 'TESTING', defaultValue: true, description: 'Run tests before deployment')
        choice(name: 'BRANCH', choices: ['master', 'develop', 'feature/*'], description: 'Git branch to deploy from')
    }
    stages {
        stage('init') {
            steps{
                script {
                    gv = load "script.groovy"
                }
            }

        } 
        stage('Build') {
            steps {
                script{
                    gv.build()
                }
            }
        }

        stage('Test') {
            when {
                expression { params.TESTING == true }
            }
            steps {
                script{
                    gv.test()
                }
            // echo "hello stating  "
            }
        }
        stage('Deploying ') {
            steps {
                script{
                    gv.deploy()
                }

            }
        }
        // stage('environment') {
        //     steps {
        //         sh 'echo " ${BUILD_ID} it is working fine thanks to all the meber"'
        //     }
        // }  
        // stage('naga pawan ') {
        //     steps {
        //         sh 'python ram1.py'
        //     }
        // }                 
    }
}

                       
        
                    
        
