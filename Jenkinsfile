pipeline {
    agent any
    stages {
        stage('init') {
            steps{
                echo "hi"
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

        stage('Test') {
            steps {
            echo "hello stating  "
            echo "hi"
            echo "welcome"
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
                echo "hi ${Env}"
            }
        }
                
    }
}

