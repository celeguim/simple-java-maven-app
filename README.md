# simple-java-maven-app

# Tutorial 
https://jenkins.io/doc/tutorials/build-a-java-app-with-maven/


# Run the container

docker run --privileged -it -e -d --rm -u root -p 8081:8080 -v /var/run/docker.sock:/var/run/docker.sock -v jenkins-data:/var/jenkins_home -v  C:\Users\luizc\simple-java-maven-app:/home/simple-java-maven-app jenkinsci/blueocean
