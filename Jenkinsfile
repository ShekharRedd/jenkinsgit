<<<<<<< HEAD

def gv

pipeline {
  agent any
  parameters{
    choice(name:"pythonfiles",choices:['a.py','b.py','c.py'])
    booleanParam(name:'exeuteTests',defaultValue:true,description:'')
    
  }
    stages{
          stage("init"){
            gv=load "nara.groovy"
          }

      stage("build")
        {
          when{
            expression{
              params.exeuteTests
            }
          }
          script{
            gv.build()
          }
        }
      stage("deplov")
        { 
            script{
              gv.deploy()
            }
        }
      stage("python files execute"){
        // when{
        //   expression{
        //     params.pythonfiles
        //   }
        // }
        script{
          gv.envn()
        }

      }
  }


  }
=======
<<<<<<< HEAD
#!/usr/bin/env groovy
=======
#!usr/bin/env groovy
>>>>>>> master
@Library("SharedLib")
def gv
pipeline {
  agent any
<<<<<<< HEAD
    stages{
//             stage("clone")
//                 {
//                   steps 
//                     { 
//                       script{
                        
//                       git "https://github.com/ShekharRedd/companyauropro.git"
//                       sh "python code.py"
//                       }
                        
//                     }
//                 }
//                   stage("deplobv")
//                             { 
//                          when{
//                          expression{
//                            env.BRANCH_NAME=='master'
//                          }
//                          }
//                   steps
//                      { 

//                        echo "deplov successfully"
//                      }
//                 }
      
      
      
            stage("deploying")
                { 
                  steps
                     { echo "deplov successfully sedg webhooks hnmnmmbbappendin"
                      
                      script{
                        deploy.dep()
                      }
                     }
                }
      
    }
  
}



                       
        
                    
        
=======
  
  stages {
    
    stage("checkout"){
      steps{
//       sh ' git checkout master '
        script{
        test.call1()
        }
      }
    
    
    }
//     stage('Build') {
//       when {
//         expression { env.BRANCH_NAME == 'master' }
//       }
//       steps {
//         sh 'echo "Building on master branch"'
//       }
//     }
//     stage('Checkout') {
//       when {
//         expression { env.BRANCH_NAME == 'master' }
//       }
//       steps {
//         sh 'echo "Checkout to master branch"'
//       }
//     }
  }
}
>>>>>>> master
>>>>>>> 0a8df2500ef68c6f259e0d3a61346f0ca7aee6ce
