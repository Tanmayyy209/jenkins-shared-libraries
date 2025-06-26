def call(String ImageTag, String DockerHubUser, String ProjectName) {
    echo "Building Docker image: ${DockerHubUser}/${ProjectName}:${ImageTag}"
    sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
