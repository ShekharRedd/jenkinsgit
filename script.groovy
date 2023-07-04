def build(){
    sh '''
        cd D:/gitbash/gitsecond/jenkinsgit
        git switch shekhar
        git status
        git add .
        git commit -m "adding file"
        git pull
        git push
    '''    
    
}

def test(){
    echo "test the application "
}

def deploy(){
    echo "deploy the application "
    echo "deployning hie dvv "
    echo "hello naga sir"
    echo "hi madhu "
    echo "good to see you"
    echo "hi sredhar"
    echo "hi shekhar "
    echo "namesthe"
    echo "hi"
    echo "welcome"
    echo "here is pull command"    
}
return this
