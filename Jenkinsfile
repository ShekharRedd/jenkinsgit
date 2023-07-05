#!/usr/bin/env groovy

@Library('SharedLib')
def gv
pipeline {
    agent any
    stages {
        stage('init') {
            steps{
                script{

                        gv=load "script.groovy"
                }
            }

        } 
        stage('Build') {
            steps {
                sh '''
                  cd D:/gitbash/gitsecond/jenkinsgit
                  git switch shekhar
                  git status
                  git add .
                  git commit -m "good  file"
                  git pull
                  git push
                '''
            }
        }

        stage('Testing we') {
            steps {
                script{
                    
                    deploy 'shekhar123reddy/dock:3.5'
                }
        
            }
        }
        stage('Deploying ') {
            input {
                message "select the env"
                ok "done"
                parameters{
                    choice(name: "Env" , choices:["env","prod"] , description: "good")

                }
            }
            steps {
                echo "deployning hie dvv "
                echo "hello naga sir"
                echo "hi madhu "
                echo "good to see you"
                echo "hi sredhar"
                echo "hi shekhar w"
                echo "hi ${BRANCH_NAME}"
            }
        }
                
    }
}

// #!/usr/bin/env groovy
// def call(String image){
//     echo "deploying the application to production env "
//     withCredentials([usernamePassword(credentialsId: 'Dockerusername', passwordVariable: 'PASS', usernameVariable: 'USER')])
//     sh "docker build -t $image ."
//     sh "echo $PASS | docker login -u $USER --password-stdin"
//     sh "docker push $image"
// }