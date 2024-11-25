#Decision Tree
data("iris")
attach(iris)
str(iris)

#Data Partition
set.seed(117)
ind <- sample(2,nrow(iris),replace = TRUE,prob = c(0.8,0.2))
train <- iris[ind==1,]
test <- iris[ind==2,]

#DT
library(party)
tree <- ctree(Species~.,train)
plot(tree)

#Predictions
p1 <- predict(tree,train)
p2 <- predict(tree,test)

#Mis-Classification Error
tab1 <- table(Predicted=p1,Actual=train$Species)
tab1
sum(diag(tab1))/sum(tab1)

tab2 <- table(Predicted=p2,Actual=test$Species)
tab2
sum(diag(tab2))/sum(tab2)
