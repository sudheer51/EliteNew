pipeline {
    agent any

    stages 
	{
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
		 
        stage('Execute Selenium Tests'){
            steps{
                
                git 'https://github.com/sudheer51/EliteNew.git'
                dir('mmp') {
                            bat 'mvn clean test'
                    }
            }
        }
		
    }
}
