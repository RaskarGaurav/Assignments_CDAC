#Random Forest Classifier
data("iris")
attach(iris)
str(iris)

#Data Partition
set.seed(117)
ind <- sample(2,nrow(iris),replace = TRUE,prob = c(0.8,0.2))
train <- iris[ind==1,]
test <- iris[ind==2,]

#Random Forest
library(randomForest)
set.seed(117)
rf <- randomForest(Species~.,train)
print(rf)

#Prediction
p1 <- predict(rf,train)
p2 <- predict(rf,test)

#Confusion matrix
library(caret)
library(e1071)
confusionMatrix(p1,train$Species)
confusionMatrix(p2,test$Species)

#Plot Eror Rate of rf
plot(rf)

#Imp Variable
varImpPlot(rf)
importance(rf)

#Partial Plot
partialPlot(rf,train,Petal.Length,"setosa")
partialPlot(rf,train,Petal.Length,"virginica")

hist(treesize(rf))
