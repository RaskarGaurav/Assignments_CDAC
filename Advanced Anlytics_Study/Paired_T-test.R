#Paired t-test 
RaymondAd <- read_excel("D:/248518_Bkp/Advance Analytics-2024/Day-7_T-tests/T-tests/pair_t.xlsx")
attach(RaymondAd)

#Assumptions
str(RaymondAd)
shapiro.test(Diff) #NOrmality test
hist(Diff)
library(moments)
skewness(Diff) #Near 0
kurtosis(Diff) #Near 0

#Paired t-test
t.test(Bef,Aft,mu=0,paired = TRUE)
