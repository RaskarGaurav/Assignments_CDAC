# One Sample t-test
Indian_oil_ethanol <- read_excel("D:/248518_Bkp/Advance Analytics-2024/Day-7_T-tests/T-tests/One Sample t-test/Indian oil_ethanol.xlsx")
attach(Indian_oil_ethanol) # use table 
# Assumptions
str(`Mileage with ethanol`) #Structure of table

# Normality
# H0 : The data is not deviating from normal distribution.
# H1 : The data is deviating from normal distribution.
shapiro.test(`Mileage with ethanol`) #Shapiro-Wilk test for Normality

hist(`Mileage with ethanol`) #Plot Histogram

library(moments)  #Package to use Skewness & Kurtosis
skewness(`Mileage with ethanol`)
kurtosis(`Mileage with ethanol`)

library(nortest) 
lillie.test(`Mileage with ethanol`) #Lilliefors test for Normality
ad.test(`Mileage with ethanol`) #Anderson-Darling test for Normality

#standard deviation
sd(`Mileage with ethanol`)

#One Sample t-test
t.test(`Mileage with ethanol`,mu=12)

t.test(`Mileage with ethanol`,mu=12,alternative = c("two.sided"),conf.level=0.95)
#==================================================================================

x<- c(1,2,3,4,5,6)
t.test(x,mu=4)

y<-c(45,35,30,48,50,60,30,42)
t.test(y,mu=40,alternative = c("greater"))
#==================================================================================

PepsiCo <- read_excel("D:/248518_Bkp/Advance Analytics-2024/Day-7_T-tests/LAB-Cases/One Sample -t-test.xlsx")
attach(PepsiCo)
str(`Quantity in ml`)
shapiro.test(`Quantity in ml`)
t.test(`Quantity in ml`,mu=300)
