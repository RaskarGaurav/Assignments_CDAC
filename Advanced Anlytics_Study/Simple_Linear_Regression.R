#Simple Linear Regression
SLR <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Day-9_Correlation_Simple and Multiple Regression _Stepwise Regression/SLR.xlsx")
attach(SLR)

#Assumption
str(SLR)
boxplot(Compensation)
boxplot(Performance)
shapiro.test(Compensation)
shapiro.test(Performance)
plot(Compensation,Performance)
scatter.smooth(Compensation,Performance)

#Simple Linear Regression
Model <- lm(Performance~Compensation, data = SLR)
summary(Model)
shapiro.test(Model$residuals)

plot(Model)
#Residuals VS Fitted gives info. unequal variance, outliers & non-linearity->0line is Regression line
#Q-Q plot (Quantile-Quantile plot) if points are on line then normal distribution of residuals.
