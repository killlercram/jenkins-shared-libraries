def call(String imageName, String imageTag, String dockerHubUser){
  sh "docker build -t ${dockerHubUser}/${imageName}:${imageTag} ."
}
