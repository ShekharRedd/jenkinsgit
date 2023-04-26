pipeline {
  agent any


    stages{
            stage("build")
                {
                  when{
                    expression{
                      BRANCH_NAME == 'master'

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
