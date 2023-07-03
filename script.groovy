def build(){
    sh "git status"
}

def test(){
    echo "test the application "
}

def deploy(){
    echo "deploy the application "
}
return this
