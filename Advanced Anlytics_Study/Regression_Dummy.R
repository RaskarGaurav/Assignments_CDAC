#Regression using Dummy Coding
dummy <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Day-9_Correlation_Simple and Multiple Regression _Stepwise Regression/Regression_Simple and Multiple/Regression Analysis using dummy Coding/dummy.xlsx")
attach(dummy)

str(dummy)
dummy$quality <- as.factor(dummy$quality)
dummy$region <- as.factor(dummy$region)
str(dummy)

#Model
Model <- lm(price~. , data = dummy)
summary(Model)

