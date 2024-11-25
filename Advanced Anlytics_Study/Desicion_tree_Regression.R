#DT Regression
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
tree1 <- ctree(Sepal.Length~.,train)
plot(tree1)
