# devops-ci-lab



#Create cluster
gcloud container clusters create lab-devops --network devops

#Auth local kubectl
gcloud container clusters get-credentials lab-devops
