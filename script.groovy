def build(){
    echo "hello"
    sh "cd D:"
    sh "ls"
    sh "cd D:/gitbash/"
    sh "ls"
    // sh "cd gitbash"
    // sh "cd gitsecond"
    // sh "cd jenkinsgit"
    // sh "git switch ram"
    // sh "git status"
    // sh "git pull"
    // sh "git add ."
    // sh 'git commit -m "adding file"'
    // sh "git push"
    // echo "hello"
    
}

def test(){
    echo "test the application "
}

def deploy(){
    echo "deploy the application "
}
return this
