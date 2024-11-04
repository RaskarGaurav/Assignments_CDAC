#Lab3 MLR
MLR <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Lab-3-Cases/MLR.xlsx")
attach(MLR)

#Multivariate Normality
library(MVN)
mvn(MLR[,c(3,4,5,6)])

#Multiple Linear Regression
Model <- lm(Y~X1+X2+X3+X4,data = MLR)
summary(Model)

#MultiCollinearity
library(car)
vif(Model)
cor(MLR[,-c(1,2)])

#Step Regeression
Fitall = lm(Y~X1+X2+X3+X4,data = MLR)
Fitfirst = lm(Y~1 , data = MLR)

#Backward Eliminiation
step(Fitall,direction = "backward")
step(Fitfirst,direction = "forward",scope = formula(Fitall))


#Simple Linear Regression
Model1 <- lm(Y~X1, data = MLR)
summary(Model1)

#mean for SLR
MLR$X5 <- rowMeans(MLR[,c(3,4,5,6)],na.rm = TRUE)
Model2 <- lm(Y~X5,data = MLR)
summary(Model2)

#Diagnostic Plots
par(mfrow = c(2,2))
plot(Model)
plot(Model1)
plot(Model2)

