#Lab3 LDA
Discriminant <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Lab-3-Cases/Discriminant.xlsx")
attach(Discriminant)

#Dependent
str(Discriminant)
Discriminant$Selection <- as.factor(Discriminant$Selection)
str(Discriminant)

#Normality
library(MVN)
mvn(Discriminant[,c(1,2,3)], mvnTest = "mardia")

#Model develop
library(MASS)
Model <- lda(Selection~. , data = Discriminant)
Model

#prediction
lpred <- predict(Model,Discriminant)
lclass <- lpred$class
lclass

#accuracy & 
ltable <- table(lclass, Discriminant$Selection)
ltable
acc <- (4+19)*100/30
acc
