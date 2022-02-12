pipeline {
    agent any

        stages {
 
            stage ('Unit Tests') {
                steps {
                    sh "mvn clean compile test"
                }
            }

            stage ('Compile Pro_Calculadora_Jose') {
                steps {
                    sh "mvn -f pom.xml clean install -Dmaven.test.skip=true"   
                }
            }
        }
}
