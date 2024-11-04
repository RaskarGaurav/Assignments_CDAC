#Multiple Linear Regression
MR1 <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Day-9_Correlation_Simple and Multiple Regression _Stepwise Regression/Regression_Simple and Multiple/Multiple Regression/MR1.xlsx")
attach(MR1)

#Assumptions
str(MR1)
shapiro.test(Attitude)
shapiro.test(Awarness)
shapiro.test(Perception)
shapiro.test(Cost)
shapiro.test(Rating)
shapiro.test(Buying)

#Regression Model
Model<- lm(Buying~., data = MR1)
summary(Model)

#Regression Model1
Model1 <- lm(Buying~Attitude+Awarness+Perception, data = MR1)
summary(Model1)

#multicolinerity
library(car)
vif(Model)
#Normality
library(mvnormalTest)
mardia(MR1)

par(mfrow=c(2,2))
plot(Model)

library(MVN)
mvn(MR1,mvnTest = "royston")
