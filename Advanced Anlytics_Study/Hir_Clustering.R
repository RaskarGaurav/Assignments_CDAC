#Hierarchical Cluster Analysis
Case_1_Godrej_Ltd <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Day-11_EFA & Cluster Analysis/Cluster Analysis/Case 1_ Godrej Ltd.xlsx")
attach(Case_1_Godrej_Ltd)
str(Case_1_Godrej_Ltd)

#HCA
distance <- dist(Case_1_Godrej_Ltd)
print(distance,digits = 2)

hc <- hclust(distance)
plot(hc)
plot(hc,hang =-1)

hc1 <- hclust(distance,method = "average")
plot(hc1,hang=-1)

member.c <- cutree(hc,2)
member.a <- cutree(hc1,2)
table(member.c,member.a)

aggregate(Case_1_Godrej_Ltd,list(member.c),mean)

library(cluster)
plot(silhouette(member.c,distance))

#kmeans cluster
kc <- kmeans(Case_1_Godrej_Ltd,2)
kc
kc$cluster

library(stats)
library(ggplot2)
library(dplyr)
library(ggfortify)
autoplot(kc,Case_1_Godrej_Ltd,frame = TRUE)
