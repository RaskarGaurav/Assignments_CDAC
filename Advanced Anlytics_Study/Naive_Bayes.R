#Naive Bayes
naive_Bayes <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Day-17-Naive Bayes_Overfitting-Underfitting-Holdout-Generalization/naive Bayes.xlsx")
attach(naive_Bayes)

library(naivebayes)
library(dplyr)
library(ggplot2)
library(psych)

str(naive_Bayes)
naive_Bayes$admit = as.factor(naive_Bayes$admit)
naive_Bayes$Rank = as.factor(naive_Bayes$Rank)
xtabs(~admit+Rank,data = naive_Bayes)
pairs.panels(naive_Bayes[-1])
naive_Bayes%>%ggplot(aes(x=admit,y=grade,fill = admit))+geom_boxplot()+ggtitle("Box Plot")
naive_Bayes%>%ggplot(aes(x=grade,fill = admit))+geom_density(alpha = 0.8, color = "Black")+ggtitle("Density Plot")

#Data Partition
set.seed(117)
ind<-sample(2,nrow(naive_Bayes),replace = T,prob = c(0.8,0.2))
train<-naive_Bayes[ind==1,]
test<-naive_Bayes[ind==2,]
model<-naive_bayes(admit~.,data=train)

p1<-predict(model,train,type = "prob")
p1
head(cbind(p1,train))

p1 <-predict(model,train)
str(p1)
tab1<-table(p1,train$admit)
tab1
sum(diag(tab1))/sum(tab1)

#EDA
train%>%filter(admit=="0")%>%summarise(mean(grade),sd(grade))
