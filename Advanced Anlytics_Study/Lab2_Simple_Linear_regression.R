#Lab2 Simple Linaer Regression
Simple_Linear_Regression <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Lab-2-Cases/Simple Linear Regression.xlsx")
attach(Simple_Linear_Regression)

str(Simple_Linear_Regression)
#Outliers and Linearity
plot(`Technical Knowledge`,`Adoption of ERP`)
boxplot(`Technical Knowledge`)
boxplot(`Adoption of ERP`)

#Simple Linear Regression
Model <- lm(`Adoption of ERP`~`Technical Knowledge`, data = Simple_Linear_Regression)
summary(Model)

#Normality
shapiro.test(Model$residuals)

par(mfrow = c(2,2))
plot(Model)
