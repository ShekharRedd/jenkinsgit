pipeline {
  agent any


    stages{
            stage("build")
                {
                  when{
                    expression{
                      env.BRANCH_NAME == 'master'

                    }
                  }
                  steps 
                    { 
                       echo "hello world"
                    }
                }
            stage("deplov")
                { 
                  steps
                     { echo "deplov successfully"
                     }
                }
    }

}
