def call(String url, String branch){
        git url: "${url}" , branch: "${branch}"
        echo "Code clonning successful"
}
