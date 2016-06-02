# devops-ci-lab

[![Build Status](https://travis-ci.org/joseripla/devops-ci-lab.svg?branch=master)](https://travis-ci.org/joseripla/devops-ci-lab)

#Create cluster
gcloud container clusters create lab-devops --network devops

#Auth local kubectl
gcloud container clusters get-credentials lab-devops
