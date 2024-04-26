//https://www.youtube.com/watch?v=PKcGy9oPVXg&list=PLVz2XdJiJQxzMiFDnwxUDxmuZQU3igcBb&index=14

pipeline {
  agent any
  tools{
  maven 'mymvn1'
  }
  stages{
  stage('Build Maven'){
  steps{
  checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/veerraju0402/eks']])
  bat 'mvn clean install'
  }
  }
  
    stage('Build docker image'){
  steps{script{
  bat 'docker build -t veerraju123/springboot-eks .'
  }
  }
  }
  
  stage('push docker image to hub'){
  steps{script{
 
 withCredentials([string(credentialsId: 'dockerHubPwd', variable: 'dockerHubCreds')]) {
 bat 'docker login -u veerraju123 -p Raju@1234'
}
bat 'docker push veerraju123/springboot-eks'
  }
  }
  }
  
  
  }
  }