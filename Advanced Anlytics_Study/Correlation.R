# Correlation Analysis
CR <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Day-9_Correlation_Simple and Multiple Regression _Stepwise Regression/Correlation Analysis/CR.xlsx")
attach(CR)
str(CR)

#Normality
shapiro.test(sales)
shapiro.test(advt)
hist(advt)
hist(sales)
boxplot(advt)
boxplot(sales) #Outlier
plot(advt,sales) #Scatter Plot

#Correlation
cor(advt,sales)
cor.test(advt,sales)

#Spearman's Correlation
cor.test(advt,sales,method = "spearman")
?cor.test
