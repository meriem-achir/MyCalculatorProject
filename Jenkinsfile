pipeline {
    agent any 

    stages {
        stage('Clone') {
            steps {
                script {
                    // Cloner le dépôt Git
                    git url: 'https://github.com/meriem-achir/MyCalculatorProject.git', branch: 'master'
                }
            }
        }
        
        stage('Build') {
            steps {
                // Construire le projet avec Maven
                bat 'mvn clean package'
            }
        }
        
        stage('Test') {
            steps {
                // Exécuter les tests unitaires
                bat 'mvn test'
            }
        }

        stage('Run') {
            steps {
                // Exécuter l'application
                bat 'java -jar target/CalculatorProject-1.0-SNAPSHOT.jar'
            }
        }
    }

    post {
        always {
            // Toujours exécuter ce bloc, que le build réussisse ou échoue
            echo 'Cleaning up...'
        }

        success {
            echo 'Pipeline succeeded!'
        }

        failure {
            echo 'Pipeline failed!'
        }
    }
}
