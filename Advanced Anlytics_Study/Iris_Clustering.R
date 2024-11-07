#Clustering IRIS
data("iris")
attach(iris)
iris <- iris[,-c(5)]
str(iris)

kc <- kmeans(iris,3)
kc$cluster
library(dplyr)
library(ggfortify)
library(ggplot2)
library(stats)
autoplot(kc,iris,frame=TRUE)
