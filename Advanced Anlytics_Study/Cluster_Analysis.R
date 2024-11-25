#Cluster Anlysis
Case_2_Shopping_Mall_Cluster_Analysis <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Day-11_EFA & Cluster Analysis/Cluster Analysis/Case 2_Shopping Mall_Cluster Analysis.xlsx")
attach(Case_2_Shopping_Mall_Cluster_Analysis)

#HCA
distance <- dist(Case_2_Shopping_Mall_Cluster_Analysis)
print(distance,digit=2)

hc.c <- hclust(distance)
plot(hc.c,hang = -1)

member.c <- cutree(hc.c,3)
member.a <- cutree(hc.c,3)
table(member.c,member.a)

aggregate(Case_2_Shopping_Mall_Cluster_Analysis,list(member.c),mean)

#KMeans
kc <- kmeans(Case_2_Shopping_Mall_Cluster_Analysis,3)
kc

#Plot
library(stats)
library(ggplot2)
library(dplyr)
library(ggfortify)
autoplot(kc,Case_2_Shopping_Mall_Cluster_Analysis)
