#Lab2 Multiple & Stepswise Regression
Multiple_Regression <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Lab-2-Cases/Multiple Regression.xlsx")
str(Multiple_Regression)

#Multi-Normality
library(MVN)
mvn(Multiple_Regression)

#Step Regression
Fitall <- lm(`Adoption of ERP`~. , data = Multiple_Regression)
Fitfirst <- lm(`Adoption of ERP`~1, data = Multiple_Regression)
#backward elimination
step(Fitall,direction = "backward")
#forward Selection 
step(Fitfirst,direction = "forward",scope = formula(Fitall))

#Multiple Linear Regression
Model <- lm(`Adoption of ERP`~.,data = Multiple_Regression)
summary(Model)

Model1 <- lm(`Adoption of ERP`~`Technical Knowledge`+Affordability, data = Multiple_Regression)
summary(Model1)

#Multicolinearity
library(car)
vif(Model1)

#outliers & Residual Normality
par(mfrow=c(2,2))
plot(Model1)
