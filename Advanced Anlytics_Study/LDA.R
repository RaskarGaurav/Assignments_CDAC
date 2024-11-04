#Linear Discriminant Analysis(LDA)
Discriminant_Analysis_2_ <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Day-10_Logistic Regression & Discriminant Analsysis/Discriminant Analysis/Discriminant Analysis 2 .xlsx")
attach(Discriminant_Analysis_2_)

str(Discriminant_Analysis_2_)
Discriminant_Analysis_2_$Buyer <- as.factor(Discriminant_Analysis_2_$Buyer)
str(Discriminant_Analysis_2_)

#Normality
shapiro.test(Durability)
shapiro.test(Mileage)
shapiro.test(`Interior Design`)
shapiro.test(Look)
#Multivriate Normality
library(MVN)
d1 <- Discriminant_Analysis_2_[,-c(1,1)]
str(d1)
mvn(d1, mvnTest = "mardia")
plot(Durability,Mileage)

#LDA
library(MASS)
Model <- lda(Buyer~.,data = Discriminant_Analysis_2_)
Model

#Prediction
lpred <- predict(Model,d1)
lpred

#Class Matrix
lclass <- lpred$class
ltable <- table(lclass,Discriminant_Analysis_2_$Buyer)
ltable
